package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CampaignPlanningConversionAttributionWindowDays;

/**
 * Attribution windows for a conversion event.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningConversionAttribution   {
  
  private CampaignPlanningConversionAttributionWindowDays clickWindowDays;
  private CampaignPlanningConversionAttributionWindowDays engagementWindowDays;
  private CampaignPlanningConversionAttributionWindowDays viewWindowDays;

  public CampaignPlanningConversionAttribution () {

  }

  public CampaignPlanningConversionAttribution (CampaignPlanningConversionAttributionWindowDays clickWindowDays, CampaignPlanningConversionAttributionWindowDays engagementWindowDays, CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
    this.clickWindowDays = clickWindowDays;
    this.engagementWindowDays = engagementWindowDays;
    this.viewWindowDays = viewWindowDays;
  }

    
  @JsonProperty("click_window_days")
  public CampaignPlanningConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

    
  @JsonProperty("engagement_window_days")
  public CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

    
  @JsonProperty("view_window_days")
  public CampaignPlanningConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningConversionAttribution campaignPlanningConversionAttribution = (CampaignPlanningConversionAttribution) o;
    return Objects.equals(clickWindowDays, campaignPlanningConversionAttribution.clickWindowDays) &&
        Objects.equals(engagementWindowDays, campaignPlanningConversionAttribution.engagementWindowDays) &&
        Objects.equals(viewWindowDays, campaignPlanningConversionAttribution.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickWindowDays, engagementWindowDays, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningConversionAttribution {\n");
    
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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
