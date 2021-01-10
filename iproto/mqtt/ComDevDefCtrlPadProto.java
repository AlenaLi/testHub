// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0103_ComDevDef_ctrlpad.proto

package google.iproto.mqtt;

public final class ComDevDefCtrlPadProto {
  private ComDevDefCtrlPadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface dev_ctrlpad_infoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.dev_ctrlpad_info)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *面板ID，由面板侧自动生成全网唯一ID信息
     * </pre>
     *
     * <code>int32 dev_id = 1;</code>
     */
    int getDevId();

    /**
     * <pre>
     *固定面&amp;&amp; 移动面板，面板侧统一定义
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 2;</code>
     */
    int getDevTypeValue();
    /**
     * <pre>
     *固定面&amp;&amp; 移动面板，面板侧统一定义
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 2;</code>
     */
    google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type getDevType();

    /**
     * <pre>
     *当前按键个数
     * </pre>
     *
     * <code>uint32 key_no = 3;</code>
     */
    int getKeyNo();

    /**
     * <pre>
     *按键类型
     * </pre>
     *
     * <code>uint32 key_type = 4;</code>
     */
    int getKeyType();
  }
  /**
   * <pre>
   * 定义面板开关属性信息 
   * </pre>
   *
   * Protobuf type {@code google.iproto.dev_ctrlpad_info}
   */
  public  static final class dev_ctrlpad_info extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.dev_ctrlpad_info)
      dev_ctrlpad_infoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use dev_ctrlpad_info.newBuilder() to construct.
    private dev_ctrlpad_info(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private dev_ctrlpad_info() {
      devId_ = 0;
      devType_ = 0;
      keyNo_ = 0;
      keyType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private dev_ctrlpad_info(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              devId_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              devType_ = rawValue;
              break;
            }
            case 24: {

              keyNo_ = input.readUInt32();
              break;
            }
            case 32: {

              keyType_ = input.readUInt32();
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
      return google.iproto.mqtt.ComDevDefCtrlPadProto.internal_static_google_iproto_dev_ctrlpad_info_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.ComDevDefCtrlPadProto.internal_static_google_iproto_dev_ctrlpad_info_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info.class, google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info.Builder.class);
    }

    public static final int DEV_ID_FIELD_NUMBER = 1;
    private int devId_;
    /**
     * <pre>
     *面板ID，由面板侧自动生成全网唯一ID信息
     * </pre>
     *
     * <code>int32 dev_id = 1;</code>
     */
    public int getDevId() {
      return devId_;
    }

    public static final int DEV_TYPE_FIELD_NUMBER = 2;
    private int devType_;
    /**
     * <pre>
     *固定面&amp;&amp; 移动面板，面板侧统一定义
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 2;</code>
     */
    public int getDevTypeValue() {
      return devType_;
    }
    /**
     * <pre>
     *固定面&amp;&amp; 移动面板，面板侧统一定义
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 2;</code>
     */
    public google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type getDevType() {
      google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type result = google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.valueOf(devType_);
      return result == null ? google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.UNRECOGNIZED : result;
    }

    public static final int KEY_NO_FIELD_NUMBER = 3;
    private int keyNo_;
    /**
     * <pre>
     *当前按键个数
     * </pre>
     *
     * <code>uint32 key_no = 3;</code>
     */
    public int getKeyNo() {
      return keyNo_;
    }

    public static final int KEY_TYPE_FIELD_NUMBER = 4;
    private int keyType_;
    /**
     * <pre>
     *按键类型
     * </pre>
     *
     * <code>uint32 key_type = 4;</code>
     */
    public int getKeyType() {
      return keyType_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (devId_ != 0) {
        output.writeInt32(1, devId_);
      }
      if (devType_ != google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.devtype_release.getNumber()) {
        output.writeEnum(2, devType_);
      }
      if (keyNo_ != 0) {
        output.writeUInt32(3, keyNo_);
      }
      if (keyType_ != 0) {
        output.writeUInt32(4, keyType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (devId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, devId_);
      }
      if (devType_ != google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.devtype_release.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, devType_);
      }
      if (keyNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, keyNo_);
      }
      if (keyType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, keyType_);
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
      if (!(obj instanceof google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info other = (google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info) obj;

      boolean result = true;
      result = result && (getDevId()
          == other.getDevId());
      result = result && devType_ == other.devType_;
      result = result && (getKeyNo()
          == other.getKeyNo());
      result = result && (getKeyType()
          == other.getKeyType());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDevId();
      hash = (37 * hash) + DEV_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + devType_;
      hash = (37 * hash) + KEY_NO_FIELD_NUMBER;
      hash = (53 * hash) + getKeyNo();
      hash = (37 * hash) + KEY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getKeyType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * 定义面板开关属性信息 
     * </pre>
     *
     * Protobuf type {@code google.iproto.dev_ctrlpad_info}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.dev_ctrlpad_info)
        google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_infoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.ComDevDefCtrlPadProto.internal_static_google_iproto_dev_ctrlpad_info_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.ComDevDefCtrlPadProto.internal_static_google_iproto_dev_ctrlpad_info_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info.class, google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info.Builder.class);
      }

      // Construct using google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info.newBuilder()
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
      public Builder clear() {
        super.clear();
        devId_ = 0;

        devType_ = 0;

        keyNo_ = 0;

        keyType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.ComDevDefCtrlPadProto.internal_static_google_iproto_dev_ctrlpad_info_descriptor;
      }

      public google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info getDefaultInstanceForType() {
        return google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info.getDefaultInstance();
      }

      public google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info build() {
        google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info buildPartial() {
        google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info result = new google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info(this);
        result.devId_ = devId_;
        result.devType_ = devType_;
        result.keyNo_ = keyNo_;
        result.keyType_ = keyType_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info) {
          return mergeFrom((google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info other) {
        if (other == google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info.getDefaultInstance()) return this;
        if (other.getDevId() != 0) {
          setDevId(other.getDevId());
        }
        if (other.devType_ != 0) {
          setDevTypeValue(other.getDevTypeValue());
        }
        if (other.getKeyNo() != 0) {
          setKeyNo(other.getKeyNo());
        }
        if (other.getKeyType() != 0) {
          setKeyType(other.getKeyType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int devId_ ;
      /**
       * <pre>
       *面板ID，由面板侧自动生成全网唯一ID信息
       * </pre>
       *
       * <code>int32 dev_id = 1;</code>
       */
      public int getDevId() {
        return devId_;
      }
      /**
       * <pre>
       *面板ID，由面板侧自动生成全网唯一ID信息
       * </pre>
       *
       * <code>int32 dev_id = 1;</code>
       */
      public Builder setDevId(int value) {
        
        devId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *面板ID，由面板侧自动生成全网唯一ID信息
       * </pre>
       *
       * <code>int32 dev_id = 1;</code>
       */
      public Builder clearDevId() {
        
        devId_ = 0;
        onChanged();
        return this;
      }

      private int devType_ = 0;
      /**
       * <pre>
       *固定面&amp;&amp; 移动面板，面板侧统一定义
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 2;</code>
       */
      public int getDevTypeValue() {
        return devType_;
      }
      /**
       * <pre>
       *固定面&amp;&amp; 移动面板，面板侧统一定义
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 2;</code>
       */
      public Builder setDevTypeValue(int value) {
        devType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *固定面&amp;&amp; 移动面板，面板侧统一定义
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 2;</code>
       */
      public google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type getDevType() {
        google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type result = google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.valueOf(devType_);
        return result == null ? google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *固定面&amp;&amp; 移动面板，面板侧统一定义
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 2;</code>
       */
      public Builder setDevType(google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        devType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *固定面&amp;&amp; 移动面板，面板侧统一定义
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 2;</code>
       */
      public Builder clearDevType() {
        
        devType_ = 0;
        onChanged();
        return this;
      }

      private int keyNo_ ;
      /**
       * <pre>
       *当前按键个数
       * </pre>
       *
       * <code>uint32 key_no = 3;</code>
       */
      public int getKeyNo() {
        return keyNo_;
      }
      /**
       * <pre>
       *当前按键个数
       * </pre>
       *
       * <code>uint32 key_no = 3;</code>
       */
      public Builder setKeyNo(int value) {
        
        keyNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *当前按键个数
       * </pre>
       *
       * <code>uint32 key_no = 3;</code>
       */
      public Builder clearKeyNo() {
        
        keyNo_ = 0;
        onChanged();
        return this;
      }

      private int keyType_ ;
      /**
       * <pre>
       *按键类型
       * </pre>
       *
       * <code>uint32 key_type = 4;</code>
       */
      public int getKeyType() {
        return keyType_;
      }
      /**
       * <pre>
       *按键类型
       * </pre>
       *
       * <code>uint32 key_type = 4;</code>
       */
      public Builder setKeyType(int value) {
        
        keyType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *按键类型
       * </pre>
       *
       * <code>uint32 key_type = 4;</code>
       */
      public Builder clearKeyType() {
        
        keyType_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:google.iproto.dev_ctrlpad_info)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.dev_ctrlpad_info)
    private static final google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info();
    }

    public static google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<dev_ctrlpad_info>
        PARSER = new com.google.protobuf.AbstractParser<dev_ctrlpad_info>() {
      public dev_ctrlpad_info parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new dev_ctrlpad_info(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<dev_ctrlpad_info> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<dev_ctrlpad_info> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.ComDevDefCtrlPadProto.dev_ctrlpad_info getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_dev_ctrlpad_info_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_dev_ctrlpad_info_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/iproto/mqtt/p0103_ComDevDef_ctr" +
      "lpad.proto\022\rgoogle.iproto\0323google/iproto" +
      "/mqtt/p0101_ComDevDef_devicetype.proto\"r" +
      "\n\020dev_ctrlpad_info\022\016\n\006dev_id\030\001 \001(\005\022,\n\010de" +
      "v_type\030\002 \001(\0162\032.google.iproto.device_type" +
      "\022\016\n\006key_no\030\003 \001(\r\022\020\n\010key_type\030\004 \001(\rB+\n\022go" +
      "ogle.iproto.mqttB\025ComDevDefCtrlPadProtob" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          google.iproto.mqtt.ComDevDefDeviceTypeProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_dev_ctrlpad_info_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_dev_ctrlpad_info_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_dev_ctrlpad_info_descriptor,
        new java.lang.String[] { "DevId", "DevType", "KeyNo", "KeyType", });
    google.iproto.mqtt.ComDevDefDeviceTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}