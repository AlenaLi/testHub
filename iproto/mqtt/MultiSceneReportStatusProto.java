// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0316_Scene_multireportstatus.proto

package google.iproto.mqtt;

public final class MultiSceneReportStatusProto {
  private MultiSceneReportStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface scene_multireportstatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.scene_multireportstatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    java.util.List<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus> 
        getSceneStatusList();
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus getSceneStatus(int index);
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    int getSceneStatusCount();
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    java.util.List<? extends google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder> 
        getSceneStatusOrBuilderList();
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder getSceneStatusOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 设备主动发送场景状态信息（通常在传感器或者按键操作后发送） 
   * </pre>
   *
   * Protobuf type {@code google.iproto.scene_multireportstatus}
   */
  public  static final class scene_multireportstatus extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.scene_multireportstatus)
      scene_multireportstatusOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use scene_multireportstatus.newBuilder() to construct.
    private scene_multireportstatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private scene_multireportstatus() {
      sceneStatus_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private scene_multireportstatus(
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
                sceneStatus_ = new java.util.ArrayList<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus>();
                mutable_bitField0_ |= 0x00000001;
              }
              sceneStatus_.add(
                  input.readMessage(google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.parser(), extensionRegistry));
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
          sceneStatus_ = java.util.Collections.unmodifiableList(sceneStatus_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.iproto.mqtt.MultiSceneReportStatusProto.internal_static_google_iproto_scene_multireportstatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.mqtt.MultiSceneReportStatusProto.internal_static_google_iproto_scene_multireportstatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus.class, google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus.Builder.class);
    }

    public static final int SCENE_STATUS_FIELD_NUMBER = 1;
    private java.util.List<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus> sceneStatus_;
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    public java.util.List<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus> getSceneStatusList() {
      return sceneStatus_;
    }
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    public java.util.List<? extends google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder> 
        getSceneStatusOrBuilderList() {
      return sceneStatus_;
    }
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    public int getSceneStatusCount() {
      return sceneStatus_.size();
    }
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    public google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus getSceneStatus(int index) {
      return sceneStatus_.get(index);
    }
    /**
     * <pre>
     *上报多个场景状态
     * </pre>
     *
     * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
     */
    public google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder getSceneStatusOrBuilder(
        int index) {
      return sceneStatus_.get(index);
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
      for (int i = 0; i < sceneStatus_.size(); i++) {
        output.writeMessage(1, sceneStatus_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < sceneStatus_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, sceneStatus_.get(i));
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
      if (!(obj instanceof google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus)) {
        return super.equals(obj);
      }
      google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus other = (google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus) obj;

      boolean result = true;
      result = result && getSceneStatusList()
          .equals(other.getSceneStatusList());
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
      if (getSceneStatusCount() > 0) {
        hash = (37 * hash) + SCENE_STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getSceneStatusList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parseFrom(
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
    public static Builder newBuilder(google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus prototype) {
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
     * 设备主动发送场景状态信息（通常在传感器或者按键操作后发送） 
     * </pre>
     *
     * Protobuf type {@code google.iproto.scene_multireportstatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.scene_multireportstatus)
        google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.mqtt.MultiSceneReportStatusProto.internal_static_google_iproto_scene_multireportstatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.mqtt.MultiSceneReportStatusProto.internal_static_google_iproto_scene_multireportstatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus.class, google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus.Builder.class);
      }

      // Construct using google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus.newBuilder()
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
          getSceneStatusFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (sceneStatusBuilder_ == null) {
          sceneStatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          sceneStatusBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.mqtt.MultiSceneReportStatusProto.internal_static_google_iproto_scene_multireportstatus_descriptor;
      }

      public google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus getDefaultInstanceForType() {
        return google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus.getDefaultInstance();
      }

      public google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus build() {
        google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus buildPartial() {
        google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus result = new google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus(this);
        int from_bitField0_ = bitField0_;
        if (sceneStatusBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            sceneStatus_ = java.util.Collections.unmodifiableList(sceneStatus_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.sceneStatus_ = sceneStatus_;
        } else {
          result.sceneStatus_ = sceneStatusBuilder_.build();
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
        if (other instanceof google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus) {
          return mergeFrom((google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus other) {
        if (other == google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus.getDefaultInstance()) return this;
        if (sceneStatusBuilder_ == null) {
          if (!other.sceneStatus_.isEmpty()) {
            if (sceneStatus_.isEmpty()) {
              sceneStatus_ = other.sceneStatus_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSceneStatusIsMutable();
              sceneStatus_.addAll(other.sceneStatus_);
            }
            onChanged();
          }
        } else {
          if (!other.sceneStatus_.isEmpty()) {
            if (sceneStatusBuilder_.isEmpty()) {
              sceneStatusBuilder_.dispose();
              sceneStatusBuilder_ = null;
              sceneStatus_ = other.sceneStatus_;
              bitField0_ = (bitField0_ & ~0x00000001);
              sceneStatusBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSceneStatusFieldBuilder() : null;
            } else {
              sceneStatusBuilder_.addAllMessages(other.sceneStatus_);
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
        google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus> sceneStatus_ =
        java.util.Collections.emptyList();
      private void ensureSceneStatusIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          sceneStatus_ = new java.util.ArrayList<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus>(sceneStatus_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder> sceneStatusBuilder_;

      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public java.util.List<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus> getSceneStatusList() {
        if (sceneStatusBuilder_ == null) {
          return java.util.Collections.unmodifiableList(sceneStatus_);
        } else {
          return sceneStatusBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public int getSceneStatusCount() {
        if (sceneStatusBuilder_ == null) {
          return sceneStatus_.size();
        } else {
          return sceneStatusBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus getSceneStatus(int index) {
        if (sceneStatusBuilder_ == null) {
          return sceneStatus_.get(index);
        } else {
          return sceneStatusBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder setSceneStatus(
          int index, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus value) {
        if (sceneStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneStatusIsMutable();
          sceneStatus_.set(index, value);
          onChanged();
        } else {
          sceneStatusBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder setSceneStatus(
          int index, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder builderForValue) {
        if (sceneStatusBuilder_ == null) {
          ensureSceneStatusIsMutable();
          sceneStatus_.set(index, builderForValue.build());
          onChanged();
        } else {
          sceneStatusBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder addSceneStatus(google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus value) {
        if (sceneStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneStatusIsMutable();
          sceneStatus_.add(value);
          onChanged();
        } else {
          sceneStatusBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder addSceneStatus(
          int index, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus value) {
        if (sceneStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneStatusIsMutable();
          sceneStatus_.add(index, value);
          onChanged();
        } else {
          sceneStatusBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder addSceneStatus(
          google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder builderForValue) {
        if (sceneStatusBuilder_ == null) {
          ensureSceneStatusIsMutable();
          sceneStatus_.add(builderForValue.build());
          onChanged();
        } else {
          sceneStatusBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder addSceneStatus(
          int index, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder builderForValue) {
        if (sceneStatusBuilder_ == null) {
          ensureSceneStatusIsMutable();
          sceneStatus_.add(index, builderForValue.build());
          onChanged();
        } else {
          sceneStatusBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder addAllSceneStatus(
          java.lang.Iterable<? extends google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus> values) {
        if (sceneStatusBuilder_ == null) {
          ensureSceneStatusIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, sceneStatus_);
          onChanged();
        } else {
          sceneStatusBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder clearSceneStatus() {
        if (sceneStatusBuilder_ == null) {
          sceneStatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          sceneStatusBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public Builder removeSceneStatus(int index) {
        if (sceneStatusBuilder_ == null) {
          ensureSceneStatusIsMutable();
          sceneStatus_.remove(index);
          onChanged();
        } else {
          sceneStatusBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder getSceneStatusBuilder(
          int index) {
        return getSceneStatusFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder getSceneStatusOrBuilder(
          int index) {
        if (sceneStatusBuilder_ == null) {
          return sceneStatus_.get(index);  } else {
          return sceneStatusBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public java.util.List<? extends google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder> 
           getSceneStatusOrBuilderList() {
        if (sceneStatusBuilder_ != null) {
          return sceneStatusBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(sceneStatus_);
        }
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder addSceneStatusBuilder() {
        return getSceneStatusFieldBuilder().addBuilder(
            google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.getDefaultInstance());
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder addSceneStatusBuilder(
          int index) {
        return getSceneStatusFieldBuilder().addBuilder(
            index, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.getDefaultInstance());
      }
      /**
       * <pre>
       *上报多个场景状态
       * </pre>
       *
       * <code>repeated .google.iproto.scene_reportstatus scene_status = 1;</code>
       */
      public java.util.List<google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder> 
           getSceneStatusBuilderList() {
        return getSceneStatusFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder> 
          getSceneStatusFieldBuilder() {
        if (sceneStatusBuilder_ == null) {
          sceneStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatus.Builder, google.iproto.mqtt.SceneReportStatusProto.scene_reportstatusOrBuilder>(
                  sceneStatus_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          sceneStatus_ = null;
        }
        return sceneStatusBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:google.iproto.scene_multireportstatus)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.scene_multireportstatus)
    private static final google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus();
    }

    public static google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<scene_multireportstatus>
        PARSER = new com.google.protobuf.AbstractParser<scene_multireportstatus>() {
      public scene_multireportstatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new scene_multireportstatus(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<scene_multireportstatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<scene_multireportstatus> getParserForType() {
      return PARSER;
    }

    public google.iproto.mqtt.MultiSceneReportStatusProto.scene_multireportstatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_scene_multireportstatus_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_scene_multireportstatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/iproto/mqtt/p0316_Scene_multire" +
      "portstatus.proto\022\rgoogle.iproto\0321google/" +
      "iproto/mqtt/p0313_Scene_reportstatus.pro" +
      "to\"R\n\027scene_multireportstatus\0227\n\014scene_s" +
      "tatus\030\001 \003(\0132!.google.iproto.scene_report" +
      "statusB1\n\022google.iproto.mqttB\033MultiScene" +
      "ReportStatusProtob\006proto3"
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
          google.iproto.mqtt.SceneReportStatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_iproto_scene_multireportstatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_scene_multireportstatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_scene_multireportstatus_descriptor,
        new java.lang.String[] { "SceneStatus", });
    google.iproto.mqtt.SceneReportStatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}