// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DeactiveGadget.proto

package emu.grasscutter.net.proto;

public final class DeactiveGadgetOuterClass {
  private DeactiveGadgetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeactiveGadgetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeactiveGadget)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ABGKFCBNDIE = 3;</code>
     * @return The aBGKFCBNDIE.
     */
    int getABGKFCBNDIE();
  }
  /**
   * <pre>
   * Obf: GCEHGMNJNOG
   * </pre>
   *
   * Protobuf type {@code DeactiveGadget}
   */
  public static final class DeactiveGadget extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DeactiveGadget)
      DeactiveGadgetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeactiveGadget.newBuilder() to construct.
    private DeactiveGadget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeactiveGadget() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DeactiveGadget();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DeactiveGadget(
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
            case 24: {

              aBGKFCBNDIE_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DeactiveGadgetOuterClass.internal_static_DeactiveGadget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DeactiveGadgetOuterClass.internal_static_DeactiveGadget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget.class, emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget.Builder.class);
    }

    public static final int ABGKFCBNDIE_FIELD_NUMBER = 3;
    private int aBGKFCBNDIE_;
    /**
     * <code>uint32 ABGKFCBNDIE = 3;</code>
     * @return The aBGKFCBNDIE.
     */
    @java.lang.Override
    public int getABGKFCBNDIE() {
      return aBGKFCBNDIE_;
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
      if (aBGKFCBNDIE_ != 0) {
        output.writeUInt32(3, aBGKFCBNDIE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aBGKFCBNDIE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, aBGKFCBNDIE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget other = (emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget) obj;

      if (getABGKFCBNDIE()
          != other.getABGKFCBNDIE()) return false;
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
      hash = (37 * hash) + ABGKFCBNDIE_FIELD_NUMBER;
      hash = (53 * hash) + getABGKFCBNDIE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget prototype) {
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
     * Obf: GCEHGMNJNOG
     * </pre>
     *
     * Protobuf type {@code DeactiveGadget}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeactiveGadget)
        emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadgetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DeactiveGadgetOuterClass.internal_static_DeactiveGadget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DeactiveGadgetOuterClass.internal_static_DeactiveGadget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget.class, emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget.newBuilder()
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
        aBGKFCBNDIE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DeactiveGadgetOuterClass.internal_static_DeactiveGadget_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget build() {
        emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget buildPartial() {
        emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget result = new emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget(this);
        result.aBGKFCBNDIE_ = aBGKFCBNDIE_;
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
        if (other instanceof emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget) {
          return mergeFrom((emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget other) {
        if (other == emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget.getDefaultInstance()) return this;
        if (other.getABGKFCBNDIE() != 0) {
          setABGKFCBNDIE(other.getABGKFCBNDIE());
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
        emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int aBGKFCBNDIE_ ;
      /**
       * <code>uint32 ABGKFCBNDIE = 3;</code>
       * @return The aBGKFCBNDIE.
       */
      @java.lang.Override
      public int getABGKFCBNDIE() {
        return aBGKFCBNDIE_;
      }
      /**
       * <code>uint32 ABGKFCBNDIE = 3;</code>
       * @param value The aBGKFCBNDIE to set.
       * @return This builder for chaining.
       */
      public Builder setABGKFCBNDIE(int value) {
        
        aBGKFCBNDIE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ABGKFCBNDIE = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearABGKFCBNDIE() {
        
        aBGKFCBNDIE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DeactiveGadget)
    }

    // @@protoc_insertion_point(class_scope:DeactiveGadget)
    private static final emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget();
    }

    public static emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeactiveGadget>
        PARSER = new com.google.protobuf.AbstractParser<DeactiveGadget>() {
      @java.lang.Override
      public DeactiveGadget parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeactiveGadget(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DeactiveGadget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeactiveGadget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DeactiveGadgetOuterClass.DeactiveGadget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeactiveGadget_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeactiveGadget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024DeactiveGadget.proto\"%\n\016DeactiveGadget" +
      "\022\023\n\013ABGKFCBNDIE\030\003 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DeactiveGadget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeactiveGadget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeactiveGadget_descriptor,
        new java.lang.String[] { "ABGKFCBNDIE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}