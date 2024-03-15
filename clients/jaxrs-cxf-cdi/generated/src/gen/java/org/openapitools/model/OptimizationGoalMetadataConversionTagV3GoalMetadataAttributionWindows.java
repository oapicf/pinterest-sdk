package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows   {
  
  private Integer clickWindowDays;

  private Integer engagementWindowDays;

  private Integer viewWindowDays;

  /**
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows clickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("click_window_days")
  public Integer getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }


  /**
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows engagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("engagement_window_days")
  public Integer getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }


  /**
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows viewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("view_window_days")
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

