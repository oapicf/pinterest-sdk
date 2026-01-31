package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
 */

@JsonTypeName("OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {

  private @Nullable Integer clickWindowDays;

  private @Nullable Integer engagementWindowDays;

  private @Nullable Integer viewWindowDays;

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows clickWindowDays(@Nullable Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Get clickWindowDays
   * @return clickWindowDays
   */
  
  @Schema(name = "click_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window_days")
  public @Nullable Integer getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(@Nullable Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows engagementWindowDays(@Nullable Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * Get engagementWindowDays
   * @return engagementWindowDays
   */
  
  @Schema(name = "engagement_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_window_days")
  public @Nullable Integer getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(@Nullable Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows viewWindowDays(@Nullable Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Get viewWindowDays
   * @return viewWindowDays
   */
  
  @Schema(name = "view_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window_days")
  public @Nullable Integer getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(@Nullable Integer viewWindowDays) {
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
    OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = (OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows) o;
    return Objects.equals(this.clickWindowDays, optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.clickWindowDays) &&
        Objects.equals(this.engagementWindowDays, optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.engagementWindowDays) &&
        Objects.equals(this.viewWindowDays, optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickWindowDays, engagementWindowDays, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

