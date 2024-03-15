package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountCreateSubscriptionRequest  {
  
  @ApiModelProperty(example = "https://webhook.example.com/xyz", required = true, value = "Standard HTTPS webhook URL.")
 /**
   * Standard HTTPS webhook URL.
  **/
  private String webhookUrl;

  @ApiModelProperty(example = "383791336903426390", value = "Lead form ID.")
 /**
   * Lead form ID.
  **/
  private String leadFormId;

  @ApiModelProperty(value = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")
 /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  **/
  private String partnerAccessToken;

  @ApiModelProperty(value = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")
 /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  **/
  private String partnerRefreshToken;
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

  public AdAccountCreateSubscriptionRequest webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

 /**
   * Lead form ID.
   * @return leadFormId
  **/
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdAccountCreateSubscriptionRequest leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
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

  public AdAccountCreateSubscriptionRequest partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
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

  public AdAccountCreateSubscriptionRequest partnerRefreshToken(String partnerRefreshToken) {
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
    AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest = (AdAccountCreateSubscriptionRequest) o;
    return Objects.equals(this.webhookUrl, adAccountCreateSubscriptionRequest.webhookUrl) &&
        Objects.equals(this.leadFormId, adAccountCreateSubscriptionRequest.leadFormId) &&
        Objects.equals(this.partnerAccessToken, adAccountCreateSubscriptionRequest.partnerAccessToken) &&
        Objects.equals(this.partnerRefreshToken, adAccountCreateSubscriptionRequest.partnerRefreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookUrl, leadFormId, partnerAccessToken, partnerRefreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreateSubscriptionRequest {\n");
    
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
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

