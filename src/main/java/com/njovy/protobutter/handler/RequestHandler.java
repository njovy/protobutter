package com.njovy.protobutter.handler;

import com.njovy.protobutter.protocol.PBRequest.Request;
import com.njovy.protobutter.protocol.PBRequest.Sync;
import com.njovy.protobutter.protocol.PBResponse.Response;
import com.njovy.protobutter.protocol.PBResponse.Response.Status;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.ReferenceCountUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link ChannelInboundHandlerAdapter} which allows to explicit only handle a
 * {@link Request}
 * 
 * @author Taehyun Park <root@njovy.com>
 * 
 */
public abstract class RequestHandler extends ChannelInboundHandlerAdapter {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final boolean autoRelease;

	/**
	 * @see {@link #SimpleChannelInboundHandler(boolean)} with {@code true} as
	 *      boolean parameter.
	 */
	protected RequestHandler() {
		this(true);
	}

	/**
	 * Create a new instance which will try to detect the types to match out of
	 * the type parameter of the class.
	 * 
	 * @param autoRelease
	 *            {@code true} if handled messages should be released
	 *            automatically by pass them to
	 *            {@link ReferenceCountUtil#release(Object)}.
	 */
	protected RequestHandler(boolean autoRelease) {
		this.autoRelease = autoRelease;
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		boolean release = true;
		try {
			if (msg instanceof Request) {
				Response response = null;
				Request request = (Request) msg;
				if (request.hasCommand()) {
					switch (request.getCommand()) {
					case KNOCK_KNOCK:
						response = Response.newBuilder().setStatus(Status.OK)
								.setRequestId(request.getId()).build();
						break;
					default:
						response = handleRequest(ctx, request);

					}
				}
				handleResponse(ctx, request, response);
			} else {
				release = false;
				ctx.fireChannelRead(msg);
			}
		} finally {
			if (autoRelease && release) {
				ReferenceCountUtil.release(msg);
			}
		}
		super.channelRead(ctx, msg);
	}

	/**
	 * Is called to handle the Request
	 * 
	 * @param ctx
	 *            the {@link ChannelHandlerContext} which this
	 *            {@link SimpleChannelInboundHandler} belongs to
	 * @param request
	 *            the Request to handle
	 * @return a response to be returned for a synchrnous call.
	 * @throws Exception
	 */
	protected abstract Response handleRequest(ChannelHandlerContext ctx,
			Request request) throws Exception;

	/**
	 * Is called to handle a response If a request was synchronous, it writes a
	 * response to a channel. Otherwise, it closes a channel.
	 * 
	 * @param ctx
	 * @param request
	 * @param response
	 */
	protected void handleResponse(ChannelHandlerContext ctx, Request request,
			Response response) {
		if (request.getSync() == Sync.SYNC) {
			if (response == null) {
				response = Response
						.newBuilder()
						.setRequestId(request.getId())
						.setMessage(
								"There was no response returned for Request:"
										+ request)
						.setStatus(Status.BAD_REQUEST).build();
			}
			ctx.writeAndFlush(response);
		}
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		super.channelReadComplete(ctx);
		ctx.disconnect();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		logger.error("Unexpected exception from downstream "
				+ cause.getLocalizedMessage());
		cause.printStackTrace();
		ctx.close();
	}

}
