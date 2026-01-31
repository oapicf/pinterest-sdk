package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 */

@Schema(name = "MediaUpload_allOf_upload_parameters", description = "The list of parameter key/value pairs you will need to send with your POST request to upload your media file.")
@JsonTypeName("MediaUpload_allOf_upload_parameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MediaUploadAllOfUploadParameters {

  private @Nullable String xAmzDate;

  private @Nullable String xAmzSignature;

  private @Nullable String xAmzSecurityToken;

  private @Nullable String xAmzAlgorithm;

  private @Nullable String key;

  private @Nullable String policy;

  private @Nullable String xAmzCredential;

  private @Nullable String contentType;

  public MediaUploadAllOfUploadParameters xAmzDate(@Nullable String xAmzDate) {
    this.xAmzDate = xAmzDate;
    return this;
  }

  /**
   * Get xAmzDate
   * @return xAmzDate
   */
  
  @Schema(name = "x-amz-date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-date")
  public @Nullable String getxAmzDate() {
    return xAmzDate;
  }

  public void setxAmzDate(@Nullable String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  public MediaUploadAllOfUploadParameters xAmzSignature(@Nullable String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
    return this;
  }

  /**
   * Get xAmzSignature
   * @return xAmzSignature
   */
  
  @Schema(name = "x-amz-signature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-signature")
  public @Nullable String getxAmzSignature() {
    return xAmzSignature;
  }

  public void setxAmzSignature(@Nullable String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
  }

  public MediaUploadAllOfUploadParameters xAmzSecurityToken(@Nullable String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
    return this;
  }

  /**
   * Get xAmzSecurityToken
   * @return xAmzSecurityToken
   */
  
  @Schema(name = "x-amz-security-token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-security-token")
  public @Nullable String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }

  public void setxAmzSecurityToken(@Nullable String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  public MediaUploadAllOfUploadParameters xAmzAlgorithm(@Nullable String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
    return this;
  }

  /**
   * Get xAmzAlgorithm
   * @return xAmzAlgorithm
   */
  
  @Schema(name = "x-amz-algorithm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-algorithm")
  public @Nullable String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }

  public void setxAmzAlgorithm(@Nullable String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  public MediaUploadAllOfUploadParameters key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public @Nullable String getKey() {
    return key;
  }

  public void setKey(@Nullable String key) {
    this.key = key;
  }

  public MediaUploadAllOfUploadParameters policy(@Nullable String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
   */
  
  @Schema(name = "policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy")
  public @Nullable String getPolicy() {
    return policy;
  }

  public void setPolicy(@Nullable String policy) {
    this.policy = policy;
  }

  public MediaUploadAllOfUploadParameters xAmzCredential(@Nullable String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
    return this;
  }

  /**
   * Get xAmzCredential
   * @return xAmzCredential
   */
  
  @Schema(name = "x-amz-credential", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-credential")
  public @Nullable String getxAmzCredential() {
    return xAmzCredential;
  }

  public void setxAmzCredential(@Nullable String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  public MediaUploadAllOfUploadParameters contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "Content-Type", example = "multipart/form-data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Content-Type")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
    this.contentType = contentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters = (MediaUploadAllOfUploadParameters) o;
    return Objects.equals(this.xAmzDate, mediaUploadAllOfUploadParameters.xAmzDate) &&
        Objects.equals(this.xAmzSignature, mediaUploadAllOfUploadParameters.xAmzSignature) &&
        Objects.equals(this.xAmzSecurityToken, mediaUploadAllOfUploadParameters.xAmzSecurityToken) &&
        Objects.equals(this.xAmzAlgorithm, mediaUploadAllOfUploadParameters.xAmzAlgorithm) &&
        Objects.equals(this.key, mediaUploadAllOfUploadParameters.key) &&
        Objects.equals(this.policy, mediaUploadAllOfUploadParameters.policy) &&
        Objects.equals(this.xAmzCredential, mediaUploadAllOfUploadParameters.xAmzCredential) &&
        Objects.equals(this.contentType, mediaUploadAllOfUploadParameters.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xAmzDate, xAmzSignature, xAmzSecurityToken, xAmzAlgorithm, key, policy, xAmzCredential, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadAllOfUploadParameters {\n");
    sb.append("    xAmzDate: ").append(toIndentedString(xAmzDate)).append("\n");
    sb.append("    xAmzSignature: ").append(toIndentedString(xAmzSignature)).append("\n");
    sb.append("    xAmzSecurityToken: ").append(toIndentedString(xAmzSecurityToken)).append("\n");
    sb.append("    xAmzAlgorithm: ").append(toIndentedString(xAmzAlgorithm)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    xAmzCredential: ").append(toIndentedString(xAmzCredential)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

