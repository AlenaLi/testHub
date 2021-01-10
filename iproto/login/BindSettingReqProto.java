// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/login/BindSettingReq.proto

package google.iproto.login;

public final class BindSettingReqProto {
  private BindSettingReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BindSettingReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.BindSettingReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *微信ID
     * </pre>
     *
     * <code>string wxid = 3;</code>
     */
    java.lang.String getWxid();
    /**
     * <pre>
     *微信ID
     * </pre>
     *
     * <code>string wxid = 3;</code>
     */
    com.google.protobuf.ByteString
        getWxidBytes();

    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string password = 1;</code>
     */
    java.lang.String getPassword();
    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string password = 1;</code>
     */
    com.google.protobuf.ByteString
        getPasswordBytes();

    /**
     * <pre>
     *确认密码
     * </pre>
     *
     * <code>string affirm = 2;</code>
     */
    java.lang.String getAffirm();
    /**
     * <pre>
     *确认密码
     * </pre>
     *
     * <code>string affirm = 2;</code>
     */
    com.google.protobuf.ByteString
        getAffirmBytes();
  }
  /**
   * <pre>
   *忘记密码设置新密码
   * </pre>
   *
   * Protobuf type {@code google.iproto.BindSettingReq}
   */
  public  static final class BindSettingReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.BindSettingReq)
      BindSettingReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BindSettingReq.newBuilder() to construct.
    private BindSettingReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BindSettingReq() {
      wxid_ = "";
      password_ = "";
      affirm_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BindSettingReq(
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

              password_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              affirm_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              wxid_ = s;
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
      return google.iproto.login.BindSettingReqProto.internal_static_google_iproto_BindSettingReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.login.BindSettingReqProto.internal_static_google_iproto_BindSettingReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.login.BindSettingReqProto.BindSettingReq.class, google.iproto.login.BindSettingReqProto.BindSettingReq.Builder.class);
    }

    public static final int WXID_FIELD_NUMBER = 3;
    private volatile java.lang.Object wxid_;
    /**
     * <pre>
     *微信ID
     * </pre>
     *
     * <code>string wxid = 3;</code>
     */
    public java.lang.String getWxid() {
      java.lang.Object ref = wxid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        wxid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *微信ID
     * </pre>
     *
     * <code>string wxid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getWxidBytes() {
      java.lang.Object ref = wxid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wxid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWORD_FIELD_NUMBER = 1;
    private volatile java.lang.Object password_;
    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string password = 1;</code>
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string password = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AFFIRM_FIELD_NUMBER = 2;
    private volatile java.lang.Object affirm_;
    /**
     * <pre>
     *确认密码
     * </pre>
     *
     * <code>string affirm = 2;</code>
     */
    public java.lang.String getAffirm() {
      java.lang.Object ref = affirm_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        affirm_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *确认密码
     * </pre>
     *
     * <code>string affirm = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAffirmBytes() {
      java.lang.Object ref = affirm_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        affirm_ = b;
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
      if (!getPasswordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, password_);
      }
      if (!getAffirmBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, affirm_);
      }
      if (!getWxidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, wxid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getPasswordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, password_);
      }
      if (!getAffirmBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, affirm_);
      }
      if (!getWxidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, wxid_);
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
      if (!(obj instanceof google.iproto.login.BindSettingReqProto.BindSettingReq)) {
        return super.equals(obj);
      }
      google.iproto.login.BindSettingReqProto.BindSettingReq other = (google.iproto.login.BindSettingReqProto.BindSettingReq) obj;

      boolean result = true;
      result = result && getWxid()
          .equals(other.getWxid());
      result = result && getPassword()
          .equals(other.getPassword());
      result = result && getAffirm()
          .equals(other.getAffirm());
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
      hash = (37 * hash) + WXID_FIELD_NUMBER;
      hash = (53 * hash) + getWxid().hashCode();
      hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
      hash = (53 * hash) + getPassword().hashCode();
      hash = (37 * hash) + AFFIRM_FIELD_NUMBER;
      hash = (53 * hash) + getAffirm().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.login.BindSettingReqProto.BindSettingReq parseFrom(
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
    public static Builder newBuilder(google.iproto.login.BindSettingReqProto.BindSettingReq prototype) {
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
     *忘记密码设置新密码
     * </pre>
     *
     * Protobuf type {@code google.iproto.BindSettingReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.BindSettingReq)
        google.iproto.login.BindSettingReqProto.BindSettingReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.login.BindSettingReqProto.internal_static_google_iproto_BindSettingReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.login.BindSettingReqProto.internal_static_google_iproto_BindSettingReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.login.BindSettingReqProto.BindSettingReq.class, google.iproto.login.BindSettingReqProto.BindSettingReq.Builder.class);
      }

      // Construct using google.iproto.login.BindSettingReqProto.BindSettingReq.newBuilder()
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
        wxid_ = "";

        password_ = "";

        affirm_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.login.BindSettingReqProto.internal_static_google_iproto_BindSettingReq_descriptor;
      }

      public google.iproto.login.BindSettingReqProto.BindSettingReq getDefaultInstanceForType() {
        return google.iproto.login.BindSettingReqProto.BindSettingReq.getDefaultInstance();
      }

      public google.iproto.login.BindSettingReqProto.BindSettingReq build() {
        google.iproto.login.BindSettingReqProto.BindSettingReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.login.BindSettingReqProto.BindSettingReq buildPartial() {
        google.iproto.login.BindSettingReqProto.BindSettingReq result = new google.iproto.login.BindSettingReqProto.BindSettingReq(this);
        result.wxid_ = wxid_;
        result.password_ = password_;
        result.affirm_ = affirm_;
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
        if (other instanceof google.iproto.login.BindSettingReqProto.BindSettingReq) {
          return mergeFrom((google.iproto.login.BindSettingReqProto.BindSettingReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.login.BindSettingReqProto.BindSettingReq other) {
        if (other == google.iproto.login.BindSettingReqProto.BindSettingReq.getDefaultInstance()) return this;
        if (!other.getWxid().isEmpty()) {
          wxid_ = other.wxid_;
          onChanged();
        }
        if (!other.getPassword().isEmpty()) {
          password_ = other.password_;
          onChanged();
        }
        if (!other.getAffirm().isEmpty()) {
          affirm_ = other.affirm_;
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
        google.iproto.login.BindSettingReqProto.BindSettingReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.login.BindSettingReqProto.BindSettingReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object wxid_ = "";
      /**
       * <pre>
       *微信ID
       * </pre>
       *
       * <code>string wxid = 3;</code>
       */
      public java.lang.String getWxid() {
        java.lang.Object ref = wxid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          wxid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *微信ID
       * </pre>
       *
       * <code>string wxid = 3;</code>
       */
      public com.google.protobuf.ByteString
          getWxidBytes() {
        java.lang.Object ref = wxid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          wxid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *微信ID
       * </pre>
       *
       * <code>string wxid = 3;</code>
       */
      public Builder setWxid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        wxid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信ID
       * </pre>
       *
       * <code>string wxid = 3;</code>
       */
      public Builder clearWxid() {
        
        wxid_ = getDefaultInstance().getWxid();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信ID
       * </pre>
       *
       * <code>string wxid = 3;</code>
       */
      public Builder setWxidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        wxid_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object password_ = "";
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string password = 1;</code>
       */
      public java.lang.String getPassword() {
        java.lang.Object ref = password_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string password = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        java.lang.Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string password = 1;</code>
       */
      public Builder setPassword(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string password = 1;</code>
       */
      public Builder clearPassword() {
        
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string password = 1;</code>
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        password_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object affirm_ = "";
      /**
       * <pre>
       *确认密码
       * </pre>
       *
       * <code>string affirm = 2;</code>
       */
      public java.lang.String getAffirm() {
        java.lang.Object ref = affirm_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          affirm_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *确认密码
       * </pre>
       *
       * <code>string affirm = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAffirmBytes() {
        java.lang.Object ref = affirm_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          affirm_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *确认密码
       * </pre>
       *
       * <code>string affirm = 2;</code>
       */
      public Builder setAffirm(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        affirm_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *确认密码
       * </pre>
       *
       * <code>string affirm = 2;</code>
       */
      public Builder clearAffirm() {
        
        affirm_ = getDefaultInstance().getAffirm();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *确认密码
       * </pre>
       *
       * <code>string affirm = 2;</code>
       */
      public Builder setAffirmBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        affirm_ = value;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.BindSettingReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.BindSettingReq)
    private static final google.iproto.login.BindSettingReqProto.BindSettingReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.login.BindSettingReqProto.BindSettingReq();
    }

    public static google.iproto.login.BindSettingReqProto.BindSettingReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BindSettingReq>
        PARSER = new com.google.protobuf.AbstractParser<BindSettingReq>() {
      public BindSettingReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BindSettingReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BindSettingReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BindSettingReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.login.BindSettingReqProto.BindSettingReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_BindSettingReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_BindSettingReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/iproto/login/BindSettingReq.pro" +
      "to\022\rgoogle.iproto\"@\n\016BindSettingReq\022\014\n\004w" +
      "xid\030\003 \001(\t\022\020\n\010password\030\001 \001(\t\022\016\n\006affirm\030\002 " +
      "\001(\tB*\n\023google.iproto.loginB\023BindSettingR" +
      "eqProtob\006proto3"
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
    internal_static_google_iproto_BindSettingReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_BindSettingReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_BindSettingReq_descriptor,
        new java.lang.String[] { "Wxid", "Password", "Affirm", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
