// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0501_UsrDev_433keyoperate.proto

package google.iproto.mqtt;

public final class UsrDev433KeyOperateProto {
  private UsrDev433KeyOperateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface usrdev_433keyoperateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.usrdev_433keyoperate)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *需要控制的设备dev_id
     * </pre>
     *
     * <code>int32 usrdev_id = 1;</code>
     */
    int getUsrdevId();

    /**
     * <pre>
     *按键编号
     * </pre>
     *
     * <code>int32 key_no = 2;</code>
     */
    int getKeyNo();

    /**
     * <pre>
     **1:学习绑定，2:删除，3:执行该按键（发送学习到的按键码）, 4: 学习完成
     * </pre>
     *
     * <code>int32 optcmd = 3;</code>
     */
    int getOptcmd();

    /**
     * <pre>
     *设备类型
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 4;</code>
     */
    int getDevTypeValue();
    /**
     * <pre>
     *设备类型
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 4;</code>
     */
    google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type getDevType();

    /**
     * <pre>
     *窗帘1000 表示其它，第一个品牌是1001
     *新风2000 表示其它，第一个品牌是2001
     *地暖3000 表示其它，第一个品牌是3001
     *其它设备 0 表示其它，
     * </pre>
     *
     * <code>int32 product = 5;</code>
     */
    int getProduct();
  }
  /**
   * <pre>
   * 433设备开始按键学习，或者删除
   * </pre>
   *
   * Protobuf type {@code google.iproto.usrdev_433keyoperate}
   */
  public  static final class usrdev_433keyoperate extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.usrdev_433keyoperate)
      usrdev_433keyoperateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use usrdev_433keyoperate.newBuilder() to construct.
    private usrdev_433keyoperate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private usrdev_433keyoperate() {
      usrdevId_ = 0;
      keyNo_ = 0;
      optcmd_ = 0;
      devType_ = 0;
      product_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private usrdev_433keyoperate(
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

              usrdevId_ = input.readInt32();
              break;
            }
            case 16: {

              keyNo_ = input.readInt32();
              break;
            }
            case 24: {

              optcmd_ = input.readInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              devType_ = rawValue;
              break;
            }
            case 40: {

              product_ = input.readInt32();
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
      return google.iproto.mqtt.UsrDev433KeyOperateProto.internal_static_google_iproto_usrdev_433keyoperate_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.UsrDev433KeyOperateProto.internal_static_google_iproto_usrdev_433keyoperate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate.class, google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate.Builder.class);
    }

    public static final int USRDEV_ID_FIELD_NUMBER = 1;
    private int usrdevId_;
    /**
     * <pre>
     *需要控制的设备dev_id
     * </pre>
     *
     * <code>int32 usrdev_id = 1;</code>
     */
    public int getUsrdevId() {
      return usrdevId_;
    }

    public static final int KEY_NO_FIELD_NUMBER = 2;
    private int keyNo_;
    /**
     * <pre>
     *按键编号
     * </pre>
     *
     * <code>int32 key_no = 2;</code>
     */
    public int getKeyNo() {
      return keyNo_;
    }

    public static final int OPTCMD_FIELD_NUMBER = 3;
    private int optcmd_;
    /**
     * <pre>
     **1:学习绑定，2:删除，3:执行该按键（发送学习到的按键码）, 4: 学习完成
     * </pre>
     *
     * <code>int32 optcmd = 3;</code>
     */
    public int getOptcmd() {
      return optcmd_;
    }

    public static final int DEV_TYPE_FIELD_NUMBER = 4;
    private int devType_;
    /**
     * <pre>
     *设备类型
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 4;</code>
     */
    public int getDevTypeValue() {
      return devType_;
    }
    /**
     * <pre>
     *设备类型
     * </pre>
     *
     * <code>.google.iproto.device_type dev_type = 4;</code>
     */
    public google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type getDevType() {
      google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type result = google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.valueOf(devType_);
      return result == null ? google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.UNRECOGNIZED : result;
    }

    public static final int PRODUCT_FIELD_NUMBER = 5;
    private int product_;
    /**
     * <pre>
     *窗帘1000 表示其它，第一个品牌是1001
     *新风2000 表示其它，第一个品牌是2001
     *地暖3000 表示其它，第一个品牌是3001
     *其它设备 0 表示其它，
     * </pre>
     *
     * <code>int32 product = 5;</code>
     */
    public int getProduct() {
      return product_;
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
      if (usrdevId_ != 0) {
        output.writeInt32(1, usrdevId_);
      }
      if (keyNo_ != 0) {
        output.writeInt32(2, keyNo_);
      }
      if (optcmd_ != 0) {
        output.writeInt32(3, optcmd_);
      }
      if (devType_ != google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.devtype_release.getNumber()) {
        output.writeEnum(4, devType_);
      }
      if (product_ != 0) {
        output.writeInt32(5, product_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (usrdevId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, usrdevId_);
      }
      if (keyNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, keyNo_);
      }
      if (optcmd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, optcmd_);
      }
      if (devType_ != google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.devtype_release.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, devType_);
      }
      if (product_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, product_);
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
      if (!(obj instanceof google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate other = (google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate) obj;

      boolean result = true;
      result = result && (getUsrdevId()
          == other.getUsrdevId());
      result = result && (getKeyNo()
          == other.getKeyNo());
      result = result && (getOptcmd()
          == other.getOptcmd());
      result = result && devType_ == other.devType_;
      result = result && (getProduct()
          == other.getProduct());
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
      hash = (37 * hash) + USRDEV_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUsrdevId();
      hash = (37 * hash) + KEY_NO_FIELD_NUMBER;
      hash = (53 * hash) + getKeyNo();
      hash = (37 * hash) + OPTCMD_FIELD_NUMBER;
      hash = (53 * hash) + getOptcmd();
      hash = (37 * hash) + DEV_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + devType_;
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate prototype) {
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
     * 433设备开始按键学习，或者删除
     * </pre>
     *
     * Protobuf type {@code google.iproto.usrdev_433keyoperate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.usrdev_433keyoperate)
        google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.UsrDev433KeyOperateProto.internal_static_google_iproto_usrdev_433keyoperate_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.UsrDev433KeyOperateProto.internal_static_google_iproto_usrdev_433keyoperate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate.class, google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate.Builder.class);
      }

      // Construct using google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate.newBuilder()
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
        usrdevId_ = 0;

        keyNo_ = 0;

        optcmd_ = 0;

        devType_ = 0;

        product_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.UsrDev433KeyOperateProto.internal_static_google_iproto_usrdev_433keyoperate_descriptor;
      }

      public google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate getDefaultInstanceForType() {
        return google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate.getDefaultInstance();
      }

      public google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate build() {
        google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate buildPartial() {
        google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate result = new google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate(this);
        result.usrdevId_ = usrdevId_;
        result.keyNo_ = keyNo_;
        result.optcmd_ = optcmd_;
        result.devType_ = devType_;
        result.product_ = product_;
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
        if (other instanceof google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate) {
          return mergeFrom((google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate other) {
        if (other == google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate.getDefaultInstance()) return this;
        if (other.getUsrdevId() != 0) {
          setUsrdevId(other.getUsrdevId());
        }
        if (other.getKeyNo() != 0) {
          setKeyNo(other.getKeyNo());
        }
        if (other.getOptcmd() != 0) {
          setOptcmd(other.getOptcmd());
        }
        if (other.devType_ != 0) {
          setDevTypeValue(other.getDevTypeValue());
        }
        if (other.getProduct() != 0) {
          setProduct(other.getProduct());
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
        google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int usrdevId_ ;
      /**
       * <pre>
       *需要控制的设备dev_id
       * </pre>
       *
       * <code>int32 usrdev_id = 1;</code>
       */
      public int getUsrdevId() {
        return usrdevId_;
      }
      /**
       * <pre>
       *需要控制的设备dev_id
       * </pre>
       *
       * <code>int32 usrdev_id = 1;</code>
       */
      public Builder setUsrdevId(int value) {
        
        usrdevId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *需要控制的设备dev_id
       * </pre>
       *
       * <code>int32 usrdev_id = 1;</code>
       */
      public Builder clearUsrdevId() {
        
        usrdevId_ = 0;
        onChanged();
        return this;
      }

      private int keyNo_ ;
      /**
       * <pre>
       *按键编号
       * </pre>
       *
       * <code>int32 key_no = 2;</code>
       */
      public int getKeyNo() {
        return keyNo_;
      }
      /**
       * <pre>
       *按键编号
       * </pre>
       *
       * <code>int32 key_no = 2;</code>
       */
      public Builder setKeyNo(int value) {
        
        keyNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *按键编号
       * </pre>
       *
       * <code>int32 key_no = 2;</code>
       */
      public Builder clearKeyNo() {
        
        keyNo_ = 0;
        onChanged();
        return this;
      }

      private int optcmd_ ;
      /**
       * <pre>
       **1:学习绑定，2:删除，3:执行该按键（发送学习到的按键码）, 4: 学习完成
       * </pre>
       *
       * <code>int32 optcmd = 3;</code>
       */
      public int getOptcmd() {
        return optcmd_;
      }
      /**
       * <pre>
       **1:学习绑定，2:删除，3:执行该按键（发送学习到的按键码）, 4: 学习完成
       * </pre>
       *
       * <code>int32 optcmd = 3;</code>
       */
      public Builder setOptcmd(int value) {
        
        optcmd_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       **1:学习绑定，2:删除，3:执行该按键（发送学习到的按键码）, 4: 学习完成
       * </pre>
       *
       * <code>int32 optcmd = 3;</code>
       */
      public Builder clearOptcmd() {
        
        optcmd_ = 0;
        onChanged();
        return this;
      }

      private int devType_ = 0;
      /**
       * <pre>
       *设备类型
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 4;</code>
       */
      public int getDevTypeValue() {
        return devType_;
      }
      /**
       * <pre>
       *设备类型
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 4;</code>
       */
      public Builder setDevTypeValue(int value) {
        devType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *设备类型
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 4;</code>
       */
      public google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type getDevType() {
        google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type result = google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.valueOf(devType_);
        return result == null ? google.iproto.mqtt.ComDevDefDeviceTypeProto.device_type.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *设备类型
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 4;</code>
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
       *设备类型
       * </pre>
       *
       * <code>.google.iproto.device_type dev_type = 4;</code>
       */
      public Builder clearDevType() {
        
        devType_ = 0;
        onChanged();
        return this;
      }

      private int product_ ;
      /**
       * <pre>
       *窗帘1000 表示其它，第一个品牌是1001
       *新风2000 表示其它，第一个品牌是2001
       *地暖3000 表示其它，第一个品牌是3001
       *其它设备 0 表示其它，
       * </pre>
       *
       * <code>int32 product = 5;</code>
       */
      public int getProduct() {
        return product_;
      }
      /**
       * <pre>
       *窗帘1000 表示其它，第一个品牌是1001
       *新风2000 表示其它，第一个品牌是2001
       *地暖3000 表示其它，第一个品牌是3001
       *其它设备 0 表示其它，
       * </pre>
       *
       * <code>int32 product = 5;</code>
       */
      public Builder setProduct(int value) {
        
        product_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *窗帘1000 表示其它，第一个品牌是1001
       *新风2000 表示其它，第一个品牌是2001
       *地暖3000 表示其它，第一个品牌是3001
       *其它设备 0 表示其它，
       * </pre>
       *
       * <code>int32 product = 5;</code>
       */
      public Builder clearProduct() {
        
        product_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.usrdev_433keyoperate)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.usrdev_433keyoperate)
    private static final google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate();
    }

    public static google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<usrdev_433keyoperate>
        PARSER = new com.google.protobuf.AbstractParser<usrdev_433keyoperate>() {
      public usrdev_433keyoperate parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new usrdev_433keyoperate(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<usrdev_433keyoperate> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<usrdev_433keyoperate> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.UsrDev433KeyOperateProto.usrdev_433keyoperate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_usrdev_433keyoperate_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_usrdev_433keyoperate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/iproto/mqtt/p0501_UsrDev_433key" +
      "operate.proto\022\rgoogle.iproto\0323google/ipr" +
      "oto/mqtt/p0101_ComDevDef_devicetype.prot" +
      "o\"\210\001\n\024usrdev_433keyoperate\022\021\n\tusrdev_id\030" +
      "\001 \001(\005\022\016\n\006key_no\030\002 \001(\005\022\016\n\006optcmd\030\003 \001(\005\022,\n" +
      "\010dev_type\030\004 \001(\0162\032.google.iproto.device_t" +
      "ype\022\017\n\007product\030\005 \001(\005B.\n\022google.iproto.mq" +
      "ttB\030UsrDev433KeyOperateProtob\006proto3"
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
    internal_static_google_iproto_usrdev_433keyoperate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_usrdev_433keyoperate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_usrdev_433keyoperate_descriptor,
        new java.lang.String[] { "UsrdevId", "KeyNo", "Optcmd", "DevType", "Product", });
    google.iproto.mqtt.ComDevDefDeviceTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}