// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0207_GW_httplog.proto

package google.iproto.mqtt;

public final class GWUpdataDevLogProto {
  private GWUpdataDevLogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface gateway_devicelogOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.gateway_devicelog)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *home id
     * </pre>
     *
     * <code>int32 home_id = 1;</code>
     */
    int getHomeId();

    /**
     * <pre>
     *device id
     * </pre>
     *
     * <code>int32 device_id = 2;</code>
     */
    int getDeviceId();

    /**
     * <pre>
     *日志明文，最长512字节
     * </pre>
     *
     * <code>string plaintext = 3;</code>
     */
    java.lang.String getPlaintext();
    /**
     * <pre>
     *日志明文，最长512字节
     * </pre>
     *
     * <code>string plaintext = 3;</code>
     */
    com.google.protobuf.ByteString
        getPlaintextBytes();
  }
  /**
   * Protobuf type {@code google.iproto.gateway_devicelog}
   */
  public  static final class gateway_devicelog extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.gateway_devicelog)
      gateway_devicelogOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use gateway_devicelog.newBuilder() to construct.
    private gateway_devicelog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private gateway_devicelog() {
      homeId_ = 0;
      deviceId_ = 0;
      plaintext_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private gateway_devicelog(
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

              deviceId_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              plaintext_ = s;
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
      return google.iproto.mqtt.GWUpdataDevLogProto.internal_static_google_iproto_gateway_devicelog_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.GWUpdataDevLogProto.internal_static_google_iproto_gateway_devicelog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog.class, google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog.Builder.class);
    }

    public static final int HOME_ID_FIELD_NUMBER = 1;
    private int homeId_;
    /**
     * <pre>
     *home id
     * </pre>
     *
     * <code>int32 home_id = 1;</code>
     */
    public int getHomeId() {
      return homeId_;
    }

    public static final int DEVICE_ID_FIELD_NUMBER = 2;
    private int deviceId_;
    /**
     * <pre>
     *device id
     * </pre>
     *
     * <code>int32 device_id = 2;</code>
     */
    public int getDeviceId() {
      return deviceId_;
    }

    public static final int PLAINTEXT_FIELD_NUMBER = 3;
    private volatile java.lang.Object plaintext_;
    /**
     * <pre>
     *日志明文，最长512字节
     * </pre>
     *
     * <code>string plaintext = 3;</code>
     */
    public java.lang.String getPlaintext() {
      java.lang.Object ref = plaintext_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plaintext_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *日志明文，最长512字节
     * </pre>
     *
     * <code>string plaintext = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPlaintextBytes() {
      java.lang.Object ref = plaintext_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plaintext_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (deviceId_ != 0) {
        output.writeInt32(2, deviceId_);
      }
      if (!getPlaintextBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, plaintext_);
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
      if (deviceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, deviceId_);
      }
      if (!getPlaintextBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, plaintext_);
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
      if (!(obj instanceof google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog other = (google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog) obj;

      boolean result = true;
      result = result && (getHomeId()
          == other.getHomeId());
      result = result && (getDeviceId()
          == other.getDeviceId());
      result = result && getPlaintext()
          .equals(other.getPlaintext());
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
      hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceId();
      hash = (37 * hash) + PLAINTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getPlaintext().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog prototype) {
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
     * Protobuf type {@code google.iproto.gateway_devicelog}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.gateway_devicelog)
        google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelogOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.GWUpdataDevLogProto.internal_static_google_iproto_gateway_devicelog_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.GWUpdataDevLogProto.internal_static_google_iproto_gateway_devicelog_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog.class, google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog.Builder.class);
      }

      // Construct using google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog.newBuilder()
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

        deviceId_ = 0;

        plaintext_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.GWUpdataDevLogProto.internal_static_google_iproto_gateway_devicelog_descriptor;
      }

      public google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog getDefaultInstanceForType() {
        return google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog.getDefaultInstance();
      }

      public google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog build() {
        google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog buildPartial() {
        google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog result = new google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog(this);
        result.homeId_ = homeId_;
        result.deviceId_ = deviceId_;
        result.plaintext_ = plaintext_;
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
        if (other instanceof google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog) {
          return mergeFrom((google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog other) {
        if (other == google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog.getDefaultInstance()) return this;
        if (other.getHomeId() != 0) {
          setHomeId(other.getHomeId());
        }
        if (other.getDeviceId() != 0) {
          setDeviceId(other.getDeviceId());
        }
        if (!other.getPlaintext().isEmpty()) {
          plaintext_ = other.plaintext_;
          onChanged();
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
        google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog) e.getUnfinishedMessage();
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
       *home id
       * </pre>
       *
       * <code>int32 home_id = 1;</code>
       */
      public int getHomeId() {
        return homeId_;
      }
      /**
       * <pre>
       *home id
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
       *home id
       * </pre>
       *
       * <code>int32 home_id = 1;</code>
       */
      public Builder clearHomeId() {
        
        homeId_ = 0;
        onChanged();
        return this;
      }

      private int deviceId_ ;
      /**
       * <pre>
       *device id
       * </pre>
       *
       * <code>int32 device_id = 2;</code>
       */
      public int getDeviceId() {
        return deviceId_;
      }
      /**
       * <pre>
       *device id
       * </pre>
       *
       * <code>int32 device_id = 2;</code>
       */
      public Builder setDeviceId(int value) {
        
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *device id
       * </pre>
       *
       * <code>int32 device_id = 2;</code>
       */
      public Builder clearDeviceId() {
        
        deviceId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object plaintext_ = "";
      /**
       * <pre>
       *日志明文，最长512字节
       * </pre>
       *
       * <code>string plaintext = 3;</code>
       */
      public java.lang.String getPlaintext() {
        java.lang.Object ref = plaintext_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          plaintext_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *日志明文，最长512字节
       * </pre>
       *
       * <code>string plaintext = 3;</code>
       */
      public com.google.protobuf.ByteString
          getPlaintextBytes() {
        java.lang.Object ref = plaintext_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          plaintext_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *日志明文，最长512字节
       * </pre>
       *
       * <code>string plaintext = 3;</code>
       */
      public Builder setPlaintext(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        plaintext_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *日志明文，最长512字节
       * </pre>
       *
       * <code>string plaintext = 3;</code>
       */
      public Builder clearPlaintext() {
        
        plaintext_ = getDefaultInstance().getPlaintext();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *日志明文，最长512字节
       * </pre>
       *
       * <code>string plaintext = 3;</code>
       */
      public Builder setPlaintextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        plaintext_ = value;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.gateway_devicelog)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.gateway_devicelog)
    private static final google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog();
    }

    public static google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<gateway_devicelog>
        PARSER = new com.google.protobuf.AbstractParser<gateway_devicelog>() {
      public gateway_devicelog parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new gateway_devicelog(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<gateway_devicelog> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<gateway_devicelog> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.GWUpdataDevLogProto.gateway_devicelog getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_gateway_devicelog_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_gateway_devicelog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/iproto/mqtt/p0207_GW_httplog.pr" +
      "oto\022\rgoogle.iproto\"J\n\021gateway_devicelog\022" +
      "\017\n\007home_id\030\001 \001(\005\022\021\n\tdevice_id\030\002 \001(\005\022\021\n\tp" +
      "laintext\030\003 \001(\tB)\n\022google.iproto.mqttB\023GW" +
      "UpdataDevLogProtob\006proto3"
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
    internal_static_google_iproto_gateway_devicelog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_gateway_devicelog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_gateway_devicelog_descriptor,
        new java.lang.String[] { "HomeId", "DeviceId", "Plaintext", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
