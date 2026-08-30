package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningConversionAttribution;
import org.openapitools.model.CampaignPlanningConversionEvent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */

@Schema(name = "CampaignPlanningConversionRate", description = "Conversion rate estimate for a specific conversion event and attribution window combination.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningConversionRate {

  private CampaignPlanningConversionAttribution attributionWindows;

  private CampaignPlanningConversionEvent conversionEvent;

  private Float conversionRate;

  public CampaignPlanningConversionRate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignPlanningConversionRate(CampaignPlanningConversionAttribution attributionWindows, CampaignPlanningConversionEvent conversionEvent, Float conversionRate) {
    this.attributionWindows = attributionWindows;
    this.conversionEvent = conversionEvent;
    this.conversionRate = conversionRate;
  }

  public CampaignPlanningConversionRate attributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  /**
   * Get attributionWindows
   * @return attributionWindows
   */
  @NotNull @Valid 
  @Schema(name = "attribution_windows", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribution_windows")
  public CampaignPlanningConversionAttribution getAttributionWindows() {
    return attributionWindows;
  }

  public void setAttributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  public CampaignPlanningConversionRate conversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  /**
   * Get conversionEvent
   * @return conversionEvent
   */
  @NotNull @Valid 
  @Schema(name = "conversion_event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conversion_event")
  public CampaignPlanningConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  public void setConversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  public CampaignPlanningConversionRate conversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
   * @return conversionRate
   */
  @NotNull 
  @Schema(name = "conversion_rate", example = "2.32600002288818", description = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conversion_rate")
  public Float getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningConversionRate campaignPlanningConversionRate = (CampaignPlanningConversionRate) o;
    return Objects.equals(this.attributionWindows, campaignPlanningConversionRate.attributionWindows) &&
        Objects.equals(this.conversionEvent, campaignPlanningConversionRate.conversionEvent) &&
        Objects.equals(this.conversionRate, campaignPlanningConversionRate.conversionRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindows, conversionEvent, conversionRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningConversionRate {\n");
    sb.append("    attributionWindows: ").append(toIndentedString(attributionWindows)).append("\n");
    sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
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

