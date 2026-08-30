package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CampaignPlanningConversionAttribution;
import org.openapitools.vertxweb.server.model.CampaignPlanningConversionEvent;

/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningConversionRate   {
  
  private CampaignPlanningConversionAttribution attributionWindows;
  private CampaignPlanningConversionEvent conversionEvent;
  private Float conversionRate;

  public CampaignPlanningConversionRate () {

  }

  public CampaignPlanningConversionRate (CampaignPlanningConversionAttribution attributionWindows, CampaignPlanningConversionEvent conversionEvent, Float conversionRate) {
    this.attributionWindows = attributionWindows;
    this.conversionEvent = conversionEvent;
    this.conversionRate = conversionRate;
  }

    
  @JsonProperty("attribution_windows")
  public CampaignPlanningConversionAttribution getAttributionWindows() {
    return attributionWindows;
  }
  public void setAttributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

    
  @JsonProperty("conversion_event")
  public CampaignPlanningConversionEvent getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

    
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
