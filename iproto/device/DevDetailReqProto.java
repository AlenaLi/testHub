// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/device/DevDetailReq.proto

package google.iproto.device;

public final class DevDetailReqProto {
  private DevDetailReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DevDetailReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.DevDetailReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *ID
     * </pre>
     *
     * <code>int32 devid = 1;</code>
     */
    int getDevid();
  }
  /**
   * <pre>
   *设备详细信息
   * </pre>
   *
   * Protobuf type {@code google.iproto.DevDetailReq}
   */
  public  static final class DevDetailReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.DevDetailReq)
      DevDetailReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DevDetailReq.newBuilder() to construct.
    private DevDetailReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DevDetailReq() {
      devid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DevDetailReq(
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

              devid_ = input.readInt32();
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
      return google.iproto.device.DevDetailReqProto.internal_static_google_iproto_DevDetailReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.device.DevDetailReqProto.internal_static_google_iproto_DevDetailReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.device.DevDetailReqProto.DevDetailReq.class, google.iproto.device.DevDetailReqProto.DevDetailReq.Builder.class);
    }

    public static final int DEVID_FIELD_NUMBER = 1;
    private int devid_;
    /**
     * <pre>
     *ID
     * </pre>
     *
     * <code>int32 devid = 1;</code>
     */
    public int getDevid() {
      return devid_;
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
      if (devid_ != 0) {
        output.writeInt32(1, devid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (devid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, devid_);
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
      if (!(obj instanceof google.iproto.device.DevDetailReqProto.DevDetailReq)) {
        return super.equals(obj);
      }
      google.iproto.device.DevDetailReqProto.DevDetailReq other = (google.iproto.device.DevDetailReqProto.DevDetailReq) obj;

      boolean result = true;
      result = result && (getDevid()
          == other.getDevid());
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
      hash = (37 * hash) + DEVID_FIELD_NUMBER;
      hash = (53 * hash) + getDevid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.device.DevDetailReqProto.DevDetailReq parseFrom(
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
    public static Builder newBuilder(google.iproto.device.DevDetailReqProto.DevDetailReq prototype) {
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
     *设备详细信息
     * </pre>
     *
     * Protobuf type {@code google.iproto.DevDetailReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.DevDetailReq)
        google.iproto.device.DevDetailReqProto.DevDetailReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.device.DevDetailReqProto.internal_static_google_iproto_DevDetailReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.device.DevDetailReqProto.internal_static_google_iproto_DevDetailReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.device.DevDetailReqProto.DevDetailReq.class, google.iproto.device.DevDetailReqProto.DevDetailReq.Builder.class);
      }

      // Construct using google.iproto.device.DevDetailReqProto.DevDetailReq.newBuilder()
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
        devid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.device.DevDetailReqProto.internal_static_google_iproto_DevDetailReq_descriptor;
      }

      public google.iproto.device.DevDetailReqProto.DevDetailReq getDefaultInstanceForType() {
        return google.iproto.device.DevDetailReqProto.DevDetailReq.getDefaultInstance();
      }

      public google.iproto.device.DevDetailReqProto.DevDetailReq build() {
        google.iproto.device.DevDetailReqProto.DevDetailReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.device.DevDetailReqProto.DevDetailReq buildPartial() {
        google.iproto.device.DevDetailReqProto.DevDetailReq result = new google.iproto.device.DevDetailReqProto.DevDetailReq(this);
        result.devid_ = devid_;
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
        if (other instanceof google.iproto.device.DevDetailReqProto.DevDetailReq) {
          return mergeFrom((google.iproto.device.DevDetailReqProto.DevDetailReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.device.DevDetailReqProto.DevDetailReq other) {
        if (other == google.iproto.device.DevDetailReqProto.DevDetailReq.getDefaultInstance()) return this;
        if (other.getDevid() != 0) {
          setDevid(other.getDevid());
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
        google.iproto.device.DevDetailReqProto.DevDetailReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.device.DevDetailReqProto.DevDetailReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int devid_ ;
      /**
       * <pre>
       *ID
       * </pre>
       *
       * <code>int32 devid = 1;</code>
       */
      public int getDevid() {
        return devid_;
      }
      /**
       * <pre>
       *ID
       * </pre>
       *
       * <code>int32 devid = 1;</code>
       */
      public Builder setDevid(int value) {
        
        devid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *ID
       * </pre>
       *
       * <code>int32 devid = 1;</code>
       */
      public Builder clearDevid() {
        
        devid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.DevDetailReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.DevDetailReq)
    private static final google.iproto.device.DevDetailReqProto.DevDetailReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.device.DevDetailReqProto.DevDetailReq();
    }

    public static google.iproto.device.DevDetailReqProto.DevDetailReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DevDetailReq>
        PARSER = new com.google.protobuf.AbstractParser<DevDetailReq>() {
      public DevDetailReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DevDetailReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DevDetailReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DevDetailReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.device.DevDetailReqProto.DevDetailReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_DevDetailReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_DevDetailReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/iproto/device/DevDetailReq.prot" +
      "o\022\rgoogle.iproto\"\035\n\014DevDetailReq\022\r\n\005devi" +
      "d\030\001 \001(\005B)\n\024google.iproto.deviceB\021DevDeta" +
      "ilReqProtob\006proto3"
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
    internal_static_google_iproto_DevDetailReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_DevDetailReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_DevDetailReq_descriptor,
        new java.lang.String[] { "Devid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
