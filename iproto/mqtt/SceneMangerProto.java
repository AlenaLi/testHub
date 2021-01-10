// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0309_Scene_manger.proto

package google.iproto.mqtt;

public final class SceneMangerProto {
  private SceneMangerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface scene_mangerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.scene_manger)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *需要创建的scene的ID
     * </pre>
     *
     * <code>int32 scene_id = 1;</code>
     */
    int getSceneId();

    /**
     * <pre>
     *0: 删除该场景，1：创建该场景
     * </pre>
     *
     * <code>int32 optcmd = 2;</code>
     */
    int getOptcmd();

    /**
     * <pre>
     *场景类型: 0: 用户自定义场景， 1: 默认离家场景，2: 默认欢迎场景
     * </pre>
     *
     * <code>int32 scene_type = 3;</code>
     */
    int getSceneType();
  }
  /**
   * <pre>
   * 创建/删除场景
   * 1、App上创建完成后，向服务器发送场景信息
   * 2、服务接收到完整的场景信息后，向设备同步场景信息
   * 3、设备接收到场景信息后，同步配置到面板上
   * 4、设备接收到场景信息后，需要向服务器回复场景配置OK消息
   * 5、创建场景时服务器需要指定默认离家或者用户自定义场景
   * </pre>
   *
   * Protobuf type {@code google.iproto.scene_manger}
   */
  public  static final class scene_manger extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.scene_manger)
      scene_mangerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use scene_manger.newBuilder() to construct.
    private scene_manger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private scene_manger() {
      sceneId_ = 0;
      optcmd_ = 0;
      sceneType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private scene_manger(
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

              sceneId_ = input.readInt32();
              break;
            }
            case 16: {

              optcmd_ = input.readInt32();
              break;
            }
            case 24: {

              sceneType_ = input.readInt32();
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
      return google.iproto.mqtt.SceneMangerProto.internal_static_google_iproto_scene_manger_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.SceneMangerProto.internal_static_google_iproto_scene_manger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.SceneMangerProto.scene_manger.class, google.iproto.mqtt.SceneMangerProto.scene_manger.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 1;
    private int sceneId_;
    /**
     * <pre>
     *需要创建的scene的ID
     * </pre>
     *
     * <code>int32 scene_id = 1;</code>
     */
    public int getSceneId() {
      return sceneId_;
    }

    public static final int OPTCMD_FIELD_NUMBER = 2;
    private int optcmd_;
    /**
     * <pre>
     *0: 删除该场景，1：创建该场景
     * </pre>
     *
     * <code>int32 optcmd = 2;</code>
     */
    public int getOptcmd() {
      return optcmd_;
    }

    public static final int SCENE_TYPE_FIELD_NUMBER = 3;
    private int sceneType_;
    /**
     * <pre>
     *场景类型: 0: 用户自定义场景， 1: 默认离家场景，2: 默认欢迎场景
     * </pre>
     *
     * <code>int32 scene_type = 3;</code>
     */
    public int getSceneType() {
      return sceneType_;
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
      if (sceneId_ != 0) {
        output.writeInt32(1, sceneId_);
      }
      if (optcmd_ != 0) {
        output.writeInt32(2, optcmd_);
      }
      if (sceneType_ != 0) {
        output.writeInt32(3, sceneType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, sceneId_);
      }
      if (optcmd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, optcmd_);
      }
      if (sceneType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, sceneType_);
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
      if (!(obj instanceof google.iproto.mqtt.SceneMangerProto.scene_manger)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.SceneMangerProto.scene_manger other = (google.iproto.mqtt.SceneMangerProto.scene_manger) obj;

      boolean result = true;
      result = result && (getSceneId()
          == other.getSceneId());
      result = result && (getOptcmd()
          == other.getOptcmd());
      result = result && (getSceneType()
          == other.getSceneType());
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + OPTCMD_FIELD_NUMBER;
      hash = (53 * hash) + getOptcmd();
      hash = (37 * hash) + SCENE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getSceneType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneMangerProto.scene_manger parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.SceneMangerProto.scene_manger prototype) {
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
     * 创建/删除场景
     * 1、App上创建完成后，向服务器发送场景信息
     * 2、服务接收到完整的场景信息后，向设备同步场景信息
     * 3、设备接收到场景信息后，同步配置到面板上
     * 4、设备接收到场景信息后，需要向服务器回复场景配置OK消息
     * 5、创建场景时服务器需要指定默认离家或者用户自定义场景
     * </pre>
     *
     * Protobuf type {@code google.iproto.scene_manger}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.scene_manger)
        google.iproto.mqtt.SceneMangerProto.scene_mangerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.SceneMangerProto.internal_static_google_iproto_scene_manger_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.SceneMangerProto.internal_static_google_iproto_scene_manger_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.SceneMangerProto.scene_manger.class, google.iproto.mqtt.SceneMangerProto.scene_manger.Builder.class);
      }

      // Construct using google.iproto.mqtt.SceneMangerProto.scene_manger.newBuilder()
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
        sceneId_ = 0;

        optcmd_ = 0;

        sceneType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.SceneMangerProto.internal_static_google_iproto_scene_manger_descriptor;
      }

      public google.iproto.mqtt.SceneMangerProto.scene_manger getDefaultInstanceForType() {
        return google.iproto.mqtt.SceneMangerProto.scene_manger.getDefaultInstance();
      }

      public google.iproto.mqtt.SceneMangerProto.scene_manger build() {
        google.iproto.mqtt.SceneMangerProto.scene_manger result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.SceneMangerProto.scene_manger buildPartial() {
        google.iproto.mqtt.SceneMangerProto.scene_manger result = new google.iproto.mqtt.SceneMangerProto.scene_manger(this);
        result.sceneId_ = sceneId_;
        result.optcmd_ = optcmd_;
        result.sceneType_ = sceneType_;
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
        if (other instanceof google.iproto.mqtt.SceneMangerProto.scene_manger) {
          return mergeFrom((google.iproto.mqtt.SceneMangerProto.scene_manger)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.SceneMangerProto.scene_manger other) {
        if (other == google.iproto.mqtt.SceneMangerProto.scene_manger.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getOptcmd() != 0) {
          setOptcmd(other.getOptcmd());
        }
        if (other.getSceneType() != 0) {
          setSceneType(other.getSceneType());
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
        google.iproto.mqtt.SceneMangerProto.scene_manger parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.SceneMangerProto.scene_manger) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneId_ ;
      /**
       * <pre>
       *需要创建的scene的ID
       * </pre>
       *
       * <code>int32 scene_id = 1;</code>
       */
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <pre>
       *需要创建的scene的ID
       * </pre>
       *
       * <code>int32 scene_id = 1;</code>
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *需要创建的scene的ID
       * </pre>
       *
       * <code>int32 scene_id = 1;</code>
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int optcmd_ ;
      /**
       * <pre>
       *0: 删除该场景，1：创建该场景
       * </pre>
       *
       * <code>int32 optcmd = 2;</code>
       */
      public int getOptcmd() {
        return optcmd_;
      }
      /**
       * <pre>
       *0: 删除该场景，1：创建该场景
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
       *0: 删除该场景，1：创建该场景
       * </pre>
       *
       * <code>int32 optcmd = 2;</code>
       */
      public Builder clearOptcmd() {
        
        optcmd_ = 0;
        onChanged();
        return this;
      }

      private int sceneType_ ;
      /**
       * <pre>
       *场景类型: 0: 用户自定义场景， 1: 默认离家场景，2: 默认欢迎场景
       * </pre>
       *
       * <code>int32 scene_type = 3;</code>
       */
      public int getSceneType() {
        return sceneType_;
      }
      /**
       * <pre>
       *场景类型: 0: 用户自定义场景， 1: 默认离家场景，2: 默认欢迎场景
       * </pre>
       *
       * <code>int32 scene_type = 3;</code>
       */
      public Builder setSceneType(int value) {
        
        sceneType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *场景类型: 0: 用户自定义场景， 1: 默认离家场景，2: 默认欢迎场景
       * </pre>
       *
       * <code>int32 scene_type = 3;</code>
       */
      public Builder clearSceneType() {
        
        sceneType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.scene_manger)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.scene_manger)
    private static final google.iproto.mqtt.SceneMangerProto.scene_manger DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.SceneMangerProto.scene_manger();
    }

    public static google.iproto.mqtt.SceneMangerProto.scene_manger getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<scene_manger>
        PARSER = new com.google.protobuf.AbstractParser<scene_manger>() {
      public scene_manger parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new scene_manger(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<scene_manger> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<scene_manger> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.SceneMangerProto.scene_manger getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_scene_manger_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_scene_manger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/iproto/mqtt/p0309_Scene_manger." +
      "proto\022\rgoogle.iproto\"D\n\014scene_manger\022\020\n\010" +
      "scene_id\030\001 \001(\005\022\016\n\006optcmd\030\002 \001(\005\022\022\n\nscene_" +
      "type\030\003 \001(\005B&\n\022google.iproto.mqttB\020SceneM" +
      "angerProtob\006proto3"
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
    internal_static_google_iproto_scene_manger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_scene_manger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_scene_manger_descriptor,
        new java.lang.String[] { "SceneId", "Optcmd", "SceneType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
