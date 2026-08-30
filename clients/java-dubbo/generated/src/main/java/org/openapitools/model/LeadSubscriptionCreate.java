package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LeadSubscriptionCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Lead form ID.
   */
  @JsonProperty("lead_form_id")
  private String leadFormId;

  /**
   * Standard HTTPS webhook URL.
   */
  @JsonProperty("webhook_url")
  private String webhookUrl;

  /**
   * Lead form ID.
   * @return leadFormId
   */
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
   */
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
    return Objects.equals(this.leadFormId, leadSubscriptionCreate.leadFormId) &&
        Objects.equals(this.webhookUrl, leadSubscriptionCreate.webhookUrl);
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
