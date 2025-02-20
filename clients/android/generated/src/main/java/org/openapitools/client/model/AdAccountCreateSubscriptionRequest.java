/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.AdAccountCreateSubscriptionRequestPartnerMetadata;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AdAccountCreateSubscriptionRequest {
  
  @SerializedName("webhook_url")
  private String webhookUrl = null;
  @SerializedName("lead_form_id")
  private String leadFormId = null;
  @SerializedName("partner_access_token")
  private String partnerAccessToken = null;
  @SerializedName("partner_refresh_token")
  private String partnerRefreshToken = null;
  @SerializedName("partner_metadata")
  private AdAccountCreateSubscriptionRequestPartnerMetadata partnerMetadata = null;

  /**
   * Standard HTTPS webhook URL.
   **/
  @ApiModelProperty(required = true, value = "Standard HTTPS webhook URL.")
  public String getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  /**
   * Lead form ID.
   **/
  @ApiModelProperty(value = "Lead form ID.")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   **/
  @ApiModelProperty(value = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   **/
  @ApiModelProperty(value = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }
  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.webhookUrl == null ? adAccountCreateSubscriptionRequest.webhookUrl == null : this.webhookUrl.equals(adAccountCreateSubscriptionRequest.webhookUrl)) &&
        (this.leadFormId == null ? adAccountCreateSubscriptionRequest.leadFormId == null : this.leadFormId.equals(adAccountCreateSubscriptionRequest.leadFormId)) &&
        (this.partnerAccessToken == null ? adAccountCreateSubscriptionRequest.partnerAccessToken == null : this.partnerAccessToken.equals(adAccountCreateSubscriptionRequest.partnerAccessToken)) &&
        (this.partnerRefreshToken == null ? adAccountCreateSubscriptionRequest.partnerRefreshToken == null : this.partnerRefreshToken.equals(adAccountCreateSubscriptionRequest.partnerRefreshToken)) &&
        (this.partnerMetadata == null ? adAccountCreateSubscriptionRequest.partnerMetadata == null : this.partnerMetadata.equals(adAccountCreateSubscriptionRequest.partnerMetadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.webhookUrl == null ? 0: this.webhookUrl.hashCode());
    result = 31 * result + (this.leadFormId == null ? 0: this.leadFormId.hashCode());
    result = 31 * result + (this.partnerAccessToken == null ? 0: this.partnerAccessToken.hashCode());
    result = 31 * result + (this.partnerRefreshToken == null ? 0: this.partnerRefreshToken.hashCode());
    result = 31 * result + (this.partnerMetadata == null ? 0: this.partnerMetadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreateSubscriptionRequest {\n");
    
    sb.append("  webhookUrl: ").append(webhookUrl).append("\n");
    sb.append("  leadFormId: ").append(leadFormId).append("\n");
    sb.append("  partnerAccessToken: ").append(partnerAccessToken).append("\n");
    sb.append("  partnerRefreshToken: ").append(partnerRefreshToken).append("\n");
    sb.append("  partnerMetadata: ").append(partnerMetadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
