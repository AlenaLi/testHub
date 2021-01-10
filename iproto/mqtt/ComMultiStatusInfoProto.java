// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0110_ComMultiStatusReport.proto

package google.iproto.mqtt;

public final class ComMultiStatusInfoProto {
  private ComMultiStatusInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface commutistatus_infoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.commutistatus_info)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 home_id = 1;</code>
     */
    int getHomeId();

    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    java.util.List<google.iproto.mqtt.ComStatusInfoProto.comstatus_info> 
        getComstatusList();
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    google.iproto.mqtt.ComStatusInfoProto.comstatus_info getComstatus(int index);
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    int getComstatusCount();
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    java.util.List<? extends google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder> 
        getComstatusOrBuilderList();
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder getComstatusOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code google.iproto.commutistatus_info}
   */
  public  static final class commutistatus_info extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.commutistatus_info)
      commutistatus_infoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use commutistatus_info.newBuilder() to construct.
    private commutistatus_info(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private commutistatus_info() {
      homeId_ = 0;
      comstatus_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private commutistatus_info(
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

              homeId_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                comstatus_ = new java.util.ArrayList<google.iproto.mqtt.ComStatusInfoProto.comstatus_info>();
                mutable_bitField0_ |= 0x00000002;
              }
              comstatus_.add(
                  input.readMessage(google.iproto.mqtt.ComStatusInfoProto.comstatus_info.parser(), extensionRegistry));
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
          comstatus_ = java.util.Collections.unmodifiableList(comstatus_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.mqtt.ComMultiStatusInfoProto.internal_static_google_iproto_commutistatus_info_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.ComMultiStatusInfoProto.internal_static_google_iproto_commutistatus_info_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info.class, google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info.Builder.class);
    }

    private int bitField0_;
    public static final int HOME_ID_FIELD_NUMBER = 1;
    private int homeId_;
    /**
     * <code>int32 home_id = 1;</code>
     */
    public int getHomeId() {
      return homeId_;
    }

    public static final int COMSTATUS_FIELD_NUMBER = 2;
    private java.util.List<google.iproto.mqtt.ComStatusInfoProto.comstatus_info> comstatus_;
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    public java.util.List<google.iproto.mqtt.ComStatusInfoProto.comstatus_info> getComstatusList() {
      return comstatus_;
    }
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    public java.util.List<? extends google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder> 
        getComstatusOrBuilderList() {
      return comstatus_;
    }
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    public int getComstatusCount() {
      return comstatus_.size();
    }
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    public google.iproto.mqtt.ComStatusInfoProto.comstatus_info getComstatus(int index) {
      return comstatus_.get(index);
    }
    /**
     * <pre>
     *上传的状态数组
     * </pre>
     *
     * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
     */
    public google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder getComstatusOrBuilder(
        int index) {
      return comstatus_.get(index);
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
      if (homeId_ != 0) {
        output.writeInt32(1, homeId_);
      }
      for (int i = 0; i < comstatus_.size(); i++) {
        output.writeMessage(2, comstatus_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (homeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, homeId_);
      }
      for (int i = 0; i < comstatus_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, comstatus_.get(i));
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
      if (!(obj instanceof google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info other = (google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info) obj;

      boolean result = true;
      result = result && (getHomeId()
          == other.getHomeId());
      result = result && getComstatusList()
          .equals(other.getComstatusList());
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
      hash = (37 * hash) + HOME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getHomeId();
      if (getComstatusCount() > 0) {
        hash = (37 * hash) + COMSTATUS_FIELD_NUMBER;
        hash = (53 * hash) + getComstatusList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info prototype) {
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
     * Protobuf type {@code google.iproto.commutistatus_info}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.commutistatus_info)
        google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_infoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.ComMultiStatusInfoProto.internal_static_google_iproto_commutistatus_info_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.ComMultiStatusInfoProto.internal_static_google_iproto_commutistatus_info_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info.class, google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info.Builder.class);
      }

      // Construct using google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info.newBuilder()
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
          getComstatusFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        homeId_ = 0;

        if (comstatusBuilder_ == null) {
          comstatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          comstatusBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.ComMultiStatusInfoProto.internal_static_google_iproto_commutistatus_info_descriptor;
      }

      public google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info getDefaultInstanceForType() {
        return google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info.getDefaultInstance();
      }

      public google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info build() {
        google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info buildPartial() {
        google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info result = new google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.homeId_ = homeId_;
        if (comstatusBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            comstatus_ = java.util.Collections.unmodifiableList(comstatus_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.comstatus_ = comstatus_;
        } else {
          result.comstatus_ = comstatusBuilder_.build();
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
        if (other instanceof google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info) {
          return mergeFrom((google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info other) {
        if (other == google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info.getDefaultInstance()) return this;
        if (other.getHomeId() != 0) {
          setHomeId(other.getHomeId());
        }
        if (comstatusBuilder_ == null) {
          if (!other.comstatus_.isEmpty()) {
            if (comstatus_.isEmpty()) {
              comstatus_ = other.comstatus_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureComstatusIsMutable();
              comstatus_.addAll(other.comstatus_);
            }
            onChanged();
          }
        } else {
          if (!other.comstatus_.isEmpty()) {
            if (comstatusBuilder_.isEmpty()) {
              comstatusBuilder_.dispose();
              comstatusBuilder_ = null;
              comstatus_ = other.comstatus_;
              bitField0_ = (bitField0_ & ~0x00000002);
              comstatusBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getComstatusFieldBuilder() : null;
            } else {
              comstatusBuilder_.addAllMessages(other.comstatus_);
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
        google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int homeId_ ;
      /**
       * <code>int32 home_id = 1;</code>
       */
      public int getHomeId() {
        return homeId_;
      }
      /**
       * <code>int32 home_id = 1;</code>
       */
      public Builder setHomeId(int value) {
        
        homeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 home_id = 1;</code>
       */
      public Builder clearHomeId() {
        
        homeId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<google.iproto.mqtt.ComStatusInfoProto.comstatus_info> comstatus_ =
        java.util.Collections.emptyList();
      private void ensureComstatusIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          comstatus_ = new java.util.ArrayList<google.iproto.mqtt.ComStatusInfoProto.comstatus_info>(comstatus_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.ComStatusInfoProto.comstatus_info, google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder, google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder> comstatusBuilder_;

      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public java.util.List<google.iproto.mqtt.ComStatusInfoProto.comstatus_info> getComstatusList() {
        if (comstatusBuilder_ == null) {
          return java.util.Collections.unmodifiableList(comstatus_);
        } else {
          return comstatusBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public int getComstatusCount() {
        if (comstatusBuilder_ == null) {
          return comstatus_.size();
        } else {
          return comstatusBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public google.iproto.mqtt.ComStatusInfoProto.comstatus_info getComstatus(int index) {
        if (comstatusBuilder_ == null) {
          return comstatus_.get(index);
        } else {
          return comstatusBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder setComstatus(
          int index, google.iproto.mqtt.ComStatusInfoProto.comstatus_info value) {
        if (comstatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureComstatusIsMutable();
          comstatus_.set(index, value);
          onChanged();
        } else {
          comstatusBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder setComstatus(
          int index, google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder builderForValue) {
        if (comstatusBuilder_ == null) {
          ensureComstatusIsMutable();
          comstatus_.set(index, builderForValue.build());
          onChanged();
        } else {
          comstatusBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder addComstatus(google.iproto.mqtt.ComStatusInfoProto.comstatus_info value) {
        if (comstatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureComstatusIsMutable();
          comstatus_.add(value);
          onChanged();
        } else {
          comstatusBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder addComstatus(
          int index, google.iproto.mqtt.ComStatusInfoProto.comstatus_info value) {
        if (comstatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureComstatusIsMutable();
          comstatus_.add(index, value);
          onChanged();
        } else {
          comstatusBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder addComstatus(
          google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder builderForValue) {
        if (comstatusBuilder_ == null) {
          ensureComstatusIsMutable();
          comstatus_.add(builderForValue.build());
          onChanged();
        } else {
          comstatusBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder addComstatus(
          int index, google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder builderForValue) {
        if (comstatusBuilder_ == null) {
          ensureComstatusIsMutable();
          comstatus_.add(index, builderForValue.build());
          onChanged();
        } else {
          comstatusBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder addAllComstatus(
          java.lang.Iterable<? extends google.iproto.mqtt.ComStatusInfoProto.comstatus_info> values) {
        if (comstatusBuilder_ == null) {
          ensureComstatusIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, comstatus_);
          onChanged();
        } else {
          comstatusBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder clearComstatus() {
        if (comstatusBuilder_ == null) {
          comstatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          comstatusBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public Builder removeComstatus(int index) {
        if (comstatusBuilder_ == null) {
          ensureComstatusIsMutable();
          comstatus_.remove(index);
          onChanged();
        } else {
          comstatusBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder getComstatusBuilder(
          int index) {
        return getComstatusFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder getComstatusOrBuilder(
          int index) {
        if (comstatusBuilder_ == null) {
          return comstatus_.get(index);  } else {
          return comstatusBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public java.util.List<? extends google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder> 
           getComstatusOrBuilderList() {
        if (comstatusBuilder_ != null) {
          return comstatusBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(comstatus_);
        }
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder addComstatusBuilder() {
        return getComstatusFieldBuilder().addBuilder(
            google.iproto.mqtt.ComStatusInfoProto.comstatus_info.getDefaultInstance());
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder addComstatusBuilder(
          int index) {
        return getComstatusFieldBuilder().addBuilder(
            index, google.iproto.mqtt.ComStatusInfoProto.comstatus_info.getDefaultInstance());
      }
      /**
       * <pre>
       *上传的状态数组
       * </pre>
       *
       * <code>repeated .google.iproto.comstatus_info comstatus = 2;</code>
       */
      public java.util.List<google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder> 
           getComstatusBuilderList() {
        return getComstatusFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.ComStatusInfoProto.comstatus_info, google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder, google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder> 
          getComstatusFieldBuilder() {
        if (comstatusBuilder_ == null) {
          comstatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              google.iproto.mqtt.ComStatusInfoProto.comstatus_info, google.iproto.mqtt.ComStatusInfoProto.comstatus_info.Builder, google.iproto.mqtt.ComStatusInfoProto.comstatus_infoOrBuilder>(
                  comstatus_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          comstatus_ = null;
        }
        return comstatusBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:google.iproto.commutistatus_info)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.commutistatus_info)
    private static final google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info();
    }

    public static google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<commutistatus_info>
        PARSER = new com.google.protobuf.AbstractParser<commutistatus_info>() {
      public commutistatus_info parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new commutistatus_info(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<commutistatus_info> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<commutistatus_info> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.ComMultiStatusInfoProto.commutistatus_info getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_commutistatus_info_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_commutistatus_info_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/iproto/mqtt/p0110_ComMultiStatu" +
      "sReport.proto\022\rgoogle.iproto\032.google/ipr" +
      "oto/mqtt/p0109_ComStatusReport.proto\"W\n\022" +
      "commutistatus_info\022\017\n\007home_id\030\001 \001(\005\0220\n\tc" +
      "omstatus\030\002 \003(\0132\035.google.iproto.comstatus" +
      "_infoB-\n\022google.iproto.mqttB\027ComMultiSta" +
      "tusInfoProtob\006proto3"
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
          google.iproto.mqtt.ComStatusInfoProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_commutistatus_info_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_commutistatus_info_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_commutistatus_info_descriptor,
        new java.lang.String[] { "HomeId", "Comstatus", });
    google.iproto.mqtt.ComStatusInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}