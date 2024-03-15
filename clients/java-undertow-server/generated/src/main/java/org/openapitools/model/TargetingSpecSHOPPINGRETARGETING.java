/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TargetingSpecSHOPPINGRETARGETING   {
  
  private Integer lookbackWindow;
  private List<Integer> tagTypes;
  private Integer exclusionWindow;

  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   */
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
   */
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

  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   */
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
    return Objects.equals(lookbackWindow, targetingSpecSHOPPINGRETARGETING.lookbackWindow) &&
        Objects.equals(tagTypes, targetingSpecSHOPPINGRETARGETING.tagTypes) &&
        Objects.equals(exclusionWindow, targetingSpecSHOPPINGRETARGETING.exclusionWindow);
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

