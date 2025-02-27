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
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1beta1;

/**
 *
 *
 * <pre>
 * The create key request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1beta1.CreateKeyRequest}
 */
public final class CreateKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1beta1.CreateKeyRequest)
    CreateKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateKeyRequest.newBuilder() to construct.
  private CreateKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateKeyRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateKeyRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.recaptchaenterprise.v1beta1.Key.Builder subBuilder = null;
              if (key_ != null) {
                subBuilder = key_.toBuilder();
              }
              key_ =
                  input.readMessage(
                      com.google.recaptchaenterprise.v1beta1.Key.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(key_);
                key_ = subBuilder.buildPartial();
              }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.class,
            com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the key will be created, in the
   * format "projects/{project_number}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the key will be created, in the
   * format "projects/{project_number}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private com.google.recaptchaenterprise.v1beta1.Key key_;
  /**
   *
   *
   * <pre>
   * Required. Information to create a reCAPTCHA Enterprise key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Information to create a reCAPTCHA Enterprise key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The key.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1beta1.Key getKey() {
    return key_ == null ? com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance() : key_;
  }
  /**
   *
   *
   * <pre>
   * Required. Information to create a reCAPTCHA Enterprise key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1beta1.KeyOrBuilder getKeyOrBuilder() {
    return getKey();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (key_ != null) {
      output.writeMessage(2, getKey());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getKey());
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1beta1.CreateKeyRequest)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1beta1.CreateKeyRequest other =
        (com.google.recaptchaenterprise.v1beta1.CreateKeyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey().equals(other.getKey())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.recaptchaenterprise.v1beta1.CreateKeyRequest prototype) {
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
   * The create key request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1beta1.CreateKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1beta1.CreateKeyRequest)
      com.google.recaptchaenterprise.v1beta1.CreateKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.class,
              com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.newBuilder()
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
      parent_ = "";

      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.CreateKeyRequest getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.CreateKeyRequest build() {
      com.google.recaptchaenterprise.v1beta1.CreateKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.CreateKeyRequest buildPartial() {
      com.google.recaptchaenterprise.v1beta1.CreateKeyRequest result =
          new com.google.recaptchaenterprise.v1beta1.CreateKeyRequest(this);
      result.parent_ = parent_;
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
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
      if (other instanceof com.google.recaptchaenterprise.v1beta1.CreateKeyRequest) {
        return mergeFrom((com.google.recaptchaenterprise.v1beta1.CreateKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1beta1.CreateKeyRequest other) {
      if (other == com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasKey()) {
        mergeKey(other.getKey());
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
      com.google.recaptchaenterprise.v1beta1.CreateKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.recaptchaenterprise.v1beta1.CreateKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the key will be created, in the
     * format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the key will be created, in the
     * format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the key will be created, in the
     * format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the key will be created, in the
     * format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the key will be created, in the
     * format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.recaptchaenterprise.v1beta1.Key key_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1beta1.Key,
            com.google.recaptchaenterprise.v1beta1.Key.Builder,
            com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>
        keyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The key.
     */
    public com.google.recaptchaenterprise.v1beta1.Key getKey() {
      if (keyBuilder_ == null) {
        return key_ == null
            ? com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance()
            : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setKey(com.google.recaptchaenterprise.v1beta1.Key value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setKey(com.google.recaptchaenterprise.v1beta1.Key.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeKey(com.google.recaptchaenterprise.v1beta1.Key value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
              com.google.recaptchaenterprise.v1beta1.Key.newBuilder(key_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.recaptchaenterprise.v1beta1.Key.Builder getKeyBuilder() {

      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.recaptchaenterprise.v1beta1.KeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null
            ? com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance()
            : key_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Information to create a reCAPTCHA Enterprise key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1beta1.Key,
            com.google.recaptchaenterprise.v1beta1.Key.Builder,
            com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.recaptchaenterprise.v1beta1.Key,
                com.google.recaptchaenterprise.v1beta1.Key.Builder,
                com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>(
                getKey(), getParentForChildren(), isClean());
        key_ = null;
      }
      return keyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1beta1.CreateKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1beta1.CreateKeyRequest)
  private static final com.google.recaptchaenterprise.v1beta1.CreateKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1beta1.CreateKeyRequest();
  }

  public static com.google.recaptchaenterprise.v1beta1.CreateKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateKeyRequest>() {
        @java.lang.Override
        public CreateKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateKeyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1beta1.CreateKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
