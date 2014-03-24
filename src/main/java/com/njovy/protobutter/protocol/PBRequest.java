// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtobufferRequest.proto

package com.njovy.protobutter.protocol;

public final class PBRequest {
  private PBRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code protobutter.Command}
   */
  public enum Command
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>KNOCK_KNOCK = 1;</code>
     *
     * <pre>
     **
     *   peers: Could be any module
     *    sync: Sync
     * message: Request
     * </pre>
     */
    KNOCK_KNOCK(0, 1),
    ;

    /**
     * <code>KNOCK_KNOCK = 1;</code>
     *
     * <pre>
     **
     *   peers: Could be any module
     *    sync: Sync
     * message: Request
     * </pre>
     */
    public static final int KNOCK_KNOCK_VALUE = 1;


    public final int getNumber() { return value; }

    public static Command valueOf(int value) {
      switch (value) {
        case 1: return KNOCK_KNOCK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Command>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Command>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Command>() {
            public Command findValueByNumber(int number) {
              return Command.valueOf(number);
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
      return com.njovy.protobutter.protocol.PBRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Command[] VALUES = values();

    public static Command valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Command(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protobutter.Command)
  }

  /**
   * Protobuf enum {@code protobutter.Sync}
   */
  public enum Sync
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SYNC = 1;</code>
     */
    SYNC(0, 1),
    /**
     * <code>ASYNC = 2;</code>
     */
    ASYNC(1, 2),
    ;

    /**
     * <code>SYNC = 1;</code>
     */
    public static final int SYNC_VALUE = 1;
    /**
     * <code>ASYNC = 2;</code>
     */
    public static final int ASYNC_VALUE = 2;


    public final int getNumber() { return value; }

    public static Sync valueOf(int value) {
      switch (value) {
        case 1: return SYNC;
        case 2: return ASYNC;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Sync>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Sync>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Sync>() {
            public Sync findValueByNumber(int number) {
              return Sync.valueOf(number);
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
      return com.njovy.protobutter.protocol.PBRequest.getDescriptor().getEnumTypes().get(1);
    }

    private static final Sync[] VALUES = values();

    public static Sync valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Sync(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protobutter.Sync)
  }

  public interface RequestOrBuilder extends
      com.google.protobuf.GeneratedMessage.
          ExtendableMessageOrBuilder<Request> {

    // required .protobutter.Command command = 1;
    /**
     * <code>required .protobutter.Command command = 1;</code>
     */
    boolean hasCommand();
    /**
     * <code>required .protobutter.Command command = 1;</code>
     */
    com.njovy.protobutter.protocol.PBRequest.Command getCommand();

    // required .protobutter.Sync sync = 2;
    /**
     * <code>required .protobutter.Sync sync = 2;</code>
     */
    boolean hasSync();
    /**
     * <code>required .protobutter.Sync sync = 2;</code>
     */
    com.njovy.protobutter.protocol.PBRequest.Sync getSync();

    // optional string id = 3;
    /**
     * <code>optional string id = 3;</code>
     */
    boolean hasId();
    /**
     * <code>optional string id = 3;</code>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 3;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();
  }
  /**
   * Protobuf type {@code protobutter.Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
        Request> implements RequestOrBuilder {
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.njovy.protobutter.protocol.PBRequest.Request, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Request(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Request defaultInstance;
    public static Request getDefaultInstance() {
      return defaultInstance;
    }

    public Request getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Request(
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
              com.njovy.protobutter.protocol.PBRequest.Command value = com.njovy.protobutter.protocol.PBRequest.Command.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                command_ = value;
              }
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.njovy.protobutter.protocol.PBRequest.Sync value = com.njovy.protobutter.protocol.PBRequest.Sync.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                sync_ = value;
              }
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              id_ = input.readBytes();
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
      return com.njovy.protobutter.protocol.PBRequest.internal_static_protobutter_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.njovy.protobutter.protocol.PBRequest.internal_static_protobutter_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.njovy.protobutter.protocol.PBRequest.Request.class, com.njovy.protobutter.protocol.PBRequest.Request.Builder.class);
    }

    public static com.google.protobuf.Parser<Request> PARSER =
        new com.google.protobuf.AbstractParser<Request>() {
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .protobutter.Command command = 1;
    public static final int COMMAND_FIELD_NUMBER = 1;
    private com.njovy.protobutter.protocol.PBRequest.Command command_;
    /**
     * <code>required .protobutter.Command command = 1;</code>
     */
    public boolean hasCommand() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .protobutter.Command command = 1;</code>
     */
    public com.njovy.protobutter.protocol.PBRequest.Command getCommand() {
      return command_;
    }

    // required .protobutter.Sync sync = 2;
    public static final int SYNC_FIELD_NUMBER = 2;
    private com.njovy.protobutter.protocol.PBRequest.Sync sync_;
    /**
     * <code>required .protobutter.Sync sync = 2;</code>
     */
    public boolean hasSync() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .protobutter.Sync sync = 2;</code>
     */
    public com.njovy.protobutter.protocol.PBRequest.Sync getSync() {
      return sync_;
    }

    // optional string id = 3;
    public static final int ID_FIELD_NUMBER = 3;
    private java.lang.Object id_;
    /**
     * <code>optional string id = 3;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string id = 3;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      command_ = com.njovy.protobutter.protocol.PBRequest.Command.KNOCK_KNOCK;
      sync_ = com.njovy.protobutter.protocol.PBRequest.Sync.SYNC;
      id_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasCommand()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSync()) {
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
        .ExtendableMessage<com.njovy.protobutter.protocol.PBRequest.Request>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, command_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, sync_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getIdBytes());
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
          .computeEnumSize(1, command_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, sync_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getIdBytes());
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

    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.njovy.protobutter.protocol.PBRequest.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.njovy.protobutter.protocol.PBRequest.Request prototype) {
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
     * Protobuf type {@code protobutter.Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
          com.njovy.protobutter.protocol.PBRequest.Request, Builder> implements com.njovy.protobutter.protocol.PBRequest.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.njovy.protobutter.protocol.PBRequest.internal_static_protobutter_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.njovy.protobutter.protocol.PBRequest.internal_static_protobutter_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.njovy.protobutter.protocol.PBRequest.Request.class, com.njovy.protobutter.protocol.PBRequest.Request.Builder.class);
      }

      // Construct using com.njovy.protobutter.protocol.PBRequest.Request.newBuilder()
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
        command_ = com.njovy.protobutter.protocol.PBRequest.Command.KNOCK_KNOCK;
        bitField0_ = (bitField0_ & ~0x00000001);
        sync_ = com.njovy.protobutter.protocol.PBRequest.Sync.SYNC;
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.njovy.protobutter.protocol.PBRequest.internal_static_protobutter_Request_descriptor;
      }

      public com.njovy.protobutter.protocol.PBRequest.Request getDefaultInstanceForType() {
        return com.njovy.protobutter.protocol.PBRequest.Request.getDefaultInstance();
      }

      public com.njovy.protobutter.protocol.PBRequest.Request build() {
        com.njovy.protobutter.protocol.PBRequest.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.njovy.protobutter.protocol.PBRequest.Request buildPartial() {
        com.njovy.protobutter.protocol.PBRequest.Request result = new com.njovy.protobutter.protocol.PBRequest.Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.command_ = command_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.sync_ = sync_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.id_ = id_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.njovy.protobutter.protocol.PBRequest.Request) {
          return mergeFrom((com.njovy.protobutter.protocol.PBRequest.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.njovy.protobutter.protocol.PBRequest.Request other) {
        if (other == com.njovy.protobutter.protocol.PBRequest.Request.getDefaultInstance()) return this;
        if (other.hasCommand()) {
          setCommand(other.getCommand());
        }
        if (other.hasSync()) {
          setSync(other.getSync());
        }
        if (other.hasId()) {
          bitField0_ |= 0x00000004;
          id_ = other.id_;
          onChanged();
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCommand()) {
          
          return false;
        }
        if (!hasSync()) {
          
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
        com.njovy.protobutter.protocol.PBRequest.Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.njovy.protobutter.protocol.PBRequest.Request) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .protobutter.Command command = 1;
      private com.njovy.protobutter.protocol.PBRequest.Command command_ = com.njovy.protobutter.protocol.PBRequest.Command.KNOCK_KNOCK;
      /**
       * <code>required .protobutter.Command command = 1;</code>
       */
      public boolean hasCommand() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .protobutter.Command command = 1;</code>
       */
      public com.njovy.protobutter.protocol.PBRequest.Command getCommand() {
        return command_;
      }
      /**
       * <code>required .protobutter.Command command = 1;</code>
       */
      public Builder setCommand(com.njovy.protobutter.protocol.PBRequest.Command value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        command_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .protobutter.Command command = 1;</code>
       */
      public Builder clearCommand() {
        bitField0_ = (bitField0_ & ~0x00000001);
        command_ = com.njovy.protobutter.protocol.PBRequest.Command.KNOCK_KNOCK;
        onChanged();
        return this;
      }

      // required .protobutter.Sync sync = 2;
      private com.njovy.protobutter.protocol.PBRequest.Sync sync_ = com.njovy.protobutter.protocol.PBRequest.Sync.SYNC;
      /**
       * <code>required .protobutter.Sync sync = 2;</code>
       */
      public boolean hasSync() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .protobutter.Sync sync = 2;</code>
       */
      public com.njovy.protobutter.protocol.PBRequest.Sync getSync() {
        return sync_;
      }
      /**
       * <code>required .protobutter.Sync sync = 2;</code>
       */
      public Builder setSync(com.njovy.protobutter.protocol.PBRequest.Sync value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        sync_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .protobutter.Sync sync = 2;</code>
       */
      public Builder clearSync() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sync_ = com.njovy.protobutter.protocol.PBRequest.Sync.SYNC;
        onChanged();
        return this;
      }

      // optional string id = 3;
      private java.lang.Object id_ = "";
      /**
       * <code>optional string id = 3;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string id = 3;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string id = 3;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string id = 3;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 3;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 3;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        id_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobutter.Request)
    }

    static {
      defaultInstance = new Request(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protobutter.Request)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobutter_Request_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobutter_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ProtobufferRequest.proto\022\013protobutter\032" +
      "\027ProtobufferCommon.proto\032\031ProtobufferRes" +
      "ponse.proto\"f\n\007Request\022%\n\007command\030\001 \002(\0162" +
      "\024.protobutter.Command\022\037\n\004sync\030\002 \002(\0162\021.pr" +
      "otobutter.Sync\022\n\n\002id\030\003 \001(\t*\007\010\350\007\020\240\215\006*\032\n\007C" +
      "ommand\022\017\n\013KNOCK_KNOCK\020\001*\033\n\004Sync\022\010\n\004SYNC\020" +
      "\001\022\t\n\005ASYNC\020\002B+\n\036com.njovy.protobutter.pr" +
      "otocolB\tPBRequest"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobutter_Request_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobutter_Request_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobutter_Request_descriptor,
              new java.lang.String[] { "Command", "Sync", "Id", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.njovy.protobutter.protocol.PBCommon.getDescriptor(),
          com.njovy.protobutter.protocol.PBResponse.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}