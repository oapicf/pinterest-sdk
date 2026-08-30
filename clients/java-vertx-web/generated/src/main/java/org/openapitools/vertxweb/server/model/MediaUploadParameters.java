package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaUploadParameters   {
  
  private String contentType;
  private String key;
  private String policy;
  private String xAmzAlgorithm;
  private String xAmzCredential;
  private String xAmzDate;
  private String xAmzSecurityToken;
  private String xAmzSignature;

  public MediaUploadParameters () {

  }

  public MediaUploadParameters (String contentType, String key, String policy, String xAmzAlgorithm, String xAmzCredential, String xAmzDate, String xAmzSecurityToken, String xAmzSignature) {
    this.contentType = contentType;
    this.key = key;
    this.policy = policy;
    this.xAmzAlgorithm = xAmzAlgorithm;
    this.xAmzCredential = xAmzCredential;
    this.xAmzDate = xAmzDate;
    this.xAmzSecurityToken = xAmzSecurityToken;
    this.xAmzSignature = xAmzSignature;
  }

    
  @JsonProperty("Content-Type")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

    
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

    
  @JsonProperty("policy")
  public String getPolicy() {
    return policy;
  }
  public void setPolicy(String policy) {
    this.policy = policy;
  }

    
  @JsonProperty("x-amz-algorithm")
  public String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }
  public void setxAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

    
  @JsonProperty("x-amz-credential")
  public String getxAmzCredential() {
    return xAmzCredential;
  }
  public void setxAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

    
  @JsonProperty("x-amz-date")
  public String getxAmzDate() {
    return xAmzDate;
  }
  public void setxAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

    
  @JsonProperty("x-amz-security-token")
  public String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }
  public void setxAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

    
  @JsonProperty("x-amz-signature")
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
    return Objects.equals(contentType, mediaUploadParameters.contentType) &&
        Objects.equals(key, mediaUploadParameters.key) &&
        Objects.equals(policy, mediaUploadParameters.policy) &&
        Objects.equals(xAmzAlgorithm, mediaUploadParameters.xAmzAlgorithm) &&
        Objects.equals(xAmzCredential, mediaUploadParameters.xAmzCredential) &&
        Objects.equals(xAmzDate, mediaUploadParameters.xAmzDate) &&
        Objects.equals(xAmzSecurityToken, mediaUploadParameters.xAmzSecurityToken) &&
        Objects.equals(xAmzSignature, mediaUploadParameters.xAmzSignature);
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
