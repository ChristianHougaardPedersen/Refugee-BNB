// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SharedMessages.proto

package via.sep3.group11.tier2.protobuf;

/**
 * Protobuf type {@code GHousingWithStatus}
 */
public final class GHousingWithStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GHousingWithStatus)
    GHousingWithStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GHousingWithStatus.newBuilder() to construct.
  private GHousingWithStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GHousingWithStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GHousingWithStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GHousingWithStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            capacity_ = input.readInt32();
            break;
          }
          case 18: {
            via.sep3.group11.tier2.protobuf.GAddress.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(via.sep3.group11.tier2.protobuf.GAddress.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            id_ = input.readInt64();
            break;
          }
          case 32: {

            available_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return via.sep3.group11.tier2.protobuf.SharedMessages.internal_static_GHousingWithStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.group11.tier2.protobuf.SharedMessages.internal_static_GHousingWithStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.group11.tier2.protobuf.GHousingWithStatus.class, via.sep3.group11.tier2.protobuf.GHousingWithStatus.Builder.class);
  }

  public static final int CAPACITY_FIELD_NUMBER = 1;
  private int capacity_;
  /**
   * <code>int32 capacity = 1;</code>
   * @return The capacity.
   */
  @java.lang.Override
  public int getCapacity() {
    return capacity_;
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  private via.sep3.group11.tier2.protobuf.GAddress address_;
  /**
   * <code>.GAddress address = 2;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.GAddress address = 2;</code>
   * @return The address.
   */
  @java.lang.Override
  public via.sep3.group11.tier2.protobuf.GAddress getAddress() {
    return address_ == null ? via.sep3.group11.tier2.protobuf.GAddress.getDefaultInstance() : address_;
  }
  /**
   * <code>.GAddress address = 2;</code>
   */
  @java.lang.Override
  public via.sep3.group11.tier2.protobuf.GAddressOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int ID_FIELD_NUMBER = 3;
  private long id_;
  /**
   * <code>int64 id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int AVAILABLE_FIELD_NUMBER = 4;
  private boolean available_;
  /**
   * <code>bool available = 4;</code>
   * @return The available.
   */
  @java.lang.Override
  public boolean getAvailable() {
    return available_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (capacity_ != 0) {
      output.writeInt32(1, capacity_);
    }
    if (address_ != null) {
      output.writeMessage(2, getAddress());
    }
    if (id_ != 0L) {
      output.writeInt64(3, id_);
    }
    if (available_ != false) {
      output.writeBool(4, available_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (capacity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, capacity_);
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAddress());
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, id_);
    }
    if (available_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, available_);
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
    if (!(obj instanceof via.sep3.group11.tier2.protobuf.GHousingWithStatus)) {
      return super.equals(obj);
    }
    via.sep3.group11.tier2.protobuf.GHousingWithStatus other = (via.sep3.group11.tier2.protobuf.GHousingWithStatus) obj;

    if (getCapacity()
        != other.getCapacity()) return false;
    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (getId()
        != other.getId()) return false;
    if (getAvailable()
        != other.getAvailable()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CAPACITY_FIELD_NUMBER;
    hash = (53 * hash) + getCapacity();
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + AVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAvailable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sep3.group11.tier2.protobuf.GHousingWithStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code GHousingWithStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GHousingWithStatus)
      via.sep3.group11.tier2.protobuf.GHousingWithStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.group11.tier2.protobuf.SharedMessages.internal_static_GHousingWithStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.group11.tier2.protobuf.SharedMessages.internal_static_GHousingWithStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.group11.tier2.protobuf.GHousingWithStatus.class, via.sep3.group11.tier2.protobuf.GHousingWithStatus.Builder.class);
    }

    // Construct using via.sep3.group11.tier2.protobuf.GHousingWithStatus.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      capacity_ = 0;

      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      id_ = 0L;

      available_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.group11.tier2.protobuf.SharedMessages.internal_static_GHousingWithStatus_descriptor;
    }

    @java.lang.Override
    public via.sep3.group11.tier2.protobuf.GHousingWithStatus getDefaultInstanceForType() {
      return via.sep3.group11.tier2.protobuf.GHousingWithStatus.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.group11.tier2.protobuf.GHousingWithStatus build() {
      via.sep3.group11.tier2.protobuf.GHousingWithStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.group11.tier2.protobuf.GHousingWithStatus buildPartial() {
      via.sep3.group11.tier2.protobuf.GHousingWithStatus result = new via.sep3.group11.tier2.protobuf.GHousingWithStatus(this);
      result.capacity_ = capacity_;
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.id_ = id_;
      result.available_ = available_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sep3.group11.tier2.protobuf.GHousingWithStatus) {
        return mergeFrom((via.sep3.group11.tier2.protobuf.GHousingWithStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.group11.tier2.protobuf.GHousingWithStatus other) {
      if (other == via.sep3.group11.tier2.protobuf.GHousingWithStatus.getDefaultInstance()) return this;
      if (other.getCapacity() != 0) {
        setCapacity(other.getCapacity());
      }
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getAvailable() != false) {
        setAvailable(other.getAvailable());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sep3.group11.tier2.protobuf.GHousingWithStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.group11.tier2.protobuf.GHousingWithStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int capacity_ ;
    /**
     * <code>int32 capacity = 1;</code>
     * @return The capacity.
     */
    @java.lang.Override
    public int getCapacity() {
      return capacity_;
    }
    /**
     * <code>int32 capacity = 1;</code>
     * @param value The capacity to set.
     * @return This builder for chaining.
     */
    public Builder setCapacity(int value) {
      
      capacity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 capacity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCapacity() {
      
      capacity_ = 0;
      onChanged();
      return this;
    }

    private via.sep3.group11.tier2.protobuf.GAddress address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.group11.tier2.protobuf.GAddress, via.sep3.group11.tier2.protobuf.GAddress.Builder, via.sep3.group11.tier2.protobuf.GAddressOrBuilder> addressBuilder_;
    /**
     * <code>.GAddress address = 2;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.GAddress address = 2;</code>
     * @return The address.
     */
    public via.sep3.group11.tier2.protobuf.GAddress getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? via.sep3.group11.tier2.protobuf.GAddress.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.GAddress address = 2;</code>
     */
    public Builder setAddress(via.sep3.group11.tier2.protobuf.GAddress value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.GAddress address = 2;</code>
     */
    public Builder setAddress(
        via.sep3.group11.tier2.protobuf.GAddress.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.GAddress address = 2;</code>
     */
    public Builder mergeAddress(via.sep3.group11.tier2.protobuf.GAddress value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            via.sep3.group11.tier2.protobuf.GAddress.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.GAddress address = 2;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.GAddress address = 2;</code>
     */
    public via.sep3.group11.tier2.protobuf.GAddress.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.GAddress address = 2;</code>
     */
    public via.sep3.group11.tier2.protobuf.GAddressOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            via.sep3.group11.tier2.protobuf.GAddress.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.GAddress address = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.group11.tier2.protobuf.GAddress, via.sep3.group11.tier2.protobuf.GAddress.Builder, via.sep3.group11.tier2.protobuf.GAddressOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            via.sep3.group11.tier2.protobuf.GAddress, via.sep3.group11.tier2.protobuf.GAddress.Builder, via.sep3.group11.tier2.protobuf.GAddressOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private long id_ ;
    /**
     * <code>int64 id = 3;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private boolean available_ ;
    /**
     * <code>bool available = 4;</code>
     * @return The available.
     */
    @java.lang.Override
    public boolean getAvailable() {
      return available_;
    }
    /**
     * <code>bool available = 4;</code>
     * @param value The available to set.
     * @return This builder for chaining.
     */
    public Builder setAvailable(boolean value) {
      
      available_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool available = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailable() {
      
      available_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GHousingWithStatus)
  }

  // @@protoc_insertion_point(class_scope:GHousingWithStatus)
  private static final via.sep3.group11.tier2.protobuf.GHousingWithStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.group11.tier2.protobuf.GHousingWithStatus();
  }

  public static via.sep3.group11.tier2.protobuf.GHousingWithStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GHousingWithStatus>
      PARSER = new com.google.protobuf.AbstractParser<GHousingWithStatus>() {
    @java.lang.Override
    public GHousingWithStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GHousingWithStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GHousingWithStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GHousingWithStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.group11.tier2.protobuf.GHousingWithStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

