package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PartnerMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscriptionPostParamsCreate   {
  
  private String leadFormId;
  private String webhookUrl;
  private String partnerAccessToken;
  private PartnerMetadata partnerMetadata;
  private String partnerRefreshToken;

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
   * Standard HTTPS webhook URL.
   **/
  
  @ApiModelProperty(required = true, value = "Standard HTTPS webhook URL.")
  @JsonProperty("webhook_url")
  @NotNull
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

