package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PartnerMetadata;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LeadSubscriptionPostParamsCreate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadSubscriptionPostParamsCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String leadFormId;

  private String webhookUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String partnerAccessToken;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable PartnerMetadata partnerMetadata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String partnerRefreshToken;

  public LeadSubscriptionPostParamsCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LeadSubscriptionPostParamsCreate(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public LeadSubscriptionPostParamsCreate leadFormId(@Nullable String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  /**
   * Lead form ID.
   * @return leadFormId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "lead_form_id", description = "Lead form ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead_form_id")
  public @Nullable String getLeadFormId() {
    return leadFormId;
  }

  @JsonProperty("lead_form_id")
  public void setLeadFormId(@Nullable String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public LeadSubscriptionPostParamsCreate webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
   */
  @NotNull 
  @Schema(name = "webhook_url", description = "Standard HTTPS webhook URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  @JsonProperty("webhook_url")
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public LeadSubscriptionPostParamsCreate partnerAccessToken(@Nullable String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

  /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerAccessToken
   */
  
  @Schema(name = "partner_access_token", description = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_access_token")
  public @Nullable String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  @JsonProperty("partner_access_token")
  public void setPartnerAccessToken(@Nullable String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public LeadSubscriptionPostParamsCreate partnerMetadata(@Nullable PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

  /**
   * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
   * @return partnerMetadata
   */
  @Valid 
  @Schema(name = "partner_metadata", description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_metadata")
  public @Nullable PartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }

  @JsonProperty("partner_metadata")
  public void setPartnerMetadata(@Nullable PartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  public LeadSubscriptionPostParamsCreate partnerRefreshToken(@Nullable String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

  /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   * @return partnerRefreshToken
   */
  
  @Schema(name = "partner_refresh_token", description = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_refresh_token")
  public @Nullable String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  @JsonProperty("partner_refresh_token")
  public void setPartnerRefreshToken(@Nullable String partnerRefreshToken) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

