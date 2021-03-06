// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0201_GW_connect.proto

package google.iproto.mqtt;

public final class GWConnectProto {
  private GWConnectProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface gateway_connectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.gateway_connect)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *绑定时从App带过来的HomeId, 服务器通过该homeid申请mqtt devname
     * </pre>
     *
     * <code>int32 home_id = 1;</code>
     */
    int getHomeId();

    /**
     * <pre>
     *绑定面板的用户ID
     * </pre>
     *
     * <code>int32 usr_id = 2;</code>
     */
    int getUsrId();

    /**
     * <pre>
     *已有的devname，如果没有则填"&#92;0"
     * </pre>
     *
     * <code>string mqtt_devName = 3;</code>
     */
    java.lang.String getMqttDevName();
    /**
     * <pre>
     *已有的devname，如果没有则填"&#92;0"
     * </pre>
     *
     * <code>string mqtt_devName = 3;</code>
     */
    com.google.protobuf.ByteString
        getMqttDevNameBytes();

    /**
     * <pre>
     *后续绑定网关，携带之前的homeid
     * </pre>
     *
     * <code>int32 old_home_id = 4;</code>
     */
    int getOldHomeId();
  }
  /**
   * <pre>
   * 设备入网，主动将自己的基本信息发给服务器，如果超时没有收到响应，则继续向服务器发送 
   * </pre>
   *
   * Protobuf type {@code google.iproto.gateway_connect}
   */
  public  static final class gateway_connect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.gateway_connect)
      gateway_connectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use gateway_connect.newBuilder() to construct.
    private gateway_connect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private gateway_connect() {
      homeId_ = 0;
      usrId_ = 0;
      mqttDevName_ = "";
      oldHomeId_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private gateway_connect(
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

              homeId_ = input.readInt32();
              break;
            }
            case 16: {

              usrId_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              mqttDevName_ = s;
              break;
            }
            case 32: {

              oldHomeId_ = input.readInt32();
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
      return google.iproto.mqtt.GWConnectProto.internal_static_google_iproto_gateway_connect_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.GWConnectProto.internal_static_google_iproto_gateway_connect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.GWConnectProto.gateway_connect.class, google.iproto.mqtt.GWConnectProto.gateway_connect.Builder.class);
    }

    public static final int HOME_ID_FIELD_NUMBER = 1;
    private int homeId_;
    /**
     * <pre>
     *绑定时从App带过来的HomeId, 服务器通过该homeid申请mqtt devname
     * </pre>
     *
     * <code>int32 home_id = 1;</code>
     */
    public int getHomeId() {
      return homeId_;
    }

    public static final int USR_ID_FIELD_NUMBER = 2;
    private int usrId_;
    /**
     * <pre>
     *绑定面板的用户ID
     * </pre>
     *
     * <code>int32 usr_id = 2;</code>
     */
    public int getUsrId() {
      return usrId_;
    }

    public static final int MQTT_DEVNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object mqttDevName_;
    /**
     * <pre>
     *已有的devname，如果没有则填"&#92;0"
     * </pre>
     *
     * <code>string mqtt_devName = 3;</code>
     */
    public java.lang.String getMqttDevName() {
      java.lang.Object ref = mqttDevName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mqttDevName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *已有的devname，如果没有则填"&#92;0"
     * </pre>
     *
     * <code>string mqtt_devName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMqttDevNameBytes() {
      java.lang.Object ref = mqttDevName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mqttDevName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OLD_HOME_ID_FIELD_NUMBER = 4;
    private int oldHomeId_;
    /**
     * <pre>
     *后续绑定网关，携带之前的homeid
     * </pre>
     *
     * <code>int32 old_home_id = 4;</code>
     */
    public int getOldHomeId() {
      return oldHomeId_;
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
      if (homeId_ != 0) {
        output.writeInt32(1, homeId_);
      }
      if (usrId_ != 0) {
        output.writeInt32(2, usrId_);
      }
      if (!getMqttDevNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mqttDevName_);
      }
      if (oldHomeId_ != 0) {
        output.writeInt32(4, oldHomeId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (homeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, homeId_);
      }
      if (usrId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, usrId_);
      }
      if (!getMqttDevNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mqttDevName_);
      }
      if (oldHomeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, oldHomeId_);
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
      if (!(obj instanceof google.iproto.mqtt.GWConnectProto.gateway_connect)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.GWConnectProto.gateway_connect other = (google.iproto.mqtt.GWConnectProto.gateway_connect) obj;

      boolean result = true;
      result = result && (getHomeId()
          == other.getHomeId());
      result = result && (getUsrId()
          == other.getUsrId());
      result = result && getMqttDevName()
          .equals(other.getMqttDevName());
      result = result && (getOldHomeId()
          == other.getOldHomeId());
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
      hash = (37 * hash) + HOME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getHomeId();
      hash = (37 * hash) + USR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUsrId();
      hash = (37 * hash) + MQTT_DEVNAME_FIELD_NUMBER;
      hash = (53 * hash) + getMqttDevName().hashCode();
      hash = (37 * hash) + OLD_HOME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOldHomeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWConnectProto.gateway_connect parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.GWConnectProto.gateway_connect prototype) {
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
     * 设备入网，主动将自己的基本信息发给服务器，如果超时没有收到响应，则继续向服务器发送 
     * </pre>
     *
     * Protobuf type {@code google.iproto.gateway_connect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.gateway_connect)
        google.iproto.mqtt.GWConnectProto.gateway_connectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.GWConnectProto.internal_static_google_iproto_gateway_connect_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.GWConnectProto.internal_static_google_iproto_gateway_connect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.GWConnectProto.gateway_connect.class, google.iproto.mqtt.GWConnectProto.gateway_connect.Builder.class);
      }

      // Construct using google.iproto.mqtt.GWConnectProto.gateway_connect.newBuilder()
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
        homeId_ = 0;

        usrId_ = 0;

        mqttDevName_ = "";

        oldHomeId_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.GWConnectProto.internal_static_google_iproto_gateway_connect_descriptor;
      }

      public google.iproto.mqtt.GWConnectProto.gateway_connect getDefaultInstanceForType() {
        return google.iproto.mqtt.GWConnectProto.gateway_connect.getDefaultInstance();
      }

      public google.iproto.mqtt.GWConnectProto.gateway_connect build() {
        google.iproto.mqtt.GWConnectProto.gateway_connect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.GWConnectProto.gateway_connect buildPartial() {
        google.iproto.mqtt.GWConnectProto.gateway_connect result = new google.iproto.mqtt.GWConnectProto.gateway_connect(this);
        result.homeId_ = homeId_;
        result.usrId_ = usrId_;
        result.mqttDevName_ = mqttDevName_;
        result.oldHomeId_ = oldHomeId_;
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
        if (other instanceof google.iproto.mqtt.GWConnectProto.gateway_connect) {
          return mergeFrom((google.iproto.mqtt.GWConnectProto.gateway_connect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.GWConnectProto.gateway_connect other) {
        if (other == google.iproto.mqtt.GWConnectProto.gateway_connect.getDefaultInstance()) return this;
        if (other.getHomeId() != 0) {
          setHomeId(other.getHomeId());
        }
        if (other.getUsrId() != 0) {
          setUsrId(other.getUsrId());
        }
        if (!other.getMqttDevName().isEmpty()) {
          mqttDevName_ = other.mqttDevName_;
          onChanged();
        }
        if (other.getOldHomeId() != 0) {
          setOldHomeId(other.getOldHomeId());
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
        google.iproto.mqtt.GWConnectProto.gateway_connect parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.GWConnectProto.gateway_connect) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int homeId_ ;
      /**
       * <pre>
       *绑定时从App带过来的HomeId, 服务器通过该homeid申请mqtt devname
       * </pre>
       *
       * <code>int32 home_id = 1;</code>
       */
      public int getHomeId() {
        return homeId_;
      }
      /**
       * <pre>
       *绑定时从App带过来的HomeId, 服务器通过该homeid申请mqtt devname
       * </pre>
       *
       * <code>int32 home_id = 1;</code>
       */
      public Builder setHomeId(int value) {
        
        homeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *绑定时从App带过来的HomeId, 服务器通过该homeid申请mqtt devname
       * </pre>
       *
       * <code>int32 home_id = 1;</code>
       */
      public Builder clearHomeId() {
        
        homeId_ = 0;
        onChanged();
        return this;
      }

      private int usrId_ ;
      /**
       * <pre>
       *绑定面板的用户ID
       * </pre>
       *
       * <code>int32 usr_id = 2;</code>
       */
      public int getUsrId() {
        return usrId_;
      }
      /**
       * <pre>
       *绑定面板的用户ID
       * </pre>
       *
       * <code>int32 usr_id = 2;</code>
       */
      public Builder setUsrId(int value) {
        
        usrId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *绑定面板的用户ID
       * </pre>
       *
       * <code>int32 usr_id = 2;</code>
       */
      public Builder clearUsrId() {
        
        usrId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object mqttDevName_ = "";
      /**
       * <pre>
       *已有的devname，如果没有则填"&#92;0"
       * </pre>
       *
       * <code>string mqtt_devName = 3;</code>
       */
      public java.lang.String getMqttDevName() {
        java.lang.Object ref = mqttDevName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mqttDevName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *已有的devname，如果没有则填"&#92;0"
       * </pre>
       *
       * <code>string mqtt_devName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMqttDevNameBytes() {
        java.lang.Object ref = mqttDevName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mqttDevName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *已有的devname，如果没有则填"&#92;0"
       * </pre>
       *
       * <code>string mqtt_devName = 3;</code>
       */
      public Builder setMqttDevName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        mqttDevName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *已有的devname，如果没有则填"&#92;0"
       * </pre>
       *
       * <code>string mqtt_devName = 3;</code>
       */
      public Builder clearMqttDevName() {
        
        mqttDevName_ = getDefaultInstance().getMqttDevName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *已有的devname，如果没有则填"&#92;0"
       * </pre>
       *
       * <code>string mqtt_devName = 3;</code>
       */
      public Builder setMqttDevNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        mqttDevName_ = value;
        onChanged();
        return this;
      }

      private int oldHomeId_ ;
      /**
       * <pre>
       *后续绑定网关，携带之前的homeid
       * </pre>
       *
       * <code>int32 old_home_id = 4;</code>
       */
      public int getOldHomeId() {
        return oldHomeId_;
      }
      /**
       * <pre>
       *后续绑定网关，携带之前的homeid
       * </pre>
       *
       * <code>int32 old_home_id = 4;</code>
       */
      public Builder setOldHomeId(int value) {
        
        oldHomeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *后续绑定网关，携带之前的homeid
       * </pre>
       *
       * <code>int32 old_home_id = 4;</code>
       */
      public Builder clearOldHomeId() {
        
        oldHomeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.gateway_connect)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.gateway_connect)
    private static final google.iproto.mqtt.GWConnectProto.gateway_connect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.GWConnectProto.gateway_connect();
    }

    public static google.iproto.mqtt.GWConnectProto.gateway_connect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<gateway_connect>
        PARSER = new com.google.protobuf.AbstractParser<gateway_connect>() {
      public gateway_connect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new gateway_connect(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<gateway_connect> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<gateway_connect> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.GWConnectProto.gateway_connect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_gateway_connect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_gateway_connect_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/iproto/mqtt/p0201_GW_connect.pr" +
      "oto\022\rgoogle.iproto\"]\n\017gateway_connect\022\017\n" +
      "\007home_id\030\001 \001(\005\022\016\n\006usr_id\030\002 \001(\005\022\024\n\014mqtt_d" +
      "evName\030\003 \001(\t\022\023\n\013old_home_id\030\004 \001(\005B$\n\022goo" +
      "gle.iproto.mqttB\016GWConnectProtob\006proto3"
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
        }, assigner);
    internal_static_google_iproto_gateway_connect_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_gateway_connect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_gateway_connect_descriptor,
        new java.lang.String[] { "HomeId", "UsrId", "MqttDevName", "OldHomeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
