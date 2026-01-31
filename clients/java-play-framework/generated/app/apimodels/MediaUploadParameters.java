package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MediaUploadParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MediaUploadParameters   {
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

  public MediaUploadParameters contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public MediaUploadParameters key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MediaUploadParameters policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public MediaUploadParameters xAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
    return this;
  }

   /**
   * Get xAmzAlgorithm
   * @return xAmzAlgorithm
  **/
  public String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }

  public void setxAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  public MediaUploadParameters xAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
    return this;
  }

   /**
   * Get xAmzCredential
   * @return xAmzCredential
  **/
  public String getxAmzCredential() {
    return xAmzCredential;
  }

  public void setxAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  public MediaUploadParameters xAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
    return this;
  }

   /**
   * Get xAmzDate
   * @return xAmzDate
  **/
  public String getxAmzDate() {
    return xAmzDate;
  }

  public void setxAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  public MediaUploadParameters xAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
    return this;
  }

   /**
   * Get xAmzSecurityToken
   * @return xAmzSecurityToken
  **/
  public String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }

  public void setxAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  public MediaUploadParameters xAmzSignature(String xAmzSignature) {
    this.xAmzSignature = xAmzSignature;
    return this;
  }

   /**
   * Get xAmzSignature
   * @return xAmzSignature
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

