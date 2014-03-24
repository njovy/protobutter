package com.njovy.protobutter;


import com.njovy.protobutter.initializer.ProtobutterInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Taehyun Park <root@njovy.com>
 * 
 */
public class ProtobutterServer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final int DEFAULT_WORKERS = 35;
	private static final int DEFAULT_BOSSES = 2;
	private static final int DEFAULT_TIMEOUT = 3000;

	public static boolean init(int port, ProtobutterInitializer initializer) {
		return init(port, DEFAULT_BOSSES, DEFAULT_WORKERS, DEFAULT_TIMEOUT,
				initializer);
	}

	public static boolean init(int port, int numberOfBosses,
			int numberOfWorkers, int timeout, ProtobutterInitializer initializer) {
		if (port < 0 || numberOfBosses < 0 || numberOfWorkers < 0
				|| timeout < 0 || initializer == null) {
			return false;
		}
		EventLoopGroup bossGroup = new NioEventLoopGroup(numberOfBosses);
		EventLoopGroup workerGroup = new NioEventLoopGroup(numberOfWorkers);
		try {
			ServerBootstrap bootstrap = new ServerBootstrap();
			bootstrap
					.group(bossGroup, workerGroup)
					.channel(NioServerSocketChannel.class)
					.childHandler(initializer)
					.option(ChannelOption.CONNECT_TIMEOUT_MILLIS,
							DEFAULT_TIMEOUT);
			bootstrap.bind(port).sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// bossGroup.shutdownGracefully();
			// workerGroup.shutdownGracefully();
		}
		return true;
	}
}
