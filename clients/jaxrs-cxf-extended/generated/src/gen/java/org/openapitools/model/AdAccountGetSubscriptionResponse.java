package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountGetSubscriptionResponse  {
  
 /**
  * Lead form ID.
  */
  @ApiModelProperty(example = "383791336903426390", value = "Lead form ID.")
  private String leadFormId;

 /**
  * Standard HTTPS webhook URL.
  */
  @ApiModelProperty(example = "https://webhook.example.com/xyz", value = "Standard HTTPS webhook URL.")
  private String webhookUrl;

 /**
  * Subscription ID.
  */
  @ApiModelProperty(example = "8078432025948590686", value = "Subscription ID.")
  private String id;

 /**
  * User account used to subscribe lead data.
  */
  @ApiModelProperty(example = "549755885175", value = "User account used to subscribe lead data.")
  private String userAccountId;

 /**
  * The Ad Account ID that this lead form belongs to.
  */
  @ApiModelProperty(example = "549755885176", value = "The Ad Account ID that this lead form belongs to.")
  private String adAccountId;

 /**
  * API version.
  */
  @ApiModelProperty(example = "v5", value = "API version.")
  private String apiVersion;

 /**
  * Base64 encoded key for client to decrypt lead data.
  */
  @ApiModelProperty(example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", value = "Base64 encoded key for client to decrypt lead data.")
  private String cryptographicKey;

 /**
  * Lead data encryption algorithm.
  */
  @ApiModelProperty(example = "AES-256-GCM", value = "Lead data encryption algorithm.")
  private String cryptographicAlgorithm;

 /**
  * Lead form creation time. Unix timestamp in milliseconds.
  */
  @ApiModelProperty(example = "1699209842000", value = "Lead form creation time. Unix timestamp in milliseconds.")
  private Integer createdTime;
 /**
  * Lead form ID.
  * @return leadFormId
  */
  @JsonProperty("lead_form_id")
 @Pattern(regexp="^\\d+$")  public String getLeadFormId() {
    return leadFormId;
  }

  /**
   * Sets the <code>leadFormId</code> property.
   */
 public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Sets the <code>leadFormId</code> property.
   */
  public AdAccountGetSubscriptionResponse leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

 /**
  * Standard HTTPS webhook URL.
  * @return webhookUrl
  */
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  /**
   * Sets the <code>webhookUrl</code> property.
   */
 public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  /**
   * Sets the <code>webhookUrl</code> property.
   */
  public AdAccountGetSubscriptionResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

 /**
  * Subscription ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AdAccountGetSubscriptionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * User account used to subscribe lead data.
  * @return userAccountId
  */
  @JsonProperty("user_account_id")
 @Pattern(regexp="^\\d+$")  public String getUserAccountId() {
    return userAccountId;
  }

  /**
   * Sets the <code>userAccountId</code> property.
   */
 public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  /**
   * Sets the <code>userAccountId</code> property.
   */
  public AdAccountGetSubscriptionResponse userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

 /**
  * The Ad Account ID that this lead form belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public AdAccountGetSubscriptionResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * API version.
  * @return apiVersion
  */
  @JsonProperty("api_version")
  public String getApiVersion() {
    return apiVersion;
  }

  /**
   * Sets the <code>apiVersion</code> property.
   */
 public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Sets the <code>apiVersion</code> property.
   */
  public AdAccountGetSubscriptionResponse apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
  * Base64 encoded key for client to decrypt lead data.
  * @return cryptographicKey
  */
  @JsonProperty("cryptographic_key")
  public String getCryptographicKey() {
    return cryptographicKey;
  }

  /**
   * Sets the <code>cryptographicKey</code> property.
   */
 public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  /**
   * Sets the <code>cryptographicKey</code> property.
   */
  public AdAccountGetSubscriptionResponse cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

 /**
  * Lead data encryption algorithm.
  * @return cryptographicAlgorithm
  */
  @JsonProperty("cryptographic_algorithm")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  /**
   * Sets the <code>cryptographicAlgorithm</code> property.
   */
 public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  /**
   * Sets the <code>cryptographicAlgorithm</code> property.
   */
  public AdAccountGetSubscriptionResponse cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

 /**
  * Lead form creation time. Unix timestamp in milliseconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public AdAccountGetSubscriptionResponse createdTime(Integer createdTime) {
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
    AdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse = (AdAccountGetSubscriptionResponse) o;
    return Objects.equals(this.leadFormId, adAccountGetSubscriptionResponse.leadFormId) &&
        Objects.equals(this.webhookUrl, adAccountGetSubscriptionResponse.webhookUrl) &&
        Objects.equals(this.id, adAccountGetSubscriptionResponse.id) &&
        Objects.equals(this.userAccountId, adAccountGetSubscriptionResponse.userAccountId) &&
        Objects.equals(this.adAccountId, adAccountGetSubscriptionResponse.adAccountId) &&
        Objects.equals(this.apiVersion, adAccountGetSubscriptionResponse.apiVersion) &&
        Objects.equals(this.cryptographicKey, adAccountGetSubscriptionResponse.cryptographicKey) &&
        Objects.equals(this.cryptographicAlgorithm, adAccountGetSubscriptionResponse.cryptographicAlgorithm) &&
        Objects.equals(this.createdTime, adAccountGetSubscriptionResponse.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadFormId, webhookUrl, id, userAccountId, adAccountId, apiVersion, cryptographicKey, cryptographicAlgorithm, createdTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountGetSubscriptionResponse {\n");
    
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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

