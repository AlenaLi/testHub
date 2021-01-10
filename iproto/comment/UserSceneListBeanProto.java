// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/comment/UserSceneListBean.proto

package google.iproto.comment;

public final class UserSceneListBeanProto {
  private UserSceneListBeanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserSceneListBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.UserSceneListBean)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *场景名字
     * </pre>
     *
     * <code>string scenename = 1;</code>
     */
    java.lang.String getScenename();
    /**
     * <pre>
     *场景名字
     * </pre>
     *
     * <code>string scenename = 1;</code>
     */
    com.google.protobuf.ByteString
        getScenenameBytes();

    /**
     * <pre>
     *场景ID
     * </pre>
     *
     * <code>int32 sceneid = 2;</code>
     */
    int getSceneid();

    /**
     * <pre>
     *场景图片地址
     * </pre>
     *
     * <code>string sceneimg = 3;</code>
     */
    java.lang.String getSceneimg();
    /**
     * <pre>
     *场景图片地址
     * </pre>
     *
     * <code>string sceneimg = 3;</code>
     */
    com.google.protobuf.ByteString
        getSceneimgBytes();

    /**
     * <pre>
     *是否打开状态
     * </pre>
     *
     * <code>bool isopen = 5;</code>
     */
    boolean getIsopen();

    /**
     * <pre>
     *是否选择
     * </pre>
     *
     * <code>bool isselect = 6;</code>
     */
    boolean getIsselect();

    /**
     * <code>bool devCreateSuccess = 7;</code>
     */
    boolean getDevCreateSuccess();

    /**
     * <code>int32 devCreateErrCode = 8;</code>
     */
    int getDevCreateErrCode();
  }
  /**
   * <pre>
   *用户设备绑定到场景获取场景列表
   * </pre>
   *
   * Protobuf type {@code google.iproto.UserSceneListBean}
   */
  public  static final class UserSceneListBean extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.UserSceneListBean)
      UserSceneListBeanOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserSceneListBean.newBuilder() to construct.
    private UserSceneListBean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserSceneListBean() {
      scenename_ = "";
      sceneid_ = 0;
      sceneimg_ = "";
      isopen_ = false;
      isselect_ = false;
      devCreateSuccess_ = false;
      devCreateErrCode_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserSceneListBean(
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

              scenename_ = s;
              break;
            }
            case 16: {

              sceneid_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              sceneimg_ = s;
              break;
            }
            case 40: {

              isopen_ = input.readBool();
              break;
            }
            case 48: {

              isselect_ = input.readBool();
              break;
            }
            case 56: {

              devCreateSuccess_ = input.readBool();
              break;
            }
            case 64: {

              devCreateErrCode_ = input.readInt32();
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
      return google.iproto.comment.UserSceneListBeanProto.internal_static_google_iproto_UserSceneListBean_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.comment.UserSceneListBeanProto.internal_static_google_iproto_UserSceneListBean_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.comment.UserSceneListBeanProto.UserSceneListBean.class, google.iproto.comment.UserSceneListBeanProto.UserSceneListBean.Builder.class);
    }

    public static final int SCENENAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object scenename_;
    /**
     * <pre>
     *场景名字
     * </pre>
     *
     * <code>string scenename = 1;</code>
     */
    public java.lang.String getScenename() {
      java.lang.Object ref = scenename_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scenename_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *场景名字
     * </pre>
     *
     * <code>string scenename = 1;</code>
     */
    public com.google.protobuf.ByteString
        getScenenameBytes() {
      java.lang.Object ref = scenename_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scenename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCENEID_FIELD_NUMBER = 2;
    private int sceneid_;
    /**
     * <pre>
     *场景ID
     * </pre>
     *
     * <code>int32 sceneid = 2;</code>
     */
    public int getSceneid() {
      return sceneid_;
    }

    public static final int SCENEIMG_FIELD_NUMBER = 3;
    private volatile java.lang.Object sceneimg_;
    /**
     * <pre>
     *场景图片地址
     * </pre>
     *
     * <code>string sceneimg = 3;</code>
     */
    public java.lang.String getSceneimg() {
      java.lang.Object ref = sceneimg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sceneimg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *场景图片地址
     * </pre>
     *
     * <code>string sceneimg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSceneimgBytes() {
      java.lang.Object ref = sceneimg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sceneimg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ISOPEN_FIELD_NUMBER = 5;
    private boolean isopen_;
    /**
     * <pre>
     *是否打开状态
     * </pre>
     *
     * <code>bool isopen = 5;</code>
     */
    public boolean getIsopen() {
      return isopen_;
    }

    public static final int ISSELECT_FIELD_NUMBER = 6;
    private boolean isselect_;
    /**
     * <pre>
     *是否选择
     * </pre>
     *
     * <code>bool isselect = 6;</code>
     */
    public boolean getIsselect() {
      return isselect_;
    }

    public static final int DEVCREATESUCCESS_FIELD_NUMBER = 7;
    private boolean devCreateSuccess_;
    /**
     * <code>bool devCreateSuccess = 7;</code>
     */
    public boolean getDevCreateSuccess() {
      return devCreateSuccess_;
    }

    public static final int DEVCREATEERRCODE_FIELD_NUMBER = 8;
    private int devCreateErrCode_;
    /**
     * <code>int32 devCreateErrCode = 8;</code>
     */
    public int getDevCreateErrCode() {
      return devCreateErrCode_;
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
      if (!getScenenameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scenename_);
      }
      if (sceneid_ != 0) {
        output.writeInt32(2, sceneid_);
      }
      if (!getSceneimgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sceneimg_);
      }
      if (isopen_ != false) {
        output.writeBool(5, isopen_);
      }
      if (isselect_ != false) {
        output.writeBool(6, isselect_);
      }
      if (devCreateSuccess_ != false) {
        output.writeBool(7, devCreateSuccess_);
      }
      if (devCreateErrCode_ != 0) {
        output.writeInt32(8, devCreateErrCode_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getScenenameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scenename_);
      }
      if (sceneid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, sceneid_);
      }
      if (!getSceneimgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sceneimg_);
      }
      if (isopen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isopen_);
      }
      if (isselect_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isselect_);
      }
      if (devCreateSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, devCreateSuccess_);
      }
      if (devCreateErrCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, devCreateErrCode_);
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
      if (!(obj instanceof google.iproto.comment.UserSceneListBeanProto.UserSceneListBean)) {
        return super.equals(obj);
      }
      google.iproto.comment.UserSceneListBeanProto.UserSceneListBean other = (google.iproto.comment.UserSceneListBeanProto.UserSceneListBean) obj;

      boolean result = true;
      result = result && getScenename()
          .equals(other.getScenename());
      result = result && (getSceneid()
          == other.getSceneid());
      result = result && getSceneimg()
          .equals(other.getSceneimg());
      result = result && (getIsopen()
          == other.getIsopen());
      result = result && (getIsselect()
          == other.getIsselect());
      result = result && (getDevCreateSuccess()
          == other.getDevCreateSuccess());
      result = result && (getDevCreateErrCode()
          == other.getDevCreateErrCode());
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
      hash = (37 * hash) + SCENENAME_FIELD_NUMBER;
      hash = (53 * hash) + getScenename().hashCode();
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneid();
      hash = (37 * hash) + SCENEIMG_FIELD_NUMBER;
      hash = (53 * hash) + getSceneimg().hashCode();
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsopen());
      hash = (37 * hash) + ISSELECT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsselect());
      hash = (37 * hash) + DEVCREATESUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDevCreateSuccess());
      hash = (37 * hash) + DEVCREATEERRCODE_FIELD_NUMBER;
      hash = (53 * hash) + getDevCreateErrCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parseFrom(
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
    public static Builder newBuilder(google.iproto.comment.UserSceneListBeanProto.UserSceneListBean prototype) {
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
     *用户设备绑定到场景获取场景列表
     * </pre>
     *
     * Protobuf type {@code google.iproto.UserSceneListBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.UserSceneListBean)
        google.iproto.comment.UserSceneListBeanProto.UserSceneListBeanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.comment.UserSceneListBeanProto.internal_static_google_iproto_UserSceneListBean_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.comment.UserSceneListBeanProto.internal_static_google_iproto_UserSceneListBean_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.comment.UserSceneListBeanProto.UserSceneListBean.class, google.iproto.comment.UserSceneListBeanProto.UserSceneListBean.Builder.class);
      }

      // Construct using google.iproto.comment.UserSceneListBeanProto.UserSceneListBean.newBuilder()
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
        scenename_ = "";

        sceneid_ = 0;

        sceneimg_ = "";

        isopen_ = false;

        isselect_ = false;

        devCreateSuccess_ = false;

        devCreateErrCode_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.comment.UserSceneListBeanProto.internal_static_google_iproto_UserSceneListBean_descriptor;
      }

      public google.iproto.comment.UserSceneListBeanProto.UserSceneListBean getDefaultInstanceForType() {
        return google.iproto.comment.UserSceneListBeanProto.UserSceneListBean.getDefaultInstance();
      }

      public google.iproto.comment.UserSceneListBeanProto.UserSceneListBean build() {
        google.iproto.comment.UserSceneListBeanProto.UserSceneListBean result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.comment.UserSceneListBeanProto.UserSceneListBean buildPartial() {
        google.iproto.comment.UserSceneListBeanProto.UserSceneListBean result = new google.iproto.comment.UserSceneListBeanProto.UserSceneListBean(this);
        result.scenename_ = scenename_;
        result.sceneid_ = sceneid_;
        result.sceneimg_ = sceneimg_;
        result.isopen_ = isopen_;
        result.isselect_ = isselect_;
        result.devCreateSuccess_ = devCreateSuccess_;
        result.devCreateErrCode_ = devCreateErrCode_;
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
        if (other instanceof google.iproto.comment.UserSceneListBeanProto.UserSceneListBean) {
          return mergeFrom((google.iproto.comment.UserSceneListBeanProto.UserSceneListBean)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.comment.UserSceneListBeanProto.UserSceneListBean other) {
        if (other == google.iproto.comment.UserSceneListBeanProto.UserSceneListBean.getDefaultInstance()) return this;
        if (!other.getScenename().isEmpty()) {
          scenename_ = other.scenename_;
          onChanged();
        }
        if (other.getSceneid() != 0) {
          setSceneid(other.getSceneid());
        }
        if (!other.getSceneimg().isEmpty()) {
          sceneimg_ = other.sceneimg_;
          onChanged();
        }
        if (other.getIsopen() != false) {
          setIsopen(other.getIsopen());
        }
        if (other.getIsselect() != false) {
          setIsselect(other.getIsselect());
        }
        if (other.getDevCreateSuccess() != false) {
          setDevCreateSuccess(other.getDevCreateSuccess());
        }
        if (other.getDevCreateErrCode() != 0) {
          setDevCreateErrCode(other.getDevCreateErrCode());
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
        google.iproto.comment.UserSceneListBeanProto.UserSceneListBean parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.comment.UserSceneListBeanProto.UserSceneListBean) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object scenename_ = "";
      /**
       * <pre>
       *场景名字
       * </pre>
       *
       * <code>string scenename = 1;</code>
       */
      public java.lang.String getScenename() {
        java.lang.Object ref = scenename_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          scenename_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *场景名字
       * </pre>
       *
       * <code>string scenename = 1;</code>
       */
      public com.google.protobuf.ByteString
          getScenenameBytes() {
        java.lang.Object ref = scenename_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          scenename_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *场景名字
       * </pre>
       *
       * <code>string scenename = 1;</code>
       */
      public Builder setScenename(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        scenename_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *场景名字
       * </pre>
       *
       * <code>string scenename = 1;</code>
       */
      public Builder clearScenename() {
        
        scenename_ = getDefaultInstance().getScenename();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *场景名字
       * </pre>
       *
       * <code>string scenename = 1;</code>
       */
      public Builder setScenenameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        scenename_ = value;
        onChanged();
        return this;
      }

      private int sceneid_ ;
      /**
       * <pre>
       *场景ID
       * </pre>
       *
       * <code>int32 sceneid = 2;</code>
       */
      public int getSceneid() {
        return sceneid_;
      }
      /**
       * <pre>
       *场景ID
       * </pre>
       *
       * <code>int32 sceneid = 2;</code>
       */
      public Builder setSceneid(int value) {
        
        sceneid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *场景ID
       * </pre>
       *
       * <code>int32 sceneid = 2;</code>
       */
      public Builder clearSceneid() {
        
        sceneid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object sceneimg_ = "";
      /**
       * <pre>
       *场景图片地址
       * </pre>
       *
       * <code>string sceneimg = 3;</code>
       */
      public java.lang.String getSceneimg() {
        java.lang.Object ref = sceneimg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sceneimg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *场景图片地址
       * </pre>
       *
       * <code>string sceneimg = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSceneimgBytes() {
        java.lang.Object ref = sceneimg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sceneimg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *场景图片地址
       * </pre>
       *
       * <code>string sceneimg = 3;</code>
       */
      public Builder setSceneimg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sceneimg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *场景图片地址
       * </pre>
       *
       * <code>string sceneimg = 3;</code>
       */
      public Builder clearSceneimg() {
        
        sceneimg_ = getDefaultInstance().getSceneimg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *场景图片地址
       * </pre>
       *
       * <code>string sceneimg = 3;</code>
       */
      public Builder setSceneimgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sceneimg_ = value;
        onChanged();
        return this;
      }

      private boolean isopen_ ;
      /**
       * <pre>
       *是否打开状态
       * </pre>
       *
       * <code>bool isopen = 5;</code>
       */
      public boolean getIsopen() {
        return isopen_;
      }
      /**
       * <pre>
       *是否打开状态
       * </pre>
       *
       * <code>bool isopen = 5;</code>
       */
      public Builder setIsopen(boolean value) {
        
        isopen_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *是否打开状态
       * </pre>
       *
       * <code>bool isopen = 5;</code>
       */
      public Builder clearIsopen() {
        
        isopen_ = false;
        onChanged();
        return this;
      }

      private boolean isselect_ ;
      /**
       * <pre>
       *是否选择
       * </pre>
       *
       * <code>bool isselect = 6;</code>
       */
      public boolean getIsselect() {
        return isselect_;
      }
      /**
       * <pre>
       *是否选择
       * </pre>
       *
       * <code>bool isselect = 6;</code>
       */
      public Builder setIsselect(boolean value) {
        
        isselect_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *是否选择
       * </pre>
       *
       * <code>bool isselect = 6;</code>
       */
      public Builder clearIsselect() {
        
        isselect_ = false;
        onChanged();
        return this;
      }

      private boolean devCreateSuccess_ ;
      /**
       * <code>bool devCreateSuccess = 7;</code>
       */
      public boolean getDevCreateSuccess() {
        return devCreateSuccess_;
      }
      /**
       * <code>bool devCreateSuccess = 7;</code>
       */
      public Builder setDevCreateSuccess(boolean value) {
        
        devCreateSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool devCreateSuccess = 7;</code>
       */
      public Builder clearDevCreateSuccess() {
        
        devCreateSuccess_ = false;
        onChanged();
        return this;
      }

      private int devCreateErrCode_ ;
      /**
       * <code>int32 devCreateErrCode = 8;</code>
       */
      public int getDevCreateErrCode() {
        return devCreateErrCode_;
      }
      /**
       * <code>int32 devCreateErrCode = 8;</code>
       */
      public Builder setDevCreateErrCode(int value) {
        
        devCreateErrCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 devCreateErrCode = 8;</code>
       */
      public Builder clearDevCreateErrCode() {
        
        devCreateErrCode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.UserSceneListBean)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.UserSceneListBean)
    private static final google.iproto.comment.UserSceneListBeanProto.UserSceneListBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.comment.UserSceneListBeanProto.UserSceneListBean();
    }

    public static google.iproto.comment.UserSceneListBeanProto.UserSceneListBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserSceneListBean>
        PARSER = new com.google.protobuf.AbstractParser<UserSceneListBean>() {
      public UserSceneListBean parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserSceneListBean(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserSceneListBean> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserSceneListBean> getParserForType() {
      return PARSER;
    }

    public google.iproto.comment.UserSceneListBeanProto.UserSceneListBean getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_UserSceneListBean_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_UserSceneListBean_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/iproto/comment/UserSceneListBea" +
      "n.proto\022\rgoogle.iproto\"\237\001\n\021UserSceneList" +
      "Bean\022\021\n\tscenename\030\001 \001(\t\022\017\n\007sceneid\030\002 \001(\005" +
      "\022\020\n\010sceneimg\030\003 \001(\t\022\016\n\006isopen\030\005 \001(\010\022\020\n\010is" +
      "select\030\006 \001(\010\022\030\n\020devCreateSuccess\030\007 \001(\010\022\030" +
      "\n\020devCreateErrCode\030\010 \001(\005B/\n\025google.iprot" +
      "o.commentB\026UserSceneListBeanProtob\006proto" +
      "3"
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
    internal_static_google_iproto_UserSceneListBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_UserSceneListBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_UserSceneListBean_descriptor,
        new java.lang.String[] { "Scenename", "Sceneid", "Sceneimg", "Isopen", "Isselect", "DevCreateSuccess", "DevCreateErrCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}