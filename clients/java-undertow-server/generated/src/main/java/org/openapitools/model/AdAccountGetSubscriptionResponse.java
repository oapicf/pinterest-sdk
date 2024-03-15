/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  /**
   * Lead form ID.
   */
  public AdAccountGetSubscriptionResponse leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426390", value = "Lead form ID.")
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Standard HTTPS webhook URL.
   */
  public AdAccountGetSubscriptionResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://webhook.example.com/xyz", value = "Standard HTTPS webhook URL.")
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  /**
   * Subscription ID.
   */
  public AdAccountGetSubscriptionResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "8078432025948590686", value = "Subscription ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * User account used to subscribe lead data.
   */
  public AdAccountGetSubscriptionResponse userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "User account used to subscribe lead data.")
  @JsonProperty("user_account_id")
  public String getUserAccountId() {
    return userAccountId;
  }
  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  /**
   * The Ad Account ID that this lead form belongs to.
   */
  public AdAccountGetSubscriptionResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885176", value = "The Ad Account ID that this lead form belongs to.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * API version.
   */
  public AdAccountGetSubscriptionResponse apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(example = "v5", value = "API version.")
  @JsonProperty("api_version")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Base64 encoded key for client to decrypt lead data.
   */
  public AdAccountGetSubscriptionResponse cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

  
  @ApiModelProperty(example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", value = "Base64 encoded key for client to decrypt lead data.")
  @JsonProperty("cryptographic_key")
  public String getCryptographicKey() {
    return cryptographicKey;
  }
  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  /**
   * Lead data encryption algorithm.
   */
  public AdAccountGetSubscriptionResponse cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

  
  @ApiModelProperty(example = "AES-256-GCM", value = "Lead data encryption algorithm.")
  @JsonProperty("cryptographic_algorithm")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }
  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  /**
   * Lead form creation time. Unix timestamp in milliseconds.
   */
  public AdAccountGetSubscriptionResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "1699209842000", value = "Lead form creation time. Unix timestamp in milliseconds.")
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

