package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.LeadSubscriptionPostParamsCreateAllOfPartnerMetadata;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadSubscriptionPostParamsCreate   {
  
  private String leadFormId;
  private String webhookUrl;
  private String partnerAccessToken;
  private LeadSubscriptionPostParamsCreateAllOfPartnerMetadata partnerMetadata;
  private String partnerRefreshToken;

  public LeadSubscriptionPostParamsCreate () {

  }

  public LeadSubscriptionPostParamsCreate (String leadFormId, String webhookUrl, String partnerAccessToken, LeadSubscriptionPostParamsCreateAllOfPartnerMetadata partnerMetadata, String partnerRefreshToken) {
    this.leadFormId = leadFormId;
    this.webhookUrl = webhookUrl;
    this.partnerAccessToken = partnerAccessToken;
    this.partnerMetadata = partnerMetadata;
    this.partnerRefreshToken = partnerRefreshToken;
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

    
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

    
  @JsonProperty("partner_metadata")
  public LeadSubscriptionPostParamsCreateAllOfPartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(LeadSubscriptionPostParamsCreateAllOfPartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

    
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
    LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate = (LeadSubscriptionPostParamsCreate) o;
    return Objects.equals(leadFormId, leadSubscriptionPostParamsCreate.leadFormId) &&
        Objects.equals(webhookUrl, leadSubscriptionPostParamsCreate.webhookUrl) &&
        Objects.equals(partnerAccessToken, leadSubscriptionPostParamsCreate.partnerAccessToken) &&
        Objects.equals(partnerMetadata, leadSubscriptionPostParamsCreate.partnerMetadata) &&
        Objects.equals(partnerRefreshToken, leadSubscriptionPostParamsCreate.partnerRefreshToken);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
