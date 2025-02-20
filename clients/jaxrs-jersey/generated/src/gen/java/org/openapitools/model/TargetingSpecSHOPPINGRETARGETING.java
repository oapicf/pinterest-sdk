/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TargetingSpecSHOPPINGRETARGETING
 */
@JsonPropertyOrder({
  TargetingSpecSHOPPINGRETARGETING.JSON_PROPERTY_LOOKBACK_WINDOW,
  TargetingSpecSHOPPINGRETARGETING.JSON_PROPERTY_TAG_TYPES,
  TargetingSpecSHOPPINGRETARGETING.JSON_PROPERTY_EXCLUSION_WINDOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingSpecSHOPPINGRETARGETING   {
  public static final String JSON_PROPERTY_LOOKBACK_WINDOW = "lookback_window";
  @JsonProperty(JSON_PROPERTY_LOOKBACK_WINDOW)
  private Integer lookbackWindow;

  public static final String JSON_PROPERTY_TAG_TYPES = "tag_types";
  @JsonProperty(JSON_PROPERTY_TAG_TYPES)
  private List<Integer> tagTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_EXCLUSION_WINDOW = "exclusion_window";
  @JsonProperty(JSON_PROPERTY_EXCLUSION_WINDOW)
  private Integer exclusionWindow;

  public TargetingSpecSHOPPINGRETARGETING lookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
    return this;
  }

  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   * @return lookbackWindow
   **/
  @JsonProperty(value = "lookback_window")
  @ApiModelProperty(example = "30", value = "Number of days ago to start lookback timeframe for dynamic retargeting")
  
  public Integer getLookbackWindow() {
    return lookbackWindow;
  }

  public void setLookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }

  public TargetingSpecSHOPPINGRETARGETING tagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
    return this;
  }

  public TargetingSpecSHOPPINGRETARGETING addTagTypesItem(Integer tagTypesItem) {
    if (this.tagTypes == null) {
      this.tagTypes = new ArrayList<>();
    }
    this.tagTypes.add(tagTypesItem);
    return this;
  }

  /**
   * Event types to target for dynamic retargeting
   * @return tagTypes
   **/
  @JsonProperty(value = "tag_types")
  @ApiModelProperty(example = "[0,6]", value = "Event types to target for dynamic retargeting")
  
  public List<Integer> getTagTypes() {
    return tagTypes;
  }

  public void setTagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
  }

  public TargetingSpecSHOPPINGRETARGETING exclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
    return this;
  }

  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   * @return exclusionWindow
   **/
  @JsonProperty(value = "exclusion_window")
  @ApiModelProperty(example = "14", value = "Number of days ago to stop lookback timeframe for dynamic retargeting")
  
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

