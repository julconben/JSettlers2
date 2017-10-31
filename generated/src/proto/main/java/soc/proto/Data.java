// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package soc.proto;

public final class Data {
  private Data() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * <pre>
   * Structs here are suffixed "Data" since we eventually want them used in the java code. Many struct names will then get
   *the same name as its OO counterparts. As in Java OO is central, I choose to suffix the data.
   * </pre>
   *
   * Protobuf enum {@code ResourceType}
   */
  public enum ResourceType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * For now, we're still tied to the integer values. Therefore I want the values to be the same as we currently use
     * them until the integer dependencies are refactored out.
     * </pre>
     *
     * <code>NOT_YET_USED = 0;</code>
     */
    NOT_YET_USED(0),
    /**
     * <code>CLAY = 1;</code>
     */
    CLAY(1),
    /**
     * <code>ORE = 2;</code>
     */
    ORE(2),
    /**
     * <code>SHEEP = 3;</code>
     */
    SHEEP(3),
    /**
     * <code>WHEAT = 4;</code>
     */
    WHEAT(4),
    /**
     * <code>WOOD = 5;</code>
     */
    WOOD(5),
    /**
     * <pre>
     * TODO: shares a slot with GOLD in some instances
     * </pre>
     *
     * <code>UNKNOWN = 6;</code>
     */
    UNKNOWN(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * For now, we're still tied to the integer values. Therefore I want the values to be the same as we currently use
     * them until the integer dependencies are refactored out.
     * </pre>
     *
     * <code>NOT_YET_USED = 0;</code>
     */
    public static final int NOT_YET_USED_VALUE = 0;
    /**
     * <code>CLAY = 1;</code>
     */
    public static final int CLAY_VALUE = 1;
    /**
     * <code>ORE = 2;</code>
     */
    public static final int ORE_VALUE = 2;
    /**
     * <code>SHEEP = 3;</code>
     */
    public static final int SHEEP_VALUE = 3;
    /**
     * <code>WHEAT = 4;</code>
     */
    public static final int WHEAT_VALUE = 4;
    /**
     * <code>WOOD = 5;</code>
     */
    public static final int WOOD_VALUE = 5;
    /**
     * <pre>
     * TODO: shares a slot with GOLD in some instances
     * </pre>
     *
     * <code>UNKNOWN = 6;</code>
     */
    public static final int UNKNOWN_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResourceType valueOf(int value) {
      return forNumber(value);
    }

    public static ResourceType forNumber(int value) {
      switch (value) {
        case 0: return NOT_YET_USED;
        case 1: return CLAY;
        case 2: return ORE;
        case 3: return SHEEP;
        case 4: return WHEAT;
        case 5: return WOOD;
        case 6: return UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResourceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
            public ResourceType findValueByNumber(int number) {
              return ResourceType.forNumber(number);
            }
          };

    private final int value;

    private ResourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ResourceType)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}