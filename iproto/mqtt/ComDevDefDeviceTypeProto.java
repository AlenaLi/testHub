// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iproto/mqtt/p0101_ComDevDef_devicetype.proto

package google.iproto.mqtt;

public final class ComDevDefDeviceTypeProto {
  private ComDevDefDeviceTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 定义设备类型
   * </pre>
   *
   * Protobuf enum {@code google.iproto.device_type}
   */
  public enum device_type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * </pre>
     *
     * <code>devtype_release = 0;</code>
     */
    devtype_release(0),
    /**
     * <pre>
     *CtrlPad
     * </pre>
     *
     * <code>devtype_ctrlpad = 544;</code>
     */
    devtype_ctrlpad(544),
    /**
     * <pre>
     *SYSLED
     * </pre>
     *
     * <code>devtype_daliledlights = 545;</code>
     */
    devtype_daliledlights(545),
    /**
     * <pre>
     *Curtain
     * </pre>
     *
     * <code>devtype_433curtain = 769;</code>
     */
    devtype_433curtain(769),
    /**
     * <pre>
     *USRLED
     * </pre>
     *
     * <code>devtype_433lights = 770;</code>
     */
    devtype_433lights(770),
    /**
     * <pre>
     *DoorMagic 门磁
     * </pre>
     *
     * <code>devtype_433doormagic = 771;</code>
     */
    devtype_433doormagic(771),
    /**
     * <pre>
     *MvPad1
     * </pre>
     *
     * <code>devtype_433moveswitch1 = 772;</code>
     */
    devtype_433moveswitch1(772),
    /**
     * <pre>
     *MvPad2
     * </pre>
     *
     * <code>devtype_433moveswitch2 = 773;</code>
     */
    devtype_433moveswitch2(773),
    /**
     * <pre>
     *MvPad3
     * </pre>
     *
     * <code>devtype_433moveswitch3 = 774;</code>
     */
    devtype_433moveswitch3(774),
    /**
     * <pre>
     *MvPad4
     * </pre>
     *
     * <code>devtype_433moveswitch4 = 775;</code>
     */
    devtype_433moveswitch4(775),
    /**
     * <pre>
     *Antithft 安防
     * </pre>
     *
     * <code>devtype_433antitheft = 776;</code>
     */
    devtype_433antitheft(776),
    /**
     * <pre>
     *SceneSensor
     * </pre>
     *
     * <code>devtype_433scenesensor = 777;</code>
     */
    devtype_433scenesensor(777),
    /**
     * <pre>
     *用户自定义设备
     * </pre>
     *
     * <code>devtype_433usrdefdev = 778;</code>
     */
    devtype_433usrdefdev(778),
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>devtype_centeraircondition = 641;</code>
     */
    devtype_centeraircondition(641),
    /**
     * <pre>
     *Scene To Control
     * </pre>
     *
     * <code>devtype_scene = 5;</code>
     */
    devtype_scene(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * </pre>
     *
     * <code>devtype_release = 0;</code>
     */
    public static final int devtype_release_VALUE = 0;
    /**
     * <pre>
     *CtrlPad
     * </pre>
     *
     * <code>devtype_ctrlpad = 544;</code>
     */
    public static final int devtype_ctrlpad_VALUE = 544;
    /**
     * <pre>
     *SYSLED
     * </pre>
     *
     * <code>devtype_daliledlights = 545;</code>
     */
    public static final int devtype_daliledlights_VALUE = 545;
    /**
     * <pre>
     *Curtain
     * </pre>
     *
     * <code>devtype_433curtain = 769;</code>
     */
    public static final int devtype_433curtain_VALUE = 769;
    /**
     * <pre>
     *USRLED
     * </pre>
     *
     * <code>devtype_433lights = 770;</code>
     */
    public static final int devtype_433lights_VALUE = 770;
    /**
     * <pre>
     *DoorMagic 门磁
     * </pre>
     *
     * <code>devtype_433doormagic = 771;</code>
     */
    public static final int devtype_433doormagic_VALUE = 771;
    /**
     * <pre>
     *MvPad1
     * </pre>
     *
     * <code>devtype_433moveswitch1 = 772;</code>
     */
    public static final int devtype_433moveswitch1_VALUE = 772;
    /**
     * <pre>
     *MvPad2
     * </pre>
     *
     * <code>devtype_433moveswitch2 = 773;</code>
     */
    public static final int devtype_433moveswitch2_VALUE = 773;
    /**
     * <pre>
     *MvPad3
     * </pre>
     *
     * <code>devtype_433moveswitch3 = 774;</code>
     */
    public static final int devtype_433moveswitch3_VALUE = 774;
    /**
     * <pre>
     *MvPad4
     * </pre>
     *
     * <code>devtype_433moveswitch4 = 775;</code>
     */
    public static final int devtype_433moveswitch4_VALUE = 775;
    /**
     * <pre>
     *Antithft 安防
     * </pre>
     *
     * <code>devtype_433antitheft = 776;</code>
     */
    public static final int devtype_433antitheft_VALUE = 776;
    /**
     * <pre>
     *SceneSensor
     * </pre>
     *
     * <code>devtype_433scenesensor = 777;</code>
     */
    public static final int devtype_433scenesensor_VALUE = 777;
    /**
     * <pre>
     *用户自定义设备
     * </pre>
     *
     * <code>devtype_433usrdefdev = 778;</code>
     */
    public static final int devtype_433usrdefdev_VALUE = 778;
    /**
     * <pre>
     *中央空调
     * </pre>
     *
     * <code>devtype_centeraircondition = 641;</code>
     */
    public static final int devtype_centeraircondition_VALUE = 641;
    /**
     * <pre>
     *Scene To Control
     * </pre>
     *
     * <code>devtype_scene = 5;</code>
     */
    public static final int devtype_scene_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static device_type valueOf(int value) {
      return forNumber(value);
    }

    public static device_type forNumber(int value) {
      switch (value) {
        case 0: return devtype_release;
        case 544: return devtype_ctrlpad;
        case 545: return devtype_daliledlights;
        case 769: return devtype_433curtain;
        case 770: return devtype_433lights;
        case 771: return devtype_433doormagic;
        case 772: return devtype_433moveswitch1;
        case 773: return devtype_433moveswitch2;
        case 774: return devtype_433moveswitch3;
        case 775: return devtype_433moveswitch4;
        case 776: return devtype_433antitheft;
        case 777: return devtype_433scenesensor;
        case 778: return devtype_433usrdefdev;
        case 641: return devtype_centeraircondition;
        case 5: return devtype_scene;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<device_type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        device_type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<device_type>() {
            public device_type findValueByNumber(int number) {
              return device_type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return google.iproto.mqtt.ComDevDefDeviceTypeProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final device_type[] VALUES = values();

    public static device_type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private device_type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.iproto.device_type)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/iproto/mqtt/p0101_ComDevDef_dev" +
      "icetype.proto\022\rgoogle.iproto*\233\003\n\013device_" +
      "type\022\023\n\017devtype_release\020\000\022\024\n\017devtype_ctr" +
      "lpad\020\240\004\022\032\n\025devtype_daliledlights\020\241\004\022\027\n\022d" +
      "evtype_433curtain\020\201\006\022\026\n\021devtype_433light" +
      "s\020\202\006\022\031\n\024devtype_433doormagic\020\203\006\022\033\n\026devty" +
      "pe_433moveswitch1\020\204\006\022\033\n\026devtype_433moves" +
      "witch2\020\205\006\022\033\n\026devtype_433moveswitch3\020\206\006\022\033" +
      "\n\026devtype_433moveswitch4\020\207\006\022\031\n\024devtype_4" +
      "33antitheft\020\210\006\022\033\n\026devtype_433scenesensor" +
      "\020\211\006\022\031\n\024devtype_433usrdefdev\020\212\006\022\037\n\032devtyp" +
      "e_centeraircondition\020\201\005\022\021\n\rdevtype_scene" +
      "\020\005B.\n\022google.iproto.mqttB\030ComDevDefDevic" +
      "eTypeProtob\006proto3"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}