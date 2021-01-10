// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/room/RoomDeleteReq.proto

package google.iproto.room;

public final class RoomDeleteReqProto {
  private RoomDeleteReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoomDeleteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.RoomDeleteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *房间Id
     * </pre>
     *
     * <code>int32 roomid = 1;</code>
     */
    int getRoomid();
  }
  /**
   * <pre>
   *删除房间
   * </pre>
   *
   * Protobuf type {@code google.iproto.RoomDeleteReq}
   */
  public  static final class RoomDeleteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.RoomDeleteReq)
      RoomDeleteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoomDeleteReq.newBuilder() to construct.
    private RoomDeleteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoomDeleteReq() {
      roomid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoomDeleteReq(
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

              roomid_ = input.readInt32();
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
      return google.iproto.room.RoomDeleteReqProto.internal_static_google_iproto_RoomDeleteReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.room.RoomDeleteReqProto.internal_static_google_iproto_RoomDeleteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.room.RoomDeleteReqProto.RoomDeleteReq.class, google.iproto.room.RoomDeleteReqProto.RoomDeleteReq.Builder.class);
    }

    public static final int ROOMID_FIELD_NUMBER = 1;
    private int roomid_;
    /**
     * <pre>
     *房间Id
     * </pre>
     *
     * <code>int32 roomid = 1;</code>
     */
    public int getRoomid() {
      return roomid_;
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
      if (roomid_ != 0) {
        output.writeInt32(1, roomid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (roomid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, roomid_);
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
      if (!(obj instanceof google.iproto.room.RoomDeleteReqProto.RoomDeleteReq)) {
        return super.equals(obj);
      }
      google.iproto.room.RoomDeleteReqProto.RoomDeleteReq other = (google.iproto.room.RoomDeleteReqProto.RoomDeleteReq) obj;

      boolean result = true;
      result = result && (getRoomid()
          == other.getRoomid());
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
      hash = (37 * hash) + ROOMID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parseFrom(
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
    public static Builder newBuilder(google.iproto.room.RoomDeleteReqProto.RoomDeleteReq prototype) {
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
     *删除房间
     * </pre>
     *
     * Protobuf type {@code google.iproto.RoomDeleteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.RoomDeleteReq)
        google.iproto.room.RoomDeleteReqProto.RoomDeleteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.room.RoomDeleteReqProto.internal_static_google_iproto_RoomDeleteReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.room.RoomDeleteReqProto.internal_static_google_iproto_RoomDeleteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.room.RoomDeleteReqProto.RoomDeleteReq.class, google.iproto.room.RoomDeleteReqProto.RoomDeleteReq.Builder.class);
      }

      // Construct using google.iproto.room.RoomDeleteReqProto.RoomDeleteReq.newBuilder()
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
        roomid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.room.RoomDeleteReqProto.internal_static_google_iproto_RoomDeleteReq_descriptor;
      }

      public google.iproto.room.RoomDeleteReqProto.RoomDeleteReq getDefaultInstanceForType() {
        return google.iproto.room.RoomDeleteReqProto.RoomDeleteReq.getDefaultInstance();
      }

      public google.iproto.room.RoomDeleteReqProto.RoomDeleteReq build() {
        google.iproto.room.RoomDeleteReqProto.RoomDeleteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.room.RoomDeleteReqProto.RoomDeleteReq buildPartial() {
        google.iproto.room.RoomDeleteReqProto.RoomDeleteReq result = new google.iproto.room.RoomDeleteReqProto.RoomDeleteReq(this);
        result.roomid_ = roomid_;
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
        if (other instanceof google.iproto.room.RoomDeleteReqProto.RoomDeleteReq) {
          return mergeFrom((google.iproto.room.RoomDeleteReqProto.RoomDeleteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.room.RoomDeleteReqProto.RoomDeleteReq other) {
        if (other == google.iproto.room.RoomDeleteReqProto.RoomDeleteReq.getDefaultInstance()) return this;
        if (other.getRoomid() != 0) {
          setRoomid(other.getRoomid());
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
        google.iproto.room.RoomDeleteReqProto.RoomDeleteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.room.RoomDeleteReqProto.RoomDeleteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int roomid_ ;
      /**
       * <pre>
       *房间Id
       * </pre>
       *
       * <code>int32 roomid = 1;</code>
       */
      public int getRoomid() {
        return roomid_;
      }
      /**
       * <pre>
       *房间Id
       * </pre>
       *
       * <code>int32 roomid = 1;</code>
       */
      public Builder setRoomid(int value) {
        
        roomid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *房间Id
       * </pre>
       *
       * <code>int32 roomid = 1;</code>
       */
      public Builder clearRoomid() {
        
        roomid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.RoomDeleteReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.RoomDeleteReq)
    private static final google.iproto.room.RoomDeleteReqProto.RoomDeleteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.room.RoomDeleteReqProto.RoomDeleteReq();
    }

    public static google.iproto.room.RoomDeleteReqProto.RoomDeleteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoomDeleteReq>
        PARSER = new com.google.protobuf.AbstractParser<RoomDeleteReq>() {
      public RoomDeleteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoomDeleteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoomDeleteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoomDeleteReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.room.RoomDeleteReqProto.RoomDeleteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_RoomDeleteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_RoomDeleteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/iproto/room/RoomDeleteReq.proto" +
      "\022\rgoogle.iproto\"\037\n\rRoomDeleteReq\022\016\n\006room" +
      "id\030\001 \001(\005B(\n\022google.iproto.roomB\022RoomDele" +
      "teReqProtob\006proto3"
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
    internal_static_google_iproto_RoomDeleteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_RoomDeleteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_RoomDeleteReq_descriptor,
        new java.lang.String[] { "Roomid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
