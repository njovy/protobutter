package com.njovy.protobutter.initializer;

import com.njovy.protobutter.handler.Handler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;


/**
 * A general {@link ChannelInitializer} for protocol buffers
 * 
 * @author Taehyun Park <root@njovy.com>
 * 
 */
public abstract class ProtobutterInitializer extends
		ChannelInitializer<SocketChannel> {
	@Override
	protected void initChannel(SocketChannel channel) throws Exception {
		ChannelPipeline pipeline = channel.pipeline();
		pipeline.addLast(Handler.FRAME_DECODER,
				new ProtobufVarint32FrameDecoder());
		final ProtobufDecoder decoder = getCustomProtobufDecoder();
		if (decoder != null) {
			pipeline.addLast(Handler.PROTOBUF_DECODER, decoder);
		} else {
			throw new NullPointerException(
					"You have to specify a custom protobuf decoder!");
		}

		pipeline.addLast(Handler.FRAME_ENCODER,
				new ProtobufVarint32LengthFieldPrepender());
		pipeline.addLast(Handler.PROTOBUF_ENCODER, new ProtobufEncoder());
		final ChannelInboundHandlerAdapter handler = getCustomHandler();
		if (handler != null) {
			pipeline.addLast(Handler.HANDLER, handler);
		} else {
			throw new NullPointerException(
					"You have to specify a custom handler!");
		}

	}

	/**
	 * Must provide your own protobuf decoder to be able to decode your own
	 * protocols.
	 * 
	 * @return
	 */
	protected abstract ProtobufDecoder getCustomProtobufDecoder();

	/**
	 * Must provide your own handler to handle protocols.
	 * 
	 * @return
	 */
	protected abstract ChannelInboundHandlerAdapter getCustomHandler();
}
