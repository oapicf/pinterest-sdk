package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows   {
  @JsonProperty("click_window_days")
  private Integer clickWindowDays;

  @JsonProperty("engagement_window_days")
  private Integer engagementWindowDays;

  @JsonProperty("view_window_days")
  private Integer viewWindowDays;

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows clickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

   /**
   * Get clickWindowDays
   * @return clickWindowDays
  **/
  @ApiModelProperty(value = "")
  public Integer getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows engagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

   /**
   * Get engagementWindowDays
   * @return engagementWindowDays
  **/
  @ApiModelProperty(value = "")
  public Integer getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows viewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * Get viewWindowDays
   * @return viewWindowDays
  **/
  @ApiModelProperty(value = "")
  public Integer getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(Integer viewWindowDays) {
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

