// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0205_GW_uploaddevresponse.proto

package google.iproto.mqtt;

public final class GWUploadDevResponseProto {
  private GWUploadDevResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface gateway_uploaddev_responseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.gateway_uploaddev_response)
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
     *0: 成功，else: 失败码
     * </pre>
     *
     * <code>int32 res_Status = 2;</code>
     */
    int getResStatus();
  }
  /**
   * <pre>
   * 网关上传设备信息完成，服务器下发响应信息
   * </pre>
   *
   * Protobuf type {@code google.iproto.gateway_uploaddev_response}
   */
  public  static final class gateway_uploaddev_response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.gateway_uploaddev_response)
      gateway_uploaddev_responseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use gateway_uploaddev_response.newBuilder() to construct.
    private gateway_uploaddev_response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private gateway_uploaddev_response() {
      homeId_ = 0;
      resStatus_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private gateway_uploaddev_response(
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

              resStatus_ = input.readInt32();
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
      return google.iproto.mqtt.GWUploadDevResponseProto.internal_static_google_iproto_gateway_uploaddev_response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.GWUploadDevResponseProto.internal_static_google_iproto_gateway_uploaddev_response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response.class, google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response.Builder.class);
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

    public static final int RES_STATUS_FIELD_NUMBER = 2;
    private int resStatus_;
    /**
     * <pre>
     *0: 成功，else: 失败码
     * </pre>
     *
     * <code>int32 res_Status = 2;</code>
     */
    public int getResStatus() {
      return resStatus_;
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
      if (resStatus_ != 0) {
        output.writeInt32(2, resStatus_);
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
      if (resStatus_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, resStatus_);
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
      if (!(obj instanceof google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response other = (google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response) obj;

      boolean result = true;
      result = result && (getHomeId()
          == other.getHomeId());
      result = result && (getResStatus()
          == other.getResStatus());
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
      hash = (37 * hash) + RES_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getResStatus();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response prototype) {
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
     * 网关上传设备信息完成，服务器下发响应信息
     * </pre>
     *
     * Protobuf type {@code google.iproto.gateway_uploaddev_response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.gateway_uploaddev_response)
        google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_responseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.GWUploadDevResponseProto.internal_static_google_iproto_gateway_uploaddev_response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.GWUploadDevResponseProto.internal_static_google_iproto_gateway_uploaddev_response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response.class, google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response.Builder.class);
      }

      // Construct using google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response.newBuilder()
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

        resStatus_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.GWUploadDevResponseProto.internal_static_google_iproto_gateway_uploaddev_response_descriptor;
      }

      public google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response getDefaultInstanceForType() {
        return google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response.getDefaultInstance();
      }

      public google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response build() {
        google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response buildPartial() {
        google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response result = new google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response(this);
        result.homeId_ = homeId_;
        result.resStatus_ = resStatus_;
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
        if (other instanceof google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response) {
          return mergeFrom((google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response other) {
        if (other == google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response.getDefaultInstance()) return this;
        if (other.getHomeId() != 0) {
          setHomeId(other.getHomeId());
        }
        if (other.getResStatus() != 0) {
          setResStatus(other.getResStatus());
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
        google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response) e.getUnfinishedMessage();
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

      private int resStatus_ ;
      /**
       * <pre>
       *0: 成功，else: 失败码
       * </pre>
       *
       * <code>int32 res_Status = 2;</code>
       */
      public int getResStatus() {
        return resStatus_;
      }
      /**
       * <pre>
       *0: 成功，else: 失败码
       * </pre>
       *
       * <code>int32 res_Status = 2;</code>
       */
      public Builder setResStatus(int value) {
        
        resStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *0: 成功，else: 失败码
       * </pre>
       *
       * <code>int32 res_Status = 2;</code>
       */
      public Builder clearResStatus() {
        
        resStatus_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.gateway_uploaddev_response)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.gateway_uploaddev_response)
    private static final google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response();
    }

    public static google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<gateway_uploaddev_response>
        PARSER = new com.google.protobuf.AbstractParser<gateway_uploaddev_response>() {
      public gateway_uploaddev_response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new gateway_uploaddev_response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<gateway_uploaddev_response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<gateway_uploaddev_response> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.GWUploadDevResponseProto.gateway_uploaddev_response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_gateway_uploaddev_response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_gateway_uploaddev_response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/iproto/mqtt/p0205_GW_uploaddevr" +
      "esponse.proto\022\rgoogle.iproto\"A\n\032gateway_" +
      "uploaddev_response\022\017\n\007home_id\030\001 \001(\005\022\022\n\nr" +
      "es_Status\030\002 \001(\005B.\n\022google.iproto.mqttB\030G" +
      "WUploadDevResponseProtob\006proto3"
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
    internal_static_google_iproto_gateway_uploaddev_response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_gateway_uploaddev_response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_gateway_uploaddev_response_descriptor,
        new java.lang.String[] { "HomeId", "ResStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
