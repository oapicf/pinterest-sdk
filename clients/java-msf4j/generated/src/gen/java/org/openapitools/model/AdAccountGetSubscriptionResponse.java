package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AdAccountGetSubscriptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountGetSubscriptionResponse   {
  @JsonProperty("lead_form_id")
  private String leadFormId;

  @JsonProperty("webhook_url")
  private String webhookUrl;

  @JsonProperty("id")
  private String id;

  @JsonProperty("user_account_id")
  private String userAccountId;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("api_version")
  private String apiVersion;

  @JsonProperty("cryptographic_key")
  private String cryptographicKey;

  @JsonProperty("cryptographic_algorithm")
  private String cryptographicAlgorithm;

  @JsonProperty("created_time")
  private Integer createdTime;

  public AdAccountGetSubscriptionResponse leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

   /**
   * Lead form ID.
   * @return leadFormId
  **/
  @ApiModelProperty(example = "383791336903426390", value = "Lead form ID.")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdAccountGetSubscriptionResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
  **/
  @ApiModelProperty(example = "https://webhook.example.com/xyz", value = "Standard HTTPS webhook URL.")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public AdAccountGetSubscriptionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Subscription ID.
   * @return id
  **/
  @ApiModelProperty(example = "8078432025948590686", value = "Subscription ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccountGetSubscriptionResponse userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * User account used to subscribe lead data.
   * @return userAccountId
  **/
  @ApiModelProperty(example = "549755885175", value = "User account used to subscribe lead data.")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public AdAccountGetSubscriptionResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
  **/
  @ApiModelProperty(example = "549755885176", value = "The Ad Account ID that this lead form belongs to.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountGetSubscriptionResponse apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version.
   * @return apiVersion
  **/
  @ApiModelProperty(example = "v5", value = "API version.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public AdAccountGetSubscriptionResponse cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

   /**
   * Base64 encoded key for client to decrypt lead data.
   * @return cryptographicKey
  **/
  @ApiModelProperty(example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", value = "Base64 encoded key for client to decrypt lead data.")
  public String getCryptographicKey() {
    return cryptographicKey;
  }

  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  public AdAccountGetSubscriptionResponse cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

   /**
   * Lead data encryption algorithm.
   * @return cryptographicAlgorithm
  **/
  @ApiModelProperty(example = "AES-256-GCM", value = "Lead data encryption algorithm.")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  public AdAccountGetSubscriptionResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Lead form creation time. Unix timestamp in milliseconds.
   * @return createdTime
  **/
  @ApiModelProperty(example = "1699209842000", value = "Lead form creation time. Unix timestamp in milliseconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

