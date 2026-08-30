package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpecShoppingRetargeting   {
  @JsonProperty("exclusion_window")
  private Integer exclusionWindow;

  @JsonProperty("lookback_window")
  private Integer lookbackWindow;

  @JsonProperty("tag_types")
  private List<Integer> tagTypes = null;

  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   **/
  public TargetingSpecShoppingRetargeting exclusionWindow(Integer exclusionWindow) {
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

  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   **/
  public TargetingSpecShoppingRetargeting lookbackWindow(Integer lookbackWindow) {
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
  public TargetingSpecShoppingRetargeting tagTypes(List<Integer> tagTypes) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting = (TargetingSpecShoppingRetargeting) o;
    return Objects.equals(exclusionWindow, targetingSpecShoppingRetargeting.exclusionWindow) &&
        Objects.equals(lookbackWindow, targetingSpecShoppingRetargeting.lookbackWindow) &&
        Objects.equals(tagTypes, targetingSpecShoppingRetargeting.tagTypes);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

