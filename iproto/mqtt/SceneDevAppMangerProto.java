// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0315_Scene_appdevmanger.proto

package google.iproto.mqtt;

public final class SceneDevAppMangerProto {
  private SceneDevAppMangerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface scene_appdevmangerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.scene_appdevmanger)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *场景ID
     * </pre>
     *
     * <code>int32 scene_id = 1;</code>
     */
    int getSceneId();

    /**
     * <pre>
     *操作, 1: 增加设备并打开， 0： 删除设备
     * </pre>
     *
     * <code>int32 optcmd = 2;</code>
     */
    int getOptcmd();

    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    java.util.List<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo> 
        getScenedevList();
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo getScenedev(int index);
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    int getScenedevCount();
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    java.util.List<? extends google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder> 
        getScenedevOrBuilderList();
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder getScenedevOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 手机APP上创建临时场景
   * 1、用户在App上启动创建场景操作，App临时分配一个scene_id给设备
   * 2、设备收到后，创建临时数据，用于记录用户场景的临时配置信息
   * 3、用户测试场景时，直接将临时场景数据生效
   * 4、临时场景数据不存入数据库
   * 5、用户退出场景配置页面，不管有没有保存，都需要向设备发送删除临时场景命令
   * 6、用户对临时场景做操作，选中设备，设置预设值，APP直接向设备侧发送相应的数据
   *    设备侧需要更新临时数据，App一次只能操作一个数据
   * 7、如果场景ID为用户ID，系统从本地数据库拉数据建立本地临时数据
   * </pre>
   *
   * Protobuf type {@code google.iproto.scene_appdevmanger}
   */
  public  static final class scene_appdevmanger extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.scene_appdevmanger)
      scene_appdevmangerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use scene_appdevmanger.newBuilder() to construct.
    private scene_appdevmanger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private scene_appdevmanger() {
      sceneId_ = 0;
      optcmd_ = 0;
      scenedev_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private scene_appdevmanger(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                scenedev_ = new java.util.ArrayList<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo>();
                mutable_bitField0_ |= 0x00000004;
              }
              scenedev_.add(
                  input.readMessage(google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          scenedev_ = java.util.Collections.unmodifiableList(scenedev_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.mqtt.SceneDevAppMangerProto.internal_static_google_iproto_scene_appdevmanger_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.SceneDevAppMangerProto.internal_static_google_iproto_scene_appdevmanger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger.class, google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger.Builder.class);
    }

    private int bitField0_;
    public static final int SCENE_ID_FIELD_NUMBER = 1;
    private int sceneId_;
    /**
     * <pre>
     *场景ID
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
     *操作, 1: 增加设备并打开， 0： 删除设备
     * </pre>
     *
     * <code>int32 optcmd = 2;</code>
     */
    public int getOptcmd() {
      return optcmd_;
    }

    public static final int SCENEDEV_FIELD_NUMBER = 3;
    private java.util.List<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo> scenedev_;
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    public java.util.List<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo> getScenedevList() {
      return scenedev_;
    }
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    public java.util.List<? extends google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder> 
        getScenedevOrBuilderList() {
      return scenedev_;
    }
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    public int getScenedevCount() {
      return scenedev_.size();
    }
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    public google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo getScenedev(int index) {
      return scenedev_.get(index);
    }
    /**
     * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
     */
    public google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder getScenedevOrBuilder(
        int index) {
      return scenedev_.get(index);
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
      for (int i = 0; i < scenedev_.size(); i++) {
        output.writeMessage(3, scenedev_.get(i));
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
      for (int i = 0; i < scenedev_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, scenedev_.get(i));
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
      if (!(obj instanceof google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger other = (google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger) obj;

      boolean result = true;
      result = result && (getSceneId()
          == other.getSceneId());
      result = result && (getOptcmd()
          == other.getOptcmd());
      result = result && getScenedevList()
          .equals(other.getScenedevList());
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
      if (getScenedevCount() > 0) {
        hash = (37 * hash) + SCENEDEV_FIELD_NUMBER;
        hash = (53 * hash) + getScenedevList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger prototype) {
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
     * 手机APP上创建临时场景
     * 1、用户在App上启动创建场景操作，App临时分配一个scene_id给设备
     * 2、设备收到后，创建临时数据，用于记录用户场景的临时配置信息
     * 3、用户测试场景时，直接将临时场景数据生效
     * 4、临时场景数据不存入数据库
     * 5、用户退出场景配置页面，不管有没有保存，都需要向设备发送删除临时场景命令
     * 6、用户对临时场景做操作，选中设备，设置预设值，APP直接向设备侧发送相应的数据
     *    设备侧需要更新临时数据，App一次只能操作一个数据
     * 7、如果场景ID为用户ID，系统从本地数据库拉数据建立本地临时数据
     * </pre>
     *
     * Protobuf type {@code google.iproto.scene_appdevmanger}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.scene_appdevmanger)
        google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmangerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.SceneDevAppMangerProto.internal_static_google_iproto_scene_appdevmanger_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.SceneDevAppMangerProto.internal_static_google_iproto_scene_appdevmanger_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger.class, google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger.Builder.class);
      }

      // Construct using google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger.newBuilder()
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
          getScenedevFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        sceneId_ = 0;

        optcmd_ = 0;

        if (scenedevBuilder_ == null) {
          scenedev_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          scenedevBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.SceneDevAppMangerProto.internal_static_google_iproto_scene_appdevmanger_descriptor;
      }

      public google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger getDefaultInstanceForType() {
        return google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger.getDefaultInstance();
      }

      public google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger build() {
        google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger buildPartial() {
        google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger result = new google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.sceneId_ = sceneId_;
        result.optcmd_ = optcmd_;
        if (scenedevBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            scenedev_ = java.util.Collections.unmodifiableList(scenedev_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.scenedev_ = scenedev_;
        } else {
          result.scenedev_ = scenedevBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger) {
          return mergeFrom((google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger other) {
        if (other == google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getOptcmd() != 0) {
          setOptcmd(other.getOptcmd());
        }
        if (scenedevBuilder_ == null) {
          if (!other.scenedev_.isEmpty()) {
            if (scenedev_.isEmpty()) {
              scenedev_ = other.scenedev_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureScenedevIsMutable();
              scenedev_.addAll(other.scenedev_);
            }
            onChanged();
          }
        } else {
          if (!other.scenedev_.isEmpty()) {
            if (scenedevBuilder_.isEmpty()) {
              scenedevBuilder_.dispose();
              scenedevBuilder_ = null;
              scenedev_ = other.scenedev_;
              bitField0_ = (bitField0_ & ~0x00000004);
              scenedevBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getScenedevFieldBuilder() : null;
            } else {
              scenedevBuilder_.addAllMessages(other.scenedev_);
            }
          }
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
        google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sceneId_ ;
      /**
       * <pre>
       *场景ID
       * </pre>
       *
       * <code>int32 scene_id = 1;</code>
       */
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <pre>
       *场景ID
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
       *场景ID
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
       *操作, 1: 增加设备并打开， 0： 删除设备
       * </pre>
       *
       * <code>int32 optcmd = 2;</code>
       */
      public int getOptcmd() {
        return optcmd_;
      }
      /**
       * <pre>
       *操作, 1: 增加设备并打开， 0： 删除设备
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
       *操作, 1: 增加设备并打开， 0： 删除设备
       * </pre>
       *
       * <code>int32 optcmd = 2;</code>
       */
      public Builder clearOptcmd() {
        
        optcmd_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo> scenedev_ =
        java.util.Collections.emptyList();
      private void ensureScenedevIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          scenedev_ = new java.util.ArrayList<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo>(scenedev_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder> scenedevBuilder_;

      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public java.util.List<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo> getScenedevList() {
        if (scenedevBuilder_ == null) {
          return java.util.Collections.unmodifiableList(scenedev_);
        } else {
          return scenedevBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public int getScenedevCount() {
        if (scenedevBuilder_ == null) {
          return scenedev_.size();
        } else {
          return scenedevBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo getScenedev(int index) {
        if (scenedevBuilder_ == null) {
          return scenedev_.get(index);
        } else {
          return scenedevBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder setScenedev(
          int index, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo value) {
        if (scenedevBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureScenedevIsMutable();
          scenedev_.set(index, value);
          onChanged();
        } else {
          scenedevBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder setScenedev(
          int index, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder builderForValue) {
        if (scenedevBuilder_ == null) {
          ensureScenedevIsMutable();
          scenedev_.set(index, builderForValue.build());
          onChanged();
        } else {
          scenedevBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder addScenedev(google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo value) {
        if (scenedevBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureScenedevIsMutable();
          scenedev_.add(value);
          onChanged();
        } else {
          scenedevBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder addScenedev(
          int index, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo value) {
        if (scenedevBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureScenedevIsMutable();
          scenedev_.add(index, value);
          onChanged();
        } else {
          scenedevBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder addScenedev(
          google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder builderForValue) {
        if (scenedevBuilder_ == null) {
          ensureScenedevIsMutable();
          scenedev_.add(builderForValue.build());
          onChanged();
        } else {
          scenedevBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder addScenedev(
          int index, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder builderForValue) {
        if (scenedevBuilder_ == null) {
          ensureScenedevIsMutable();
          scenedev_.add(index, builderForValue.build());
          onChanged();
        } else {
          scenedevBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder addAllScenedev(
          java.lang.Iterable<? extends google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo> values) {
        if (scenedevBuilder_ == null) {
          ensureScenedevIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, scenedev_);
          onChanged();
        } else {
          scenedevBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder clearScenedev() {
        if (scenedevBuilder_ == null) {
          scenedev_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          scenedevBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public Builder removeScenedev(int index) {
        if (scenedevBuilder_ == null) {
          ensureScenedevIsMutable();
          scenedev_.remove(index);
          onChanged();
        } else {
          scenedevBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder getScenedevBuilder(
          int index) {
        return getScenedevFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder getScenedevOrBuilder(
          int index) {
        if (scenedevBuilder_ == null) {
          return scenedev_.get(index);  } else {
          return scenedevBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public java.util.List<? extends google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder> 
           getScenedevOrBuilderList() {
        if (scenedevBuilder_ != null) {
          return scenedevBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(scenedev_);
        }
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder addScenedevBuilder() {
        return getScenedevFieldBuilder().addBuilder(
            google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.getDefaultInstance());
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder addScenedevBuilder(
          int index) {
        return getScenedevFieldBuilder().addBuilder(
            index, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.getDefaultInstance());
      }
      /**
       * <code>repeated .google.iproto.scene_devicepresetinfo scenedev = 3;</code>
       */
      public java.util.List<google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder> 
           getScenedevBuilderList() {
        return getScenedevFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder> 
          getScenedevFieldBuilder() {
        if (scenedevBuilder_ == null) {
          scenedevBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfo.Builder, google.iproto.mqtt.ComSceneDevPresetProto.scene_devicepresetinfoOrBuilder>(
                  scenedev_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          scenedev_ = null;
        }
        return scenedevBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:google.iproto.scene_appdevmanger)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.scene_appdevmanger)
    private static final google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger();
    }

    public static google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<scene_appdevmanger>
        PARSER = new com.google.protobuf.AbstractParser<scene_appdevmanger>() {
      public scene_appdevmanger parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new scene_appdevmanger(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<scene_appdevmanger> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<scene_appdevmanger> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.SceneDevAppMangerProto.scene_appdevmanger getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_scene_appdevmanger_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_scene_appdevmanger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/iproto/mqtt/p0315_Scene_appdevm" +
      "anger.proto\022\rgoogle.iproto\0321google/iprot" +
      "o/mqtt/p0108_ComScene_DevPreset.proto\"o\n" +
      "\022scene_appdevmanger\022\020\n\010scene_id\030\001 \001(\005\022\016\n" +
      "\006optcmd\030\002 \001(\005\0227\n\010scenedev\030\003 \003(\0132%.google" +
      ".iproto.scene_devicepresetinfoB,\n\022google" +
      ".iproto.mqttB\026SceneDevAppMangerProtob\006pr" +
      "oto3"
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
          google.iproto.mqtt.ComSceneDevPresetProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_scene_appdevmanger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_scene_appdevmanger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_scene_appdevmanger_descriptor,
        new java.lang.String[] { "SceneId", "Optcmd", "Scenedev", });
    google.iproto.mqtt.ComSceneDevPresetProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
