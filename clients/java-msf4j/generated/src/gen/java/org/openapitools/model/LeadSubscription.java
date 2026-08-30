package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LeadSubscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscription   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("api_version")
  private String apiVersion;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("cryptographic_algorithm")
  private String cryptographicAlgorithm;

  @JsonProperty("cryptographic_key")
  private String cryptographicKey;

  @JsonProperty("id")
  private String id;

  @JsonProperty("lead_form_id")
  private String leadFormId;

  @JsonProperty("user_account_id")
  private String userAccountId;

  @JsonProperty("webhook_url")
  private String webhookUrl;

  public LeadSubscription adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
  **/
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public LeadSubscription apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "API version.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public LeadSubscription createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Subscription creation time. Unix timestamp in milliseconds.
   * @return createdTime
  **/
  @ApiModelProperty(value = "Subscription creation time. Unix timestamp in milliseconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public LeadSubscription cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

   /**
   * Lead data encryption algorithm.
   * @return cryptographicAlgorithm
  **/
  @ApiModelProperty(value = "Lead data encryption algorithm.")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  public LeadSubscription cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

   /**
   * Base64 encoded key for client to decrypt lead data.
   * @return cryptographicKey
  **/
  @ApiModelProperty(value = "Base64 encoded key for client to decrypt lead data.")
  public String getCryptographicKey() {
    return cryptographicKey;
  }

  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  public LeadSubscription id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Subscription ID.
   * @return id
  **/
  @ApiModelProperty(value = "Subscription ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LeadSubscription leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

   /**
   * Lead form ID.
   * @return leadFormId
  **/
  @ApiModelProperty(value = "Lead form ID.")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public LeadSubscription userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * User account used to subscribe lead data.
   * @return userAccountId
  **/
  @ApiModelProperty(value = "User account used to subscribe lead data.")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public LeadSubscription webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
  **/
  @ApiModelProperty(value = "Standard HTTPS webhook URL.")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadSubscription leadSubscription = (LeadSubscription) o;
    return Objects.equals(this.adAccountId, leadSubscription.adAccountId) &&
        Objects.equals(this.apiVersion, leadSubscription.apiVersion) &&
        Objects.equals(this.createdTime, leadSubscription.createdTime) &&
        Objects.equals(this.cryptographicAlgorithm, leadSubscription.cryptographicAlgorithm) &&
        Objects.equals(this.cryptographicKey, leadSubscription.cryptographicKey) &&
        Objects.equals(this.id, leadSubscription.id) &&
        Objects.equals(this.leadFormId, leadSubscription.leadFormId) &&
        Objects.equals(this.userAccountId, leadSubscription.userAccountId) &&
        Objects.equals(this.webhookUrl, leadSubscription.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, apiVersion, createdTime, cryptographicAlgorithm, cryptographicKey, id, leadFormId, userAccountId, webhookUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadSubscription {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    cryptographicAlgorithm: ").append(toIndentedString(cryptographicAlgorithm)).append("\n");
    sb.append("    cryptographicKey: ").append(toIndentedString(cryptographicKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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

