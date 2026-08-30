package org.openapitools.model;

import org.openapitools.model.PartnerMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadSubscriptionPostParamsCreate  {
  
 /**
  * Lead form ID.
  */
  @ApiModelProperty(value = "Lead form ID.")
  private String leadFormId;

 /**
  * Standard HTTPS webhook URL.
  */
  @ApiModelProperty(required = true, value = "Standard HTTPS webhook URL.")
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
  public LeadSubscriptionPostParamsCreate leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

 /**
  * Standard HTTPS webhook URL.
  * @return webhookUrl
  */
  @JsonProperty("webhook_url")
  @NotNull
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
  public LeadSubscriptionPostParamsCreate webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

 /**
  * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  * @return partnerAccessToken
  */
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  /**
   * Sets the <code>partnerAccessToken</code> property.
   */
 public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  /**
   * Sets the <code>partnerAccessToken</code> property.
   */
  public LeadSubscriptionPostParamsCreate partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

 /**
  * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  * @return partnerMetadata
  */
  @JsonProperty("partner_metadata")
  public PartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }

  /**
   * Sets the <code>partnerMetadata</code> property.
   */
 public void setPartnerMetadata(PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  /**
   * Sets the <code>partnerMetadata</code> property.
   */
  public LeadSubscriptionPostParamsCreate partnerMetadata(PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

 /**
  * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  * @return partnerRefreshToken
  */
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  /**
   * Sets the <code>partnerRefreshToken</code> property.
   */
 public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  /**
   * Sets the <code>partnerRefreshToken</code> property.
   */
  public LeadSubscriptionPostParamsCreate partnerRefreshToken(String partnerRefreshToken) {
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
    LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate = (LeadSubscriptionPostParamsCreate) o;
    return Objects.equals(this.leadFormId, leadSubscriptionPostParamsCreate.leadFormId) &&
        Objects.equals(this.webhookUrl, leadSubscriptionPostParamsCreate.webhookUrl) &&
        Objects.equals(this.partnerAccessToken, leadSubscriptionPostParamsCreate.partnerAccessToken) &&
        Objects.equals(this.partnerMetadata, leadSubscriptionPostParamsCreate.partnerMetadata) &&
        Objects.equals(this.partnerRefreshToken, leadSubscriptionPostParamsCreate.partnerRefreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadFormId, webhookUrl, partnerAccessToken, partnerMetadata, partnerRefreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadSubscriptionPostParamsCreate {\n");
    
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
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

