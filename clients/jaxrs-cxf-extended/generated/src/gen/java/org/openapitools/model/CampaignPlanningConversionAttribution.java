package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningConversionAttributionWindowDays;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Attribution windows for a conversion event.
 */
@ApiModel(description="Attribution windows for a conversion event.")

public class CampaignPlanningConversionAttribution  {
  
 /**
  * Number of days to use as the conversion attribution window for a pin click action.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action.")
  @Valid
  private CampaignPlanningConversionAttributionWindowDays clickWindowDays;

 /**
  * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.")
  @Valid
  private CampaignPlanningConversionAttributionWindowDays engagementWindowDays;

 /**
  * Number of days to use as the conversion attribution window for a view action.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action.")
  @Valid
  private CampaignPlanningConversionAttributionWindowDays viewWindowDays;
 /**
  * Number of days to use as the conversion attribution window for a pin click action.
  * @return clickWindowDays
  */
  @JsonProperty("click_window_days")
  public CampaignPlanningConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
 public void setClickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
  public CampaignPlanningConversionAttribution clickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
  * @return engagementWindowDays
  */
  @JsonProperty("engagement_window_days")
  public CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  /**
   * Sets the <code>engagementWindowDays</code> property.
   */
 public void setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   * Sets the <code>engagementWindowDays</code> property.
   */
  public CampaignPlanningConversionAttribution engagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for a view action.
  * @return viewWindowDays
  */
  @JsonProperty("view_window_days")
  public CampaignPlanningConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
 public void setViewWindowDays(CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
  public CampaignPlanningConversionAttribution viewWindowDays(CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
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
    CampaignPlanningConversionAttribution campaignPlanningConversionAttribution = (CampaignPlanningConversionAttribution) o;
    return Objects.equals(this.clickWindowDays, campaignPlanningConversionAttribution.clickWindowDays) &&
        Objects.equals(this.engagementWindowDays, campaignPlanningConversionAttribution.engagementWindowDays) &&
        Objects.equals(this.viewWindowDays, campaignPlanningConversionAttribution.viewWindowDays);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

