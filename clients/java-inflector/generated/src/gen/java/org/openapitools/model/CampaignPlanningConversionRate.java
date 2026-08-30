package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConversionAttribution;
import org.openapitools.model.CampaignPlanningConversionEvent;



/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 **/

@ApiModel(description = "Conversion rate estimate for a specific conversion event and attribution window combination.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningConversionRate   {
  @JsonProperty("attribution_windows")
  private CampaignPlanningConversionAttribution attributionWindows;

  @JsonProperty("conversion_event")
  private CampaignPlanningConversionEvent conversionEvent;

  @JsonProperty("conversion_rate")
  private Float conversionRate;

  /**
   **/
  public CampaignPlanningConversionRate attributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attribution_windows")
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
    return Objects.equals(attributionWindows, campaignPlanningConversionRate.attributionWindows) &&
        Objects.equals(conversionEvent, campaignPlanningConversionRate.conversionEvent) &&
        Objects.equals(conversionRate, campaignPlanningConversionRate.conversionRate);
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

