package apimodels;

import apimodels.CampaignPlanningConversionAttribution;
import apimodels.CampaignPlanningConversionEvent;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignPlanningConversionRate   {
  @JsonProperty("attribution_windows")
  @NotNull
@Valid

  private CampaignPlanningConversionAttribution attributionWindows;

  @JsonProperty("conversion_event")
  @NotNull
@Valid

  private CampaignPlanningConversionEvent conversionEvent;

  @JsonProperty("conversion_rate")
  @NotNull

  private Float conversionRate;

  public CampaignPlanningConversionRate attributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

   /**
   * Get attributionWindows
   * @return attributionWindows
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

