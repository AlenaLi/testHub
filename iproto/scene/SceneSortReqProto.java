// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/scene/SceneSortReq.proto

package google.iproto.scene;

public final class SceneSortReqProto {
  private SceneSortReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneSortReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.SceneSortReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *家庭ID  有房间ID 就没有家庭ID
     * </pre>
     *
     * <code>int32 homeid = 4;</code>
     */
    int getHomeid();

    /**
     * <pre>
     *房间ID
     * </pre>
     *
     * <code>int32 roomid = 3;</code>
     */
    int getRoomid();

    /**
     * <pre>
     *起始位置
     * </pre>
     *
     * <code>int32 from = 1;</code>
     */
    int getFrom();

    /**
     * <pre>
     *结束位置
     * </pre>
     *
     * <code>int32 to = 2;</code>
     */
    int getTo();
  }
  /**
   * <pre>
   *场景设备排序接口
   * </pre>
   *
   * Protobuf type {@code google.iproto.SceneSortReq}
   */
  public  static final class SceneSortReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.SceneSortReq)
      SceneSortReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneSortReq.newBuilder() to construct.
    private SceneSortReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneSortReq() {
      homeid_ = 0;
      roomid_ = 0;
      from_ = 0;
      to_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneSortReq(
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

              from_ = input.readInt32();
              break;
            }
            case 16: {

              to_ = input.readInt32();
              break;
            }
            case 24: {

              roomid_ = input.readInt32();
              break;
            }
            case 32: {

              homeid_ = input.readInt32();
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
      return google.iproto.scene.SceneSortReqProto.internal_static_google_iproto_SceneSortReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.scene.SceneSortReqProto.internal_static_google_iproto_SceneSortReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.scene.SceneSortReqProto.SceneSortReq.class, google.iproto.scene.SceneSortReqProto.SceneSortReq.Builder.class);
    }

    public static final int HOMEID_FIELD_NUMBER = 4;
    private int homeid_;
    /**
     * <pre>
     *家庭ID  有房间ID 就没有家庭ID
     * </pre>
     *
     * <code>int32 homeid = 4;</code>
     */
    public int getHomeid() {
      return homeid_;
    }

    public static final int ROOMID_FIELD_NUMBER = 3;
    private int roomid_;
    /**
     * <pre>
     *房间ID
     * </pre>
     *
     * <code>int32 roomid = 3;</code>
     */
    public int getRoomid() {
      return roomid_;
    }

    public static final int FROM_FIELD_NUMBER = 1;
    private int from_;
    /**
     * <pre>
     *起始位置
     * </pre>
     *
     * <code>int32 from = 1;</code>
     */
    public int getFrom() {
      return from_;
    }

    public static final int TO_FIELD_NUMBER = 2;
    private int to_;
    /**
     * <pre>
     *结束位置
     * </pre>
     *
     * <code>int32 to = 2;</code>
     */
    public int getTo() {
      return to_;
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
      if (from_ != 0) {
        output.writeInt32(1, from_);
      }
      if (to_ != 0) {
        output.writeInt32(2, to_);
      }
      if (roomid_ != 0) {
        output.writeInt32(3, roomid_);
      }
      if (homeid_ != 0) {
        output.writeInt32(4, homeid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (from_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, from_);
      }
      if (to_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, to_);
      }
      if (roomid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, roomid_);
      }
      if (homeid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, homeid_);
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
      if (!(obj instanceof google.iproto.scene.SceneSortReqProto.SceneSortReq)) {
        return super.equals(obj);
      }
      google.iproto.scene.SceneSortReqProto.SceneSortReq other = (google.iproto.scene.SceneSortReqProto.SceneSortReq) obj;

      boolean result = true;
      result = result && (getHomeid()
          == other.getHomeid());
      result = result && (getRoomid()
          == other.getRoomid());
      result = result && (getFrom()
          == other.getFrom());
      result = result && (getTo()
          == other.getTo());
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
      hash = (37 * hash) + HOMEID_FIELD_NUMBER;
      hash = (53 * hash) + getHomeid();
      hash = (37 * hash) + ROOMID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomid();
      hash = (37 * hash) + FROM_FIELD_NUMBER;
      hash = (53 * hash) + getFrom();
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getTo();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneSortReqProto.SceneSortReq parseFrom(
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
    public static Builder newBuilder(google.iproto.scene.SceneSortReqProto.SceneSortReq prototype) {
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
     *场景设备排序接口
     * </pre>
     *
     * Protobuf type {@code google.iproto.SceneSortReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.SceneSortReq)
        google.iproto.scene.SceneSortReqProto.SceneSortReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.scene.SceneSortReqProto.internal_static_google_iproto_SceneSortReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.scene.SceneSortReqProto.internal_static_google_iproto_SceneSortReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.scene.SceneSortReqProto.SceneSortReq.class, google.iproto.scene.SceneSortReqProto.SceneSortReq.Builder.class);
      }

      // Construct using google.iproto.scene.SceneSortReqProto.SceneSortReq.newBuilder()
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
        homeid_ = 0;

        roomid_ = 0;

        from_ = 0;

        to_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.scene.SceneSortReqProto.internal_static_google_iproto_SceneSortReq_descriptor;
      }

      public google.iproto.scene.SceneSortReqProto.SceneSortReq getDefaultInstanceForType() {
        return google.iproto.scene.SceneSortReqProto.SceneSortReq.getDefaultInstance();
      }

      public google.iproto.scene.SceneSortReqProto.SceneSortReq build() {
        google.iproto.scene.SceneSortReqProto.SceneSortReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.scene.SceneSortReqProto.SceneSortReq buildPartial() {
        google.iproto.scene.SceneSortReqProto.SceneSortReq result = new google.iproto.scene.SceneSortReqProto.SceneSortReq(this);
        result.homeid_ = homeid_;
        result.roomid_ = roomid_;
        result.from_ = from_;
        result.to_ = to_;
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
        if (other instanceof google.iproto.scene.SceneSortReqProto.SceneSortReq) {
          return mergeFrom((google.iproto.scene.SceneSortReqProto.SceneSortReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.scene.SceneSortReqProto.SceneSortReq other) {
        if (other == google.iproto.scene.SceneSortReqProto.SceneSortReq.getDefaultInstance()) return this;
        if (other.getHomeid() != 0) {
          setHomeid(other.getHomeid());
        }
        if (other.getRoomid() != 0) {
          setRoomid(other.getRoomid());
        }
        if (other.getFrom() != 0) {
          setFrom(other.getFrom());
        }
        if (other.getTo() != 0) {
          setTo(other.getTo());
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
        google.iproto.scene.SceneSortReqProto.SceneSortReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.scene.SceneSortReqProto.SceneSortReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int homeid_ ;
      /**
       * <pre>
       *家庭ID  有房间ID 就没有家庭ID
       * </pre>
       *
       * <code>int32 homeid = 4;</code>
       */
      public int getHomeid() {
        return homeid_;
      }
      /**
       * <pre>
       *家庭ID  有房间ID 就没有家庭ID
       * </pre>
       *
       * <code>int32 homeid = 4;</code>
       */
      public Builder setHomeid(int value) {
        
        homeid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *家庭ID  有房间ID 就没有家庭ID
       * </pre>
       *
       * <code>int32 homeid = 4;</code>
       */
      public Builder clearHomeid() {
        
        homeid_ = 0;
        onChanged();
        return this;
      }

      private int roomid_ ;
      /**
       * <pre>
       *房间ID
       * </pre>
       *
       * <code>int32 roomid = 3;</code>
       */
      public int getRoomid() {
        return roomid_;
      }
      /**
       * <pre>
       *房间ID
       * </pre>
       *
       * <code>int32 roomid = 3;</code>
       */
      public Builder setRoomid(int value) {
        
        roomid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *房间ID
       * </pre>
       *
       * <code>int32 roomid = 3;</code>
       */
      public Builder clearRoomid() {
        
        roomid_ = 0;
        onChanged();
        return this;
      }

      private int from_ ;
      /**
       * <pre>
       *起始位置
       * </pre>
       *
       * <code>int32 from = 1;</code>
       */
      public int getFrom() {
        return from_;
      }
      /**
       * <pre>
       *起始位置
       * </pre>
       *
       * <code>int32 from = 1;</code>
       */
      public Builder setFrom(int value) {
        
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *起始位置
       * </pre>
       *
       * <code>int32 from = 1;</code>
       */
      public Builder clearFrom() {
        
        from_ = 0;
        onChanged();
        return this;
      }

      private int to_ ;
      /**
       * <pre>
       *结束位置
       * </pre>
       *
       * <code>int32 to = 2;</code>
       */
      public int getTo() {
        return to_;
      }
      /**
       * <pre>
       *结束位置
       * </pre>
       *
       * <code>int32 to = 2;</code>
       */
      public Builder setTo(int value) {
        
        to_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *结束位置
       * </pre>
       *
       * <code>int32 to = 2;</code>
       */
      public Builder clearTo() {
        
        to_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.SceneSortReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.SceneSortReq)
    private static final google.iproto.scene.SceneSortReqProto.SceneSortReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.scene.SceneSortReqProto.SceneSortReq();
    }

    public static google.iproto.scene.SceneSortReqProto.SceneSortReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneSortReq>
        PARSER = new com.google.protobuf.AbstractParser<SceneSortReq>() {
      public SceneSortReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneSortReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneSortReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneSortReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.scene.SceneSortReqProto.SceneSortReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_SceneSortReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_SceneSortReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/iproto/scene/SceneSortReq.proto" +
      "\022\rgoogle.iproto\"H\n\014SceneSortReq\022\016\n\006homei" +
      "d\030\004 \001(\005\022\016\n\006roomid\030\003 \001(\005\022\014\n\004from\030\001 \001(\005\022\n\n" +
      "\002to\030\002 \001(\005B(\n\023google.iproto.sceneB\021SceneS" +
      "ortReqProtob\006proto3"
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
    internal_static_google_iproto_SceneSortReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_SceneSortReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_SceneSortReq_descriptor,
        new java.lang.String[] { "Homeid", "Roomid", "From", "To", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
