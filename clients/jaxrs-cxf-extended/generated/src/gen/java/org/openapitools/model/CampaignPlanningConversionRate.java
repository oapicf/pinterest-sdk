package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningConversionAttribution;
import org.openapitools.model.CampaignPlanningConversionEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */
@ApiModel(description="Conversion rate estimate for a specific conversion event and attribution window combination.")

public class CampaignPlanningConversionRate  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CampaignPlanningConversionAttribution attributionWindows;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CampaignPlanningConversionEvent conversionEvent;

 /**
  * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
  */
  @ApiModelProperty(example = "2.32600002288818", required = true, value = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.")
  private Float conversionRate;
 /**
  * Get attributionWindows
  * @return attributionWindows
  */
  @JsonProperty("attribution_windows")
  @NotNull
  public CampaignPlanningConversionAttribution getAttributionWindows() {
    return attributionWindows;
  }

  /**
   * Sets the <code>attributionWindows</code> property.
   */
 public void setAttributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  /**
   * Sets the <code>attributionWindows</code> property.
   */
  public CampaignPlanningConversionRate attributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

 /**
  * Get conversionEvent
  * @return conversionEvent
  */
  @JsonProperty("conversion_event")
  @NotNull
  public CampaignPlanningConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
 public void setConversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
  public CampaignPlanningConversionRate conversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

 /**
  * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
  * @return conversionRate
  */
  @JsonProperty("conversion_rate")
  @NotNull
  public Float getConversionRate() {
    return conversionRate;
  }

  /**
   * Sets the <code>conversionRate</code> property.
   */
 public void setConversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
  }

  /**
   * Sets the <code>conversionRate</code> property.
   */
  public CampaignPlanningConversionRate conversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

