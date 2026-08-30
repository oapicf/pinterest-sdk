package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningConversionAttributionWindowDays;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Attribution windows for a conversion event.
 */

@Schema(name = "CampaignPlanningConversionAttribution", description = "Attribution windows for a conversion event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningConversionAttribution {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignPlanningConversionAttributionWindowDays clickWindowDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignPlanningConversionAttributionWindowDays engagementWindowDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignPlanningConversionAttributionWindowDays viewWindowDays;

  public CampaignPlanningConversionAttribution clickWindowDays(@Nullable CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   * @return clickWindowDays
   */
  @Valid 
  @Schema(name = "click_window_days", description = "Number of days to use as the conversion attribution window for a pin click action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window_days")
  public @Nullable CampaignPlanningConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  @JsonProperty("click_window_days")
  public void setClickWindowDays(@Nullable CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public CampaignPlanningConversionAttribution engagementWindowDays(@Nullable CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
   * @return engagementWindowDays
   */
  @Valid 
  @Schema(name = "engagement_window_days", description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_window_days")
  public @Nullable CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  @JsonProperty("engagement_window_days")
  public void setEngagementWindowDays(@Nullable CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public CampaignPlanningConversionAttribution viewWindowDays(@Nullable CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action.
   * @return viewWindowDays
   */
  @Valid 
  @Schema(name = "view_window_days", description = "Number of days to use as the conversion attribution window for a view action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window_days")
  public @Nullable CampaignPlanningConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  @JsonProperty("view_window_days")
  public void setViewWindowDays(@Nullable CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

