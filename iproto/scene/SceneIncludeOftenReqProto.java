// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/scene/SceneIncludeOftenReq.proto

package google.iproto.scene;

public final class SceneIncludeOftenReqProto {
  private SceneIncludeOftenReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneIncludeOftenReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.iproto.SceneIncludeOftenReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 sceneid = 1;</code>
     */
    int getSceneid();

    /**
     * <code>bool select = 2;</code>
     */
    boolean getSelect();
  }
  /**
   * <pre>
   *包含到常用场景
   * </pre>
   *
   * Protobuf type {@code google.iproto.SceneIncludeOftenReq}
   */
  public  static final class SceneIncludeOftenReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.iproto.SceneIncludeOftenReq)
      SceneIncludeOftenReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneIncludeOftenReq.newBuilder() to construct.
    private SceneIncludeOftenReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneIncludeOftenReq() {
      sceneid_ = 0;
      select_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneIncludeOftenReq(
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

              sceneid_ = input.readInt32();
              break;
            }
            case 16: {

              select_ = input.readBool();
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
      return google.iproto.scene.SceneIncludeOftenReqProto.internal_static_google_iproto_SceneIncludeOftenReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.iproto.scene.SceneIncludeOftenReqProto.internal_static_google_iproto_SceneIncludeOftenReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq.class, google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq.Builder.class);
    }

    public static final int SCENEID_FIELD_NUMBER = 1;
    private int sceneid_;
    /**
     * <code>int32 sceneid = 1;</code>
     */
    public int getSceneid() {
      return sceneid_;
    }

    public static final int SELECT_FIELD_NUMBER = 2;
    private boolean select_;
    /**
     * <code>bool select = 2;</code>
     */
    public boolean getSelect() {
      return select_;
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
      if (sceneid_ != 0) {
        output.writeInt32(1, sceneid_);
      }
      if (select_ != false) {
        output.writeBool(2, select_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, sceneid_);
      }
      if (select_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, select_);
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
      if (!(obj instanceof google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq)) {
        return super.equals(obj);
      }
      google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq other = (google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq) obj;

      boolean result = true;
      result = result && (getSceneid()
          == other.getSceneid());
      result = result && (getSelect()
          == other.getSelect());
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
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneid();
      hash = (37 * hash) + SELECT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSelect());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parseFrom(
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
    public static Builder newBuilder(google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq prototype) {
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
     *包含到常用场景
     * </pre>
     *
     * Protobuf type {@code google.iproto.SceneIncludeOftenReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.iproto.SceneIncludeOftenReq)
        google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.iproto.scene.SceneIncludeOftenReqProto.internal_static_google_iproto_SceneIncludeOftenReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.iproto.scene.SceneIncludeOftenReqProto.internal_static_google_iproto_SceneIncludeOftenReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq.class, google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq.Builder.class);
      }

      // Construct using google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq.newBuilder()
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
        sceneid_ = 0;

        select_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.iproto.scene.SceneIncludeOftenReqProto.internal_static_google_iproto_SceneIncludeOftenReq_descriptor;
      }

      public google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq getDefaultInstanceForType() {
        return google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq.getDefaultInstance();
      }

      public google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq build() {
        google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq buildPartial() {
        google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq result = new google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq(this);
        result.sceneid_ = sceneid_;
        result.select_ = select_;
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
        if (other instanceof google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq) {
          return mergeFrom((google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq other) {
        if (other == google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq.getDefaultInstance()) return this;
        if (other.getSceneid() != 0) {
          setSceneid(other.getSceneid());
        }
        if (other.getSelect() != false) {
          setSelect(other.getSelect());
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
        google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneid_ ;
      /**
       * <code>int32 sceneid = 1;</code>
       */
      public int getSceneid() {
        return sceneid_;
      }
      /**
       * <code>int32 sceneid = 1;</code>
       */
      public Builder setSceneid(int value) {
        
        sceneid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sceneid = 1;</code>
       */
      public Builder clearSceneid() {
        
        sceneid_ = 0;
        onChanged();
        return this;
      }

      private boolean select_ ;
      /**
       * <code>bool select = 2;</code>
       */
      public boolean getSelect() {
        return select_;
      }
      /**
       * <code>bool select = 2;</code>
       */
      public Builder setSelect(boolean value) {
        
        select_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool select = 2;</code>
       */
      public Builder clearSelect() {
        
        select_ = false;
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


      // @@protoc_insertion_point(builder_scope:google.iproto.SceneIncludeOftenReq)
    }

    // @@protoc_insertion_point(class_scope:google.iproto.SceneIncludeOftenReq)
    private static final google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq();
    }

    public static google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneIncludeOftenReq>
        PARSER = new com.google.protobuf.AbstractParser<SceneIncludeOftenReq>() {
      public SceneIncludeOftenReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneIncludeOftenReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneIncludeOftenReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneIncludeOftenReq> getParserForType() {
      return PARSER;
    }

    public google.iproto.scene.SceneIncludeOftenReqProto.SceneIncludeOftenReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iproto_SceneIncludeOftenReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iproto_SceneIncludeOftenReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/iproto/scene/SceneIncludeOftenR" +
      "eq.proto\022\rgoogle.iproto\"7\n\024SceneIncludeO" +
      "ftenReq\022\017\n\007sceneid\030\001 \001(\005\022\016\n\006select\030\002 \001(\010" +
      "B0\n\023google.iproto.sceneB\031SceneIncludeOft" +
      "enReqProtob\006proto3"
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
    internal_static_google_iproto_SceneIncludeOftenReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iproto_SceneIncludeOftenReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iproto_SceneIncludeOftenReq_descriptor,
        new java.lang.String[] { "Sceneid", "Select", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
