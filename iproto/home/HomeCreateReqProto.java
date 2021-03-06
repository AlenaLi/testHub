// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/home/HomeCreateReq.proto

package google.iproto.home;

public final class HomeCreateReqProto {
  private HomeCreateReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeCreateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.HomeCreateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *homeId 如果有是修改家庭信息，没有值是创建
     * </pre>
     *
     * <code>int32 homeid = 1;</code>
     */
    int getHomeid();

    /**
     * <pre>
     *家庭名称
     * </pre>
     *
     * <code>string homename = 2;</code>
     */
    java.lang.String getHomename();
    /**
     * <pre>
     *家庭名称
     * </pre>
     *
     * <code>string homename = 2;</code>
     */
    com.google.protobuf.ByteString
        getHomenameBytes();

    /**
     * <pre>
     *地址行政区
     * </pre>
     *
     * <code>string addrcode = 3;</code>
     */
    java.lang.String getAddrcode();
    /**
     * <pre>
     *地址行政区
     * </pre>
     *
     * <code>string addrcode = 3;</code>
     */
    com.google.protobuf.ByteString
        getAddrcodeBytes();

    /**
     * <pre>
     *详细地址
     * </pre>
     *
     * <code>string addr = 4;</code>
     */
    java.lang.String getAddr();
    /**
     * <pre>
     *详细地址
     * </pre>
     *
     * <code>string addr = 4;</code>
     */
    com.google.protobuf.ByteString
        getAddrBytes();

    /**
     * <pre>
     *家庭背景图片，如果是默认图片是Default
     * </pre>
     *
     * <code>string homeimg = 5;</code>
     */
    java.lang.String getHomeimg();
    /**
     * <pre>
     *家庭背景图片，如果是默认图片是Default
     * </pre>
     *
     * <code>string homeimg = 5;</code>
     */
    com.google.protobuf.ByteString
        getHomeimgBytes();
  }
  /**
   * <pre>
   *创建家庭请求
   * </pre>
   *
   * Protobuf type {@code google.iproto.HomeCreateReq}
   */
  public  static final class HomeCreateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.HomeCreateReq)
      HomeCreateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeCreateReq.newBuilder() to construct.
    private HomeCreateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeCreateReq() {
      homeid_ = 0;
      homename_ = "";
      addrcode_ = "";
      addr_ = "";
      homeimg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeCreateReq(
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

              homename_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              addrcode_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              addr_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              homeimg_ = s;
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
      return google.iproto.home.HomeCreateReqProto.internal_static_google_iproto_HomeCreateReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.home.HomeCreateReqProto.internal_static_google_iproto_HomeCreateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.home.HomeCreateReqProto.HomeCreateReq.class, google.iproto.home.HomeCreateReqProto.HomeCreateReq.Builder.class);
    }

    public static final int HOMEID_FIELD_NUMBER = 1;
    private int homeid_;
    /**
     * <pre>
     *homeId 如果有是修改家庭信息，没有值是创建
     * </pre>
     *
     * <code>int32 homeid = 1;</code>
     */
    public int getHomeid() {
      return homeid_;
    }

    public static final int HOMENAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object homename_;
    /**
     * <pre>
     *家庭名称
     * </pre>
     *
     * <code>string homename = 2;</code>
     */
    public java.lang.String getHomename() {
      java.lang.Object ref = homename_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        homename_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *家庭名称
     * </pre>
     *
     * <code>string homename = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHomenameBytes() {
      java.lang.Object ref = homename_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        homename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDRCODE_FIELD_NUMBER = 3;
    private volatile java.lang.Object addrcode_;
    /**
     * <pre>
     *地址行政区
     * </pre>
     *
     * <code>string addrcode = 3;</code>
     */
    public java.lang.String getAddrcode() {
      java.lang.Object ref = addrcode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addrcode_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *地址行政区
     * </pre>
     *
     * <code>string addrcode = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAddrcodeBytes() {
      java.lang.Object ref = addrcode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addrcode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDR_FIELD_NUMBER = 4;
    private volatile java.lang.Object addr_;
    /**
     * <pre>
     *详细地址
     * </pre>
     *
     * <code>string addr = 4;</code>
     */
    public java.lang.String getAddr() {
      java.lang.Object ref = addr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addr_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *详细地址
     * </pre>
     *
     * <code>string addr = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAddrBytes() {
      java.lang.Object ref = addr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HOMEIMG_FIELD_NUMBER = 5;
    private volatile java.lang.Object homeimg_;
    /**
     * <pre>
     *家庭背景图片，如果是默认图片是Default
     * </pre>
     *
     * <code>string homeimg = 5;</code>
     */
    public java.lang.String getHomeimg() {
      java.lang.Object ref = homeimg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        homeimg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *家庭背景图片，如果是默认图片是Default
     * </pre>
     *
     * <code>string homeimg = 5;</code>
     */
    public com.google.protobuf.ByteString
        getHomeimgBytes() {
      java.lang.Object ref = homeimg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        homeimg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (homeid_ != 0) {
        output.writeInt32(1, homeid_);
      }
      if (!getHomenameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, homename_);
      }
      if (!getAddrcodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, addrcode_);
      }
      if (!getAddrBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, addr_);
      }
      if (!getHomeimgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, homeimg_);
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
      if (!getHomenameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, homename_);
      }
      if (!getAddrcodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, addrcode_);
      }
      if (!getAddrBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, addr_);
      }
      if (!getHomeimgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, homeimg_);
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
      if (!(obj instanceof google.iproto.home.HomeCreateReqProto.HomeCreateReq)) {
        return super.equals(obj);
      }
      google.iproto.home.HomeCreateReqProto.HomeCreateReq other = (google.iproto.home.HomeCreateReqProto.HomeCreateReq) obj;

      boolean result = true;
      result = result && (getHomeid()
          == other.getHomeid());
      result = result && getHomename()
          .equals(other.getHomename());
      result = result && getAddrcode()
          .equals(other.getAddrcode());
      result = result && getAddr()
          .equals(other.getAddr());
      result = result && getHomeimg()
          .equals(other.getHomeimg());
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
      hash = (37 * hash) + HOMENAME_FIELD_NUMBER;
      hash = (53 * hash) + getHomename().hashCode();
      hash = (37 * hash) + ADDRCODE_FIELD_NUMBER;
      hash = (53 * hash) + getAddrcode().hashCode();
      hash = (37 * hash) + ADDR_FIELD_NUMBER;
      hash = (53 * hash) + getAddr().hashCode();
      hash = (37 * hash) + HOMEIMG_FIELD_NUMBER;
      hash = (53 * hash) + getHomeimg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq parseFrom(
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
    public static Builder newBuilder(google.iproto.home.HomeCreateReqProto.HomeCreateReq prototype) {
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
     *创建家庭请求
     * </pre>
     *
     * Protobuf type {@code google.iproto.HomeCreateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.HomeCreateReq)
        google.iproto.home.HomeCreateReqProto.HomeCreateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.home.HomeCreateReqProto.internal_static_google_iproto_HomeCreateReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.home.HomeCreateReqProto.internal_static_google_iproto_HomeCreateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.home.HomeCreateReqProto.HomeCreateReq.class, google.iproto.home.HomeCreateReqProto.HomeCreateReq.Builder.class);
      }

      // Construct using google.iproto.home.HomeCreateReqProto.HomeCreateReq.newBuilder()
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

        homename_ = "";

        addrcode_ = "";

        addr_ = "";

        homeimg_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.home.HomeCreateReqProto.internal_static_google_iproto_HomeCreateReq_descriptor;
      }

      public google.iproto.home.HomeCreateReqProto.HomeCreateReq getDefaultInstanceForType() {
        return google.iproto.home.HomeCreateReqProto.HomeCreateReq.getDefaultInstance();
      }

      public google.iproto.home.HomeCreateReqProto.HomeCreateReq build() {
        google.iproto.home.HomeCreateReqProto.HomeCreateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.home.HomeCreateReqProto.HomeCreateReq buildPartial() {
        google.iproto.home.HomeCreateReqProto.HomeCreateReq result = new google.iproto.home.HomeCreateReqProto.HomeCreateReq(this);
        result.homeid_ = homeid_;
        result.homename_ = homename_;
        result.addrcode_ = addrcode_;
        result.addr_ = addr_;
        result.homeimg_ = homeimg_;
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
        if (other instanceof google.iproto.home.HomeCreateReqProto.HomeCreateReq) {
          return mergeFrom((google.iproto.home.HomeCreateReqProto.HomeCreateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.home.HomeCreateReqProto.HomeCreateReq other) {
        if (other == google.iproto.home.HomeCreateReqProto.HomeCreateReq.getDefaultInstance()) return this;
        if (other.getHomeid() != 0) {
          setHomeid(other.getHomeid());
        }
        if (!other.getHomename().isEmpty()) {
          homename_ = other.homename_;
          onChanged();
        }
        if (!other.getAddrcode().isEmpty()) {
          addrcode_ = other.addrcode_;
          onChanged();
        }
        if (!other.getAddr().isEmpty()) {
          addr_ = other.addr_;
          onChanged();
        }
        if (!other.getHomeimg().isEmpty()) {
          homeimg_ = other.homeimg_;
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
        google.iproto.home.HomeCreateReqProto.HomeCreateReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.home.HomeCreateReqProto.HomeCreateReq) e.getUnfinishedMessage();
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
       *homeId 如果有是修改家庭信息，没有值是创建
       * </pre>
       *
       * <code>int32 homeid = 1;</code>
       */
      public int getHomeid() {
        return homeid_;
      }
      /**
       * <pre>
       *homeId 如果有是修改家庭信息，没有值是创建
       * </pre>
       *
       * <code>int32 homeid = 1;</code>
       */
      public Builder setHomeid(int value) {
        
        homeid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *homeId 如果有是修改家庭信息，没有值是创建
       * </pre>
       *
       * <code>int32 homeid = 1;</code>
       */
      public Builder clearHomeid() {
        
        homeid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object homename_ = "";
      /**
       * <pre>
       *家庭名称
       * </pre>
       *
       * <code>string homename = 2;</code>
       */
      public java.lang.String getHomename() {
        java.lang.Object ref = homename_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          homename_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *家庭名称
       * </pre>
       *
       * <code>string homename = 2;</code>
       */
      public com.google.protobuf.ByteString
          getHomenameBytes() {
        java.lang.Object ref = homename_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          homename_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *家庭名称
       * </pre>
       *
       * <code>string homename = 2;</code>
       */
      public Builder setHomename(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        homename_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *家庭名称
       * </pre>
       *
       * <code>string homename = 2;</code>
       */
      public Builder clearHomename() {
        
        homename_ = getDefaultInstance().getHomename();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *家庭名称
       * </pre>
       *
       * <code>string homename = 2;</code>
       */
      public Builder setHomenameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        homename_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object addrcode_ = "";
      /**
       * <pre>
       *地址行政区
       * </pre>
       *
       * <code>string addrcode = 3;</code>
       */
      public java.lang.String getAddrcode() {
        java.lang.Object ref = addrcode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          addrcode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *地址行政区
       * </pre>
       *
       * <code>string addrcode = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAddrcodeBytes() {
        java.lang.Object ref = addrcode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          addrcode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *地址行政区
       * </pre>
       *
       * <code>string addrcode = 3;</code>
       */
      public Builder setAddrcode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        addrcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *地址行政区
       * </pre>
       *
       * <code>string addrcode = 3;</code>
       */
      public Builder clearAddrcode() {
        
        addrcode_ = getDefaultInstance().getAddrcode();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *地址行政区
       * </pre>
       *
       * <code>string addrcode = 3;</code>
       */
      public Builder setAddrcodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        addrcode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object addr_ = "";
      /**
       * <pre>
       *详细地址
       * </pre>
       *
       * <code>string addr = 4;</code>
       */
      public java.lang.String getAddr() {
        java.lang.Object ref = addr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          addr_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *详细地址
       * </pre>
       *
       * <code>string addr = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAddrBytes() {
        java.lang.Object ref = addr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          addr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *详细地址
       * </pre>
       *
       * <code>string addr = 4;</code>
       */
      public Builder setAddr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        addr_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *详细地址
       * </pre>
       *
       * <code>string addr = 4;</code>
       */
      public Builder clearAddr() {
        
        addr_ = getDefaultInstance().getAddr();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *详细地址
       * </pre>
       *
       * <code>string addr = 4;</code>
       */
      public Builder setAddrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        addr_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object homeimg_ = "";
      /**
       * <pre>
       *家庭背景图片，如果是默认图片是Default
       * </pre>
       *
       * <code>string homeimg = 5;</code>
       */
      public java.lang.String getHomeimg() {
        java.lang.Object ref = homeimg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          homeimg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *家庭背景图片，如果是默认图片是Default
       * </pre>
       *
       * <code>string homeimg = 5;</code>
       */
      public com.google.protobuf.ByteString
          getHomeimgBytes() {
        java.lang.Object ref = homeimg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          homeimg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *家庭背景图片，如果是默认图片是Default
       * </pre>
       *
       * <code>string homeimg = 5;</code>
       */
      public Builder setHomeimg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        homeimg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *家庭背景图片，如果是默认图片是Default
       * </pre>
       *
       * <code>string homeimg = 5;</code>
       */
      public Builder clearHomeimg() {
        
        homeimg_ = getDefaultInstance().getHomeimg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *家庭背景图片，如果是默认图片是Default
       * </pre>
       *
       * <code>string homeimg = 5;</code>
       */
      public Builder setHomeimgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        homeimg_ = value;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.HomeCreateReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.HomeCreateReq)
    private static final google.iproto.home.HomeCreateReqProto.HomeCreateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.home.HomeCreateReqProto.HomeCreateReq();
    }

    public static google.iproto.home.HomeCreateReqProto.HomeCreateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeCreateReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeCreateReq>() {
      public HomeCreateReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeCreateReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeCreateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeCreateReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.home.HomeCreateReqProto.HomeCreateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_HomeCreateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_HomeCreateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/iproto/home/HomeCreateReq.proto" +
      "\022\rgoogle.iproto\"b\n\rHomeCreateReq\022\016\n\006home" +
      "id\030\001 \001(\005\022\020\n\010homename\030\002 \001(\t\022\020\n\010addrcode\030\003" +
      " \001(\t\022\014\n\004addr\030\004 \001(\t\022\017\n\007homeimg\030\005 \001(\tB(\n\022g" +
      "oogle.iproto.homeB\022HomeCreateReqProtob\006p" +
      "roto3"
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
    internal_static_google_iproto_HomeCreateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_HomeCreateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_HomeCreateReq_descriptor,
        new java.lang.String[] { "Homeid", "Homename", "Addrcode", "Addr", "Homeimg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
