package com.njovy.protobutter.handler;

/**
 * Contains constants for Handlers
 * 
 * @author Taehyun Park <root@njovy.com>
 * 
 */
public abstract class Handler {
	public static final String SSL = "ssl";
	public static final String HANDLER = "handler";
	public static final String COMPRESSOR = "deflater";
	public static final String DECOMPRESSOR = "inflater";

	public static final String FRAME_DECODER = "frameDecoder";
	public static final String FRAME_ENCODER = "frameEncoder";
	public static final String PROTOBUF_DECODER = "protobufDecoder";
	public static final String PROTOBUF_ENCODER = "protobufEncoder";

	public static final String RPC_CLIENT = "rpcClient";
	public static final String RPC_SERVER = "rpcServer";
	public static final String CLIENT_CONNECT = "clientConnect";
	public static final String SERVER_CONNECT = "serverConnect";
}
