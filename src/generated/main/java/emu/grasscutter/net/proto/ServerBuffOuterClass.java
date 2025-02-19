// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerBuff.proto

package emu.grasscutter.net.proto;

public final class ServerBuffOuterClass {
  private ServerBuffOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerBuffOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerBuff)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 server_buff_uid = 1;</code>
     * @return The serverBuffUid.
     */
    int getServerBuffUid();

    /**
     * <code>uint32 server_buff_id = 2;</code>
     * @return The serverBuffId.
     */
    int getServerBuffId();

    /**
     * <code>uint32 server_buff_type = 3;</code>
     * @return The serverBuffType.
     */
    int getServerBuffType();

    /**
     * <code>uint32 instanced_modifier_id = 4;</code>
     * @return The instancedModifierId.
     */
    int getInstancedModifierId();

    /**
     * <code>bool is_modifier_added = 5;</code>
     * @return The isModifierAdded.
     */
    boolean getIsModifierAdded();
  }
  /**
   * <pre>
   *4.7.0
   * </pre>
   *
   * Protobuf type {@code ServerBuff}
   */
  public static final class ServerBuff extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerBuff)
      ServerBuffOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerBuff.newBuilder() to construct.
    private ServerBuff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerBuff() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerBuff();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerBuff(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              serverBuffUid_ = input.readUInt32();
              break;
            }
            case 16: {

              serverBuffId_ = input.readUInt32();
              break;
            }
            case 24: {

              serverBuffType_ = input.readUInt32();
              break;
            }
            case 32: {

              instancedModifierId_ = input.readUInt32();
              break;
            }
            case 40: {

              isModifierAdded_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ServerBuffOuterClass.internal_static_ServerBuff_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServerBuffOuterClass.internal_static_ServerBuff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff.class, emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff.Builder.class);
    }

    public static final int SERVER_BUFF_UID_FIELD_NUMBER = 1;
    private int serverBuffUid_;
    /**
     * <code>uint32 server_buff_uid = 1;</code>
     * @return The serverBuffUid.
     */
    @java.lang.Override
    public int getServerBuffUid() {
      return serverBuffUid_;
    }

    public static final int SERVER_BUFF_ID_FIELD_NUMBER = 2;
    private int serverBuffId_;
    /**
     * <code>uint32 server_buff_id = 2;</code>
     * @return The serverBuffId.
     */
    @java.lang.Override
    public int getServerBuffId() {
      return serverBuffId_;
    }

    public static final int SERVER_BUFF_TYPE_FIELD_NUMBER = 3;
    private int serverBuffType_;
    /**
     * <code>uint32 server_buff_type = 3;</code>
     * @return The serverBuffType.
     */
    @java.lang.Override
    public int getServerBuffType() {
      return serverBuffType_;
    }

    public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 4;
    private int instancedModifierId_;
    /**
     * <code>uint32 instanced_modifier_id = 4;</code>
     * @return The instancedModifierId.
     */
    @java.lang.Override
    public int getInstancedModifierId() {
      return instancedModifierId_;
    }

    public static final int IS_MODIFIER_ADDED_FIELD_NUMBER = 5;
    private boolean isModifierAdded_;
    /**
     * <code>bool is_modifier_added = 5;</code>
     * @return The isModifierAdded.
     */
    @java.lang.Override
    public boolean getIsModifierAdded() {
      return isModifierAdded_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (serverBuffUid_ != 0) {
        output.writeUInt32(1, serverBuffUid_);
      }
      if (serverBuffId_ != 0) {
        output.writeUInt32(2, serverBuffId_);
      }
      if (serverBuffType_ != 0) {
        output.writeUInt32(3, serverBuffType_);
      }
      if (instancedModifierId_ != 0) {
        output.writeUInt32(4, instancedModifierId_);
      }
      if (isModifierAdded_ != false) {
        output.writeBool(5, isModifierAdded_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverBuffUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, serverBuffUid_);
      }
      if (serverBuffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, serverBuffId_);
      }
      if (serverBuffType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, serverBuffType_);
      }
      if (instancedModifierId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, instancedModifierId_);
      }
      if (isModifierAdded_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isModifierAdded_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff other = (emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff) obj;

      if (getServerBuffUid()
          != other.getServerBuffUid()) return false;
      if (getServerBuffId()
          != other.getServerBuffId()) return false;
      if (getServerBuffType()
          != other.getServerBuffType()) return false;
      if (getInstancedModifierId()
          != other.getInstancedModifierId()) return false;
      if (getIsModifierAdded()
          != other.getIsModifierAdded()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SERVER_BUFF_UID_FIELD_NUMBER;
      hash = (53 * hash) + getServerBuffUid();
      hash = (37 * hash) + SERVER_BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getServerBuffId();
      hash = (37 * hash) + SERVER_BUFF_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getServerBuffType();
      hash = (37 * hash) + INSTANCED_MODIFIER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedModifierId();
      hash = (37 * hash) + IS_MODIFIER_ADDED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsModifierAdded());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *4.7.0
     * </pre>
     *
     * Protobuf type {@code ServerBuff}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerBuff)
        emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuffOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerBuffOuterClass.internal_static_ServerBuff_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServerBuffOuterClass.internal_static_ServerBuff_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff.class, emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        serverBuffUid_ = 0;

        serverBuffId_ = 0;

        serverBuffType_ = 0;

        instancedModifierId_ = 0;

        isModifierAdded_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServerBuffOuterClass.internal_static_ServerBuff_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff build() {
        emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff buildPartial() {
        emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff result = new emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff(this);
        result.serverBuffUid_ = serverBuffUid_;
        result.serverBuffId_ = serverBuffId_;
        result.serverBuffType_ = serverBuffType_;
        result.instancedModifierId_ = instancedModifierId_;
        result.isModifierAdded_ = isModifierAdded_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff) {
          return mergeFrom((emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff other) {
        if (other == emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff.getDefaultInstance()) return this;
        if (other.getServerBuffUid() != 0) {
          setServerBuffUid(other.getServerBuffUid());
        }
        if (other.getServerBuffId() != 0) {
          setServerBuffId(other.getServerBuffId());
        }
        if (other.getServerBuffType() != 0) {
          setServerBuffType(other.getServerBuffType());
        }
        if (other.getInstancedModifierId() != 0) {
          setInstancedModifierId(other.getInstancedModifierId());
        }
        if (other.getIsModifierAdded() != false) {
          setIsModifierAdded(other.getIsModifierAdded());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int serverBuffUid_ ;
      /**
       * <code>uint32 server_buff_uid = 1;</code>
       * @return The serverBuffUid.
       */
      @java.lang.Override
      public int getServerBuffUid() {
        return serverBuffUid_;
      }
      /**
       * <code>uint32 server_buff_uid = 1;</code>
       * @param value The serverBuffUid to set.
       * @return This builder for chaining.
       */
      public Builder setServerBuffUid(int value) {
        
        serverBuffUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 server_buff_uid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerBuffUid() {
        
        serverBuffUid_ = 0;
        onChanged();
        return this;
      }

      private int serverBuffId_ ;
      /**
       * <code>uint32 server_buff_id = 2;</code>
       * @return The serverBuffId.
       */
      @java.lang.Override
      public int getServerBuffId() {
        return serverBuffId_;
      }
      /**
       * <code>uint32 server_buff_id = 2;</code>
       * @param value The serverBuffId to set.
       * @return This builder for chaining.
       */
      public Builder setServerBuffId(int value) {
        
        serverBuffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 server_buff_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerBuffId() {
        
        serverBuffId_ = 0;
        onChanged();
        return this;
      }

      private int serverBuffType_ ;
      /**
       * <code>uint32 server_buff_type = 3;</code>
       * @return The serverBuffType.
       */
      @java.lang.Override
      public int getServerBuffType() {
        return serverBuffType_;
      }
      /**
       * <code>uint32 server_buff_type = 3;</code>
       * @param value The serverBuffType to set.
       * @return This builder for chaining.
       */
      public Builder setServerBuffType(int value) {
        
        serverBuffType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 server_buff_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerBuffType() {
        
        serverBuffType_ = 0;
        onChanged();
        return this;
      }

      private int instancedModifierId_ ;
      /**
       * <code>uint32 instanced_modifier_id = 4;</code>
       * @return The instancedModifierId.
       */
      @java.lang.Override
      public int getInstancedModifierId() {
        return instancedModifierId_;
      }
      /**
       * <code>uint32 instanced_modifier_id = 4;</code>
       * @param value The instancedModifierId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedModifierId(int value) {
        
        instancedModifierId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_modifier_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedModifierId() {
        
        instancedModifierId_ = 0;
        onChanged();
        return this;
      }

      private boolean isModifierAdded_ ;
      /**
       * <code>bool is_modifier_added = 5;</code>
       * @return The isModifierAdded.
       */
      @java.lang.Override
      public boolean getIsModifierAdded() {
        return isModifierAdded_;
      }
      /**
       * <code>bool is_modifier_added = 5;</code>
       * @param value The isModifierAdded to set.
       * @return This builder for chaining.
       */
      public Builder setIsModifierAdded(boolean value) {
        
        isModifierAdded_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_modifier_added = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsModifierAdded() {
        
        isModifierAdded_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ServerBuff)
    }

    // @@protoc_insertion_point(class_scope:ServerBuff)
    private static final emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff();
    }

    public static emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerBuff>
        PARSER = new com.google.protobuf.AbstractParser<ServerBuff>() {
      @java.lang.Override
      public ServerBuff parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerBuff(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerBuff> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerBuff> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServerBuffOuterClass.ServerBuff getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerBuff_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerBuff_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ServerBuff.proto\"\221\001\n\nServerBuff\022\027\n\017ser" +
      "ver_buff_uid\030\001 \001(\r\022\026\n\016server_buff_id\030\002 \001" +
      "(\r\022\030\n\020server_buff_type\030\003 \001(\r\022\035\n\025instance" +
      "d_modifier_id\030\004 \001(\r\022\031\n\021is_modifier_added" +
      "\030\005 \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerBuff_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerBuff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerBuff_descriptor,
        new java.lang.String[] { "ServerBuffUid", "ServerBuffId", "ServerBuffType", "InstancedModifierId", "IsModifierAdded", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
