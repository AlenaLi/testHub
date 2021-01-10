// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0412_SysDev_presskeyinforesponse.proto

package google.iproto.mqtt;

public final class SysDevPresskeyInfoResponseProto {
  private SysDevPresskeyInfoResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface sysdev_presskeyinfo_responseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.sysdev_presskeyinfo_response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *只能是面板的ID（包含固定，移动两类面板）
     * </pre>
     *
     * <code>int32 dev_id = 1;</code>
     */
    int getDevId();

    /**
     * <pre>
     *按键编号，0~3共4个，-1按键无效
     * </pre>
     *
     * <code>int32 key_no = 2;</code>
     */
    int getKeyNo();

    /**
     * <pre>
     *响应状态，0：成功，else: 出现问题
     * </pre>
     *
     * <code>int32 exec_status = 3;</code>
     */
    int getExecStatus();
  }
  /**
   * <pre>
   * 面板向APP发送按键信息后，App响应面板接收到按键信息，
   * 如果面板连续三个按键没有接收到响应信息，认为APP已经异常退出界面，将面板恢复为正常操作
   * </pre>
   *
   * Protobuf type {@code google.iproto.sysdev_presskeyinfo_response}
   */
  public  static final class sysdev_presskeyinfo_response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.sysdev_presskeyinfo_response)
      sysdev_presskeyinfo_responseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use sysdev_presskeyinfo_response.newBuilder() to construct.
    private sysdev_presskeyinfo_response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private sysdev_presskeyinfo_response() {
      devId_ = 0;
      keyNo_ = 0;
      execStatus_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private sysdev_presskeyinfo_response(
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

              keyNo_ = input.readInt32();
              break;
            }
            case 24: {

              execStatus_ = input.readInt32();
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
      return google.iproto.mqtt.SysDevPresskeyInfoResponseProto.internal_static_google_iproto_sysdev_presskeyinfo_response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.SysDevPresskeyInfoResponseProto.internal_static_google_iproto_sysdev_presskeyinfo_response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response.class, google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response.Builder.class);
    }

    public static final int DEV_ID_FIELD_NUMBER = 1;
    private int devId_;
    /**
     * <pre>
     *只能是面板的ID（包含固定，移动两类面板）
     * </pre>
     *
     * <code>int32 dev_id = 1;</code>
     */
    public int getDevId() {
      return devId_;
    }

    public static final int KEY_NO_FIELD_NUMBER = 2;
    private int keyNo_;
    /**
     * <pre>
     *按键编号，0~3共4个，-1按键无效
     * </pre>
     *
     * <code>int32 key_no = 2;</code>
     */
    public int getKeyNo() {
      return keyNo_;
    }

    public static final int EXEC_STATUS_FIELD_NUMBER = 3;
    private int execStatus_;
    /**
     * <pre>
     *响应状态，0：成功，else: 出现问题
     * </pre>
     *
     * <code>int32 exec_status = 3;</code>
     */
    public int getExecStatus() {
      return execStatus_;
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
      if (keyNo_ != 0) {
        output.writeInt32(2, keyNo_);
      }
      if (execStatus_ != 0) {
        output.writeInt32(3, execStatus_);
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
      if (keyNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, keyNo_);
      }
      if (execStatus_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, execStatus_);
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
      if (!(obj instanceof google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response other = (google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response) obj;

      boolean result = true;
      result = result && (getDevId()
          == other.getDevId());
      result = result && (getKeyNo()
          == other.getKeyNo());
      result = result && (getExecStatus()
          == other.getExecStatus());
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
      hash = (37 * hash) + KEY_NO_FIELD_NUMBER;
      hash = (53 * hash) + getKeyNo();
      hash = (37 * hash) + EXEC_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getExecStatus();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response prototype) {
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
     * 面板向APP发送按键信息后，App响应面板接收到按键信息，
     * 如果面板连续三个按键没有接收到响应信息，认为APP已经异常退出界面，将面板恢复为正常操作
     * </pre>
     *
     * Protobuf type {@code google.iproto.sysdev_presskeyinfo_response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.sysdev_presskeyinfo_response)
        google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_responseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.SysDevPresskeyInfoResponseProto.internal_static_google_iproto_sysdev_presskeyinfo_response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.SysDevPresskeyInfoResponseProto.internal_static_google_iproto_sysdev_presskeyinfo_response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response.class, google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response.Builder.class);
      }

      // Construct using google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response.newBuilder()
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

        keyNo_ = 0;

        execStatus_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.SysDevPresskeyInfoResponseProto.internal_static_google_iproto_sysdev_presskeyinfo_response_descriptor;
      }

      public google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response getDefaultInstanceForType() {
        return google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response.getDefaultInstance();
      }

      public google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response build() {
        google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response buildPartial() {
        google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response result = new google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response(this);
        result.devId_ = devId_;
        result.keyNo_ = keyNo_;
        result.execStatus_ = execStatus_;
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
        if (other instanceof google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response) {
          return mergeFrom((google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response other) {
        if (other == google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response.getDefaultInstance()) return this;
        if (other.getDevId() != 0) {
          setDevId(other.getDevId());
        }
        if (other.getKeyNo() != 0) {
          setKeyNo(other.getKeyNo());
        }
        if (other.getExecStatus() != 0) {
          setExecStatus(other.getExecStatus());
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
        google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response) e.getUnfinishedMessage();
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
       *只能是面板的ID（包含固定，移动两类面板）
       * </pre>
       *
       * <code>int32 dev_id = 1;</code>
       */
      public int getDevId() {
        return devId_;
      }
      /**
       * <pre>
       *只能是面板的ID（包含固定，移动两类面板）
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
       *只能是面板的ID（包含固定，移动两类面板）
       * </pre>
       *
       * <code>int32 dev_id = 1;</code>
       */
      public Builder clearDevId() {
        
        devId_ = 0;
        onChanged();
        return this;
      }

      private int keyNo_ ;
      /**
       * <pre>
       *按键编号，0~3共4个，-1按键无效
       * </pre>
       *
       * <code>int32 key_no = 2;</code>
       */
      public int getKeyNo() {
        return keyNo_;
      }
      /**
       * <pre>
       *按键编号，0~3共4个，-1按键无效
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
       *按键编号，0~3共4个，-1按键无效
       * </pre>
       *
       * <code>int32 key_no = 2;</code>
       */
      public Builder clearKeyNo() {
        
        keyNo_ = 0;
        onChanged();
        return this;
      }

      private int execStatus_ ;
      /**
       * <pre>
       *响应状态，0：成功，else: 出现问题
       * </pre>
       *
       * <code>int32 exec_status = 3;</code>
       */
      public int getExecStatus() {
        return execStatus_;
      }
      /**
       * <pre>
       *响应状态，0：成功，else: 出现问题
       * </pre>
       *
       * <code>int32 exec_status = 3;</code>
       */
      public Builder setExecStatus(int value) {
        
        execStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *响应状态，0：成功，else: 出现问题
       * </pre>
       *
       * <code>int32 exec_status = 3;</code>
       */
      public Builder clearExecStatus() {
        
        execStatus_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.sysdev_presskeyinfo_response)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.sysdev_presskeyinfo_response)
    private static final google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response();
    }

    public static google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<sysdev_presskeyinfo_response>
        PARSER = new com.google.protobuf.AbstractParser<sysdev_presskeyinfo_response>() {
      public sysdev_presskeyinfo_response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new sysdev_presskeyinfo_response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<sysdev_presskeyinfo_response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<sysdev_presskeyinfo_response> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.SysDevPresskeyInfoResponseProto.sysdev_presskeyinfo_response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_sysdev_presskeyinfo_response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_sysdev_presskeyinfo_response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/iproto/mqtt/p0412_SysDev_pressk" +
      "eyinforesponse.proto\022\rgoogle.iproto\"S\n\034s" +
      "ysdev_presskeyinfo_response\022\016\n\006dev_id\030\001 " +
      "\001(\005\022\016\n\006key_no\030\002 \001(\005\022\023\n\013exec_status\030\003 \001(\005" +
      "B5\n\022google.iproto.mqttB\037SysDevPresskeyIn" +
      "foResponseProtob\006proto3"
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
    internal_static_google_iproto_sysdev_presskeyinfo_response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_sysdev_presskeyinfo_response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_sysdev_presskeyinfo_response_descriptor,
        new java.lang.String[] { "DevId", "KeyNo", "ExecStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
