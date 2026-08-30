package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LeadSubscriptionCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscriptionCreate   {
  private String leadFormId;
  private String webhookUrl;

  public LeadSubscriptionCreate() {
  }

  @JsonCreator
  public LeadSubscriptionCreate(
    @JsonProperty(required = true, value = "webhook_url") String webhookUrl
  ) {
    this.webhookUrl = webhookUrl;
  }

  /**
   * Lead form ID.
   **/
  public LeadSubscriptionCreate leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  
  @ApiModelProperty(value = "Lead form ID.")
  @JsonProperty("lead_form_id")
   @Pattern(regexp="^\\d+$")public String getLeadFormId() {
    return leadFormId;
  }

  @JsonProperty("lead_form_id")
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
  @JsonProperty(required = true, value = "webhook_url")
  @NotNull public String getWebhookUrl() {
    return webhookUrl;
  }

  @JsonProperty(required = true, value = "webhook_url")
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
