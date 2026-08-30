package org.openapitools.model;

import org.openapitools.model.CampaignPlanningConversionAttribution;
import org.openapitools.model.CampaignPlanningConversionEvent;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */
public class CampaignPlanningConversionRate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attribution_windows")
  private CampaignPlanningConversionAttribution attributionWindows;

  @JsonProperty("conversion_event")
  private CampaignPlanningConversionEvent conversionEvent;

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
   */
  @JsonProperty("conversion_rate")
  private Float conversionRate;

  /**
   * 
   * @return attributionWindows
   */
  public CampaignPlanningConversionAttribution getAttributionWindows() {
    return attributionWindows;
  }

  public void setAttributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  /**
   * 
   * @return conversionEvent
   */
  public CampaignPlanningConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  public void setConversionEvent(CampaignPlanningConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
   * @return conversionRate
   */
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
