package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MediaUploadParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Content-Type")
  private String contentType;

  @JsonProperty("key")
  private String key;

  @JsonProperty("policy")
  private String policy;

  @JsonProperty("x-amz-algorithm")
  private String xAmzAlgorithm;

  @JsonProperty("x-amz-credential")
  private String xAmzCredential;

  @JsonProperty("x-amz-date")
  private String xAmzDate;

  @JsonProperty("x-amz-security-token")
  private String xAmzSecurityToken;

  @JsonProperty("x-amz-signature")
  private String xAmzSignature;

  /**
   * 
   * @return contentType
   */
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * 
   * @return key
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * 
   * @return policy
   */
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  /**
   * 
   * @return xAmzAlgorithm
   */
  public String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }

  public void setxAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  /**
   * 
   * @return xAmzCredential
   */
  public String getxAmzCredential() {
    return xAmzCredential;
  }

  public void setxAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  /**
   * 
   * @return xAmzDate
   */
  public String getxAmzDate() {
    return xAmzDate;
  }

  public void setxAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  /**
   * 
   * @return xAmzSecurityToken
   */
  public String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }

  public void setxAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  /**
   * 
   * @return xAmzSignature
   */
  public String getxAmzSignature() {
    return xAmzSignature;
  }

  public void setxAmzSignature(String xAmzSignature) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
