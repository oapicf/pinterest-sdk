package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class TargetingSpecSHOPPINGRETARGETING   {
  
  private Integer lookbackWindow;

  private List<Integer> tagTypes;

  private Integer exclusionWindow;

  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   **/
  public TargetingSpecSHOPPINGRETARGETING lookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
    return this;
  }

  
  @ApiModelProperty(example = "30", value = "Number of days ago to start lookback timeframe for dynamic retargeting")
  @JsonProperty("lookback_window")
  public Integer getLookbackWindow() {
    return lookbackWindow;
  }
  public void setLookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }


  /**
   * Event types to target for dynamic retargeting
   **/
  public TargetingSpecSHOPPINGRETARGETING tagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[0,6]", value = "Event types to target for dynamic retargeting")
  @JsonProperty("tag_types")
  public List<Integer> getTagTypes() {
    return tagTypes;
  }
  public void setTagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
  }

  public TargetingSpecSHOPPINGRETARGETING addTagTypesItem(Integer tagTypesItem) {
    if (this.tagTypes == null) {
      this.tagTypes = new ArrayList<>();
    }
    this.tagTypes.add(tagTypesItem);
    return this;
  }


  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   **/
  public TargetingSpecSHOPPINGRETARGETING exclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
    return this;
  }

  
  @ApiModelProperty(example = "14", value = "Number of days ago to stop lookback timeframe for dynamic retargeting")
  @JsonProperty("exclusion_window")
  public Integer getExclusionWindow() {
    return exclusionWindow;
  }
  public void setExclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING = (TargetingSpecSHOPPINGRETARGETING) o;
    return Objects.equals(this.lookbackWindow, targetingSpecSHOPPINGRETARGETING.lookbackWindow) &&
        Objects.equals(this.tagTypes, targetingSpecSHOPPINGRETARGETING.tagTypes) &&
        Objects.equals(this.exclusionWindow, targetingSpecSHOPPINGRETARGETING.exclusionWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookbackWindow, tagTypes, exclusionWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecSHOPPINGRETARGETING {\n");
    
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    tagTypes: ").append(toIndentedString(tagTypes)).append("\n");
    sb.append("    exclusionWindow: ").append(toIndentedString(exclusionWindow)).append("\n");
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

