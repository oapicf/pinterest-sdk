package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConversionAttribution;
import org.openapitools.model.CampaignPlanningConversionEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 **/
@ApiModel(description = "Conversion rate estimate for a specific conversion event and attribution window combination.")
@JsonTypeName("CampaignPlanningConversionRate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningConversionRate   {
  private CampaignPlanningConversionAttribution attributionWindows;
  private CampaignPlanningConversionEvent conversionEvent;
  private Float conversionRate;

  public CampaignPlanningConversionRate() {
  }

  @JsonCreator
  public CampaignPlanningConversionRate(
    @JsonProperty(required = true, value = "attribution_windows") CampaignPlanningConversionAttribution attributionWindows,
    @JsonProperty(required = true, value = "conversion_event") CampaignPlanningConversionEvent conversionEvent,
    @JsonProperty(required = true, value = "conversion_rate") Float conversionRate
  ) {
    this.attributionWindows = attributionWindows;
    this.conversionEvent = conversionEvent;
    this.conversionRate = conversionRate;
  }

  /**
   **/
  public CampaignPlanningConversionRate attributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "attribution_windows")
  @NotNull @Valid public CampaignPlanningConversionAttribution getAttributionWindows() {
    return attributionWindows;
  }

  @JsonProperty(required = true, value = "attribution_windows")
  public void setAttributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  /**
   **/
  public CampaignPlanningConversionRate conversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "conversion_event")
  @NotNull public CampaignPlanningConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  @JsonProperty(required = true, value = "conversion_event")
  public void setConversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
   **/
  public CampaignPlanningConversionRate conversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  
  @ApiModelProperty(example = "2.32600002288818", required = true, value = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.")
  @JsonProperty(required = true, value = "conversion_rate")
  @NotNull public Float getConversionRate() {
    return conversionRate;
  }

  @JsonProperty(required = true, value = "conversion_rate")
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
