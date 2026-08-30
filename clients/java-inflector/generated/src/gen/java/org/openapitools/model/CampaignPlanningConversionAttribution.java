package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConversionAttributionWindowDays;



/**
 * Attribution windows for a conversion event.
 **/

@ApiModel(description = "Attribution windows for a conversion event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningConversionAttribution   {
  @JsonProperty("click_window_days")
  private CampaignPlanningConversionAttributionWindowDays clickWindowDays;

  @JsonProperty("engagement_window_days")
  private CampaignPlanningConversionAttributionWindowDays engagementWindowDays;

  @JsonProperty("view_window_days")
  private CampaignPlanningConversionAttributionWindowDays viewWindowDays;

  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   **/
  public CampaignPlanningConversionAttribution clickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action.")
  @JsonProperty("click_window_days")
  public CampaignPlanningConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
   **/
  public CampaignPlanningConversionAttribution engagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.")
  @JsonProperty("engagement_window_days")
  public CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action.
   **/
  public CampaignPlanningConversionAttribution viewWindowDays(CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action.")
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

