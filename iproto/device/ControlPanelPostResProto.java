// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/device/ControlPanelPostRes.proto

package google.iproto.device;

public final class ControlPanelPostResProto {
  private ControlPanelPostResProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ControlPanelPostResOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.ControlPanelPostRes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *ID数据 除了场景都要返回ID给我
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    int getId();
  }
  /**
   * Protobuf type {@code google.iproto.ControlPanelPostRes}
   */
  public  static final class ControlPanelPostRes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.ControlPanelPostRes)
      ControlPanelPostResOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ControlPanelPostRes.newBuilder() to construct.
    private ControlPanelPostRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ControlPanelPostRes() {
      id_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ControlPanelPostRes(
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

              id_ = input.readInt32();
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
      return google.iproto.device.ControlPanelPostResProto.internal_static_google_iproto_ControlPanelPostRes_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.device.ControlPanelPostResProto.internal_static_google_iproto_ControlPanelPostRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes.class, google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <pre>
     *ID数据 除了场景都要返回ID给我
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
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
      if (!(obj instanceof google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes)) {
        return super.equals(obj);
      }
      google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes other = (google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parseFrom(
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
    public static Builder newBuilder(google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes prototype) {
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
     * Protobuf type {@code google.iproto.ControlPanelPostRes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.ControlPanelPostRes)
        google.iproto.device.ControlPanelPostResProto.ControlPanelPostResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.device.ControlPanelPostResProto.internal_static_google_iproto_ControlPanelPostRes_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.device.ControlPanelPostResProto.internal_static_google_iproto_ControlPanelPostRes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes.class, google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes.Builder.class);
      }

      // Construct using google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes.newBuilder()
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
        id_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.device.ControlPanelPostResProto.internal_static_google_iproto_ControlPanelPostRes_descriptor;
      }

      public google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes getDefaultInstanceForType() {
        return google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes.getDefaultInstance();
      }

      public google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes build() {
        google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes buildPartial() {
        google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes result = new google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes(this);
        result.id_ = id_;
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
        if (other instanceof google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes) {
          return mergeFrom((google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes other) {
        if (other == google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
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
        google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <pre>
       *ID数据 除了场景都要返回ID给我
       * </pre>
       *
       * <code>int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <pre>
       *ID数据 除了场景都要返回ID给我
       * </pre>
       *
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *ID数据 除了场景都要返回ID给我
       * </pre>
       *
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.ControlPanelPostRes)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.ControlPanelPostRes)
    private static final google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes();
    }

    public static google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ControlPanelPostRes>
        PARSER = new com.google.protobuf.AbstractParser<ControlPanelPostRes>() {
      public ControlPanelPostRes parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ControlPanelPostRes(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ControlPanelPostRes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ControlPanelPostRes> getParserForType() {
      return PARSER;
    }

    public google.iproto.device.ControlPanelPostResProto.ControlPanelPostRes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_ControlPanelPostRes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_ControlPanelPostRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/iproto/device/ControlPanelPostR" +
      "es.proto\022\rgoogle.iproto\"!\n\023ControlPanelP" +
      "ostRes\022\n\n\002id\030\001 \001(\005B0\n\024google.iproto.devi" +
      "ceB\030ControlPanelPostResProtob\006proto3"
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
    internal_static_google_iproto_ControlPanelPostRes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_ControlPanelPostRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_ControlPanelPostRes_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
