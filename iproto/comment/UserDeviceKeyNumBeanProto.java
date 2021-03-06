// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/comment/UserDeviceKeyNumBean.proto

package google.iproto.comment;

public final class UserDeviceKeyNumBeanProto {
  private UserDeviceKeyNumBeanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserDeviceKeyNumBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.UserDeviceKeyNumBean)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *按键编号
     * </pre>
     *
     * <code>int32 keynum = 1;</code>
     */
    int getKeynum();

    /**
     * <pre>
     *按键名称
     * </pre>
     *
     * <code>string keyname = 2;</code>
     */
    java.lang.String getKeyname();
    /**
     * <pre>
     *按键名称
     * </pre>
     *
     * <code>string keyname = 2;</code>
     */
    com.google.protobuf.ByteString
        getKeynameBytes();

    /**
     * <pre>
     *按键是否选中
     * </pre>
     *
     * <code>bool isselect = 3;</code>
     */
    boolean getIsselect();
  }
  /**
   * <pre>
   *自定义用户设备返回按键数据
   * </pre>
   *
   * Protobuf type {@code google.iproto.UserDeviceKeyNumBean}
   */
  public  static final class UserDeviceKeyNumBean extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.UserDeviceKeyNumBean)
      UserDeviceKeyNumBeanOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserDeviceKeyNumBean.newBuilder() to construct.
    private UserDeviceKeyNumBean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserDeviceKeyNumBean() {
      keynum_ = 0;
      keyname_ = "";
      isselect_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserDeviceKeyNumBean(
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

              keynum_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              keyname_ = s;
              break;
            }
            case 24: {

              isselect_ = input.readBool();
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
      return google.iproto.comment.UserDeviceKeyNumBeanProto.internal_static_google_iproto_UserDeviceKeyNumBean_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.comment.UserDeviceKeyNumBeanProto.internal_static_google_iproto_UserDeviceKeyNumBean_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean.class, google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean.Builder.class);
    }

    public static final int KEYNUM_FIELD_NUMBER = 1;
    private int keynum_;
    /**
     * <pre>
     *按键编号
     * </pre>
     *
     * <code>int32 keynum = 1;</code>
     */
    public int getKeynum() {
      return keynum_;
    }

    public static final int KEYNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object keyname_;
    /**
     * <pre>
     *按键名称
     * </pre>
     *
     * <code>string keyname = 2;</code>
     */
    public java.lang.String getKeyname() {
      java.lang.Object ref = keyname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyname_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *按键名称
     * </pre>
     *
     * <code>string keyname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeynameBytes() {
      java.lang.Object ref = keyname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ISSELECT_FIELD_NUMBER = 3;
    private boolean isselect_;
    /**
     * <pre>
     *按键是否选中
     * </pre>
     *
     * <code>bool isselect = 3;</code>
     */
    public boolean getIsselect() {
      return isselect_;
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
      if (keynum_ != 0) {
        output.writeInt32(1, keynum_);
      }
      if (!getKeynameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyname_);
      }
      if (isselect_ != false) {
        output.writeBool(3, isselect_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (keynum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, keynum_);
      }
      if (!getKeynameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyname_);
      }
      if (isselect_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isselect_);
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
      if (!(obj instanceof google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean)) {
        return super.equals(obj);
      }
      google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean other = (google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean) obj;

      boolean result = true;
      result = result && (getKeynum()
          == other.getKeynum());
      result = result && getKeyname()
          .equals(other.getKeyname());
      result = result && (getIsselect()
          == other.getIsselect());
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
      hash = (37 * hash) + KEYNUM_FIELD_NUMBER;
      hash = (53 * hash) + getKeynum();
      hash = (37 * hash) + KEYNAME_FIELD_NUMBER;
      hash = (53 * hash) + getKeyname().hashCode();
      hash = (37 * hash) + ISSELECT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsselect());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parseFrom(
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
    public static Builder newBuilder(google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean prototype) {
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
     *自定义用户设备返回按键数据
     * </pre>
     *
     * Protobuf type {@code google.iproto.UserDeviceKeyNumBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.UserDeviceKeyNumBean)
        google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBeanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.comment.UserDeviceKeyNumBeanProto.internal_static_google_iproto_UserDeviceKeyNumBean_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.comment.UserDeviceKeyNumBeanProto.internal_static_google_iproto_UserDeviceKeyNumBean_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean.class, google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean.Builder.class);
      }

      // Construct using google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean.newBuilder()
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
        keynum_ = 0;

        keyname_ = "";

        isselect_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.comment.UserDeviceKeyNumBeanProto.internal_static_google_iproto_UserDeviceKeyNumBean_descriptor;
      }

      public google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean getDefaultInstanceForType() {
        return google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean.getDefaultInstance();
      }

      public google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean build() {
        google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean buildPartial() {
        google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean result = new google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean(this);
        result.keynum_ = keynum_;
        result.keyname_ = keyname_;
        result.isselect_ = isselect_;
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
        if (other instanceof google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean) {
          return mergeFrom((google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean other) {
        if (other == google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean.getDefaultInstance()) return this;
        if (other.getKeynum() != 0) {
          setKeynum(other.getKeynum());
        }
        if (!other.getKeyname().isEmpty()) {
          keyname_ = other.keyname_;
          onChanged();
        }
        if (other.getIsselect() != false) {
          setIsselect(other.getIsselect());
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
        google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int keynum_ ;
      /**
       * <pre>
       *按键编号
       * </pre>
       *
       * <code>int32 keynum = 1;</code>
       */
      public int getKeynum() {
        return keynum_;
      }
      /**
       * <pre>
       *按键编号
       * </pre>
       *
       * <code>int32 keynum = 1;</code>
       */
      public Builder setKeynum(int value) {
        
        keynum_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *按键编号
       * </pre>
       *
       * <code>int32 keynum = 1;</code>
       */
      public Builder clearKeynum() {
        
        keynum_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object keyname_ = "";
      /**
       * <pre>
       *按键名称
       * </pre>
       *
       * <code>string keyname = 2;</code>
       */
      public java.lang.String getKeyname() {
        java.lang.Object ref = keyname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          keyname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *按键名称
       * </pre>
       *
       * <code>string keyname = 2;</code>
       */
      public com.google.protobuf.ByteString
          getKeynameBytes() {
        java.lang.Object ref = keyname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          keyname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *按键名称
       * </pre>
       *
       * <code>string keyname = 2;</code>
       */
      public Builder setKeyname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        keyname_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *按键名称
       * </pre>
       *
       * <code>string keyname = 2;</code>
       */
      public Builder clearKeyname() {
        
        keyname_ = getDefaultInstance().getKeyname();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *按键名称
       * </pre>
       *
       * <code>string keyname = 2;</code>
       */
      public Builder setKeynameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        keyname_ = value;
        onChanged();
        return this;
      }

      private boolean isselect_ ;
      /**
       * <pre>
       *按键是否选中
       * </pre>
       *
       * <code>bool isselect = 3;</code>
       */
      public boolean getIsselect() {
        return isselect_;
      }
      /**
       * <pre>
       *按键是否选中
       * </pre>
       *
       * <code>bool isselect = 3;</code>
       */
      public Builder setIsselect(boolean value) {
        
        isselect_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *按键是否选中
       * </pre>
       *
       * <code>bool isselect = 3;</code>
       */
      public Builder clearIsselect() {
        
        isselect_ = false;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.UserDeviceKeyNumBean)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.UserDeviceKeyNumBean)
    private static final google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean();
    }

    public static google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserDeviceKeyNumBean>
        PARSER = new com.google.protobuf.AbstractParser<UserDeviceKeyNumBean>() {
      public UserDeviceKeyNumBean parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserDeviceKeyNumBean(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserDeviceKeyNumBean> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserDeviceKeyNumBean> getParserForType() {
      return PARSER;
    }

    public google.iproto.comment.UserDeviceKeyNumBeanProto.UserDeviceKeyNumBean getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_UserDeviceKeyNumBean_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_UserDeviceKeyNumBean_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/iproto/comment/UserDeviceKeyNum" +
      "Bean.proto\022\rgoogle.iproto\"I\n\024UserDeviceK" +
      "eyNumBean\022\016\n\006keynum\030\001 \001(\005\022\017\n\007keyname\030\002 \001" +
      "(\t\022\020\n\010isselect\030\003 \001(\010B2\n\025google.iproto.co" +
      "mmentB\031UserDeviceKeyNumBeanProtob\006proto3"
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
    internal_static_google_iproto_UserDeviceKeyNumBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_UserDeviceKeyNumBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_UserDeviceKeyNumBean_descriptor,
        new java.lang.String[] { "Keynum", "Keyname", "Isselect", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
