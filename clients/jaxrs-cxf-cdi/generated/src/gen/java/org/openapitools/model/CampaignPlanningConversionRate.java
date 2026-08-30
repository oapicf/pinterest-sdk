package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConversionAttribution;
import org.openapitools.model.CampaignPlanningConversionEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Conversion rate estimate for a specific conversion event and attribution window combination.")
public class CampaignPlanningConversionRate   {
  
  private CampaignPlanningConversionAttribution attributionWindows;

  private CampaignPlanningConversionEvent conversionEvent;

  private Float conversionRate;

  /**
   **/
  public CampaignPlanningConversionRate attributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attribution_windows")
  @NotNull
  public CampaignPlanningConversionAttribution getAttributionWindows() {
    return attributionWindows;
  }
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
  @JsonProperty("conversion_event")
  @NotNull
  public CampaignPlanningConversionEvent getConversionEvent() {
    return conversionEvent;
  }
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
  @JsonProperty("conversion_rate")
  @NotNull
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

