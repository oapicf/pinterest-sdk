package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountGetSubscriptionResponse  {
  
  @ApiModelProperty(example = "383791336903426390", value = "Lead form ID.")
 /**
   * Lead form ID.
  **/
  private String leadFormId;

  @ApiModelProperty(example = "https://webhook.example.com/xyz", value = "Standard HTTPS webhook URL.")
 /**
   * Standard HTTPS webhook URL.
  **/
  private String webhookUrl;

  @ApiModelProperty(example = "8078432025948590686", value = "Subscription ID.")
 /**
   * Subscription ID.
  **/
  private String id;

  @ApiModelProperty(example = "549755885175", value = "User account used to subscribe lead data.")
 /**
   * User account used to subscribe lead data.
  **/
  private String userAccountId;

  @ApiModelProperty(example = "549755885176", value = "The Ad Account ID that this lead form belongs to.")
 /**
   * The Ad Account ID that this lead form belongs to.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "v5", value = "API version.")
 /**
   * API version.
  **/
  private String apiVersion;

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

  @ApiModelProperty(example = "1699209842000", value = "Lead form creation time. Unix timestamp in milliseconds.")
 /**
   * Lead form creation time. Unix timestamp in milliseconds.
  **/
  private Integer createdTime;
 /**
   * Lead form ID.
   * @return leadFormId
  **/
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdAccountGetSubscriptionResponse leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

 /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
  **/
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public AdAccountGetSubscriptionResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

 /**
   * Subscription ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccountGetSubscriptionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * User account used to subscribe lead data.
   * @return userAccountId
  **/
  @JsonProperty("user_account_id")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public AdAccountGetSubscriptionResponse userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

 /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountGetSubscriptionResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * API version.
   * @return apiVersion
  **/
  @JsonProperty("api_version")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public AdAccountGetSubscriptionResponse apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
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

  public AdAccountGetSubscriptionResponse cryptographicKey(String cryptographicKey) {
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

  public AdAccountGetSubscriptionResponse cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

 /**
   * Lead form creation time. Unix timestamp in milliseconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

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

