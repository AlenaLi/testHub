// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0306_Scene_devdeleteresponse.proto

package google.iproto.mqtt;

public final class SceneDeleteDevResponseProto {
  private SceneDeleteDevResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface scene_devdelete_responseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.scene_devdelete_response)
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
     *执行状态，0：成功，else: 错误码
     * </pre>
     *
     * <code>int32 exec_status = 2;</code>
     */
    int getExecStatus();
  }
  /**
   * <pre>
   * 删除场景中的设备，如果某个面板上场景中的所有设备被删除完了，对应面板同时删除该面板上的场景信息 
   * </pre>
   *
   * Protobuf type {@code google.iproto.scene_devdelete_response}
   */
  public  static final class scene_devdelete_response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.scene_devdelete_response)
      scene_devdelete_responseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use scene_devdelete_response.newBuilder() to construct.
    private scene_devdelete_response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private scene_devdelete_response() {
      sceneId_ = 0;
      execStatus_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private scene_devdelete_response(
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
      return google.iproto.mqtt.SceneDeleteDevResponseProto.internal_static_google_iproto_scene_devdelete_response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.SceneDeleteDevResponseProto.internal_static_google_iproto_scene_devdelete_response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response.class, google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response.Builder.class);
    }

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

    public static final int EXEC_STATUS_FIELD_NUMBER = 2;
    private int execStatus_;
    /**
     * <pre>
     *执行状态，0：成功，else: 错误码
     * </pre>
     *
     * <code>int32 exec_status = 2;</code>
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
      if (sceneId_ != 0) {
        output.writeInt32(1, sceneId_);
      }
      if (execStatus_ != 0) {
        output.writeInt32(2, execStatus_);
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
      if (execStatus_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, execStatus_);
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
      if (!(obj instanceof google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response other = (google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response) obj;

      boolean result = true;
      result = result && (getSceneId()
          == other.getSceneId());
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + EXEC_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getExecStatus();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response prototype) {
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
     * Protobuf type {@code google.iproto.scene_devdelete_response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.scene_devdelete_response)
        google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_responseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.SceneDeleteDevResponseProto.internal_static_google_iproto_scene_devdelete_response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.SceneDeleteDevResponseProto.internal_static_google_iproto_scene_devdelete_response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response.class, google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response.Builder.class);
      }

      // Construct using google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response.newBuilder()
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

        execStatus_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.SceneDeleteDevResponseProto.internal_static_google_iproto_scene_devdelete_response_descriptor;
      }

      public google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response getDefaultInstanceForType() {
        return google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response.getDefaultInstance();
      }

      public google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response build() {
        google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response buildPartial() {
        google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response result = new google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response(this);
        result.sceneId_ = sceneId_;
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
        if (other instanceof google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response) {
          return mergeFrom((google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response other) {
        if (other == google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response) e.getUnfinishedMessage();
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

      private int execStatus_ ;
      /**
       * <pre>
       *执行状态，0：成功，else: 错误码
       * </pre>
       *
       * <code>int32 exec_status = 2;</code>
       */
      public int getExecStatus() {
        return execStatus_;
      }
      /**
       * <pre>
       *执行状态，0：成功，else: 错误码
       * </pre>
       *
       * <code>int32 exec_status = 2;</code>
       */
      public Builder setExecStatus(int value) {
        
        execStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *执行状态，0：成功，else: 错误码
       * </pre>
       *
       * <code>int32 exec_status = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:google.iproto.scene_devdelete_response)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.scene_devdelete_response)
    private static final google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response();
    }

    public static google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<scene_devdelete_response>
        PARSER = new com.google.protobuf.AbstractParser<scene_devdelete_response>() {
      public scene_devdelete_response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new scene_devdelete_response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<scene_devdelete_response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<scene_devdelete_response> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.SceneDeleteDevResponseProto.scene_devdelete_response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_scene_devdelete_response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_scene_devdelete_response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/iproto/mqtt/p0306_Scene_devdele" +
      "teresponse.proto\022\rgoogle.iproto\"A\n\030scene" +
      "_devdelete_response\022\020\n\010scene_id\030\001 \001(\005\022\023\n" +
      "\013exec_status\030\002 \001(\005B1\n\022google.iproto.mqtt" +
      "B\033SceneDeleteDevResponseProtob\006proto3"
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
    internal_static_google_iproto_scene_devdelete_response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_scene_devdelete_response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_scene_devdelete_response_descriptor,
        new java.lang.String[] { "SceneId", "ExecStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
