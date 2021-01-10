// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0305_Scene_devdelete.proto

package google.iproto.mqtt;

public final class SceneDeleteDevProto {
  private SceneDeleteDevProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface scene_devdeleteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.scene_devdelete)
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
     *需要删除的设备ID
     * </pre>
     *
     * <code>repeated int32 dev_id = 2;</code>
     */
    java.util.List<java.lang.Integer> getDevIdList();
    /**
     * <pre>
     *需要删除的设备ID
     * </pre>
     *
     * <code>repeated int32 dev_id = 2;</code>
     */
    int getDevIdCount();
    /**
     * <pre>
     *需要删除的设备ID
     * </pre>
     *
     * <code>repeated int32 dev_id = 2;</code>
     */
    int getDevId(int index);
  }
  /**
   * <pre>
   * 删除场景中的设备，如果某个面板上场景中的所有设备被删除完了，对应面板同时删除该面板上的场景信息 
   * </pre>
   *
   * Protobuf type {@code google.iproto.scene_devdelete}
   */
  public  static final class scene_devdelete extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.scene_devdelete)
      scene_devdeleteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use scene_devdelete.newBuilder() to construct.
    private scene_devdelete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private scene_devdelete() {
      sceneId_ = 0;
      devId_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private scene_devdelete(
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
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                devId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              devId_.add(input.readInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                devId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                devId_.add(input.readInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          devId_ = java.util.Collections.unmodifiableList(devId_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.mqtt.SceneDeleteDevProto.internal_static_google_iproto_scene_devdelete_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.SceneDeleteDevProto.internal_static_google_iproto_scene_devdelete_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete.class, google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete.Builder.class);
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

    public static final int DEV_ID_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Integer> devId_;
    /**
     * <pre>
     *需要删除的设备ID
     * </pre>
     *
     * <code>repeated int32 dev_id = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getDevIdList() {
      return devId_;
    }
    /**
     * <pre>
     *需要删除的设备ID
     * </pre>
     *
     * <code>repeated int32 dev_id = 2;</code>
     */
    public int getDevIdCount() {
      return devId_.size();
    }
    /**
     * <pre>
     *需要删除的设备ID
     * </pre>
     *
     * <code>repeated int32 dev_id = 2;</code>
     */
    public int getDevId(int index) {
      return devId_.get(index);
    }
    private int devIdMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (sceneId_ != 0) {
        output.writeInt32(1, sceneId_);
      }
      if (getDevIdList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(devIdMemoizedSerializedSize);
      }
      for (int i = 0; i < devId_.size(); i++) {
        output.writeInt32NoTag(devId_.get(i));
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
      {
        int dataSize = 0;
        for (int i = 0; i < devId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(devId_.get(i));
        }
        size += dataSize;
        if (!getDevIdList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        devIdMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete other = (google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete) obj;

      boolean result = true;
      result = result && (getSceneId()
          == other.getSceneId());
      result = result && getDevIdList()
          .equals(other.getDevIdList());
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
      if (getDevIdCount() > 0) {
        hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
        hash = (53 * hash) + getDevIdList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete prototype) {
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
     * 删除场景中的设备，如果某个面板上场景中的所有设备被删除完了，对应面板同时删除该面板上的场景信息 
     * </pre>
     *
     * Protobuf type {@code google.iproto.scene_devdelete}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.scene_devdelete)
        google.iproto.mqtt.SceneDeleteDevProto.scene_devdeleteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.SceneDeleteDevProto.internal_static_google_iproto_scene_devdelete_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.SceneDeleteDevProto.internal_static_google_iproto_scene_devdelete_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete.class, google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete.Builder.class);
      }

      // Construct using google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete.newBuilder()
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

        devId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.SceneDeleteDevProto.internal_static_google_iproto_scene_devdelete_descriptor;
      }

      public google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete getDefaultInstanceForType() {
        return google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete.getDefaultInstance();
      }

      public google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete build() {
        google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete buildPartial() {
        google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete result = new google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.sceneId_ = sceneId_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          devId_ = java.util.Collections.unmodifiableList(devId_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.devId_ = devId_;
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
        if (other instanceof google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete) {
          return mergeFrom((google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete other) {
        if (other == google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (!other.devId_.isEmpty()) {
          if (devId_.isEmpty()) {
            devId_ = other.devId_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDevIdIsMutable();
            devId_.addAll(other.devId_);
          }
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
        google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete) e.getUnfinishedMessage();
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

      private java.util.List<java.lang.Integer> devId_ = java.util.Collections.emptyList();
      private void ensureDevIdIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          devId_ = new java.util.ArrayList<java.lang.Integer>(devId_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       *需要删除的设备ID
       * </pre>
       *
       * <code>repeated int32 dev_id = 2;</code>
       */
      public java.util.List<java.lang.Integer>
          getDevIdList() {
        return java.util.Collections.unmodifiableList(devId_);
      }
      /**
       * <pre>
       *需要删除的设备ID
       * </pre>
       *
       * <code>repeated int32 dev_id = 2;</code>
       */
      public int getDevIdCount() {
        return devId_.size();
      }
      /**
       * <pre>
       *需要删除的设备ID
       * </pre>
       *
       * <code>repeated int32 dev_id = 2;</code>
       */
      public int getDevId(int index) {
        return devId_.get(index);
      }
      /**
       * <pre>
       *需要删除的设备ID
       * </pre>
       *
       * <code>repeated int32 dev_id = 2;</code>
       */
      public Builder setDevId(
          int index, int value) {
        ensureDevIdIsMutable();
        devId_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *需要删除的设备ID
       * </pre>
       *
       * <code>repeated int32 dev_id = 2;</code>
       */
      public Builder addDevId(int value) {
        ensureDevIdIsMutable();
        devId_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *需要删除的设备ID
       * </pre>
       *
       * <code>repeated int32 dev_id = 2;</code>
       */
      public Builder addAllDevId(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDevIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devId_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *需要删除的设备ID
       * </pre>
       *
       * <code>repeated int32 dev_id = 2;</code>
       */
      public Builder clearDevId() {
        devId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:google.iproto.scene_devdelete)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.scene_devdelete)
    private static final google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete();
    }

    public static google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<scene_devdelete>
        PARSER = new com.google.protobuf.AbstractParser<scene_devdelete>() {
      public scene_devdelete parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new scene_devdelete(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<scene_devdelete> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<scene_devdelete> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.SceneDeleteDevProto.scene_devdelete getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_scene_devdelete_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_scene_devdelete_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/iproto/mqtt/p0305_Scene_devdele" +
      "te.proto\022\rgoogle.iproto\"3\n\017scene_devdele" +
      "te\022\020\n\010scene_id\030\001 \001(\005\022\016\n\006dev_id\030\002 \003(\005B)\n\022" +
      "google.iproto.mqttB\023SceneDeleteDevProtob" +
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
        }, assigner);
    internal_static_google_iproto_scene_devdelete_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_scene_devdelete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_scene_devdelete_descriptor,
        new java.lang.String[] { "SceneId", "DevId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
