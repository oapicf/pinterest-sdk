package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingSpecSHOPPINGRETARGETING  {
  
 /**
  * Number of days ago to start lookback timeframe for dynamic retargeting
  */
  @ApiModelProperty(example = "30", value = "Number of days ago to start lookback timeframe for dynamic retargeting")
  private Integer lookbackWindow;

 /**
  * Event types to target for dynamic retargeting
  */
  @ApiModelProperty(example = "[0,6]", value = "Event types to target for dynamic retargeting")
  private List<Integer> tagTypes = new ArrayList<>();

 /**
  * Number of days ago to stop lookback timeframe for dynamic retargeting
  */
  @ApiModelProperty(example = "14", value = "Number of days ago to stop lookback timeframe for dynamic retargeting")
  private Integer exclusionWindow;
 /**
  * Number of days ago to start lookback timeframe for dynamic retargeting
  * @return lookbackWindow
  */
  @JsonProperty("lookback_window")
  public Integer getLookbackWindow() {
    return lookbackWindow;
  }

  /**
   * Sets the <code>lookbackWindow</code> property.
   */
 public void setLookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }

  /**
   * Sets the <code>lookbackWindow</code> property.
   */
  public TargetingSpecSHOPPINGRETARGETING lookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
    return this;
  }

 /**
  * Event types to target for dynamic retargeting
  * @return tagTypes
  */
  @JsonProperty("tag_types")
  public List<Integer> getTagTypes() {
    return tagTypes;
  }

  /**
   * Sets the <code>tagTypes</code> property.
   */
 public void setTagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
  }

  /**
   * Sets the <code>tagTypes</code> property.
   */
  public TargetingSpecSHOPPINGRETARGETING tagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>tagTypes</code> list.
   */
  public TargetingSpecSHOPPINGRETARGETING addTagTypesItem(Integer tagTypesItem) {
    this.tagTypes.add(tagTypesItem);
    return this;
  }

 /**
  * Number of days ago to stop lookback timeframe for dynamic retargeting
  * @return exclusionWindow
  */
  @JsonProperty("exclusion_window")
  public Integer getExclusionWindow() {
    return exclusionWindow;
  }

  /**
   * Sets the <code>exclusionWindow</code> property.
   */
 public void setExclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
  }

  /**
   * Sets the <code>exclusionWindow</code> property.
   */
  public TargetingSpecSHOPPINGRETARGETING exclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

