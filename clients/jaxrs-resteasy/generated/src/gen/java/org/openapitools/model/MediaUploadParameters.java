package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MediaUploadParameters   {
  
  private String contentType;
  private String key;
  private String policy;
  private String xAmzAlgorithm;
  private String xAmzCredential;
  private String xAmzDate;
  private String xAmzSecurityToken;
  private String xAmzSignature;

  /**
   **/
  
  @ApiModelProperty(example = "multipart/form-data", value = "")
  @JsonProperty("Content-Type")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  
  @ApiModelProperty(example = "uploads/11/aa/22/3:video:203014033110991560:5212123920968240771", value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  
  @ApiModelProperty(example = "eyJleHBpcmF0aW9uIjoiMj..==", value = "")
  @JsonProperty("policy")
  public String getPolicy() {
    return policy;
  }
  public void setPolicy(String policy) {
    this.policy = policy;
  }

  /**
   **/
  
  @ApiModelProperty(example = "AWS4-HMAC-SHA256", value = "")
  @JsonProperty("x-amz-algorithm")
  public String getxAmzAlgorithm() {
    return xAmzAlgorithm;
  }
  public void setxAmzAlgorithm(String xAmzAlgorithm) {
    this.xAmzAlgorithm = xAmzAlgorithm;
  }

  /**
   **/
  
  @ApiModelProperty(example = "ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request", value = "")
  @JsonProperty("x-amz-credential")
  public String getxAmzCredential() {
    return xAmzCredential;
  }
  public void setxAmzCredential(String xAmzCredential) {
    this.xAmzCredential = xAmzCredential;
  }

  /**
   **/
  
  @ApiModelProperty(example = "20220127T185143Z", value = "")
  @JsonProperty("x-amz-date")
  public String getxAmzDate() {
    return xAmzDate;
  }
  public void setxAmzDate(String xAmzDate) {
    this.xAmzDate = xAmzDate;
  }

  /**
   **/
  
  @ApiModelProperty(example = "IQoJb3JpZ2luX2VjEJr...==", value = "")
  @JsonProperty("x-amz-security-token")
  public String getxAmzSecurityToken() {
    return xAmzSecurityToken;
  }
  public void setxAmzSecurityToken(String xAmzSecurityToken) {
    this.xAmzSecurityToken = xAmzSecurityToken;
  }

  /**
   **/
  
  @ApiModelProperty(example = "fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92", value = "")
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

