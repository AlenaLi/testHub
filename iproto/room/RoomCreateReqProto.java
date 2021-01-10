// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/room/RoomCreateReq.proto

package google.iproto.room;

public final class RoomCreateReqProto {
  private RoomCreateReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoomCreateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.RoomCreateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 homeid = 1;</code>
     */
    int getHomeid();

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
  }
  /**
   * <pre>
   *创建房间
   * </pre>
   *
   * Protobuf type {@code google.iproto.RoomCreateReq}
   */
  public  static final class RoomCreateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.RoomCreateReq)
      RoomCreateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoomCreateReq.newBuilder() to construct.
    private RoomCreateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoomCreateReq() {
      homeid_ = 0;
      roomamne_ = "";
      roomimg_ = "";
      devis_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoomCreateReq(
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

              homeid_ = input.readInt32();
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
      return google.iproto.room.RoomCreateReqProto.internal_static_google_iproto_RoomCreateReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.room.RoomCreateReqProto.internal_static_google_iproto_RoomCreateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.room.RoomCreateReqProto.RoomCreateReq.class, google.iproto.room.RoomCreateReqProto.RoomCreateReq.Builder.class);
    }

    private int bitField0_;
    public static final int HOMEID_FIELD_NUMBER = 1;
    private int homeid_;
    /**
     * <code>int32 homeid = 1;</code>
     */
    public int getHomeid() {
      return homeid_;
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
      if (homeid_ != 0) {
        output.writeInt32(1, homeid_);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (homeid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, homeid_);
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof google.iproto.room.RoomCreateReqProto.RoomCreateReq)) {
        return super.equals(obj);
      }
      google.iproto.room.RoomCreateReqProto.RoomCreateReq other = (google.iproto.room.RoomCreateReqProto.RoomCreateReq) obj;

      boolean result = true;
      result = result && (getHomeid()
          == other.getHomeid());
      result = result && getRoomamne()
          .equals(other.getRoomamne());
      result = result && getRoomimg()
          .equals(other.getRoomimg());
      result = result && getDevisList()
          .equals(other.getDevisList());
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
      hash = (37 * hash) + ROOMAMNE_FIELD_NUMBER;
      hash = (53 * hash) + getRoomamne().hashCode();
      hash = (37 * hash) + ROOMIMG_FIELD_NUMBER;
      hash = (53 * hash) + getRoomimg().hashCode();
      if (getDevisCount() > 0) {
        hash = (37 * hash) + DEVIS_FIELD_NUMBER;
        hash = (53 * hash) + getDevisList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq parseFrom(
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
    public static Builder newBuilder(google.iproto.room.RoomCreateReqProto.RoomCreateReq prototype) {
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
     * Protobuf type {@code google.iproto.RoomCreateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.RoomCreateReq)
        google.iproto.room.RoomCreateReqProto.RoomCreateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.room.RoomCreateReqProto.internal_static_google_iproto_RoomCreateReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.room.RoomCreateReqProto.internal_static_google_iproto_RoomCreateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.room.RoomCreateReqProto.RoomCreateReq.class, google.iproto.room.RoomCreateReqProto.RoomCreateReq.Builder.class);
      }

      // Construct using google.iproto.room.RoomCreateReqProto.RoomCreateReq.newBuilder()
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

        roomamne_ = "";

        roomimg_ = "";

        devis_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.room.RoomCreateReqProto.internal_static_google_iproto_RoomCreateReq_descriptor;
      }

      public google.iproto.room.RoomCreateReqProto.RoomCreateReq getDefaultInstanceForType() {
        return google.iproto.room.RoomCreateReqProto.RoomCreateReq.getDefaultInstance();
      }

      public google.iproto.room.RoomCreateReqProto.RoomCreateReq build() {
        google.iproto.room.RoomCreateReqProto.RoomCreateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.room.RoomCreateReqProto.RoomCreateReq buildPartial() {
        google.iproto.room.RoomCreateReqProto.RoomCreateReq result = new google.iproto.room.RoomCreateReqProto.RoomCreateReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.homeid_ = homeid_;
        result.roomamne_ = roomamne_;
        result.roomimg_ = roomimg_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          devis_ = java.util.Collections.unmodifiableList(devis_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.devis_ = devis_;
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
        if (other instanceof google.iproto.room.RoomCreateReqProto.RoomCreateReq) {
          return mergeFrom((google.iproto.room.RoomCreateReqProto.RoomCreateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.room.RoomCreateReqProto.RoomCreateReq other) {
        if (other == google.iproto.room.RoomCreateReqProto.RoomCreateReq.getDefaultInstance()) return this;
        if (other.getHomeid() != 0) {
          setHomeid(other.getHomeid());
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
        google.iproto.room.RoomCreateReqProto.RoomCreateReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.room.RoomCreateReqProto.RoomCreateReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int homeid_ ;
      /**
       * <code>int32 homeid = 1;</code>
       */
      public int getHomeid() {
        return homeid_;
      }
      /**
       * <code>int32 homeid = 1;</code>
       */
      public Builder setHomeid(int value) {
        
        homeid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 homeid = 1;</code>
       */
      public Builder clearHomeid() {
        
        homeid_ = 0;
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
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:google.iproto.RoomCreateReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.RoomCreateReq)
    private static final google.iproto.room.RoomCreateReqProto.RoomCreateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.room.RoomCreateReqProto.RoomCreateReq();
    }

    public static google.iproto.room.RoomCreateReqProto.RoomCreateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoomCreateReq>
        PARSER = new com.google.protobuf.AbstractParser<RoomCreateReq>() {
      public RoomCreateReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoomCreateReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoomCreateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoomCreateReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.room.RoomCreateReqProto.RoomCreateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_RoomCreateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_RoomCreateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/iproto/room/RoomCreateReq.proto" +
      "\022\rgoogle.iproto\"Q\n\rRoomCreateReq\022\016\n\006home" +
      "id\030\001 \001(\005\022\020\n\010roomamne\030\002 \001(\t\022\017\n\007roomimg\030\004 " +
      "\001(\t\022\r\n\005devis\030\003 \003(\005B(\n\022google.iproto.room" +
      "B\022RoomCreateReqProtob\006proto3"
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
    internal_static_google_iproto_RoomCreateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_RoomCreateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_RoomCreateReq_descriptor,
        new java.lang.String[] { "Homeid", "Roomamne", "Roomimg", "Devis", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}