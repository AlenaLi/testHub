// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0209_GW_backupconfigresponse.proto

package google.iproto.mqtt;

public final class GWBackupconfigResponse {
  private GWBackupconfigResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface gateway_backupconfigresponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.gateway_backupconfigresponse)
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
     *1: 备份配置，2：恢复配置
     * </pre>
     *
     * <code>int32 optcmd = 2;</code>
     */
    int getOptcmd();

    /**
     * <pre>
     *0: 指令可以执行；其它：不能执行，1：底层功能实现不成功，需要服务器单条下发
     * </pre>
     *
     * <code>int32 exec_status = 3;</code>
     */
    int getExecStatus();
  }
  /**
   * Protobuf type {@code google.iproto.gateway_backupconfigresponse}
   */
  public  static final class gateway_backupconfigresponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.gateway_backupconfigresponse)
      gateway_backupconfigresponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use gateway_backupconfigresponse.newBuilder() to construct.
    private gateway_backupconfigresponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private gateway_backupconfigresponse() {
      homeId_ = 0;
      optcmd_ = 0;
      execStatus_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private gateway_backupconfigresponse(
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

              optcmd_ = input.readInt32();
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
      return google.iproto.mqtt.GWBackupconfigResponse.internal_static_google_iproto_gateway_backupconfigresponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.GWBackupconfigResponse.internal_static_google_iproto_gateway_backupconfigresponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse.class, google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse.Builder.class);
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

    public static final int OPTCMD_FIELD_NUMBER = 2;
    private int optcmd_;
    /**
     * <pre>
     *1: 备份配置，2：恢复配置
     * </pre>
     *
     * <code>int32 optcmd = 2;</code>
     */
    public int getOptcmd() {
      return optcmd_;
    }

    public static final int EXEC_STATUS_FIELD_NUMBER = 3;
    private int execStatus_;
    /**
     * <pre>
     *0: 指令可以执行；其它：不能执行，1：底层功能实现不成功，需要服务器单条下发
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
      if (homeId_ != 0) {
        output.writeInt32(1, homeId_);
      }
      if (optcmd_ != 0) {
        output.writeInt32(2, optcmd_);
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
      if (homeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, homeId_);
      }
      if (optcmd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, optcmd_);
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
      if (!(obj instanceof google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse other = (google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse) obj;

      boolean result = true;
      result = result && (getHomeId()
          == other.getHomeId());
      result = result && (getOptcmd()
          == other.getOptcmd());
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
      hash = (37 * hash) + HOME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getHomeId();
      hash = (37 * hash) + OPTCMD_FIELD_NUMBER;
      hash = (53 * hash) + getOptcmd();
      hash = (37 * hash) + EXEC_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getExecStatus();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse prototype) {
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
     * Protobuf type {@code google.iproto.gateway_backupconfigresponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.gateway_backupconfigresponse)
        google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.GWBackupconfigResponse.internal_static_google_iproto_gateway_backupconfigresponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.GWBackupconfigResponse.internal_static_google_iproto_gateway_backupconfigresponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse.class, google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse.Builder.class);
      }

      // Construct using google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse.newBuilder()
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

        optcmd_ = 0;

        execStatus_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.GWBackupconfigResponse.internal_static_google_iproto_gateway_backupconfigresponse_descriptor;
      }

      public google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse getDefaultInstanceForType() {
        return google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse.getDefaultInstance();
      }

      public google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse build() {
        google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse buildPartial() {
        google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse result = new google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse(this);
        result.homeId_ = homeId_;
        result.optcmd_ = optcmd_;
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
        if (other instanceof google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse) {
          return mergeFrom((google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse other) {
        if (other == google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse.getDefaultInstance()) return this;
        if (other.getHomeId() != 0) {
          setHomeId(other.getHomeId());
        }
        if (other.getOptcmd() != 0) {
          setOptcmd(other.getOptcmd());
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
        google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse) e.getUnfinishedMessage();
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

      private int optcmd_ ;
      /**
       * <pre>
       *1: 备份配置，2：恢复配置
       * </pre>
       *
       * <code>int32 optcmd = 2;</code>
       */
      public int getOptcmd() {
        return optcmd_;
      }
      /**
       * <pre>
       *1: 备份配置，2：恢复配置
       * </pre>
       *
       * <code>int32 optcmd = 2;</code>
       */
      public Builder setOptcmd(int value) {
        
        optcmd_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *1: 备份配置，2：恢复配置
       * </pre>
       *
       * <code>int32 optcmd = 2;</code>
       */
      public Builder clearOptcmd() {
        
        optcmd_ = 0;
        onChanged();
        return this;
      }

      private int execStatus_ ;
      /**
       * <pre>
       *0: 指令可以执行；其它：不能执行，1：底层功能实现不成功，需要服务器单条下发
       * </pre>
       *
       * <code>int32 exec_status = 3;</code>
       */
      public int getExecStatus() {
        return execStatus_;
      }
      /**
       * <pre>
       *0: 指令可以执行；其它：不能执行，1：底层功能实现不成功，需要服务器单条下发
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
       *0: 指令可以执行；其它：不能执行，1：底层功能实现不成功，需要服务器单条下发
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


      // @@protoc_insertion_point(builder_scope:google.iproto.gateway_backupconfigresponse)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.gateway_backupconfigresponse)
    private static final google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse();
    }

    public static google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<gateway_backupconfigresponse>
        PARSER = new com.google.protobuf.AbstractParser<gateway_backupconfigresponse>() {
      public gateway_backupconfigresponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new gateway_backupconfigresponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<gateway_backupconfigresponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<gateway_backupconfigresponse> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.GWBackupconfigResponse.gateway_backupconfigresponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_gateway_backupconfigresponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_gateway_backupconfigresponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/iproto/mqtt/p0209_GW_backupconf" +
      "igresponse.proto\022\rgoogle.iproto\"T\n\034gatew" +
      "ay_backupconfigresponse\022\017\n\007home_id\030\001 \001(\005" +
      "\022\016\n\006optcmd\030\002 \001(\005\022\023\n\013exec_status\030\003 \001(\005B,\n" +
      "\022google.iproto.mqttB\026GWBackupconfigRespo" +
      "nseb\006proto3"
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
    internal_static_google_iproto_gateway_backupconfigresponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_gateway_backupconfigresponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_gateway_backupconfigresponse_descriptor,
        new java.lang.String[] { "HomeId", "Optcmd", "ExecStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
