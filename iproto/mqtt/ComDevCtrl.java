// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0001_ComDevCtrl.proto

package google.iproto.mqtt;

public final class ComDevCtrl {
  private ComDevCtrl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface comdev_ctrlOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.comdev_ctrl)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    java.util.List<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info> 
        getCenterairconditonList();
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info getCenterairconditon(int index);
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    int getCenterairconditonCount();
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    java.util.List<? extends google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder> 
        getCenterairconditonOrBuilderList();
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder getCenterairconditonOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 通用设备控制接口
   * </pre>
   *
   * Protobuf type {@code google.iproto.comdev_ctrl}
   */
  public  static final class comdev_ctrl extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.comdev_ctrl)
      comdev_ctrlOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use comdev_ctrl.newBuilder() to construct.
    private comdev_ctrl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private comdev_ctrl() {
      centerairconditon_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private comdev_ctrl(
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
                centerairconditon_ = new java.util.ArrayList<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info>();
                mutable_bitField0_ |= 0x00000001;
              }
              centerairconditon_.add(
                  input.readMessage(google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.parser(), extensionRegistry));
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
          centerairconditon_ = java.util.Collections.unmodifiableList(centerairconditon_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.mqtt.ComDevCtrl.internal_static_google_iproto_comdev_ctrl_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.ComDevCtrl.internal_static_google_iproto_comdev_ctrl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.ComDevCtrl.comdev_ctrl.class, google.iproto.mqtt.ComDevCtrl.comdev_ctrl.Builder.class);
    }

    public static final int CENTERAIRCONDITON_FIELD_NUMBER = 1;
    private java.util.List<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info> centerairconditon_;
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    public java.util.List<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info> getCenterairconditonList() {
      return centerairconditon_;
    }
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    public java.util.List<? extends google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder> 
        getCenterairconditonOrBuilderList() {
      return centerairconditon_;
    }
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    public int getCenterairconditonCount() {
      return centerairconditon_.size();
    }
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    public google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info getCenterairconditon(int index) {
      return centerairconditon_.get(index);
    }
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
     */
    public google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder getCenterairconditonOrBuilder(
        int index) {
      return centerairconditon_.get(index);
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
      for (int i = 0; i < centerairconditon_.size(); i++) {
        output.writeMessage(1, centerairconditon_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < centerairconditon_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, centerairconditon_.get(i));
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
      if (!(obj instanceof google.iproto.mqtt.ComDevCtrl.comdev_ctrl)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.ComDevCtrl.comdev_ctrl other = (google.iproto.mqtt.ComDevCtrl.comdev_ctrl) obj;

      boolean result = true;
      result = result && getCenterairconditonList()
          .equals(other.getCenterairconditonList());
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
      if (getCenterairconditonCount() > 0) {
        hash = (37 * hash) + CENTERAIRCONDITON_FIELD_NUMBER;
        hash = (53 * hash) + getCenterairconditonList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.ComDevCtrl.comdev_ctrl prototype) {
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
     * 通用设备控制接口
     * </pre>
     *
     * Protobuf type {@code google.iproto.comdev_ctrl}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.comdev_ctrl)
        google.iproto.mqtt.ComDevCtrl.comdev_ctrlOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.ComDevCtrl.internal_static_google_iproto_comdev_ctrl_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.ComDevCtrl.internal_static_google_iproto_comdev_ctrl_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.ComDevCtrl.comdev_ctrl.class, google.iproto.mqtt.ComDevCtrl.comdev_ctrl.Builder.class);
      }

      // Construct using google.iproto.mqtt.ComDevCtrl.comdev_ctrl.newBuilder()
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
          getCenterairconditonFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (centerairconditonBuilder_ == null) {
          centerairconditon_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          centerairconditonBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.ComDevCtrl.internal_static_google_iproto_comdev_ctrl_descriptor;
      }

      public google.iproto.mqtt.ComDevCtrl.comdev_ctrl getDefaultInstanceForType() {
        return google.iproto.mqtt.ComDevCtrl.comdev_ctrl.getDefaultInstance();
      }

      public google.iproto.mqtt.ComDevCtrl.comdev_ctrl build() {
        google.iproto.mqtt.ComDevCtrl.comdev_ctrl result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.ComDevCtrl.comdev_ctrl buildPartial() {
        google.iproto.mqtt.ComDevCtrl.comdev_ctrl result = new google.iproto.mqtt.ComDevCtrl.comdev_ctrl(this);
        int from_bitField0_ = bitField0_;
        if (centerairconditonBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            centerairconditon_ = java.util.Collections.unmodifiableList(centerairconditon_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.centerairconditon_ = centerairconditon_;
        } else {
          result.centerairconditon_ = centerairconditonBuilder_.build();
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
        if (other instanceof google.iproto.mqtt.ComDevCtrl.comdev_ctrl) {
          return mergeFrom((google.iproto.mqtt.ComDevCtrl.comdev_ctrl)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.ComDevCtrl.comdev_ctrl other) {
        if (other == google.iproto.mqtt.ComDevCtrl.comdev_ctrl.getDefaultInstance()) return this;
        if (centerairconditonBuilder_ == null) {
          if (!other.centerairconditon_.isEmpty()) {
            if (centerairconditon_.isEmpty()) {
              centerairconditon_ = other.centerairconditon_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCenterairconditonIsMutable();
              centerairconditon_.addAll(other.centerairconditon_);
            }
            onChanged();
          }
        } else {
          if (!other.centerairconditon_.isEmpty()) {
            if (centerairconditonBuilder_.isEmpty()) {
              centerairconditonBuilder_.dispose();
              centerairconditonBuilder_ = null;
              centerairconditon_ = other.centerairconditon_;
              bitField0_ = (bitField0_ & ~0x00000001);
              centerairconditonBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCenterairconditonFieldBuilder() : null;
            } else {
              centerairconditonBuilder_.addAllMessages(other.centerairconditon_);
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
        google.iproto.mqtt.ComDevCtrl.comdev_ctrl parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.ComDevCtrl.comdev_ctrl) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info> centerairconditon_ =
        java.util.Collections.emptyList();
      private void ensureCenterairconditonIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          centerairconditon_ = new java.util.ArrayList<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info>(centerairconditon_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder> centerairconditonBuilder_;

      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public java.util.List<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info> getCenterairconditonList() {
        if (centerairconditonBuilder_ == null) {
          return java.util.Collections.unmodifiableList(centerairconditon_);
        } else {
          return centerairconditonBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public int getCenterairconditonCount() {
        if (centerairconditonBuilder_ == null) {
          return centerairconditon_.size();
        } else {
          return centerairconditonBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info getCenterairconditon(int index) {
        if (centerairconditonBuilder_ == null) {
          return centerairconditon_.get(index);
        } else {
          return centerairconditonBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder setCenterairconditon(
          int index, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info value) {
        if (centerairconditonBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCenterairconditonIsMutable();
          centerairconditon_.set(index, value);
          onChanged();
        } else {
          centerairconditonBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder setCenterairconditon(
          int index, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder builderForValue) {
        if (centerairconditonBuilder_ == null) {
          ensureCenterairconditonIsMutable();
          centerairconditon_.set(index, builderForValue.build());
          onChanged();
        } else {
          centerairconditonBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder addCenterairconditon(google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info value) {
        if (centerairconditonBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCenterairconditonIsMutable();
          centerairconditon_.add(value);
          onChanged();
        } else {
          centerairconditonBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder addCenterairconditon(
          int index, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info value) {
        if (centerairconditonBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCenterairconditonIsMutable();
          centerairconditon_.add(index, value);
          onChanged();
        } else {
          centerairconditonBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder addCenterairconditon(
          google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder builderForValue) {
        if (centerairconditonBuilder_ == null) {
          ensureCenterairconditonIsMutable();
          centerairconditon_.add(builderForValue.build());
          onChanged();
        } else {
          centerairconditonBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder addCenterairconditon(
          int index, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder builderForValue) {
        if (centerairconditonBuilder_ == null) {
          ensureCenterairconditonIsMutable();
          centerairconditon_.add(index, builderForValue.build());
          onChanged();
        } else {
          centerairconditonBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder addAllCenterairconditon(
          java.lang.Iterable<? extends google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info> values) {
        if (centerairconditonBuilder_ == null) {
          ensureCenterairconditonIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, centerairconditon_);
          onChanged();
        } else {
          centerairconditonBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder clearCenterairconditon() {
        if (centerairconditonBuilder_ == null) {
          centerairconditon_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          centerairconditonBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public Builder removeCenterairconditon(int index) {
        if (centerairconditonBuilder_ == null) {
          ensureCenterairconditonIsMutable();
          centerairconditon_.remove(index);
          onChanged();
        } else {
          centerairconditonBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder getCenterairconditonBuilder(
          int index) {
        return getCenterairconditonFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder getCenterairconditonOrBuilder(
          int index) {
        if (centerairconditonBuilder_ == null) {
          return centerairconditon_.get(index);  } else {
          return centerairconditonBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public java.util.List<? extends google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder> 
           getCenterairconditonOrBuilderList() {
        if (centerairconditonBuilder_ != null) {
          return centerairconditonBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(centerairconditon_);
        }
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder addCenterairconditonBuilder() {
        return getCenterairconditonFieldBuilder().addBuilder(
            google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.getDefaultInstance());
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder addCenterairconditonBuilder(
          int index) {
        return getCenterairconditonFieldBuilder().addBuilder(
            index, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.getDefaultInstance());
      }
      /**
       * <pre>
       *中央空调
       * </pre>
       *
       * <code>repeated .google.iproto.dev_centerairconditon_info centerairconditon = 1;</code>
       */
      public java.util.List<google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder> 
           getCenterairconditonBuilderList() {
        return getCenterairconditonFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder> 
          getCenterairconditonFieldBuilder() {
        if (centerairconditonBuilder_ == null) {
          centerairconditonBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_info.Builder, google.iproto.mqtt.ComDevDefCenterAcProto.dev_centerairconditon_infoOrBuilder>(
                  centerairconditon_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          centerairconditon_ = null;
        }
        return centerairconditonBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:google.iproto.comdev_ctrl)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.comdev_ctrl)
    private static final google.iproto.mqtt.ComDevCtrl.comdev_ctrl DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.ComDevCtrl.comdev_ctrl();
    }

    public static google.iproto.mqtt.ComDevCtrl.comdev_ctrl getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<comdev_ctrl>
        PARSER = new com.google.protobuf.AbstractParser<comdev_ctrl>() {
      public comdev_ctrl parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new comdev_ctrl(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<comdev_ctrl> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<comdev_ctrl> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.ComDevCtrl.comdev_ctrl getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_comdev_ctrl_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_comdev_ctrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/iproto/mqtt/p0001_ComDevCtrl.pr" +
      "oto\022\rgoogle.iproto\032:google/iproto/mqtt/p" +
      "0112_ComDevDef_centerairconditon.proto\"S" +
      "\n\013comdev_ctrl\022D\n\021centerairconditon\030\001 \003(\013" +
      "2).google.iproto.dev_centerairconditon_i" +
      "nfoB \n\022google.iproto.mqttB\nComDevCtrlb\006p" +
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
          google.iproto.mqtt.ComDevDefCenterAcProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_comdev_ctrl_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_comdev_ctrl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_comdev_ctrl_descriptor,
        new java.lang.String[] { "Centerairconditon", });
    google.iproto.mqtt.ComDevDefCenterAcProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}