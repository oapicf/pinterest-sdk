package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LeadSubscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscription   {
  private String adAccountId;
  private String apiVersion;
  private Integer createdTime;
  private String cryptographicAlgorithm;
  private String cryptographicKey;
  private String id;
  private String leadFormId;
  private String userAccountId;
  private String webhookUrl;

  public LeadSubscription() {
  }

  /**
   * The Ad Account ID that this lead form belongs to.
   **/
  public LeadSubscription adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  @JsonProperty("ad_account_id")
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * API version.
   **/
  public LeadSubscription apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(value = "API version.")
  @JsonProperty("api_version")
  public String getApiVersion() {
    return apiVersion;
  }

  @JsonProperty("api_version")
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Subscription creation time. Unix timestamp in milliseconds.
   **/
  public LeadSubscription createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(value = "Subscription creation time. Unix timestamp in milliseconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Lead data encryption algorithm.
   **/
  public LeadSubscription cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

  
  @ApiModelProperty(value = "Lead data encryption algorithm.")
  @JsonProperty("cryptographic_algorithm")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  @JsonProperty("cryptographic_algorithm")
  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  /**
   * Base64 encoded key for client to decrypt lead data.
   **/
  public LeadSubscription cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

  
  @ApiModelProperty(value = "Base64 encoded key for client to decrypt lead data.")
  @JsonProperty("cryptographic_key")
  public String getCryptographicKey() {
    return cryptographicKey;
  }

  @JsonProperty("cryptographic_key")
  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  /**
   * Subscription ID.
   **/
  public LeadSubscription id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Subscription ID.")
  @JsonProperty("id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Lead form ID.
   **/
  public LeadSubscription leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  
  @ApiModelProperty(value = "Lead form ID.")
  @JsonProperty("lead_form_id")
   @Pattern(regexp="^\\d+$")public String getLeadFormId() {
    return leadFormId;
  }

  @JsonProperty("lead_form_id")
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * User account used to subscribe lead data.
   **/
  public LeadSubscription userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "User account used to subscribe lead data.")
  @JsonProperty("user_account_id")
   @Pattern(regexp="^\\d+$")public String getUserAccountId() {
    return userAccountId;
  }

  @JsonProperty("user_account_id")
  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  /**
   * Standard HTTPS webhook URL.
   **/
  public LeadSubscription webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Standard HTTPS webhook URL.")
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  @JsonProperty("webhook_url")
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
