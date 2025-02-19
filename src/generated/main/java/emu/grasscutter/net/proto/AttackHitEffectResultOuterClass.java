// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttackHitEffectResult.proto

package emu.grasscutter.net.proto;

public final class AttackHitEffectResultOuterClass {
  private AttackHitEffectResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AttackHitEffectResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AttackHitEffectResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float ICKHFGPOHOB = 1;</code>
     * @return The iCKHFGPOHOB.
     */
    float getICKHFGPOHOB();

    /**
     * <code>float PJBNLHEDMKH = 2;</code>
     * @return The pJBNLHEDMKH.
     */
    float getPJBNLHEDMKH();

    /**
     * <code>float HEMHBCPCDAP = 3;</code>
     * @return The hEMHBCPCDAP.
     */
    float getHEMHBCPCDAP();

    /**
     * <code>uint32 AJFIGFGCMLO = 12;</code>
     * @return The aJFIGFGCMLO.
     */
    int getAJFIGFGCMLO();

    /**
     * <code>float CEECMAJGHLC = 14;</code>
     * @return The cEECMAJGHLC.
     */
    float getCEECMAJGHLC();

    /**
     * <code>uint32 MHOBBFJGOFL = 15;</code>
     * @return The mHOBBFJGOFL.
     */
    int getMHOBBFJGOFL();
  }
  /**
   * <pre>
   *4.7.0
   * </pre>
   *
   * Protobuf type {@code AttackHitEffectResult}
   */
  public static final class AttackHitEffectResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AttackHitEffectResult)
      AttackHitEffectResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AttackHitEffectResult.newBuilder() to construct.
    private AttackHitEffectResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AttackHitEffectResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AttackHitEffectResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AttackHitEffectResult(
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
            case 13: {

              iCKHFGPOHOB_ = input.readFloat();
              break;
            }
            case 21: {

              pJBNLHEDMKH_ = input.readFloat();
              break;
            }
            case 29: {

              hEMHBCPCDAP_ = input.readFloat();
              break;
            }
            case 96: {

              aJFIGFGCMLO_ = input.readUInt32();
              break;
            }
            case 117: {

              cEECMAJGHLC_ = input.readFloat();
              break;
            }
            case 120: {

              mHOBBFJGOFL_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
    }

    public static final int ICKHFGPOHOB_FIELD_NUMBER = 1;
    private float iCKHFGPOHOB_;
    /**
     * <code>float ICKHFGPOHOB = 1;</code>
     * @return The iCKHFGPOHOB.
     */
    @java.lang.Override
    public float getICKHFGPOHOB() {
      return iCKHFGPOHOB_;
    }

    public static final int PJBNLHEDMKH_FIELD_NUMBER = 2;
    private float pJBNLHEDMKH_;
    /**
     * <code>float PJBNLHEDMKH = 2;</code>
     * @return The pJBNLHEDMKH.
     */
    @java.lang.Override
    public float getPJBNLHEDMKH() {
      return pJBNLHEDMKH_;
    }

    public static final int HEMHBCPCDAP_FIELD_NUMBER = 3;
    private float hEMHBCPCDAP_;
    /**
     * <code>float HEMHBCPCDAP = 3;</code>
     * @return The hEMHBCPCDAP.
     */
    @java.lang.Override
    public float getHEMHBCPCDAP() {
      return hEMHBCPCDAP_;
    }

    public static final int AJFIGFGCMLO_FIELD_NUMBER = 12;
    private int aJFIGFGCMLO_;
    /**
     * <code>uint32 AJFIGFGCMLO = 12;</code>
     * @return The aJFIGFGCMLO.
     */
    @java.lang.Override
    public int getAJFIGFGCMLO() {
      return aJFIGFGCMLO_;
    }

    public static final int CEECMAJGHLC_FIELD_NUMBER = 14;
    private float cEECMAJGHLC_;
    /**
     * <code>float CEECMAJGHLC = 14;</code>
     * @return The cEECMAJGHLC.
     */
    @java.lang.Override
    public float getCEECMAJGHLC() {
      return cEECMAJGHLC_;
    }

    public static final int MHOBBFJGOFL_FIELD_NUMBER = 15;
    private int mHOBBFJGOFL_;
    /**
     * <code>uint32 MHOBBFJGOFL = 15;</code>
     * @return The mHOBBFJGOFL.
     */
    @java.lang.Override
    public int getMHOBBFJGOFL() {
      return mHOBBFJGOFL_;
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
      if (iCKHFGPOHOB_ != 0F) {
        output.writeFloat(1, iCKHFGPOHOB_);
      }
      if (pJBNLHEDMKH_ != 0F) {
        output.writeFloat(2, pJBNLHEDMKH_);
      }
      if (hEMHBCPCDAP_ != 0F) {
        output.writeFloat(3, hEMHBCPCDAP_);
      }
      if (aJFIGFGCMLO_ != 0) {
        output.writeUInt32(12, aJFIGFGCMLO_);
      }
      if (cEECMAJGHLC_ != 0F) {
        output.writeFloat(14, cEECMAJGHLC_);
      }
      if (mHOBBFJGOFL_ != 0) {
        output.writeUInt32(15, mHOBBFJGOFL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iCKHFGPOHOB_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, iCKHFGPOHOB_);
      }
      if (pJBNLHEDMKH_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, pJBNLHEDMKH_);
      }
      if (hEMHBCPCDAP_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, hEMHBCPCDAP_);
      }
      if (aJFIGFGCMLO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, aJFIGFGCMLO_);
      }
      if (cEECMAJGHLC_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(14, cEECMAJGHLC_);
      }
      if (mHOBBFJGOFL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, mHOBBFJGOFL_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other = (emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) obj;

      if (java.lang.Float.floatToIntBits(getICKHFGPOHOB())
          != java.lang.Float.floatToIntBits(
              other.getICKHFGPOHOB())) return false;
      if (java.lang.Float.floatToIntBits(getPJBNLHEDMKH())
          != java.lang.Float.floatToIntBits(
              other.getPJBNLHEDMKH())) return false;
      if (java.lang.Float.floatToIntBits(getHEMHBCPCDAP())
          != java.lang.Float.floatToIntBits(
              other.getHEMHBCPCDAP())) return false;
      if (getAJFIGFGCMLO()
          != other.getAJFIGFGCMLO()) return false;
      if (java.lang.Float.floatToIntBits(getCEECMAJGHLC())
          != java.lang.Float.floatToIntBits(
              other.getCEECMAJGHLC())) return false;
      if (getMHOBBFJGOFL()
          != other.getMHOBBFJGOFL()) return false;
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
      hash = (37 * hash) + ICKHFGPOHOB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getICKHFGPOHOB());
      hash = (37 * hash) + PJBNLHEDMKH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getPJBNLHEDMKH());
      hash = (37 * hash) + HEMHBCPCDAP_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHEMHBCPCDAP());
      hash = (37 * hash) + AJFIGFGCMLO_FIELD_NUMBER;
      hash = (53 * hash) + getAJFIGFGCMLO();
      hash = (37 * hash) + CEECMAJGHLC_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCEECMAJGHLC());
      hash = (37 * hash) + MHOBBFJGOFL_FIELD_NUMBER;
      hash = (53 * hash) + getMHOBBFJGOFL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult prototype) {
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
     * Protobuf type {@code AttackHitEffectResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AttackHitEffectResult)
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.newBuilder()
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
        iCKHFGPOHOB_ = 0F;

        pJBNLHEDMKH_ = 0F;

        hEMHBCPCDAP_ = 0F;

        aJFIGFGCMLO_ = 0;

        cEECMAJGHLC_ = 0F;

        mHOBBFJGOFL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult build() {
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult buildPartial() {
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = new emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult(this);
        result.iCKHFGPOHOB_ = iCKHFGPOHOB_;
        result.pJBNLHEDMKH_ = pJBNLHEDMKH_;
        result.hEMHBCPCDAP_ = hEMHBCPCDAP_;
        result.aJFIGFGCMLO_ = aJFIGFGCMLO_;
        result.cEECMAJGHLC_ = cEECMAJGHLC_;
        result.mHOBBFJGOFL_ = mHOBBFJGOFL_;
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
        if (other instanceof emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) {
          return mergeFrom((emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other) {
        if (other == emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance()) return this;
        if (other.getICKHFGPOHOB() != 0F) {
          setICKHFGPOHOB(other.getICKHFGPOHOB());
        }
        if (other.getPJBNLHEDMKH() != 0F) {
          setPJBNLHEDMKH(other.getPJBNLHEDMKH());
        }
        if (other.getHEMHBCPCDAP() != 0F) {
          setHEMHBCPCDAP(other.getHEMHBCPCDAP());
        }
        if (other.getAJFIGFGCMLO() != 0) {
          setAJFIGFGCMLO(other.getAJFIGFGCMLO());
        }
        if (other.getCEECMAJGHLC() != 0F) {
          setCEECMAJGHLC(other.getCEECMAJGHLC());
        }
        if (other.getMHOBBFJGOFL() != 0) {
          setMHOBBFJGOFL(other.getMHOBBFJGOFL());
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
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float iCKHFGPOHOB_ ;
      /**
       * <code>float ICKHFGPOHOB = 1;</code>
       * @return The iCKHFGPOHOB.
       */
      @java.lang.Override
      public float getICKHFGPOHOB() {
        return iCKHFGPOHOB_;
      }
      /**
       * <code>float ICKHFGPOHOB = 1;</code>
       * @param value The iCKHFGPOHOB to set.
       * @return This builder for chaining.
       */
      public Builder setICKHFGPOHOB(float value) {
        
        iCKHFGPOHOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float ICKHFGPOHOB = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearICKHFGPOHOB() {
        
        iCKHFGPOHOB_ = 0F;
        onChanged();
        return this;
      }

      private float pJBNLHEDMKH_ ;
      /**
       * <code>float PJBNLHEDMKH = 2;</code>
       * @return The pJBNLHEDMKH.
       */
      @java.lang.Override
      public float getPJBNLHEDMKH() {
        return pJBNLHEDMKH_;
      }
      /**
       * <code>float PJBNLHEDMKH = 2;</code>
       * @param value The pJBNLHEDMKH to set.
       * @return This builder for chaining.
       */
      public Builder setPJBNLHEDMKH(float value) {
        
        pJBNLHEDMKH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float PJBNLHEDMKH = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPJBNLHEDMKH() {
        
        pJBNLHEDMKH_ = 0F;
        onChanged();
        return this;
      }

      private float hEMHBCPCDAP_ ;
      /**
       * <code>float HEMHBCPCDAP = 3;</code>
       * @return The hEMHBCPCDAP.
       */
      @java.lang.Override
      public float getHEMHBCPCDAP() {
        return hEMHBCPCDAP_;
      }
      /**
       * <code>float HEMHBCPCDAP = 3;</code>
       * @param value The hEMHBCPCDAP to set.
       * @return This builder for chaining.
       */
      public Builder setHEMHBCPCDAP(float value) {
        
        hEMHBCPCDAP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float HEMHBCPCDAP = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHEMHBCPCDAP() {
        
        hEMHBCPCDAP_ = 0F;
        onChanged();
        return this;
      }

      private int aJFIGFGCMLO_ ;
      /**
       * <code>uint32 AJFIGFGCMLO = 12;</code>
       * @return The aJFIGFGCMLO.
       */
      @java.lang.Override
      public int getAJFIGFGCMLO() {
        return aJFIGFGCMLO_;
      }
      /**
       * <code>uint32 AJFIGFGCMLO = 12;</code>
       * @param value The aJFIGFGCMLO to set.
       * @return This builder for chaining.
       */
      public Builder setAJFIGFGCMLO(int value) {
        
        aJFIGFGCMLO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AJFIGFGCMLO = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAJFIGFGCMLO() {
        
        aJFIGFGCMLO_ = 0;
        onChanged();
        return this;
      }

      private float cEECMAJGHLC_ ;
      /**
       * <code>float CEECMAJGHLC = 14;</code>
       * @return The cEECMAJGHLC.
       */
      @java.lang.Override
      public float getCEECMAJGHLC() {
        return cEECMAJGHLC_;
      }
      /**
       * <code>float CEECMAJGHLC = 14;</code>
       * @param value The cEECMAJGHLC to set.
       * @return This builder for chaining.
       */
      public Builder setCEECMAJGHLC(float value) {
        
        cEECMAJGHLC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float CEECMAJGHLC = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCEECMAJGHLC() {
        
        cEECMAJGHLC_ = 0F;
        onChanged();
        return this;
      }

      private int mHOBBFJGOFL_ ;
      /**
       * <code>uint32 MHOBBFJGOFL = 15;</code>
       * @return The mHOBBFJGOFL.
       */
      @java.lang.Override
      public int getMHOBBFJGOFL() {
        return mHOBBFJGOFL_;
      }
      /**
       * <code>uint32 MHOBBFJGOFL = 15;</code>
       * @param value The mHOBBFJGOFL to set.
       * @return This builder for chaining.
       */
      public Builder setMHOBBFJGOFL(int value) {
        
        mHOBBFJGOFL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MHOBBFJGOFL = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMHOBBFJGOFL() {
        
        mHOBBFJGOFL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AttackHitEffectResult)
    }

    // @@protoc_insertion_point(class_scope:AttackHitEffectResult)
    private static final emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult();
    }

    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AttackHitEffectResult>
        PARSER = new com.google.protobuf.AbstractParser<AttackHitEffectResult>() {
      @java.lang.Override
      public AttackHitEffectResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttackHitEffectResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AttackHitEffectResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AttackHitEffectResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttackHitEffectResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttackHitEffectResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AttackHitEffectResult.proto\"\225\001\n\025Attack" +
      "HitEffectResult\022\023\n\013ICKHFGPOHOB\030\001 \001(\002\022\023\n\013" +
      "PJBNLHEDMKH\030\002 \001(\002\022\023\n\013HEMHBCPCDAP\030\003 \001(\002\022\023" +
      "\n\013AJFIGFGCMLO\030\014 \001(\r\022\023\n\013CEECMAJGHLC\030\016 \001(\002" +
      "\022\023\n\013MHOBBFJGOFL\030\017 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AttackHitEffectResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AttackHitEffectResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttackHitEffectResult_descriptor,
        new java.lang.String[] { "ICKHFGPOHOB", "PJBNLHEDMKH", "HEMHBCPCDAP", "AJFIGFGCMLO", "CEECMAJGHLC", "MHOBBFJGOFL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
