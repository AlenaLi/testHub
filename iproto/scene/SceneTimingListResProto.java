// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/scene/SceneTimingListRes.proto

package google.iproto.scene;

public final class SceneTimingListResProto {
  private SceneTimingListResProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneTimingListResOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.SceneTimingListRes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    java.util.List<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean> 
        getResultList();
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    google.iproto.comment.SceneTimingBeanProto.SceneTimingBean getResult(int index);
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    int getResultCount();
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    java.util.List<? extends google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder> 
        getResultOrBuilderList();
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder getResultOrBuilder(
        int index);
  }
  /**
   * <pre>
   *场景定时列表
   * </pre>
   *
   * Protobuf type {@code google.iproto.SceneTimingListRes}
   */
  public  static final class SceneTimingListRes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.SceneTimingListRes)
      SceneTimingListResOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneTimingListRes.newBuilder() to construct.
    private SceneTimingListRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneTimingListRes() {
      result_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneTimingListRes(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                result_ = new java.util.ArrayList<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean>();
                mutable_bitField0_ |= 0x00000001;
              }
              result_.add(
                  input.readMessage(google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          result_ = java.util.Collections.unmodifiableList(result_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.scene.SceneTimingListResProto.internal_static_google_iproto_SceneTimingListRes_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.scene.SceneTimingListResProto.internal_static_google_iproto_SceneTimingListRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.scene.SceneTimingListResProto.SceneTimingListRes.class, google.iproto.scene.SceneTimingListResProto.SceneTimingListRes.Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private java.util.List<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean> result_;
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    public java.util.List<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean> getResultList() {
      return result_;
    }
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    public java.util.List<? extends google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder> 
        getResultOrBuilderList() {
      return result_;
    }
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    public int getResultCount() {
      return result_.size();
    }
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    public google.iproto.comment.SceneTimingBeanProto.SceneTimingBean getResult(int index) {
      return result_.get(index);
    }
    /**
     * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
     */
    public google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder getResultOrBuilder(
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
      for (int i = 0; i < result_.size(); i++) {
        output.writeMessage(1, result_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < result_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, result_.get(i));
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
      if (!(obj instanceof google.iproto.scene.SceneTimingListResProto.SceneTimingListRes)) {
        return super.equals(obj);
      }
      google.iproto.scene.SceneTimingListResProto.SceneTimingListRes other = (google.iproto.scene.SceneTimingListResProto.SceneTimingListRes) obj;

      boolean result = true;
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
      if (getResultCount() > 0) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResultList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parseFrom(
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
    public static Builder newBuilder(google.iproto.scene.SceneTimingListResProto.SceneTimingListRes prototype) {
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
     *场景定时列表
     * </pre>
     *
     * Protobuf type {@code google.iproto.SceneTimingListRes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.SceneTimingListRes)
        google.iproto.scene.SceneTimingListResProto.SceneTimingListResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.scene.SceneTimingListResProto.internal_static_google_iproto_SceneTimingListRes_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.scene.SceneTimingListResProto.internal_static_google_iproto_SceneTimingListRes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.scene.SceneTimingListResProto.SceneTimingListRes.class, google.iproto.scene.SceneTimingListResProto.SceneTimingListRes.Builder.class);
      }

      // Construct using google.iproto.scene.SceneTimingListResProto.SceneTimingListRes.newBuilder()
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
        if (resultBuilder_ == null) {
          result_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          resultBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.scene.SceneTimingListResProto.internal_static_google_iproto_SceneTimingListRes_descriptor;
      }

      public google.iproto.scene.SceneTimingListResProto.SceneTimingListRes getDefaultInstanceForType() {
        return google.iproto.scene.SceneTimingListResProto.SceneTimingListRes.getDefaultInstance();
      }

      public google.iproto.scene.SceneTimingListResProto.SceneTimingListRes build() {
        google.iproto.scene.SceneTimingListResProto.SceneTimingListRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.scene.SceneTimingListResProto.SceneTimingListRes buildPartial() {
        google.iproto.scene.SceneTimingListResProto.SceneTimingListRes result = new google.iproto.scene.SceneTimingListResProto.SceneTimingListRes(this);
        int from_bitField0_ = bitField0_;
        if (resultBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            result_ = java.util.Collections.unmodifiableList(result_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.result_ = result_;
        } else {
          result.result_ = resultBuilder_.build();
        }
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
        if (other instanceof google.iproto.scene.SceneTimingListResProto.SceneTimingListRes) {
          return mergeFrom((google.iproto.scene.SceneTimingListResProto.SceneTimingListRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.scene.SceneTimingListResProto.SceneTimingListRes other) {
        if (other == google.iproto.scene.SceneTimingListResProto.SceneTimingListRes.getDefaultInstance()) return this;
        if (resultBuilder_ == null) {
          if (!other.result_.isEmpty()) {
            if (result_.isEmpty()) {
              result_ = other.result_;
              bitField0_ = (bitField0_ & ~0x00000001);
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
              bitField0_ = (bitField0_ & ~0x00000001);
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
        google.iproto.scene.SceneTimingListResProto.SceneTimingListRes parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.scene.SceneTimingListResProto.SceneTimingListRes) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean> result_ =
        java.util.Collections.emptyList();
      private void ensureResultIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          result_ = new java.util.ArrayList<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean>(result_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.comment.SceneTimingBeanProto.SceneTimingBean, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder, google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder> resultBuilder_;

      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public java.util.List<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean> getResultList() {
        if (resultBuilder_ == null) {
          return java.util.Collections.unmodifiableList(result_);
        } else {
          return resultBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public int getResultCount() {
        if (resultBuilder_ == null) {
          return result_.size();
        } else {
          return resultBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public google.iproto.comment.SceneTimingBeanProto.SceneTimingBean getResult(int index) {
        if (resultBuilder_ == null) {
          return result_.get(index);
        } else {
          return resultBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder setResult(
          int index, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean value) {
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder setResult(
          int index, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder builderForValue) {
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder addResult(google.iproto.comment.SceneTimingBeanProto.SceneTimingBean value) {
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder addResult(
          int index, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean value) {
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder addResult(
          google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder builderForValue) {
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder addResult(
          int index, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder builderForValue) {
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder addAllResult(
          java.lang.Iterable<? extends google.iproto.comment.SceneTimingBeanProto.SceneTimingBean> values) {
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public Builder clearResult() {
        if (resultBuilder_ == null) {
          result_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          resultBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
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
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder getResultBuilder(
          int index) {
        return getResultFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder getResultOrBuilder(
          int index) {
        if (resultBuilder_ == null) {
          return result_.get(index);  } else {
          return resultBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public java.util.List<? extends google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder> 
           getResultOrBuilderList() {
        if (resultBuilder_ != null) {
          return resultBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(result_);
        }
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder addResultBuilder() {
        return getResultFieldBuilder().addBuilder(
            google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.getDefaultInstance());
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder addResultBuilder(
          int index) {
        return getResultFieldBuilder().addBuilder(
            index, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.getDefaultInstance());
      }
      /**
       * <code>repeated .google.iproto.SceneTimingBean result = 1;</code>
       */
      public java.util.List<google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder> 
           getResultBuilderList() {
        return getResultFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.comment.SceneTimingBeanProto.SceneTimingBean, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder, google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder> 
          getResultFieldBuilder() {
        if (resultBuilder_ == null) {
          resultBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              google.iproto.comment.SceneTimingBeanProto.SceneTimingBean, google.iproto.comment.SceneTimingBeanProto.SceneTimingBean.Builder, google.iproto.comment.SceneTimingBeanProto.SceneTimingBeanOrBuilder>(
                  result_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
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


      // @@protoc_insertion_point(builder_scope:google.iproto.SceneTimingListRes)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.SceneTimingListRes)
    private static final google.iproto.scene.SceneTimingListResProto.SceneTimingListRes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.scene.SceneTimingListResProto.SceneTimingListRes();
    }

    public static google.iproto.scene.SceneTimingListResProto.SceneTimingListRes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneTimingListRes>
        PARSER = new com.google.protobuf.AbstractParser<SceneTimingListRes>() {
      public SceneTimingListRes parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneTimingListRes(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneTimingListRes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneTimingListRes> getParserForType() {
      return PARSER;
    }

    public google.iproto.scene.SceneTimingListResProto.SceneTimingListRes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_SceneTimingListRes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_SceneTimingListRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/iproto/scene/SceneTimingListRes" +
      ".proto\022\rgoogle.iproto\032+google/iproto/com" +
      "ment/SceneTimingBean.proto\"D\n\022SceneTimin" +
      "gListRes\022.\n\006result\030\001 \003(\0132\036.google.iproto" +
      ".SceneTimingBeanB.\n\023google.iproto.sceneB" +
      "\027SceneTimingListResProtob\006proto3"
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
          google.iproto.comment.SceneTimingBeanProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_SceneTimingListRes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_SceneTimingListRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_SceneTimingListRes_descriptor,
        new java.lang.String[] { "Result", });
    google.iproto.comment.SceneTimingBeanProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
