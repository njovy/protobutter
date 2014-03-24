package com.njovy.protobutter;

import com.njovy.protobutter.handler.ResponseHandler;
import com.njovy.protobutter.initializer.ProtobutterInitializer;
import com.njovy.protobutter.protocol.PBRequest.Request;
import com.njovy.protobutter.protocol.PBRequest.Sync;
import com.njovy.protobutter.protocol.PBResponse.Response;
import com.njovy.protobutter.protocol.PBResponse.Response.Status;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * Sends a {@link Sync#SYNC} or {@link Sync#ASYNC} request to a
 * {@link ProtobutterServer} to get a {@link Response}
 *
 * @author Taehyun Park
 */
public class ProtobutterClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static Bootstrap _bootstrap;
    private static final int DEFAULT_WORKERS = 35;
    private static final int DEFAULT_TIMEOUT = 2000;

    public static boolean init(ProtobutterInitializer initializer) {
        return init(DEFAULT_WORKERS, DEFAULT_TIMEOUT, initializer);
    }

    public static boolean init(int numberOfWorkers, int timeout,
                               ProtobutterInitializer initializer) {
        EventLoopGroup workerGroup = new NioEventLoopGroup(numberOfWorkers);
        _bootstrap = new Bootstrap();
        _bootstrap.group(workerGroup).channel(NioSocketChannel.class)
                .handler(initializer);
        _bootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, timeout);
        return true;
    }

    /**
     * A helper method that sends a request to a remote peer and returns a
     * response
     *
     * @param host    the host address of a given remote peer
     * @param port    the port of a given remote peer
     * @param builder a {@link Request.Builder}
     * @return {@link Response} If a async request was sent successfully, a
     * returned response will be OK.
     */
    public static Response sendRequest(String host, Integer port,
                                       Request.Builder builder) {
        // check if a request has an id.
        // if there is no id, then set a random uuid.
        if (builder.getSync() == Sync.SYNC && !builder.hasId()) {
            builder.setId(UUID.randomUUID().toString());
        }
        return sendRequest(host, port, builder.build());
    }

    private static Response sendRequest(String host, Integer port,
                                        Request request) {
        System.out.println("@sendRequest - " + host + ":" + port + ", "
                + request);
        Response response = null;
        Channel channel = null;
        ResponseHandler handler;
        // if a request is synchronous
        if (request.getSync() == Sync.SYNC) {
            try {
                channel = _bootstrap.connect(host, port).sync().channel();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                response = Response.newBuilder()
                        .setStatus(Response.Status.FAILED)
                        .setMessage(e.getLocalizedMessage()).build();
            } catch (TimeoutException e) {
                response = Response.newBuilder()
                        .setStatus(Response.Status.TIMEOUT)
                        .setMessage(e.getLocalizedMessage()).build();

            } catch (Exception e) {
                response = Response.newBuilder()
                        .setStatus(Response.Status.FAILED)
                        .setMessage(e.getMessage()).build();
            }
        } else {
            // otherwise a request is asynchronous
            ChannelFuture future = _bootstrap.connect(host, port);
            future.awaitUninterruptibly();
            if (future.isDone()) {
                if (future.isCancelled()) {
                    response = Response.newBuilder()
                            .setStatus(Status.CANCELLED)
                            .setMessage(future.cause().getLocalizedMessage())
                            .build();
                } else if (!future.isSuccess()) {
                    response = Response.newBuilder().setStatus(Status.FAILED)
                            .setMessage(future.cause().getLocalizedMessage())
                            .build();
                } else {
                    channel = future.channel();
                }
            } else {
                response = Response.newBuilder().setStatus(Status.FAILED)
                        .setMessage(future.cause().getLocalizedMessage())
                        .build();
            }

        }
        if (channel != null) {
            handler = channel.pipeline().get(ResponseHandler.class);
            response = handler.sendRequest(request);
        }
        if (response == null) {
            response = Response.newBuilder().setStatus(Status.UNKNOWN).build();
        }
        return response;
    }

}
