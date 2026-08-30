package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PartnerMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscriptionPostParams   {
  
  private String adAccountId;
  private String apiVersion;
  private Integer createdTime;
  private String cryptographicAlgorithm;
  private String cryptographicKey;
  private String id;
  private String leadFormId;
  private String userAccountId;
  private String webhookUrl;
  private String partnerAccessToken;
  private PartnerMetadata partnerMetadata;
  private String partnerRefreshToken;

  /**
   * The Ad Account ID that this lead form belongs to.
   **/
  
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * API version.
   **/
  
  @ApiModelProperty(value = "API version.")
  @JsonProperty("api_version")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Subscription creation time. Unix timestamp in milliseconds.
   **/
  
  @ApiModelProperty(value = "Subscription creation time. Unix timestamp in milliseconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Lead data encryption algorithm.
   **/
  
  @ApiModelProperty(value = "Lead data encryption algorithm.")
  @JsonProperty("cryptographic_algorithm")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }
  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  /**
   * Base64 encoded key for client to decrypt lead data.
   **/
  
  @ApiModelProperty(value = "Base64 encoded key for client to decrypt lead data.")
  @JsonProperty("cryptographic_key")
  public String getCryptographicKey() {
    return cryptographicKey;
  }
  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  /**
   * Subscription ID.
   **/
  
  @ApiModelProperty(value = "Subscription ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Lead form ID.
   **/
  
  @ApiModelProperty(value = "Lead form ID.")
  @JsonProperty("lead_form_id")
 @Pattern(regexp="^\\d+$")  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * User account used to subscribe lead data.
   **/
  
  @ApiModelProperty(value = "User account used to subscribe lead data.")
  @JsonProperty("user_account_id")
 @Pattern(regexp="^\\d+$")  public String getUserAccountId() {
    return userAccountId;
  }
  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  /**
   * Standard HTTPS webhook URL.
   **/
  
  @ApiModelProperty(value = "Standard HTTPS webhook URL.")
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   **/
  
  @ApiModelProperty(value = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  /**
   * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
   **/
  
  @ApiModelProperty(value = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
  @JsonProperty("partner_metadata")
  public PartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   **/
  
  @ApiModelProperty(value = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")
  @JsonProperty("partner_refresh_token")
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

