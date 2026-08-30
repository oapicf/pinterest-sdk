package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PartnerMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadSubscriptionPostParams  {
  
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
  * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  */
  @ApiModelProperty(value = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")

  private String partnerAccessToken;

 /**
  * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  */
  @ApiModelProperty(value = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")

  @Valid

  private PartnerMetadata partnerMetadata;

 /**
  * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  */
  @ApiModelProperty(value = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")

  private String partnerRefreshToken;
 /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public LeadSubscriptionPostParams adAccountId(String adAccountId) {
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

  public LeadSubscriptionPostParams apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
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

  public LeadSubscriptionPostParams createdTime(Integer createdTime) {
    this.createdTime = createdTime;
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

  public LeadSubscriptionPostParams cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
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

  public LeadSubscriptionPostParams cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

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

  public LeadSubscriptionPostParams id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Lead form ID.
   * @return leadFormId
  **/
  @JsonProperty("lead_form_id")
 @Pattern(regexp="^\\d+$")  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public LeadSubscriptionPostParams leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

 /**
   * User account used to subscribe lead data.
   * @return userAccountId
  **/
  @JsonProperty("user_account_id")
 @Pattern(regexp="^\\d+$")  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public LeadSubscriptionPostParams userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
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

  public LeadSubscriptionPostParams webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

 /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerAccessToken
  **/
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public LeadSubscriptionPostParams partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

 /**
   * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
   * @return partnerMetadata
  **/
  @JsonProperty("partner_metadata")
  public PartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }

  public void setPartnerMetadata(PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  public LeadSubscriptionPostParams partnerMetadata(PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

 /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerRefreshToken
  **/
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  public LeadSubscriptionPostParams partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
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
    LeadSubscriptionPostParams leadSubscriptionPostParams = (LeadSubscriptionPostParams) o;
    return Objects.equals(this.adAccountId, leadSubscriptionPostParams.adAccountId) &&
        Objects.equals(this.apiVersion, leadSubscriptionPostParams.apiVersion) &&
        Objects.equals(this.createdTime, leadSubscriptionPostParams.createdTime) &&
        Objects.equals(this.cryptographicAlgorithm, leadSubscriptionPostParams.cryptographicAlgorithm) &&
        Objects.equals(this.cryptographicKey, leadSubscriptionPostParams.cryptographicKey) &&
        Objects.equals(this.id, leadSubscriptionPostParams.id) &&
        Objects.equals(this.leadFormId, leadSubscriptionPostParams.leadFormId) &&
        Objects.equals(this.userAccountId, leadSubscriptionPostParams.userAccountId) &&
        Objects.equals(this.webhookUrl, leadSubscriptionPostParams.webhookUrl) &&
        Objects.equals(this.partnerAccessToken, leadSubscriptionPostParams.partnerAccessToken) &&
        Objects.equals(this.partnerMetadata, leadSubscriptionPostParams.partnerMetadata) &&
        Objects.equals(this.partnerRefreshToken, leadSubscriptionPostParams.partnerRefreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, apiVersion, createdTime, cryptographicAlgorithm, cryptographicKey, id, leadFormId, userAccountId, webhookUrl, partnerAccessToken, partnerMetadata, partnerRefreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadSubscriptionPostParams {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    cryptographicAlgorithm: ").append(toIndentedString(cryptographicAlgorithm)).append("\n");
    sb.append("    cryptographicKey: ").append(toIndentedString(cryptographicKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

