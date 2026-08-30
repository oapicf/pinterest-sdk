package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LeadSubscription implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The Ad Account ID that this lead form belongs to.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * API version.
   */
  @JsonProperty("api_version")
  private String apiVersion;

  /**
   * Subscription creation time. Unix timestamp in milliseconds.
   */
  @JsonProperty("created_time")
  private Integer createdTime;

  /**
   * Lead data encryption algorithm.
   */
  @JsonProperty("cryptographic_algorithm")
  private String cryptographicAlgorithm;

  /**
   * Base64 encoded key for client to decrypt lead data.
   */
  @JsonProperty("cryptographic_key")
  private String cryptographicKey;

  /**
   * Subscription ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Lead form ID.
   */
  @JsonProperty("lead_form_id")
  private String leadFormId;

  /**
   * User account used to subscribe lead data.
   */
  @JsonProperty("user_account_id")
  private String userAccountId;

  /**
   * Standard HTTPS webhook URL.
   */
  @JsonProperty("webhook_url")
  private String webhookUrl;

  /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * API version.
   * @return apiVersion
   */
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Subscription creation time. Unix timestamp in milliseconds.
   * @return createdTime
   */
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Lead data encryption algorithm.
   * @return cryptographicAlgorithm
   */
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  /**
   * Base64 encoded key for client to decrypt lead data.
   * @return cryptographicKey
   */
  public String getCryptographicKey() {
    return cryptographicKey;
  }

  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  /**
   * Subscription ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Lead form ID.
   * @return leadFormId
   */
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * User account used to subscribe lead data.
   * @return userAccountId
   */
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
   */
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
