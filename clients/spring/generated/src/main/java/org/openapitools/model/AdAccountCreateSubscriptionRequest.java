package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdAccountCreateSubscriptionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountCreateSubscriptionRequest {

  private String webhookUrl;

  private String leadFormId;

  private String partnerAccessToken;

  private String partnerRefreshToken;

  public AdAccountCreateSubscriptionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdAccountCreateSubscriptionRequest(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public AdAccountCreateSubscriptionRequest webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
  */
  @NotNull 
  @Schema(name = "webhook_url", example = "https://webhook.example.com/xyz", description = "Standard HTTPS webhook URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public AdAccountCreateSubscriptionRequest leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  /**
   * Lead form ID.
   * @return leadFormId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "lead_form_id", example = "383791336903426390", description = "Lead form ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdAccountCreateSubscriptionRequest partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

  /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerAccessToken
  */
  
  @Schema(name = "partner_access_token", description = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public AdAccountCreateSubscriptionRequest partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

  /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerRefreshToken
  */
  
  @Schema(name = "partner_refresh_token", description = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

