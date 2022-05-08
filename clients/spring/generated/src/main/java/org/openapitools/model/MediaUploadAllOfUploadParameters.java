package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-08T00:42:02.037116Z[Etc/UTC]")
public class MediaUploadAllOfUploadParameters   {

  @JsonProperty("x-amz-date")
  private String xAmzDate;

  @JsonProperty("x-amz-signature")
  private String xAmzSignature;

  @JsonProperty("x-amz-security-token")
  private String xAmzSecurityToken;

  @JsonProperty("x-amz-algorithm")
  private String xAmzAlgorithm;

  @JsonProperty("key")
  private String key;

  @JsonProperty("policy")
  private String policy;

  @JsonProperty("x-amz-credential")
  private String xAmzCredential;

  @JsonProperty("Content-Type")
  private String contentType;

  public MediaUploadAllOfUploadParameters xAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
    return this;
  }

  /**
   * Get xAmzDate
   * @return xAmzDate
  */
  
  @Schema(name = "x-amz-date", required = false)
  public String getxAmzDate() {
    return xAmzDate;
  }

  public void setxAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  public MediaUploadAllOfUploadParameters xAmzSignature(String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
    return this;
  }

  /**
   * Get xAmzSignature
   * @return xAmzSignature
  */
  
  @Schema(name = "x-amz-signature", required = false)
  public String getxAmzSignature() {
    return xAmzSignature;
  }

  public void setxAmzSignature(String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
  }

  public MediaUploadAllOfUploadParameters xAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
    return this;
  }

  /**
   * Get xAmzSecurityToken
   * @return xAmzSecurityToken
  */
  
  @Schema(name = "x-amz-security-token", required = false)
  public String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }

  public void setxAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  public MediaUploadAllOfUploadParameters xAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
    return this;
  }

  /**
   * Get xAmzAlgorithm
   * @return xAmzAlgorithm
  */
  
  @Schema(name = "x-amz-algorithm", required = false)
  public String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }

  public void setxAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  public MediaUploadAllOfUploadParameters key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", required = false)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MediaUploadAllOfUploadParameters policy(String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
  */
  
  @Schema(name = "policy", required = false)
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public MediaUploadAllOfUploadParameters xAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
    return this;
  }

  /**
   * Get xAmzCredential
   * @return xAmzCredential
  */
  
  @Schema(name = "x-amz-credential", required = false)
  public String getxAmzCredential() {
    return xAmzCredential;
  }

  public void setxAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  public MediaUploadAllOfUploadParameters contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  */
  
  @Schema(name = "Content-Type", example = "multipart/form-data", required = false)
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
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

