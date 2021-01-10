// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/comment/UserRelationResult.proto

package google.iproto.comment;

public final class UserRelationResultProto {
  private UserRelationResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserRelationResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.UserRelationResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *用户类型直接返回用户类型，列：master, member
     * </pre>
     *
     * <code>string usertype = 1;</code>
     */
    java.lang.String getUsertype();
    /**
     * <pre>
     *用户类型直接返回用户类型，列：master, member
     * </pre>
     *
     * <code>string usertype = 1;</code>
     */
    com.google.protobuf.ByteString
        getUsertypeBytes();

    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    java.util.List<google.iproto.comment.UserRelationBeanProto.UserRelationBean> 
        getResultList();
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    google.iproto.comment.UserRelationBeanProto.UserRelationBean getResult(int index);
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    int getResultCount();
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    java.util.List<? extends google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder> 
        getResultOrBuilderList();
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder getResultOrBuilder(
        int index);
  }
  /**
   * <pre>
   *传感器列表数据
   * </pre>
   *
   * Protobuf type {@code google.iproto.UserRelationResult}
   */
  public  static final class UserRelationResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.UserRelationResult)
      UserRelationResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserRelationResult.newBuilder() to construct.
    private UserRelationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserRelationResult() {
      usertype_ = "";
      result_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserRelationResult(
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

              usertype_ = s;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                result_ = new java.util.ArrayList<google.iproto.comment.UserRelationBeanProto.UserRelationBean>();
                mutable_bitField0_ |= 0x00000002;
              }
              result_.add(
                  input.readMessage(google.iproto.comment.UserRelationBeanProto.UserRelationBean.parser(), extensionRegistry));
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
          result_ = java.util.Collections.unmodifiableList(result_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.comment.UserRelationResultProto.internal_static_google_iproto_UserRelationResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.comment.UserRelationResultProto.internal_static_google_iproto_UserRelationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.comment.UserRelationResultProto.UserRelationResult.class, google.iproto.comment.UserRelationResultProto.UserRelationResult.Builder.class);
    }

    private int bitField0_;
    public static final int USERTYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object usertype_;
    /**
     * <pre>
     *用户类型直接返回用户类型，列：master, member
     * </pre>
     *
     * <code>string usertype = 1;</code>
     */
    public java.lang.String getUsertype() {
      java.lang.Object ref = usertype_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        usertype_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *用户类型直接返回用户类型，列：master, member
     * </pre>
     *
     * <code>string usertype = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUsertypeBytes() {
      java.lang.Object ref = usertype_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        usertype_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESULT_FIELD_NUMBER = 2;
    private java.util.List<google.iproto.comment.UserRelationBeanProto.UserRelationBean> result_;
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    public java.util.List<google.iproto.comment.UserRelationBeanProto.UserRelationBean> getResultList() {
      return result_;
    }
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    public java.util.List<? extends google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder> 
        getResultOrBuilderList() {
      return result_;
    }
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    public int getResultCount() {
      return result_.size();
    }
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    public google.iproto.comment.UserRelationBeanProto.UserRelationBean getResult(int index) {
      return result_.get(index);
    }
    /**
     * <pre>
     *用户信息集合
     * </pre>
     *
     * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
     */
    public google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder getResultOrBuilder(
        int index) {
      return result_.get(index);
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
      if (!getUsertypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, usertype_);
      }
      for (int i = 0; i < result_.size(); i++) {
        output.writeMessage(2, result_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUsertypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, usertype_);
      }
      for (int i = 0; i < result_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, result_.get(i));
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
      if (!(obj instanceof google.iproto.comment.UserRelationResultProto.UserRelationResult)) {
        return super.equals(obj);
      }
      google.iproto.comment.UserRelationResultProto.UserRelationResult other = (google.iproto.comment.UserRelationResultProto.UserRelationResult) obj;

      boolean result = true;
      result = result && getUsertype()
          .equals(other.getUsertype());
      result = result && getResultList()
          .equals(other.getResultList());
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
      hash = (37 * hash) + USERTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getUsertype().hashCode();
      if (getResultCount() > 0) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResultList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserRelationResultProto.UserRelationResult parseFrom(
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
    public static Builder newBuilder(google.iproto.comment.UserRelationResultProto.UserRelationResult prototype) {
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
     *传感器列表数据
     * </pre>
     *
     * Protobuf type {@code google.iproto.UserRelationResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.UserRelationResult)
        google.iproto.comment.UserRelationResultProto.UserRelationResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.comment.UserRelationResultProto.internal_static_google_iproto_UserRelationResult_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.comment.UserRelationResultProto.internal_static_google_iproto_UserRelationResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.comment.UserRelationResultProto.UserRelationResult.class, google.iproto.comment.UserRelationResultProto.UserRelationResult.Builder.class);
      }

      // Construct using google.iproto.comment.UserRelationResultProto.UserRelationResult.newBuilder()
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
          getResultFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        usertype_ = "";

        if (resultBuilder_ == null) {
          result_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          resultBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.comment.UserRelationResultProto.internal_static_google_iproto_UserRelationResult_descriptor;
      }

      public google.iproto.comment.UserRelationResultProto.UserRelationResult getDefaultInstanceForType() {
        return google.iproto.comment.UserRelationResultProto.UserRelationResult.getDefaultInstance();
      }

      public google.iproto.comment.UserRelationResultProto.UserRelationResult build() {
        google.iproto.comment.UserRelationResultProto.UserRelationResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.comment.UserRelationResultProto.UserRelationResult buildPartial() {
        google.iproto.comment.UserRelationResultProto.UserRelationResult result = new google.iproto.comment.UserRelationResultProto.UserRelationResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.usertype_ = usertype_;
        if (resultBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            result_ = java.util.Collections.unmodifiableList(result_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.result_ = result_;
        } else {
          result.result_ = resultBuilder_.build();
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
        if (other instanceof google.iproto.comment.UserRelationResultProto.UserRelationResult) {
          return mergeFrom((google.iproto.comment.UserRelationResultProto.UserRelationResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.comment.UserRelationResultProto.UserRelationResult other) {
        if (other == google.iproto.comment.UserRelationResultProto.UserRelationResult.getDefaultInstance()) return this;
        if (!other.getUsertype().isEmpty()) {
          usertype_ = other.usertype_;
          onChanged();
        }
        if (resultBuilder_ == null) {
          if (!other.result_.isEmpty()) {
            if (result_.isEmpty()) {
              result_ = other.result_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureResultIsMutable();
              result_.addAll(other.result_);
            }
            onChanged();
          }
        } else {
          if (!other.result_.isEmpty()) {
            if (resultBuilder_.isEmpty()) {
              resultBuilder_.dispose();
              resultBuilder_ = null;
              result_ = other.result_;
              bitField0_ = (bitField0_ & ~0x00000002);
              resultBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getResultFieldBuilder() : null;
            } else {
              resultBuilder_.addAllMessages(other.result_);
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
        google.iproto.comment.UserRelationResultProto.UserRelationResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.comment.UserRelationResultProto.UserRelationResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object usertype_ = "";
      /**
       * <pre>
       *用户类型直接返回用户类型，列：master, member
       * </pre>
       *
       * <code>string usertype = 1;</code>
       */
      public java.lang.String getUsertype() {
        java.lang.Object ref = usertype_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          usertype_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *用户类型直接返回用户类型，列：master, member
       * </pre>
       *
       * <code>string usertype = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUsertypeBytes() {
        java.lang.Object ref = usertype_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          usertype_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *用户类型直接返回用户类型，列：master, member
       * </pre>
       *
       * <code>string usertype = 1;</code>
       */
      public Builder setUsertype(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        usertype_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用户类型直接返回用户类型，列：master, member
       * </pre>
       *
       * <code>string usertype = 1;</code>
       */
      public Builder clearUsertype() {
        
        usertype_ = getDefaultInstance().getUsertype();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用户类型直接返回用户类型，列：master, member
       * </pre>
       *
       * <code>string usertype = 1;</code>
       */
      public Builder setUsertypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        usertype_ = value;
        onChanged();
        return this;
      }

      private java.util.List<google.iproto.comment.UserRelationBeanProto.UserRelationBean> result_ =
        java.util.Collections.emptyList();
      private void ensureResultIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          result_ = new java.util.ArrayList<google.iproto.comment.UserRelationBeanProto.UserRelationBean>(result_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.comment.UserRelationBeanProto.UserRelationBean, google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder, google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder> resultBuilder_;

      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public java.util.List<google.iproto.comment.UserRelationBeanProto.UserRelationBean> getResultList() {
        if (resultBuilder_ == null) {
          return java.util.Collections.unmodifiableList(result_);
        } else {
          return resultBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public int getResultCount() {
        if (resultBuilder_ == null) {
          return result_.size();
        } else {
          return resultBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public google.iproto.comment.UserRelationBeanProto.UserRelationBean getResult(int index) {
        if (resultBuilder_ == null) {
          return result_.get(index);
        } else {
          return resultBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder setResult(
          int index, google.iproto.comment.UserRelationBeanProto.UserRelationBean value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResultIsMutable();
          result_.set(index, value);
          onChanged();
        } else {
          resultBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder setResult(
          int index, google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder builderForValue) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.set(index, builderForValue.build());
          onChanged();
        } else {
          resultBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder addResult(google.iproto.comment.UserRelationBeanProto.UserRelationBean value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResultIsMutable();
          result_.add(value);
          onChanged();
        } else {
          resultBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder addResult(
          int index, google.iproto.comment.UserRelationBeanProto.UserRelationBean value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResultIsMutable();
          result_.add(index, value);
          onChanged();
        } else {
          resultBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder addResult(
          google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder builderForValue) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.add(builderForValue.build());
          onChanged();
        } else {
          resultBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder addResult(
          int index, google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder builderForValue) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.add(index, builderForValue.build());
          onChanged();
        } else {
          resultBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder addAllResult(
          java.lang.Iterable<? extends google.iproto.comment.UserRelationBeanProto.UserRelationBean> values) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, result_);
          onChanged();
        } else {
          resultBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder clearResult() {
        if (resultBuilder_ == null) {
          result_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          resultBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public Builder removeResult(int index) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.remove(index);
          onChanged();
        } else {
          resultBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder getResultBuilder(
          int index) {
        return getResultFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder getResultOrBuilder(
          int index) {
        if (resultBuilder_ == null) {
          return result_.get(index);  } else {
          return resultBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public java.util.List<? extends google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder> 
           getResultOrBuilderList() {
        if (resultBuilder_ != null) {
          return resultBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(result_);
        }
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder addResultBuilder() {
        return getResultFieldBuilder().addBuilder(
            google.iproto.comment.UserRelationBeanProto.UserRelationBean.getDefaultInstance());
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder addResultBuilder(
          int index) {
        return getResultFieldBuilder().addBuilder(
            index, google.iproto.comment.UserRelationBeanProto.UserRelationBean.getDefaultInstance());
      }
      /**
       * <pre>
       *用户信息集合
       * </pre>
       *
       * <code>repeated .google.iproto.UserRelationBean result = 2;</code>
       */
      public java.util.List<google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder> 
           getResultBuilderList() {
        return getResultFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.comment.UserRelationBeanProto.UserRelationBean, google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder, google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder> 
          getResultFieldBuilder() {
        if (resultBuilder_ == null) {
          resultBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              google.iproto.comment.UserRelationBeanProto.UserRelationBean, google.iproto.comment.UserRelationBeanProto.UserRelationBean.Builder, google.iproto.comment.UserRelationBeanProto.UserRelationBeanOrBuilder>(
                  result_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          result_ = null;
        }
        return resultBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:google.iproto.UserRelationResult)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.UserRelationResult)
    private static final google.iproto.comment.UserRelationResultProto.UserRelationResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.comment.UserRelationResultProto.UserRelationResult();
    }

    public static google.iproto.comment.UserRelationResultProto.UserRelationResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserRelationResult>
        PARSER = new com.google.protobuf.AbstractParser<UserRelationResult>() {
      public UserRelationResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserRelationResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserRelationResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserRelationResult> getParserForType() {
      return PARSER;
    }

    public google.iproto.comment.UserRelationResultProto.UserRelationResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_UserRelationResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_UserRelationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/iproto/comment/UserRelationResu" +
      "lt.proto\022\rgoogle.iproto\032,google/iproto/c" +
      "omment/UserRelationBean.proto\"W\n\022UserRel" +
      "ationResult\022\020\n\010usertype\030\001 \001(\t\022/\n\006result\030" +
      "\002 \003(\0132\037.google.iproto.UserRelationBeanB0" +
      "\n\025google.iproto.commentB\027UserRelationRes" +
      "ultProtob\006proto3"
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
          google.iproto.comment.UserRelationBeanProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_UserRelationResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_UserRelationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_UserRelationResult_descriptor,
        new java.lang.String[] { "Usertype", "Result", });
    google.iproto.comment.UserRelationBeanProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
