// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/room/RoomUpdateDeviceReq.proto

package google.iproto.room;

public final class RoomUpdateDeviceReqProto {
  private RoomUpdateDeviceReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoomUpdateDeviceReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.RoomUpdateDeviceReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *房间Id
     * </pre>
     *
     * <code>int32 roomid = 1;</code>
     */
    int getRoomid();

    /**
     * <pre>
     *房间名称
     * </pre>
     *
     * <code>string roomamne = 2;</code>
     */
    java.lang.String getRoomamne();
    /**
     * <pre>
     *房间名称
     * </pre>
     *
     * <code>string roomamne = 2;</code>
     */
    com.google.protobuf.ByteString
        getRoomamneBytes();

    /**
     * <pre>
     *房间图片地址
     * </pre>
     *
     * <code>string roomimg = 4;</code>
     */
    java.lang.String getRoomimg();
    /**
     * <pre>
     *房间图片地址
     * </pre>
     *
     * <code>string roomimg = 4;</code>
     */
    com.google.protobuf.ByteString
        getRoomimgBytes();

    /**
     * <pre>
     *设备id集合
     * </pre>
     *
     * <code>repeated int32 devis = 3;</code>
     */
    java.util.List<java.lang.Integer> getDevisList();
    /**
     * <pre>
     *设备id集合
     * </pre>
     *
     * <code>repeated int32 devis = 3;</code>
     */
    int getDevisCount();
    /**
     * <pre>
     *设备id集合
     * </pre>
     *
     * <code>repeated int32 devis = 3;</code>
     */
    int getDevis(int index);

    /**
     * <pre>
     * 房间id
     * </pre>
     *
     * <code>int32 homeid = 5;</code>
     */
    int getHomeid();
  }
  /**
   * <pre>
   *创建房间
   * </pre>
   *
   * Protobuf type {@code google.iproto.RoomUpdateDeviceReq}
   */
  public  static final class RoomUpdateDeviceReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.RoomUpdateDeviceReq)
      RoomUpdateDeviceReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoomUpdateDeviceReq.newBuilder() to construct.
    private RoomUpdateDeviceReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoomUpdateDeviceReq() {
      roomid_ = 0;
      roomamne_ = "";
      roomimg_ = "";
      devis_ = java.util.Collections.emptyList();
      homeid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoomUpdateDeviceReq(
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              roomamne_ = s;
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                devis_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              devis_.add(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
                devis_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              while (input.getBytesUntilLimit() > 0) {
                devis_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              roomimg_ = s;
              break;
            }
            case 40: {

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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          devis_ = java.util.Collections.unmodifiableList(devis_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.room.RoomUpdateDeviceReqProto.internal_static_google_iproto_RoomUpdateDeviceReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.room.RoomUpdateDeviceReqProto.internal_static_google_iproto_RoomUpdateDeviceReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq.class, google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq.Builder.class);
    }

    private int bitField0_;
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

    public static final int ROOMAMNE_FIELD_NUMBER = 2;
    private volatile java.lang.Object roomamne_;
    /**
     * <pre>
     *房间名称
     * </pre>
     *
     * <code>string roomamne = 2;</code>
     */
    public java.lang.String getRoomamne() {
      java.lang.Object ref = roomamne_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roomamne_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *房间名称
     * </pre>
     *
     * <code>string roomamne = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRoomamneBytes() {
      java.lang.Object ref = roomamne_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roomamne_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROOMIMG_FIELD_NUMBER = 4;
    private volatile java.lang.Object roomimg_;
    /**
     * <pre>
     *房间图片地址
     * </pre>
     *
     * <code>string roomimg = 4;</code>
     */
    public java.lang.String getRoomimg() {
      java.lang.Object ref = roomimg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roomimg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *房间图片地址
     * </pre>
     *
     * <code>string roomimg = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRoomimgBytes() {
      java.lang.Object ref = roomimg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roomimg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVIS_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> devis_;
    /**
     * <pre>
     *设备id集合
     * </pre>
     *
     * <code>repeated int32 devis = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getDevisList() {
      return devis_;
    }
    /**
     * <pre>
     *设备id集合
     * </pre>
     *
     * <code>repeated int32 devis = 3;</code>
     */
    public int getDevisCount() {
      return devis_.size();
    }
    /**
     * <pre>
     *设备id集合
     * </pre>
     *
     * <code>repeated int32 devis = 3;</code>
     */
    public int getDevis(int index) {
      return devis_.get(index);
    }
    private int devisMemoizedSerializedSize = -1;

    public static final int HOMEID_FIELD_NUMBER = 5;
    private int homeid_;
    /**
     * <pre>
     * 房间id
     * </pre>
     *
     * <code>int32 homeid = 5;</code>
     */
    public int getHomeid() {
      return homeid_;
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
      getSerializedSize();
      if (roomid_ != 0) {
        output.writeInt32(1, roomid_);
      }
      if (!getRoomamneBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomamne_);
      }
      if (getDevisList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(devisMemoizedSerializedSize);
      }
      for (int i = 0; i < devis_.size(); i++) {
        output.writeInt32NoTag(devis_.get(i));
      }
      if (!getRoomimgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, roomimg_);
      }
      if (homeid_ != 0) {
        output.writeInt32(5, homeid_);
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
      if (!getRoomamneBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomamne_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < devis_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(devis_.get(i));
        }
        size += dataSize;
        if (!getDevisList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        devisMemoizedSerializedSize = dataSize;
      }
      if (!getRoomimgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, roomimg_);
      }
      if (homeid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, homeid_);
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
      if (!(obj instanceof google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq)) {
        return super.equals(obj);
      }
      google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq other = (google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq) obj;

      boolean result = true;
      result = result && (getRoomid()
          == other.getRoomid());
      result = result && getRoomamne()
          .equals(other.getRoomamne());
      result = result && getRoomimg()
          .equals(other.getRoomimg());
      result = result && getDevisList()
          .equals(other.getDevisList());
      result = result && (getHomeid()
          == other.getHomeid());
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
      hash = (37 * hash) + ROOMAMNE_FIELD_NUMBER;
      hash = (53 * hash) + getRoomamne().hashCode();
      hash = (37 * hash) + ROOMIMG_FIELD_NUMBER;
      hash = (53 * hash) + getRoomimg().hashCode();
      if (getDevisCount() > 0) {
        hash = (37 * hash) + DEVIS_FIELD_NUMBER;
        hash = (53 * hash) + getDevisList().hashCode();
      }
      hash = (37 * hash) + HOMEID_FIELD_NUMBER;
      hash = (53 * hash) + getHomeid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parseFrom(
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
    public static Builder newBuilder(google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq prototype) {
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
     *创建房间
     * </pre>
     *
     * Protobuf type {@code google.iproto.RoomUpdateDeviceReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.RoomUpdateDeviceReq)
        google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.room.RoomUpdateDeviceReqProto.internal_static_google_iproto_RoomUpdateDeviceReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.room.RoomUpdateDeviceReqProto.internal_static_google_iproto_RoomUpdateDeviceReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq.class, google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq.Builder.class);
      }

      // Construct using google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq.newBuilder()
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

        roomamne_ = "";

        roomimg_ = "";

        devis_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        homeid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.room.RoomUpdateDeviceReqProto.internal_static_google_iproto_RoomUpdateDeviceReq_descriptor;
      }

      public google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq getDefaultInstanceForType() {
        return google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq.getDefaultInstance();
      }

      public google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq build() {
        google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq buildPartial() {
        google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq result = new google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.roomid_ = roomid_;
        result.roomamne_ = roomamne_;
        result.roomimg_ = roomimg_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          devis_ = java.util.Collections.unmodifiableList(devis_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.devis_ = devis_;
        result.homeid_ = homeid_;
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
        if (other instanceof google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq) {
          return mergeFrom((google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq other) {
        if (other == google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq.getDefaultInstance()) return this;
        if (other.getRoomid() != 0) {
          setRoomid(other.getRoomid());
        }
        if (!other.getRoomamne().isEmpty()) {
          roomamne_ = other.roomamne_;
          onChanged();
        }
        if (!other.getRoomimg().isEmpty()) {
          roomimg_ = other.roomimg_;
          onChanged();
        }
        if (!other.devis_.isEmpty()) {
          if (devis_.isEmpty()) {
            devis_ = other.devis_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureDevisIsMutable();
            devis_.addAll(other.devis_);
          }
          onChanged();
        }
        if (other.getHomeid() != 0) {
          setHomeid(other.getHomeid());
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
        google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

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

      private java.lang.Object roomamne_ = "";
      /**
       * <pre>
       *房间名称
       * </pre>
       *
       * <code>string roomamne = 2;</code>
       */
      public java.lang.String getRoomamne() {
        java.lang.Object ref = roomamne_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          roomamne_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *房间名称
       * </pre>
       *
       * <code>string roomamne = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRoomamneBytes() {
        java.lang.Object ref = roomamne_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          roomamne_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *房间名称
       * </pre>
       *
       * <code>string roomamne = 2;</code>
       */
      public Builder setRoomamne(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        roomamne_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *房间名称
       * </pre>
       *
       * <code>string roomamne = 2;</code>
       */
      public Builder clearRoomamne() {
        
        roomamne_ = getDefaultInstance().getRoomamne();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *房间名称
       * </pre>
       *
       * <code>string roomamne = 2;</code>
       */
      public Builder setRoomamneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        roomamne_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object roomimg_ = "";
      /**
       * <pre>
       *房间图片地址
       * </pre>
       *
       * <code>string roomimg = 4;</code>
       */
      public java.lang.String getRoomimg() {
        java.lang.Object ref = roomimg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          roomimg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *房间图片地址
       * </pre>
       *
       * <code>string roomimg = 4;</code>
       */
      public com.google.protobuf.ByteString
          getRoomimgBytes() {
        java.lang.Object ref = roomimg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          roomimg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *房间图片地址
       * </pre>
       *
       * <code>string roomimg = 4;</code>
       */
      public Builder setRoomimg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        roomimg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *房间图片地址
       * </pre>
       *
       * <code>string roomimg = 4;</code>
       */
      public Builder clearRoomimg() {
        
        roomimg_ = getDefaultInstance().getRoomimg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *房间图片地址
       * </pre>
       *
       * <code>string roomimg = 4;</code>
       */
      public Builder setRoomimgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        roomimg_ = value;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> devis_ = java.util.Collections.emptyList();
      private void ensureDevisIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          devis_ = new java.util.ArrayList<java.lang.Integer>(devis_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <pre>
       *设备id集合
       * </pre>
       *
       * <code>repeated int32 devis = 3;</code>
       */
      public java.util.List<java.lang.Integer>
          getDevisList() {
        return java.util.Collections.unmodifiableList(devis_);
      }
      /**
       * <pre>
       *设备id集合
       * </pre>
       *
       * <code>repeated int32 devis = 3;</code>
       */
      public int getDevisCount() {
        return devis_.size();
      }
      /**
       * <pre>
       *设备id集合
       * </pre>
       *
       * <code>repeated int32 devis = 3;</code>
       */
      public int getDevis(int index) {
        return devis_.get(index);
      }
      /**
       * <pre>
       *设备id集合
       * </pre>
       *
       * <code>repeated int32 devis = 3;</code>
       */
      public Builder setDevis(
          int index, int value) {
        ensureDevisIsMutable();
        devis_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *设备id集合
       * </pre>
       *
       * <code>repeated int32 devis = 3;</code>
       */
      public Builder addDevis(int value) {
        ensureDevisIsMutable();
        devis_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *设备id集合
       * </pre>
       *
       * <code>repeated int32 devis = 3;</code>
       */
      public Builder addAllDevis(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDevisIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devis_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *设备id集合
       * </pre>
       *
       * <code>repeated int32 devis = 3;</code>
       */
      public Builder clearDevis() {
        devis_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      private int homeid_ ;
      /**
       * <pre>
       * 房间id
       * </pre>
       *
       * <code>int32 homeid = 5;</code>
       */
      public int getHomeid() {
        return homeid_;
      }
      /**
       * <pre>
       * 房间id
       * </pre>
       *
       * <code>int32 homeid = 5;</code>
       */
      public Builder setHomeid(int value) {
        
        homeid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 房间id
       * </pre>
       *
       * <code>int32 homeid = 5;</code>
       */
      public Builder clearHomeid() {
        
        homeid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.RoomUpdateDeviceReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.RoomUpdateDeviceReq)
    private static final google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq();
    }

    public static google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoomUpdateDeviceReq>
        PARSER = new com.google.protobuf.AbstractParser<RoomUpdateDeviceReq>() {
      public RoomUpdateDeviceReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoomUpdateDeviceReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoomUpdateDeviceReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoomUpdateDeviceReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.room.RoomUpdateDeviceReqProto.RoomUpdateDeviceReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_RoomUpdateDeviceReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_RoomUpdateDeviceReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/iproto/room/RoomUpdateDeviceReq" +
      ".proto\022\rgoogle.iproto\"g\n\023RoomUpdateDevic" +
      "eReq\022\016\n\006roomid\030\001 \001(\005\022\020\n\010roomamne\030\002 \001(\t\022\017" +
      "\n\007roomimg\030\004 \001(\t\022\r\n\005devis\030\003 \003(\005\022\016\n\006homeid" +
      "\030\005 \001(\005B.\n\022google.iproto.roomB\030RoomUpdate" +
      "DeviceReqProtob\006proto3"
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
    internal_static_google_iproto_RoomUpdateDeviceReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_RoomUpdateDeviceReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_RoomUpdateDeviceReq_descriptor,
        new java.lang.String[] { "Roomid", "Roomamne", "Roomimg", "Devis", "Homeid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
