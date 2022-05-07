package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 **/
@ApiModel(description="The list of parameter key/value pairs you will need to send with your POST request to upload your media file.")
public class MediaUploadAllOfUploadParameters  {
  
  @ApiModelProperty(value = "")
  private String xAmzDate;

  @ApiModelProperty(value = "")
  private String xAmzSignature;

  @ApiModelProperty(value = "")
  private String xAmzSecurityToken;

  @ApiModelProperty(value = "")
  private String xAmzAlgorithm;

  @ApiModelProperty(value = "")
  private String key;

  @ApiModelProperty(value = "")
  private String policy;

  @ApiModelProperty(value = "")
  private String xAmzCredential;

  @ApiModelProperty(example = "multipart/form-data", value = "")
  private String contentType;
 /**
   * Get xAmzDate
   * @return xAmzDate
  **/
  @JsonProperty("x-amz-date")
  public String getxAmzDate() {
    return xAmzDate;
  }

  public void setxAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  public MediaUploadAllOfUploadParameters xAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
    return this;
  }

 /**
   * Get xAmzSignature
   * @return xAmzSignature
  **/
  @JsonProperty("x-amz-signature")
  public String getxAmzSignature() {
    return xAmzSignature;
  }

  public void setxAmzSignature(String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
  }

  public MediaUploadAllOfUploadParameters xAmzSignature(String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
    return this;
  }

 /**
   * Get xAmzSecurityToken
   * @return xAmzSecurityToken
  **/
  @JsonProperty("x-amz-security-token")
  public String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }

  public void setxAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  public MediaUploadAllOfUploadParameters xAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
    return this;
  }

 /**
   * Get xAmzAlgorithm
   * @return xAmzAlgorithm
  **/
  @JsonProperty("x-amz-algorithm")
  public String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }

  public void setxAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  public MediaUploadAllOfUploadParameters xAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
    return this;
  }

 /**
   * Get key
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MediaUploadAllOfUploadParameters key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Get policy
   * @return policy
  **/
  @JsonProperty("policy")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public MediaUploadAllOfUploadParameters policy(String policy) {
    this.policy = policy;
    return this;
  }

 /**
   * Get xAmzCredential
   * @return xAmzCredential
  **/
  @JsonProperty("x-amz-credential")
  public String getxAmzCredential() {
    return xAmzCredential;
  }

  public void setxAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  public MediaUploadAllOfUploadParameters xAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("Content-Type")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public MediaUploadAllOfUploadParameters contentType(String contentType) {
    this.contentType = contentType;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

