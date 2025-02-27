/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Settings specific to keys that can be used by iOS apps.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.IOSKeySettings}
 */
public final class IOSKeySettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.IOSKeySettings)
    IOSKeySettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IOSKeySettings.newBuilder() to construct.
  private IOSKeySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IOSKeySettings() {
    allowedBundleIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IOSKeySettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private IOSKeySettings(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                allowedBundleIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              allowedBundleIds_.add(s);
              break;
            }
          case 16:
            {
              allowAllBundleIds_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        allowedBundleIds_ = allowedBundleIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_IOSKeySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_IOSKeySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.IOSKeySettings.class,
            com.google.recaptchaenterprise.v1.IOSKeySettings.Builder.class);
  }

  public static final int ALLOW_ALL_BUNDLE_IDS_FIELD_NUMBER = 2;
  private boolean allowAllBundleIds_;
  /**
   *
   *
   * <pre>
   * If set to true, allowed_bundle_ids are not enforced.
   * </pre>
   *
   * <code>bool allow_all_bundle_ids = 2;</code>
   *
   * @return The allowAllBundleIds.
   */
  @java.lang.Override
  public boolean getAllowAllBundleIds() {
    return allowAllBundleIds_;
  }

  public static final int ALLOWED_BUNDLE_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList allowedBundleIds_;
  /**
   *
   *
   * <pre>
   * iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1;</code>
   *
   * @return A list containing the allowedBundleIds.
   */
  public com.google.protobuf.ProtocolStringList getAllowedBundleIdsList() {
    return allowedBundleIds_;
  }
  /**
   *
   *
   * <pre>
   * iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1;</code>
   *
   * @return The count of allowedBundleIds.
   */
  public int getAllowedBundleIdsCount() {
    return allowedBundleIds_.size();
  }
  /**
   *
   *
   * <pre>
   * iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The allowedBundleIds at the given index.
   */
  public java.lang.String getAllowedBundleIds(int index) {
    return allowedBundleIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedBundleIds at the given index.
   */
  public com.google.protobuf.ByteString getAllowedBundleIdsBytes(int index) {
    return allowedBundleIds_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < allowedBundleIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowedBundleIds_.getRaw(i));
    }
    if (allowAllBundleIds_ != false) {
      output.writeBool(2, allowAllBundleIds_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedBundleIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowedBundleIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedBundleIdsList().size();
    }
    if (allowAllBundleIds_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, allowAllBundleIds_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.IOSKeySettings)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.IOSKeySettings other =
        (com.google.recaptchaenterprise.v1.IOSKeySettings) obj;

    if (getAllowAllBundleIds() != other.getAllowAllBundleIds()) return false;
    if (!getAllowedBundleIdsList().equals(other.getAllowedBundleIdsList())) return false;
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
    hash = (37 * hash) + ALLOW_ALL_BUNDLE_IDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowAllBundleIds());
    if (getAllowedBundleIdsCount() > 0) {
      hash = (37 * hash) + ALLOWED_BUNDLE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedBundleIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.IOSKeySettings prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Settings specific to keys that can be used by iOS apps.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.IOSKeySettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.IOSKeySettings)
      com.google.recaptchaenterprise.v1.IOSKeySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_IOSKeySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_IOSKeySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.IOSKeySettings.class,
              com.google.recaptchaenterprise.v1.IOSKeySettings.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.IOSKeySettings.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      allowAllBundleIds_ = false;

      allowedBundleIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_IOSKeySettings_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.IOSKeySettings getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.IOSKeySettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.IOSKeySettings build() {
      com.google.recaptchaenterprise.v1.IOSKeySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.IOSKeySettings buildPartial() {
      com.google.recaptchaenterprise.v1.IOSKeySettings result =
          new com.google.recaptchaenterprise.v1.IOSKeySettings(this);
      int from_bitField0_ = bitField0_;
      result.allowAllBundleIds_ = allowAllBundleIds_;
      if (((bitField0_ & 0x00000001) != 0)) {
        allowedBundleIds_ = allowedBundleIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowedBundleIds_ = allowedBundleIds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.recaptchaenterprise.v1.IOSKeySettings) {
        return mergeFrom((com.google.recaptchaenterprise.v1.IOSKeySettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.IOSKeySettings other) {
      if (other == com.google.recaptchaenterprise.v1.IOSKeySettings.getDefaultInstance())
        return this;
      if (other.getAllowAllBundleIds() != false) {
        setAllowAllBundleIds(other.getAllowAllBundleIds());
      }
      if (!other.allowedBundleIds_.isEmpty()) {
        if (allowedBundleIds_.isEmpty()) {
          allowedBundleIds_ = other.allowedBundleIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedBundleIdsIsMutable();
          allowedBundleIds_.addAll(other.allowedBundleIds_);
        }
        onChanged();
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
      com.google.recaptchaenterprise.v1.IOSKeySettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.recaptchaenterprise.v1.IOSKeySettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private boolean allowAllBundleIds_;
    /**
     *
     *
     * <pre>
     * If set to true, allowed_bundle_ids are not enforced.
     * </pre>
     *
     * <code>bool allow_all_bundle_ids = 2;</code>
     *
     * @return The allowAllBundleIds.
     */
    @java.lang.Override
    public boolean getAllowAllBundleIds() {
      return allowAllBundleIds_;
    }
    /**
     *
     *
     * <pre>
     * If set to true, allowed_bundle_ids are not enforced.
     * </pre>
     *
     * <code>bool allow_all_bundle_ids = 2;</code>
     *
     * @param value The allowAllBundleIds to set.
     * @return This builder for chaining.
     */
    public Builder setAllowAllBundleIds(boolean value) {

      allowAllBundleIds_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, allowed_bundle_ids are not enforced.
     * </pre>
     *
     * <code>bool allow_all_bundle_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowAllBundleIds() {

      allowAllBundleIds_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList allowedBundleIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAllowedBundleIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedBundleIds_ = new com.google.protobuf.LazyStringArrayList(allowedBundleIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @return A list containing the allowedBundleIds.
     */
    public com.google.protobuf.ProtocolStringList getAllowedBundleIdsList() {
      return allowedBundleIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @return The count of allowedBundleIds.
     */
    public int getAllowedBundleIdsCount() {
      return allowedBundleIds_.size();
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The allowedBundleIds at the given index.
     */
    public java.lang.String getAllowedBundleIds(int index) {
      return allowedBundleIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the allowedBundleIds at the given index.
     */
    public com.google.protobuf.ByteString getAllowedBundleIdsBytes(int index) {
      return allowedBundleIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The allowedBundleIds to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedBundleIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedBundleIdsIsMutable();
      allowedBundleIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @param value The allowedBundleIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedBundleIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedBundleIdsIsMutable();
      allowedBundleIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @param values The allowedBundleIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedBundleIds(java.lang.Iterable<java.lang.String> values) {
      ensureAllowedBundleIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedBundleIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowedBundleIds() {
      allowedBundleIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * iOS bundle ids of apps allowed to use the key.
     * Example: 'com.companyname.productname.appname'
     * </pre>
     *
     * <code>repeated string allowed_bundle_ids = 1;</code>
     *
     * @param value The bytes of the allowedBundleIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedBundleIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAllowedBundleIdsIsMutable();
      allowedBundleIds_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.IOSKeySettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.IOSKeySettings)
  private static final com.google.recaptchaenterprise.v1.IOSKeySettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.IOSKeySettings();
  }

  public static com.google.recaptchaenterprise.v1.IOSKeySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IOSKeySettings> PARSER =
      new com.google.protobuf.AbstractParser<IOSKeySettings>() {
        @java.lang.Override
        public IOSKeySettings parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new IOSKeySettings(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<IOSKeySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IOSKeySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.IOSKeySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
