package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MediaUploadParameters  {
  
  @ApiModelProperty(example = "multipart/form-data", value = "")
  private String contentType;

  @ApiModelProperty(example = "uploads/11/aa/22/3:video:203014033110991560:5212123920968240771", value = "")
  private String key;

  @ApiModelProperty(example = "eyJleHBpcmF0aW9uIjoiMj..==", value = "")
  private String policy;

  @ApiModelProperty(example = "AWS4-HMAC-SHA256", value = "")
  private String xAmzAlgorithm;

  @ApiModelProperty(example = "ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request", value = "")
  private String xAmzCredential;

  @ApiModelProperty(example = "20220127T185143Z", value = "")
  private String xAmzDate;

  @ApiModelProperty(example = "IQoJb3JpZ2luX2VjEJr...==", value = "")
  private String xAmzSecurityToken;

  @ApiModelProperty(example = "fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92", value = "")
  private String xAmzSignature;
 /**
  * Get contentType
  * @return contentType
  */
  @JsonProperty("Content-Type")
  public String getContentType() {
    return contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
 public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public MediaUploadParameters contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
  * Get key
  * @return key
  */
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  /**
   * Sets the <code>key</code> property.
   */
 public void setKey(String key) {
    this.key = key;
  }

  /**
   * Sets the <code>key</code> property.
   */
  public MediaUploadParameters key(String key) {
    this.key = key;
    return this;
  }

 /**
  * Get policy
  * @return policy
  */
  @JsonProperty("policy")
  public String getPolicy() {
    return policy;
  }

  /**
   * Sets the <code>policy</code> property.
   */
 public void setPolicy(String policy) {
    this.policy = policy;
  }

  /**
   * Sets the <code>policy</code> property.
   */
  public MediaUploadParameters policy(String policy) {
    this.policy = policy;
    return this;
  }

 /**
  * Get xAmzAlgorithm
  * @return xAmzAlgorithm
  */
  @JsonProperty("x-amz-algorithm")
  public String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }

  /**
   * Sets the <code>xAmzAlgorithm</code> property.
   */
 public void setxAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  /**
   * Sets the <code>xAmzAlgorithm</code> property.
   */
  public MediaUploadParameters xAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
    return this;
  }

 /**
  * Get xAmzCredential
  * @return xAmzCredential
  */
  @JsonProperty("x-amz-credential")
  public String getxAmzCredential() {
    return xAmzCredential;
  }

  /**
   * Sets the <code>xAmzCredential</code> property.
   */
 public void setxAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  /**
   * Sets the <code>xAmzCredential</code> property.
   */
  public MediaUploadParameters xAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
    return this;
  }

 /**
  * Get xAmzDate
  * @return xAmzDate
  */
  @JsonProperty("x-amz-date")
  public String getxAmzDate() {
    return xAmzDate;
  }

  /**
   * Sets the <code>xAmzDate</code> property.
   */
 public void setxAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  /**
   * Sets the <code>xAmzDate</code> property.
   */
  public MediaUploadParameters xAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
    return this;
  }

 /**
  * Get xAmzSecurityToken
  * @return xAmzSecurityToken
  */
  @JsonProperty("x-amz-security-token")
  public String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }

  /**
   * Sets the <code>xAmzSecurityToken</code> property.
   */
 public void setxAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  /**
   * Sets the <code>xAmzSecurityToken</code> property.
   */
  public MediaUploadParameters xAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
    return this;
  }

 /**
  * Get xAmzSignature
  * @return xAmzSignature
  */
  @JsonProperty("x-amz-signature")
  public String getxAmzSignature() {
    return xAmzSignature;
  }

  /**
   * Sets the <code>xAmzSignature</code> property.
   */
 public void setxAmzSignature(String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
  }

  /**
   * Sets the <code>xAmzSignature</code> property.
   */
  public MediaUploadParameters xAmzSignature(String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

