// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Housing.proto

package via.sep3.group11.tier2.protobuf;

public final class HousingOuterClass {
  private HousingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GAddHousingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GAddHousingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListOfAvailableHousing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListOfAvailableHousing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rHousing.proto\032\024SharedMessages.proto\"?\n" +
      "\022GAddHousingRequest\022\032\n\007housing\030\001 \001(\0132\t.G" +
      "Housing\022\r\n\005email\030\002 \001(\t\"5\n\026ListOfAvailabl" +
      "eHousing\022\033\n\010housings\030\001 \003(\0132\t.GHousing\"\007\n" +
      "\005Empty2\216\001\n\007Housing\022,\n\naddHousing\022\023.GAddH" +
      "ousingRequest\032\t.GHousing\0226\n\023getAvailable" +
      "Housing\022\006.Empty\032\027.ListOfAvailableHousing" +
      "\022\035\n\rremoveHousing\022\004.GId\032\006.EmptyB#\n\037via.s" +
      "ep3.group11.tier2.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          via.sep3.group11.tier2.protobuf.SharedMessages.getDescriptor(),
        });
    internal_static_GAddHousingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GAddHousingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GAddHousingRequest_descriptor,
        new java.lang.String[] { "Housing", "Email", });
    internal_static_ListOfAvailableHousing_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ListOfAvailableHousing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListOfAvailableHousing_descriptor,
        new java.lang.String[] { "Housings", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    via.sep3.group11.tier2.protobuf.SharedMessages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
