package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadSubscription  {
  
 /**
  * The Ad Account ID that this lead form belongs to.
  */
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  private String adAccountId;

 /**
  * API version.
  */
  @ApiModelProperty(value = "API version.")
  private String apiVersion;

 /**
  * Subscription creation time. Unix timestamp in milliseconds.
  */
  @ApiModelProperty(value = "Subscription creation time. Unix timestamp in milliseconds.")
  private Integer createdTime;

 /**
  * Lead data encryption algorithm.
  */
  @ApiModelProperty(value = "Lead data encryption algorithm.")
  private String cryptographicAlgorithm;

 /**
  * Base64 encoded key for client to decrypt lead data.
  */
  @ApiModelProperty(value = "Base64 encoded key for client to decrypt lead data.")
  private String cryptographicKey;

 /**
  * Subscription ID.
  */
  @ApiModelProperty(value = "Subscription ID.")
  private String id;

 /**
  * Lead form ID.
  */
  @ApiModelProperty(value = "Lead form ID.")
  private String leadFormId;

 /**
  * User account used to subscribe lead data.
  */
  @ApiModelProperty(value = "User account used to subscribe lead data.")
  private String userAccountId;

 /**
  * Standard HTTPS webhook URL.
  */
  @ApiModelProperty(value = "Standard HTTPS webhook URL.")
  private String webhookUrl;
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
  public LeadSubscription adAccountId(String adAccountId) {
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
  public LeadSubscription apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
  * Subscription creation time. Unix timestamp in milliseconds.
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
  public LeadSubscription createdTime(Integer createdTime) {
    this.createdTime = createdTime;
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
  public LeadSubscription cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
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
  public LeadSubscription cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
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
  public LeadSubscription id(String id) {
    this.id = id;
    return this;
  }

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
  public LeadSubscription leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
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
  public LeadSubscription userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
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
  public LeadSubscription webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

