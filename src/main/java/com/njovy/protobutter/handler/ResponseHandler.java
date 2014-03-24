package com.njovy.protobutter.handler;


import com.njovy.protobutter.protocol.PBRequest.Request;
import com.njovy.protobutter.protocol.PBRequest.Sync;
import com.njovy.protobutter.protocol.PBResponse.Response;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * {@link ChannelInboundHandlerAdapter} which allows to explicit only handle a
 * {@link Response}
 *
 * @author Taehyun Park <root@njovy.com>
 */
public class ResponseHandler extends SimpleChannelInboundHandler<Response> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final BlockingQueue<Response> response = new LinkedBlockingQueue<Response>();

    // Stateful properties
    private volatile Channel channel;

    /**
     * The default timeout is 3000ms.
     */
    private static final long DEFAULT_TIMEOUT = 3000L;

    private final long timeout;

    public ResponseHandler() {
        this(DEFAULT_TIMEOUT);
    }

    /**
     * Creates a new instance which will try to detect the types match
     * {@code Response}
     *
     * @param timeoutInMilliSeconds how long to wait before giving up, in units of unit
     */
    public ResponseHandler(long timeoutInMilliSeconds) {
        super();
        this.timeout = timeoutInMilliSeconds;
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
        channel = ctx.channel();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Response response)
            throws Exception {
        this.response.add(response);
    }

    public Response sendRequest(Request request) {
        channel.writeAndFlush(request);
        Response response = null;
        if (request.getSync() == Sync.SYNC) {
            boolean interrupted = false;
            try {
                response = this.response.poll(timeout, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (response != null) {
                    this.response.remove(response);
                } else {
                    response = Response
                            .newBuilder()
                            .setStatus(Response.Status.TIMEOUT)
                            .setMessage(
                                    "Waited a response for "
                                            + timeout
                                            + "ms but no response from a remote peer")
                            .build();
                }
            } catch (InterruptedException e) {
                interrupted = true;
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
                response = Response.newBuilder()
                        .setStatus(Response.Status.FAILED)
                        .setMessage("Current Thread Interrupted!").build();
            }
        } else {
            response = Response.newBuilder().setStatus(Response.Status.OK)
                    .build();
        }
        return response;
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        cause.printStackTrace();
        logger.error("Unexpected exception from downstream "
                + cause.getLocalizedMessage());
        ctx.close();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
        ctx.flush();
    }

}
