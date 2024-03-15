package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountCreateSubscriptionResponse  {
  
  @ApiModelProperty(example = "8078432025948590686", value = "Subscription ID.")
 /**
   * Subscription ID.
  **/
  private String id;

  @ApiModelProperty(example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", value = "Base64 encoded key for client to decrypt lead data.")
 /**
   * Base64 encoded key for client to decrypt lead data.
  **/
  private String cryptographicKey;

  @ApiModelProperty(example = "AES-256-GCM", value = "Lead data encryption algorithm.")
 /**
   * Lead data encryption algorithm.
  **/
  private String cryptographicAlgorithm;

  @ApiModelProperty(example = "1699209842000", value = "Subscription creation time. Unix timestamp in milliseconds.")
 /**
   * Subscription creation time. Unix timestamp in milliseconds.
  **/
  private Integer createdTime;
 /**
   * Subscription ID.
   * @return id
  **/
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccountCreateSubscriptionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Base64 encoded key for client to decrypt lead data.
   * @return cryptographicKey
  **/
  @JsonProperty("cryptographic_key")
  public String getCryptographicKey() {
    return cryptographicKey;
  }

  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  public AdAccountCreateSubscriptionResponse cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

 /**
   * Lead data encryption algorithm.
   * @return cryptographicAlgorithm
  **/
  @JsonProperty("cryptographic_algorithm")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  public AdAccountCreateSubscriptionResponse cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

 /**
   * Subscription creation time. Unix timestamp in milliseconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdAccountCreateSubscriptionResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
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
    AdAccountCreateSubscriptionResponse adAccountCreateSubscriptionResponse = (AdAccountCreateSubscriptionResponse) o;
    return Objects.equals(this.id, adAccountCreateSubscriptionResponse.id) &&
        Objects.equals(this.cryptographicKey, adAccountCreateSubscriptionResponse.cryptographicKey) &&
        Objects.equals(this.cryptographicAlgorithm, adAccountCreateSubscriptionResponse.cryptographicAlgorithm) &&
        Objects.equals(this.createdTime, adAccountCreateSubscriptionResponse.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cryptographicKey, cryptographicAlgorithm, createdTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreateSubscriptionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cryptographicKey: ").append(toIndentedString(cryptographicKey)).append("\n");
    sb.append("    cryptographicAlgorithm: ").append(toIndentedString(cryptographicAlgorithm)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

