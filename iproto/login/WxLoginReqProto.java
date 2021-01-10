// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/login/WxLoginReq.proto

package google.iproto.login;

public final class WxLoginReqProto {
  private WxLoginReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WxLoginReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.WxLoginReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *微信返回ID
     * </pre>
     *
     * <code>string openid = 1;</code>
     */
    java.lang.String getOpenid();
    /**
     * <pre>
     *微信返回ID
     * </pre>
     *
     * <code>string openid = 1;</code>
     */
    com.google.protobuf.ByteString
        getOpenidBytes();

    /**
     * <pre>
     *微信昵称
     * </pre>
     *
     * <code>string nickname = 2;</code>
     */
    java.lang.String getNickname();
    /**
     * <pre>
     *微信昵称
     * </pre>
     *
     * <code>string nickname = 2;</code>
     */
    com.google.protobuf.ByteString
        getNicknameBytes();

    /**
     * <pre>
     *微信头像地址
     * </pre>
     *
     * <code>string headimgurl = 3;</code>
     */
    java.lang.String getHeadimgurl();
    /**
     * <pre>
     *微信头像地址
     * </pre>
     *
     * <code>string headimgurl = 3;</code>
     */
    com.google.protobuf.ByteString
        getHeadimgurlBytes();
  }
  /**
   * <pre>
   *微信登录请求
   * </pre>
   *
   * Protobuf type {@code google.iproto.WxLoginReq}
   */
  public  static final class WxLoginReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.WxLoginReq)
      WxLoginReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WxLoginReq.newBuilder() to construct.
    private WxLoginReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WxLoginReq() {
      openid_ = "";
      nickname_ = "";
      headimgurl_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WxLoginReq(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              openid_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              headimgurl_ = s;
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
      return google.iproto.login.WxLoginReqProto.internal_static_google_iproto_WxLoginReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.login.WxLoginReqProto.internal_static_google_iproto_WxLoginReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.login.WxLoginReqProto.WxLoginReq.class, google.iproto.login.WxLoginReqProto.WxLoginReq.Builder.class);
    }

    public static final int OPENID_FIELD_NUMBER = 1;
    private volatile java.lang.Object openid_;
    /**
     * <pre>
     *微信返回ID
     * </pre>
     *
     * <code>string openid = 1;</code>
     */
    public java.lang.String getOpenid() {
      java.lang.Object ref = openid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        openid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *微信返回ID
     * </pre>
     *
     * <code>string openid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOpenidBytes() {
      java.lang.Object ref = openid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        openid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NICKNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object nickname_;
    /**
     * <pre>
     *微信昵称
     * </pre>
     *
     * <code>string nickname = 2;</code>
     */
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *微信昵称
     * </pre>
     *
     * <code>string nickname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HEADIMGURL_FIELD_NUMBER = 3;
    private volatile java.lang.Object headimgurl_;
    /**
     * <pre>
     *微信头像地址
     * </pre>
     *
     * <code>string headimgurl = 3;</code>
     */
    public java.lang.String getHeadimgurl() {
      java.lang.Object ref = headimgurl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        headimgurl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *微信头像地址
     * </pre>
     *
     * <code>string headimgurl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getHeadimgurlBytes() {
      java.lang.Object ref = headimgurl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        headimgurl_ = b;
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
      if (!getOpenidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, openid_);
      }
      if (!getNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nickname_);
      }
      if (!getHeadimgurlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, headimgurl_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getOpenidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, openid_);
      }
      if (!getNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nickname_);
      }
      if (!getHeadimgurlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, headimgurl_);
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
      if (!(obj instanceof google.iproto.login.WxLoginReqProto.WxLoginReq)) {
        return super.equals(obj);
      }
      google.iproto.login.WxLoginReqProto.WxLoginReq other = (google.iproto.login.WxLoginReqProto.WxLoginReq) obj;

      boolean result = true;
      result = result && getOpenid()
          .equals(other.getOpenid());
      result = result && getNickname()
          .equals(other.getNickname());
      result = result && getHeadimgurl()
          .equals(other.getHeadimgurl());
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
      hash = (37 * hash) + OPENID_FIELD_NUMBER;
      hash = (53 * hash) + getOpenid().hashCode();
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (37 * hash) + HEADIMGURL_FIELD_NUMBER;
      hash = (53 * hash) + getHeadimgurl().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.login.WxLoginReqProto.WxLoginReq parseFrom(
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
    public static Builder newBuilder(google.iproto.login.WxLoginReqProto.WxLoginReq prototype) {
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
     *微信登录请求
     * </pre>
     *
     * Protobuf type {@code google.iproto.WxLoginReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.WxLoginReq)
        google.iproto.login.WxLoginReqProto.WxLoginReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.login.WxLoginReqProto.internal_static_google_iproto_WxLoginReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.login.WxLoginReqProto.internal_static_google_iproto_WxLoginReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.login.WxLoginReqProto.WxLoginReq.class, google.iproto.login.WxLoginReqProto.WxLoginReq.Builder.class);
      }

      // Construct using google.iproto.login.WxLoginReqProto.WxLoginReq.newBuilder()
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
        openid_ = "";

        nickname_ = "";

        headimgurl_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.login.WxLoginReqProto.internal_static_google_iproto_WxLoginReq_descriptor;
      }

      public google.iproto.login.WxLoginReqProto.WxLoginReq getDefaultInstanceForType() {
        return google.iproto.login.WxLoginReqProto.WxLoginReq.getDefaultInstance();
      }

      public google.iproto.login.WxLoginReqProto.WxLoginReq build() {
        google.iproto.login.WxLoginReqProto.WxLoginReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.login.WxLoginReqProto.WxLoginReq buildPartial() {
        google.iproto.login.WxLoginReqProto.WxLoginReq result = new google.iproto.login.WxLoginReqProto.WxLoginReq(this);
        result.openid_ = openid_;
        result.nickname_ = nickname_;
        result.headimgurl_ = headimgurl_;
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
        if (other instanceof google.iproto.login.WxLoginReqProto.WxLoginReq) {
          return mergeFrom((google.iproto.login.WxLoginReqProto.WxLoginReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.login.WxLoginReqProto.WxLoginReq other) {
        if (other == google.iproto.login.WxLoginReqProto.WxLoginReq.getDefaultInstance()) return this;
        if (!other.getOpenid().isEmpty()) {
          openid_ = other.openid_;
          onChanged();
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        if (!other.getHeadimgurl().isEmpty()) {
          headimgurl_ = other.headimgurl_;
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
        google.iproto.login.WxLoginReqProto.WxLoginReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.login.WxLoginReqProto.WxLoginReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object openid_ = "";
      /**
       * <pre>
       *微信返回ID
       * </pre>
       *
       * <code>string openid = 1;</code>
       */
      public java.lang.String getOpenid() {
        java.lang.Object ref = openid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          openid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *微信返回ID
       * </pre>
       *
       * <code>string openid = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOpenidBytes() {
        java.lang.Object ref = openid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          openid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *微信返回ID
       * </pre>
       *
       * <code>string openid = 1;</code>
       */
      public Builder setOpenid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        openid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信返回ID
       * </pre>
       *
       * <code>string openid = 1;</code>
       */
      public Builder clearOpenid() {
        
        openid_ = getDefaultInstance().getOpenid();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信返回ID
       * </pre>
       *
       * <code>string openid = 1;</code>
       */
      public Builder setOpenidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        openid_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object nickname_ = "";
      /**
       * <pre>
       *微信昵称
       * </pre>
       *
       * <code>string nickname = 2;</code>
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *微信昵称
       * </pre>
       *
       * <code>string nickname = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *微信昵称
       * </pre>
       *
       * <code>string nickname = 2;</code>
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信昵称
       * </pre>
       *
       * <code>string nickname = 2;</code>
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信昵称
       * </pre>
       *
       * <code>string nickname = 2;</code>
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object headimgurl_ = "";
      /**
       * <pre>
       *微信头像地址
       * </pre>
       *
       * <code>string headimgurl = 3;</code>
       */
      public java.lang.String getHeadimgurl() {
        java.lang.Object ref = headimgurl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          headimgurl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *微信头像地址
       * </pre>
       *
       * <code>string headimgurl = 3;</code>
       */
      public com.google.protobuf.ByteString
          getHeadimgurlBytes() {
        java.lang.Object ref = headimgurl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          headimgurl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *微信头像地址
       * </pre>
       *
       * <code>string headimgurl = 3;</code>
       */
      public Builder setHeadimgurl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        headimgurl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信头像地址
       * </pre>
       *
       * <code>string headimgurl = 3;</code>
       */
      public Builder clearHeadimgurl() {
        
        headimgurl_ = getDefaultInstance().getHeadimgurl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信头像地址
       * </pre>
       *
       * <code>string headimgurl = 3;</code>
       */
      public Builder setHeadimgurlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        headimgurl_ = value;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.WxLoginReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.WxLoginReq)
    private static final google.iproto.login.WxLoginReqProto.WxLoginReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.login.WxLoginReqProto.WxLoginReq();
    }

    public static google.iproto.login.WxLoginReqProto.WxLoginReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WxLoginReq>
        PARSER = new com.google.protobuf.AbstractParser<WxLoginReq>() {
      public WxLoginReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WxLoginReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WxLoginReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WxLoginReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.login.WxLoginReqProto.WxLoginReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_WxLoginReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_WxLoginReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/iproto/login/WxLoginReq.proto\022\r" +
      "google.iproto\"B\n\nWxLoginReq\022\016\n\006openid\030\001 " +
      "\001(\t\022\020\n\010nickname\030\002 \001(\t\022\022\n\nheadimgurl\030\003 \001(" +
      "\tB&\n\023google.iproto.loginB\017WxLoginReqProt" +
      "ob\006proto3"
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
    internal_static_google_iproto_WxLoginReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_WxLoginReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_WxLoginReq_descriptor,
        new java.lang.String[] { "Openid", "Nickname", "Headimgurl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
