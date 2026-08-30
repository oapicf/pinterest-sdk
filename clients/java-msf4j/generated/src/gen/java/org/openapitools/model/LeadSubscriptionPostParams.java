package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PartnerMetadata;

/**
 * LeadSubscriptionPostParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscriptionPostParams   {
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

  @JsonProperty("partner_access_token")
  private String partnerAccessToken;

  @JsonProperty("partner_metadata")
  private PartnerMetadata partnerMetadata;

  @JsonProperty("partner_refresh_token")
  private String partnerRefreshToken;

  public LeadSubscriptionPostParams adAccountId(String adAccountId) {
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

  public LeadSubscriptionPostParams apiVersion(String apiVersion) {
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

  public LeadSubscriptionPostParams createdTime(Integer createdTime) {
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

  public LeadSubscriptionPostParams cryptographicAlgorithm(String cryptographicAlgorithm) {
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

  public LeadSubscriptionPostParams cryptographicKey(String cryptographicKey) {
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

  public LeadSubscriptionPostParams id(String id) {
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

  public LeadSubscriptionPostParams leadFormId(String leadFormId) {
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

  public LeadSubscriptionPostParams userAccountId(String userAccountId) {
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

  public LeadSubscriptionPostParams webhookUrl(String webhookUrl) {
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

  public LeadSubscriptionPostParams partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

   /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerAccessToken
  **/
  @ApiModelProperty(value = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public LeadSubscriptionPostParams partnerMetadata(PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

   /**
   * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
   * @return partnerMetadata
  **/
  @ApiModelProperty(value = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
  public PartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }

  public void setPartnerMetadata(PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  public LeadSubscriptionPostParams partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

   /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerRefreshToken
  **/
  @ApiModelProperty(value = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

