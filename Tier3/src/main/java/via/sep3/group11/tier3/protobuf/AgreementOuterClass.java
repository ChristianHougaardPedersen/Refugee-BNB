// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Agreement.proto

package via.sep3.group11.tier3.protobuf;

public final class AgreementOuterClass {
  private AgreementOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getAllPendingAgreementsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getAllPendingAgreementsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Agreement.proto\032\024SharedMessages.proto\"" +
      "B\n\037getAllPendingAgreementsResponse\022\037\n\nag" +
      "reements\030\001 \003(\0132\013.GAgreement2\371\002\n\tAgreemen" +
      "t\022(\n\014addAgreement\022\013.GAgreement\032\013.GAgreem" +
      "ent\022+\n\017updateAgreement\022\013.GAgreement\032\013.GA" +
      "greement\022%\n\020getAgreementById\022\004.GId\032\013.GAg" +
      "reement\022A\n\024getAgreementByHostId\022\007.GEmail" +
      "\032 .getAllPendingAgreementsResponse\022\037\n\017de" +
      "leteAgreement\022\004.GId\032\006.Empty\022D\n\027getAllPen" +
      "dingAgreements\022\007.GEmail\032 .getAllPendingA" +
      "greementsResponse\022D\n\032getAllAgreementByHo" +
      "usingId\022\004.GId\032 .getAllPendingAgreementsR" +
      "esponseB#\n\037via.sep3.group11.tier3.protob" +
      "ufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          via.sep3.group11.tier3.protobuf.SharedMessages.getDescriptor(),
        });
    internal_static_getAllPendingAgreementsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_getAllPendingAgreementsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getAllPendingAgreementsResponse_descriptor,
        new java.lang.String[] { "Agreements", });
    via.sep3.group11.tier3.protobuf.SharedMessages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
