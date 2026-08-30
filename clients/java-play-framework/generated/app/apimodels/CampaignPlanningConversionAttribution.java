package apimodels;

import apimodels.CampaignPlanningConversionAttributionWindowDays;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Attribution windows for a conversion event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignPlanningConversionAttribution   {
  @JsonProperty("click_window_days")
  @Valid

  private CampaignPlanningConversionAttributionWindowDays clickWindowDays;

  @JsonProperty("engagement_window_days")
  @Valid

  private CampaignPlanningConversionAttributionWindowDays engagementWindowDays;

  @JsonProperty("view_window_days")
  @Valid

  private CampaignPlanningConversionAttributionWindowDays viewWindowDays;

  public CampaignPlanningConversionAttribution clickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for a pin click action.
   * @return clickWindowDays
  **/
  public CampaignPlanningConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public CampaignPlanningConversionAttribution engagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
   * @return engagementWindowDays
  **/
  public CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public CampaignPlanningConversionAttribution viewWindowDays(CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for a view action.
   * @return viewWindowDays
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

