package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountGetSubscriptionResponse   {
  
  private String leadFormId;
  private String webhookUrl;
  private String id;
  private String userAccountId;
  private String adAccountId;
  private String apiVersion;
  private String cryptographicKey;
  private String cryptographicAlgorithm;
  private Integer createdTime;

  public AdAccountGetSubscriptionResponse () {

  }

  public AdAccountGetSubscriptionResponse (String leadFormId, String webhookUrl, String id, String userAccountId, String adAccountId, String apiVersion, String cryptographicKey, String cryptographicAlgorithm, Integer createdTime) {
    this.leadFormId = leadFormId;
    this.webhookUrl = webhookUrl;
    this.id = id;
    this.userAccountId = userAccountId;
    this.adAccountId = adAccountId;
    this.apiVersion = apiVersion;
    this.cryptographicKey = cryptographicKey;
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    this.createdTime = createdTime;
  }

    
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

    
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("user_account_id")
  public String getUserAccountId() {
    return userAccountId;
  }
  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("api_version")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

    
  @JsonProperty("cryptographic_key")
  public String getCryptographicKey() {
    return cryptographicKey;
  }
  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

    
  @JsonProperty("cryptographic_algorithm")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }
  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

    
  @JsonProperty("created_time")
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
    return Objects.equals(leadFormId, adAccountGetSubscriptionResponse.leadFormId) &&
        Objects.equals(webhookUrl, adAccountGetSubscriptionResponse.webhookUrl) &&
        Objects.equals(id, adAccountGetSubscriptionResponse.id) &&
        Objects.equals(userAccountId, adAccountGetSubscriptionResponse.userAccountId) &&
        Objects.equals(adAccountId, adAccountGetSubscriptionResponse.adAccountId) &&
        Objects.equals(apiVersion, adAccountGetSubscriptionResponse.apiVersion) &&
        Objects.equals(cryptographicKey, adAccountGetSubscriptionResponse.cryptographicKey) &&
        Objects.equals(cryptographicAlgorithm, adAccountGetSubscriptionResponse.cryptographicAlgorithm) &&
        Objects.equals(createdTime, adAccountGetSubscriptionResponse.createdTime);
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
