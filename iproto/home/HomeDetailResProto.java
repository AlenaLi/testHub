// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/home/HomeDetailRes.proto

package google.iproto.home;

public final class HomeDetailResProto {
  private HomeDetailResProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeDetailResOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.HomeDetailRes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.iproto.HomeListBean result = 1;</code>
     */
    boolean hasResult();
    /**
     * <code>.google.iproto.HomeListBean result = 1;</code>
     */
    google.iproto.comment.HomeListBeanProto.HomeListBean getResult();
    /**
     * <code>.google.iproto.HomeListBean result = 1;</code>
     */
    google.iproto.comment.HomeListBeanProto.HomeListBeanOrBuilder getResultOrBuilder();
  }
  /**
   * <pre>
   *场景列表请求
   * </pre>
   *
   * Protobuf type {@code google.iproto.HomeDetailRes}
   */
  public  static final class HomeDetailRes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.HomeDetailRes)
      HomeDetailResOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeDetailRes.newBuilder() to construct.
    private HomeDetailRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeDetailRes() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeDetailRes(
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
              google.iproto.comment.HomeListBeanProto.HomeListBean.Builder subBuilder = null;
              if (result_ != null) {
                subBuilder = result_.toBuilder();
              }
              result_ = input.readMessage(google.iproto.comment.HomeListBeanProto.HomeListBean.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(result_);
                result_ = subBuilder.buildPartial();
              }

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
      return google.iproto.home.HomeDetailResProto.internal_static_google_iproto_HomeDetailRes_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.home.HomeDetailResProto.internal_static_google_iproto_HomeDetailRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.home.HomeDetailResProto.HomeDetailRes.class, google.iproto.home.HomeDetailResProto.HomeDetailRes.Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private google.iproto.comment.HomeListBeanProto.HomeListBean result_;
    /**
     * <code>.google.iproto.HomeListBean result = 1;</code>
     */
    public boolean hasResult() {
      return result_ != null;
    }
    /**
     * <code>.google.iproto.HomeListBean result = 1;</code>
     */
    public google.iproto.comment.HomeListBeanProto.HomeListBean getResult() {
      return result_ == null ? google.iproto.comment.HomeListBeanProto.HomeListBean.getDefaultInstance() : result_;
    }
    /**
     * <code>.google.iproto.HomeListBean result = 1;</code>
     */
    public google.iproto.comment.HomeListBeanProto.HomeListBeanOrBuilder getResultOrBuilder() {
      return getResult();
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
      if (result_ != null) {
        output.writeMessage(1, getResult());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResult());
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
      if (!(obj instanceof google.iproto.home.HomeDetailResProto.HomeDetailRes)) {
        return super.equals(obj);
      }
      google.iproto.home.HomeDetailResProto.HomeDetailRes other = (google.iproto.home.HomeDetailResProto.HomeDetailRes) obj;

      boolean result = true;
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && getResult()
            .equals(other.getResult());
      }
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
      if (hasResult()) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.home.HomeDetailResProto.HomeDetailRes parseFrom(
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
    public static Builder newBuilder(google.iproto.home.HomeDetailResProto.HomeDetailRes prototype) {
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
     *场景列表请求
     * </pre>
     *
     * Protobuf type {@code google.iproto.HomeDetailRes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.HomeDetailRes)
        google.iproto.home.HomeDetailResProto.HomeDetailResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.home.HomeDetailResProto.internal_static_google_iproto_HomeDetailRes_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.home.HomeDetailResProto.internal_static_google_iproto_HomeDetailRes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.home.HomeDetailResProto.HomeDetailRes.class, google.iproto.home.HomeDetailResProto.HomeDetailRes.Builder.class);
      }

      // Construct using google.iproto.home.HomeDetailResProto.HomeDetailRes.newBuilder()
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
        if (resultBuilder_ == null) {
          result_ = null;
        } else {
          result_ = null;
          resultBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.home.HomeDetailResProto.internal_static_google_iproto_HomeDetailRes_descriptor;
      }

      public google.iproto.home.HomeDetailResProto.HomeDetailRes getDefaultInstanceForType() {
        return google.iproto.home.HomeDetailResProto.HomeDetailRes.getDefaultInstance();
      }

      public google.iproto.home.HomeDetailResProto.HomeDetailRes build() {
        google.iproto.home.HomeDetailResProto.HomeDetailRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.home.HomeDetailResProto.HomeDetailRes buildPartial() {
        google.iproto.home.HomeDetailResProto.HomeDetailRes result = new google.iproto.home.HomeDetailResProto.HomeDetailRes(this);
        if (resultBuilder_ == null) {
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
        if (other instanceof google.iproto.home.HomeDetailResProto.HomeDetailRes) {
          return mergeFrom((google.iproto.home.HomeDetailResProto.HomeDetailRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.home.HomeDetailResProto.HomeDetailRes other) {
        if (other == google.iproto.home.HomeDetailResProto.HomeDetailRes.getDefaultInstance()) return this;
        if (other.hasResult()) {
          mergeResult(other.getResult());
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
        google.iproto.home.HomeDetailResProto.HomeDetailRes parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.home.HomeDetailResProto.HomeDetailRes) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private google.iproto.comment.HomeListBeanProto.HomeListBean result_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          google.iproto.comment.HomeListBeanProto.HomeListBean, google.iproto.comment.HomeListBeanProto.HomeListBean.Builder, google.iproto.comment.HomeListBeanProto.HomeListBeanOrBuilder> resultBuilder_;
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public boolean hasResult() {
        return resultBuilder_ != null || result_ != null;
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public google.iproto.comment.HomeListBeanProto.HomeListBean getResult() {
        if (resultBuilder_ == null) {
          return result_ == null ? google.iproto.comment.HomeListBeanProto.HomeListBean.getDefaultInstance() : result_;
        } else {
          return resultBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public Builder setResult(google.iproto.comment.HomeListBeanProto.HomeListBean value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          result_ = value;
          onChanged();
        } else {
          resultBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public Builder setResult(
          google.iproto.comment.HomeListBeanProto.HomeListBean.Builder builderForValue) {
        if (resultBuilder_ == null) {
          result_ = builderForValue.build();
          onChanged();
        } else {
          resultBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public Builder mergeResult(google.iproto.comment.HomeListBeanProto.HomeListBean value) {
        if (resultBuilder_ == null) {
          if (result_ != null) {
            result_ =
              google.iproto.comment.HomeListBeanProto.HomeListBean.newBuilder(result_).mergeFrom(value).buildPartial();
          } else {
            result_ = value;
          }
          onChanged();
        } else {
          resultBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public Builder clearResult() {
        if (resultBuilder_ == null) {
          result_ = null;
          onChanged();
        } else {
          result_ = null;
          resultBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public google.iproto.comment.HomeListBeanProto.HomeListBean.Builder getResultBuilder() {
        
        onChanged();
        return getResultFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      public google.iproto.comment.HomeListBeanProto.HomeListBeanOrBuilder getResultOrBuilder() {
        if (resultBuilder_ != null) {
          return resultBuilder_.getMessageOrBuilder();
        } else {
          return result_ == null ?
              google.iproto.comment.HomeListBeanProto.HomeListBean.getDefaultInstance() : result_;
        }
      }
      /**
       * <code>.google.iproto.HomeListBean result = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          google.iproto.comment.HomeListBeanProto.HomeListBean, google.iproto.comment.HomeListBeanProto.HomeListBean.Builder, google.iproto.comment.HomeListBeanProto.HomeListBeanOrBuilder> 
          getResultFieldBuilder() {
        if (resultBuilder_ == null) {
          resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              google.iproto.comment.HomeListBeanProto.HomeListBean, google.iproto.comment.HomeListBeanProto.HomeListBean.Builder, google.iproto.comment.HomeListBeanProto.HomeListBeanOrBuilder>(
                  getResult(),
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


      // @@protoc_insertion_point(builder_scope:google.iproto.HomeDetailRes)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.HomeDetailRes)
    private static final google.iproto.home.HomeDetailResProto.HomeDetailRes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.home.HomeDetailResProto.HomeDetailRes();
    }

    public static google.iproto.home.HomeDetailResProto.HomeDetailRes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeDetailRes>
        PARSER = new com.google.protobuf.AbstractParser<HomeDetailRes>() {
      public HomeDetailRes parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeDetailRes(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeDetailRes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeDetailRes> getParserForType() {
      return PARSER;
    }

    public google.iproto.home.HomeDetailResProto.HomeDetailRes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_HomeDetailRes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_HomeDetailRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/iproto/home/HomeDetailRes.proto" +
      "\022\rgoogle.iproto\032(google/iproto/comment/H" +
      "omeListBean.proto\"<\n\rHomeDetailRes\022+\n\006re" +
      "sult\030\001 \001(\0132\033.google.iproto.HomeListBeanB" +
      "(\n\022google.iproto.homeB\022HomeDetailResProt" +
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
          google.iproto.comment.HomeListBeanProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_HomeDetailRes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_HomeDetailRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_HomeDetailRes_descriptor,
        new java.lang.String[] { "Result", });
    google.iproto.comment.HomeListBeanProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
