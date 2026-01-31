package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MediaUploadParameters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MediaUploadParameters {

  private @Nullable String contentType;

  private @Nullable String key;

  private @Nullable String policy;

  private @Nullable String xAmzAlgorithm;

  private @Nullable String xAmzCredential;

  private @Nullable String xAmzDate;

  private @Nullable String xAmzSecurityToken;

  private @Nullable String xAmzSignature;

  public MediaUploadParameters contentType(@Nullable String contentType) {
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

  public MediaUploadParameters key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  
  @Schema(name = "key", example = "uploads/11/aa/22/3:video:203014033110991560:5212123920968240771", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public @Nullable String getKey() {
    return key;
  }

  public void setKey(@Nullable String key) {
    this.key = key;
  }

  public MediaUploadParameters policy(@Nullable String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
   */
  
  @Schema(name = "policy", example = "eyJleHBpcmF0aW9uIjoiMj..==", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy")
  public @Nullable String getPolicy() {
    return policy;
  }

  public void setPolicy(@Nullable String policy) {
    this.policy = policy;
  }

  public MediaUploadParameters xAmzAlgorithm(@Nullable String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
    return this;
  }

  /**
   * Get xAmzAlgorithm
   * @return xAmzAlgorithm
   */
  
  @Schema(name = "x-amz-algorithm", example = "AWS4-HMAC-SHA256", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-algorithm")
  public @Nullable String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }

  public void setxAmzAlgorithm(@Nullable String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  public MediaUploadParameters xAmzCredential(@Nullable String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
    return this;
  }

  /**
   * Get xAmzCredential
   * @return xAmzCredential
   */
  
  @Schema(name = "x-amz-credential", example = "ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-credential")
  public @Nullable String getxAmzCredential() {
    return xAmzCredential;
  }

  public void setxAmzCredential(@Nullable String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  public MediaUploadParameters xAmzDate(@Nullable String xAmzDate) {
    this.xAmzDate = xAmzDate;
    return this;
  }

  /**
   * Get xAmzDate
   * @return xAmzDate
   */
  
  @Schema(name = "x-amz-date", example = "20220127T185143Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-date")
  public @Nullable String getxAmzDate() {
    return xAmzDate;
  }

  public void setxAmzDate(@Nullable String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  public MediaUploadParameters xAmzSecurityToken(@Nullable String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
    return this;
  }

  /**
   * Get xAmzSecurityToken
   * @return xAmzSecurityToken
   */
  
  @Schema(name = "x-amz-security-token", example = "IQoJb3JpZ2luX2VjEJr...==", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-security-token")
  public @Nullable String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }

  public void setxAmzSecurityToken(@Nullable String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  public MediaUploadParameters xAmzSignature(@Nullable String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
    return this;
  }

  /**
   * Get xAmzSignature
   * @return xAmzSignature
   */
  
  @Schema(name = "x-amz-signature", example = "fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-amz-signature")
  public @Nullable String getxAmzSignature() {
    return xAmzSignature;
  }

  public void setxAmzSignature(@Nullable String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadParameters mediaUploadParameters = (MediaUploadParameters) o;
    return Objects.equals(this.contentType, mediaUploadParameters.contentType) &&
        Objects.equals(this.key, mediaUploadParameters.key) &&
        Objects.equals(this.policy, mediaUploadParameters.policy) &&
        Objects.equals(this.xAmzAlgorithm, mediaUploadParameters.xAmzAlgorithm) &&
        Objects.equals(this.xAmzCredential, mediaUploadParameters.xAmzCredential) &&
        Objects.equals(this.xAmzDate, mediaUploadParameters.xAmzDate) &&
        Objects.equals(this.xAmzSecurityToken, mediaUploadParameters.xAmzSecurityToken) &&
        Objects.equals(this.xAmzSignature, mediaUploadParameters.xAmzSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, key, policy, xAmzAlgorithm, xAmzCredential, xAmzDate, xAmzSecurityToken, xAmzSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadParameters {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    xAmzAlgorithm: ").append(toIndentedString(xAmzAlgorithm)).append("\n");
    sb.append("    xAmzCredential: ").append(toIndentedString(xAmzCredential)).append("\n");
    sb.append("    xAmzDate: ").append(toIndentedString(xAmzDate)).append("\n");
    sb.append("    xAmzSecurityToken: ").append(toIndentedString(xAmzSecurityToken)).append("\n");
    sb.append("    xAmzSignature: ").append(toIndentedString(xAmzSignature)).append("\n");
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

