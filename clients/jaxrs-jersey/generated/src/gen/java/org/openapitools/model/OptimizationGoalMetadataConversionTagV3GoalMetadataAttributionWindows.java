/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
 */
@JsonPropertyOrder({
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.JSON_PROPERTY_CLICK_WINDOW_DAYS,
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.JSON_PROPERTY_ENGAGEMENT_WINDOW_DAYS,
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.JSON_PROPERTY_VIEW_WINDOW_DAYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows   {
  public static final String JSON_PROPERTY_CLICK_WINDOW_DAYS = "click_window_days";
  @JsonProperty(JSON_PROPERTY_CLICK_WINDOW_DAYS)
  private Integer clickWindowDays;

  public static final String JSON_PROPERTY_ENGAGEMENT_WINDOW_DAYS = "engagement_window_days";
  @JsonProperty(JSON_PROPERTY_ENGAGEMENT_WINDOW_DAYS)
  private Integer engagementWindowDays;

  public static final String JSON_PROPERTY_VIEW_WINDOW_DAYS = "view_window_days";
  @JsonProperty(JSON_PROPERTY_VIEW_WINDOW_DAYS)
  private Integer viewWindowDays;

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows clickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Get clickWindowDays
   * @return clickWindowDays
   **/
  @JsonProperty(value = "click_window_days")
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
  @JsonProperty(value = "engagement_window_days")
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
  @JsonProperty(value = "view_window_days")
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
