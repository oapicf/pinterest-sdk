package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingSpecShoppingRetargeting  {
  
 /**
  * Number of days ago to stop lookback timeframe for dynamic retargeting
  */
  @ApiModelProperty(example = "14", value = "Number of days ago to stop lookback timeframe for dynamic retargeting")

  private Integer exclusionWindow;

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
   * @return exclusionWindow
  **/
  @JsonProperty("exclusion_window")
  public Integer getExclusionWindow() {
    return exclusionWindow;
  }

  public void setExclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
  }

  public TargetingSpecShoppingRetargeting exclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
    return this;
  }

 /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   * @return lookbackWindow
  **/
  @JsonProperty("lookback_window")
  public Integer getLookbackWindow() {
    return lookbackWindow;
  }

  public void setLookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }

  public TargetingSpecShoppingRetargeting lookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
    return this;
  }

 /**
   * Event types to target for dynamic retargeting
   * @return tagTypes
  **/
  @JsonProperty("tag_types")
  public List<Integer> getTagTypes() {
    return tagTypes;
  }

  public void setTagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
  }

  public TargetingSpecShoppingRetargeting tagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
    return this;
  }

  public TargetingSpecShoppingRetargeting addTagTypesItem(Integer tagTypesItem) {
    this.tagTypes.add(tagTypesItem);
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
    TargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting = (TargetingSpecShoppingRetargeting) o;
    return Objects.equals(this.exclusionWindow, targetingSpecShoppingRetargeting.exclusionWindow) &&
        Objects.equals(this.lookbackWindow, targetingSpecShoppingRetargeting.lookbackWindow) &&
        Objects.equals(this.tagTypes, targetingSpecShoppingRetargeting.tagTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionWindow, lookbackWindow, tagTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecShoppingRetargeting {\n");
    
    sb.append("    exclusionWindow: ").append(toIndentedString(exclusionWindow)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    tagTypes: ").append(toIndentedString(tagTypes)).append("\n");
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

