// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtobufferResponse.proto

package com.njovy.protobutter.protocol;

public final class PBResponse {
  private PBResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResponseOrBuilder extends
      com.google.protobuf.GeneratedMessage.
          ExtendableMessageOrBuilder<Response> {

    // required .protobutter.Response.Status status = 1 [default = FAILED];
    /**
     * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
     */
    boolean hasStatus();
    /**
     * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
     */
    com.njovy.protobutter.protocol.PBResponse.Response.Status getStatus();

    // optional string request_id = 2;
    /**
     * <code>optional string request_id = 2;</code>
     */
    boolean hasRequestId();
    /**
     * <code>optional string request_id = 2;</code>
     */
    java.lang.String getRequestId();
    /**
     * <code>optional string request_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getRequestIdBytes();

    // optional string message = 3;
    /**
     * <code>optional string message = 3;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code protobutter.Response}
   */
  public static final class Response extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
        Response> implements ResponseOrBuilder {
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.njovy.protobutter.protocol.PBResponse.Response, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Response(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Response defaultInstance;
    public static Response getDefaultInstance() {
      return defaultInstance;
    }

    public Response getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.njovy.protobutter.protocol.PBResponse.Response.Status value = com.njovy.protobutter.protocol.PBResponse.Response.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              requestId_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              message_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.njovy.protobutter.protocol.PBResponse.internal_static_protobutter_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.njovy.protobutter.protocol.PBResponse.internal_static_protobutter_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.njovy.protobutter.protocol.PBResponse.Response.class, com.njovy.protobutter.protocol.PBResponse.Response.Builder.class);
    }

    public static com.google.protobuf.Parser<Response> PARSER =
        new com.google.protobuf.AbstractParser<Response>() {
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code protobutter.Response.Status}
     */
    public enum Status
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>OK = 0;</code>
       */
      OK(0, 0),
      /**
       * <code>FAILED = 1;</code>
       */
      FAILED(1, 1),
      /**
       * <code>BAD_REQUEST = 2;</code>
       */
      BAD_REQUEST(2, 2),
      /**
       * <code>NOT_FOUND = 3;</code>
       */
      NOT_FOUND(3, 3),
      /**
       * <code>TIMEOUT = 4;</code>
       */
      TIMEOUT(4, 4),
      /**
       * <code>CANCELLED = 5;</code>
       */
      CANCELLED(5, 5),
      /**
       * <code>UNKNOWN = 6;</code>
       */
      UNKNOWN(6, 6),
      /**
       * <code>INVALID_PROTOCOL = 7;</code>
       */
      INVALID_PROTOCOL(7, 7),
      ;

      /**
       * <code>OK = 0;</code>
       */
      public static final int OK_VALUE = 0;
      /**
       * <code>FAILED = 1;</code>
       */
      public static final int FAILED_VALUE = 1;
      /**
       * <code>BAD_REQUEST = 2;</code>
       */
      public static final int BAD_REQUEST_VALUE = 2;
      /**
       * <code>NOT_FOUND = 3;</code>
       */
      public static final int NOT_FOUND_VALUE = 3;
      /**
       * <code>TIMEOUT = 4;</code>
       */
      public static final int TIMEOUT_VALUE = 4;
      /**
       * <code>CANCELLED = 5;</code>
       */
      public static final int CANCELLED_VALUE = 5;
      /**
       * <code>UNKNOWN = 6;</code>
       */
      public static final int UNKNOWN_VALUE = 6;
      /**
       * <code>INVALID_PROTOCOL = 7;</code>
       */
      public static final int INVALID_PROTOCOL_VALUE = 7;


      public final int getNumber() { return value; }

      public static Status valueOf(int value) {
        switch (value) {
          case 0: return OK;
          case 1: return FAILED;
          case 2: return BAD_REQUEST;
          case 3: return NOT_FOUND;
          case 4: return TIMEOUT;
          case 5: return CANCELLED;
          case 6: return UNKNOWN;
          case 7: return INVALID_PROTOCOL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Status>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Status>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Status>() {
              public Status findValueByNumber(int number) {
                return Status.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.njovy.protobutter.protocol.PBResponse.Response.getDescriptor().getEnumTypes().get(0);
      }

      private static final Status[] VALUES = values();

      public static Status valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Status(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:protobutter.Response.Status)
    }

    private int bitField0_;
    // required .protobutter.Response.Status status = 1 [default = FAILED];
    public static final int STATUS_FIELD_NUMBER = 1;
    private com.njovy.protobutter.protocol.PBResponse.Response.Status status_;
    /**
     * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
     */
    public com.njovy.protobutter.protocol.PBResponse.Response.Status getStatus() {
      return status_;
    }

    // optional string request_id = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private java.lang.Object requestId_;
    /**
     * <code>optional string request_id = 2;</code>
     */
    public boolean hasRequestId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string request_id = 2;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          requestId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string request_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string message = 3;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.Object message_;
    /**
     * <code>optional string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      status_ = com.njovy.protobutter.protocol.PBResponse.Response.Status.FAILED;
      requestId_ = "";
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage
        .ExtendableMessage<com.njovy.protobutter.protocol.PBResponse.Response>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getRequestIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
      }
      extensionWriter.writeUntil(100000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getRequestIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.njovy.protobutter.protocol.PBResponse.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.njovy.protobutter.protocol.PBResponse.Response prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protobutter.Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
          com.njovy.protobutter.protocol.PBResponse.Response, Builder> implements com.njovy.protobutter.protocol.PBResponse.ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.njovy.protobutter.protocol.PBResponse.internal_static_protobutter_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.njovy.protobutter.protocol.PBResponse.internal_static_protobutter_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.njovy.protobutter.protocol.PBResponse.Response.class, com.njovy.protobutter.protocol.PBResponse.Response.Builder.class);
      }

      // Construct using com.njovy.protobutter.protocol.PBResponse.Response.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = com.njovy.protobutter.protocol.PBResponse.Response.Status.FAILED;
        bitField0_ = (bitField0_ & ~0x00000001);
        requestId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.njovy.protobutter.protocol.PBResponse.internal_static_protobutter_Response_descriptor;
      }

      public com.njovy.protobutter.protocol.PBResponse.Response getDefaultInstanceForType() {
        return com.njovy.protobutter.protocol.PBResponse.Response.getDefaultInstance();
      }

      public com.njovy.protobutter.protocol.PBResponse.Response build() {
        com.njovy.protobutter.protocol.PBResponse.Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.njovy.protobutter.protocol.PBResponse.Response buildPartial() {
        com.njovy.protobutter.protocol.PBResponse.Response result = new com.njovy.protobutter.protocol.PBResponse.Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.requestId_ = requestId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.njovy.protobutter.protocol.PBResponse.Response) {
          return mergeFrom((com.njovy.protobutter.protocol.PBResponse.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.njovy.protobutter.protocol.PBResponse.Response other) {
        if (other == com.njovy.protobutter.protocol.PBResponse.Response.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasRequestId()) {
          bitField0_ |= 0x00000002;
          requestId_ = other.requestId_;
          onChanged();
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        if (!extensionsAreInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.njovy.protobutter.protocol.PBResponse.Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.njovy.protobutter.protocol.PBResponse.Response) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .protobutter.Response.Status status = 1 [default = FAILED];
      private com.njovy.protobutter.protocol.PBResponse.Response.Status status_ = com.njovy.protobutter.protocol.PBResponse.Response.Status.FAILED;
      /**
       * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
       */
      public com.njovy.protobutter.protocol.PBResponse.Response.Status getStatus() {
        return status_;
      }
      /**
       * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
       */
      public Builder setStatus(com.njovy.protobutter.protocol.PBResponse.Response.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .protobutter.Response.Status status = 1 [default = FAILED];</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = com.njovy.protobutter.protocol.PBResponse.Response.Status.FAILED;
        onChanged();
        return this;
      }

      // optional string request_id = 2;
      private java.lang.Object requestId_ = "";
      /**
       * <code>optional string request_id = 2;</code>
       */
      public boolean hasRequestId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string request_id = 2;</code>
       */
      public java.lang.String getRequestId() {
        java.lang.Object ref = requestId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          requestId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string request_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRequestIdBytes() {
        java.lang.Object ref = requestId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          requestId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string request_id = 2;</code>
       */
      public Builder setRequestId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string request_id = 2;</code>
       */
      public Builder clearRequestId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        requestId_ = getDefaultInstance().getRequestId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string request_id = 2;</code>
       */
      public Builder setRequestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        requestId_ = value;
        onChanged();
        return this;
      }

      // optional string message = 3;
      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobutter.Response)
    }

    static {
      defaultInstance = new Response(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protobutter.Response)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobutter_Response_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobutter_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ProtobufferResponse.proto\022\013protobutter" +
      "\032\027ProtobufferCommon.proto\"\353\001\n\010Response\0224" +
      "\n\006status\030\001 \002(\0162\034.protobutter.Response.St" +
      "atus:\006FAILED\022\022\n\nrequest_id\030\002 \001(\t\022\017\n\007mess" +
      "age\030\003 \001(\t\"{\n\006Status\022\006\n\002OK\020\000\022\n\n\006FAILED\020\001\022" +
      "\017\n\013BAD_REQUEST\020\002\022\r\n\tNOT_FOUND\020\003\022\013\n\007TIMEO" +
      "UT\020\004\022\r\n\tCANCELLED\020\005\022\013\n\007UNKNOWN\020\006\022\024\n\020INVA" +
      "LID_PROTOCOL\020\007*\007\010\350\007\020\240\215\006B,\n\036com.njovy.pro" +
      "tobutter.protocolB\nPBResponse"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobutter_Response_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobutter_Response_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobutter_Response_descriptor,
              new java.lang.String[] { "Status", "RequestId", "Message", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.njovy.protobutter.protocol.PBCommon.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
