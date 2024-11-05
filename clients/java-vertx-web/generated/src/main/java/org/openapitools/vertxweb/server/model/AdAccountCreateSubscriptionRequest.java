package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AdAccountCreateSubscriptionRequestPartnerMetadata;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountCreateSubscriptionRequest   {
  
  private String webhookUrl;
  private String leadFormId;
  private String partnerAccessToken;
  private String partnerRefreshToken;
  private AdAccountCreateSubscriptionRequestPartnerMetadata partnerMetadata;

  public AdAccountCreateSubscriptionRequest () {

  }

  public AdAccountCreateSubscriptionRequest (String webhookUrl, String leadFormId, String partnerAccessToken, String partnerRefreshToken, AdAccountCreateSubscriptionRequestPartnerMetadata partnerMetadata) {
    this.webhookUrl = webhookUrl;
    this.leadFormId = leadFormId;
    this.partnerAccessToken = partnerAccessToken;
    this.partnerRefreshToken = partnerRefreshToken;
    this.partnerMetadata = partnerMetadata;
  }

    
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

    
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

    
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

    
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }
  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

    
  @JsonProperty("partner_metadata")
  public AdAccountCreateSubscriptionRequestPartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(AdAccountCreateSubscriptionRequestPartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
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
    return Objects.equals(webhookUrl, adAccountCreateSubscriptionRequest.webhookUrl) &&
        Objects.equals(leadFormId, adAccountCreateSubscriptionRequest.leadFormId) &&
        Objects.equals(partnerAccessToken, adAccountCreateSubscriptionRequest.partnerAccessToken) &&
        Objects.equals(partnerRefreshToken, adAccountCreateSubscriptionRequest.partnerRefreshToken) &&
        Objects.equals(partnerMetadata, adAccountCreateSubscriptionRequest.partnerMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookUrl, leadFormId, partnerAccessToken, partnerRefreshToken, partnerMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreateSubscriptionRequest {\n");
    
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
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
