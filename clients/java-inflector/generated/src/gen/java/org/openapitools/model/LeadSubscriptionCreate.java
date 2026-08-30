package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscriptionCreate   {
  @JsonProperty("lead_form_id")
  private String leadFormId;

  @JsonProperty("webhook_url")
  private String webhookUrl;

  /**
   * Lead form ID.
   **/
  public LeadSubscriptionCreate leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  
  @ApiModelProperty(value = "Lead form ID.")
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Standard HTTPS webhook URL.
   **/
  public LeadSubscriptionCreate webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Standard HTTPS webhook URL.")
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadSubscriptionCreate leadSubscriptionCreate = (LeadSubscriptionCreate) o;
    return Objects.equals(leadFormId, leadSubscriptionCreate.leadFormId) &&
        Objects.equals(webhookUrl, leadSubscriptionCreate.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadFormId, webhookUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadSubscriptionCreate {\n");
    
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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

