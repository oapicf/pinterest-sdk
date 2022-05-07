package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdsAnalyticsTargetingType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTypeFilter  {
  
 /**
  * List of targeting types
  */
  @ApiModelProperty(value = "List of targeting types")
  @Valid
  private List<AdsAnalyticsTargetingType> targetingTypes = null;
 /**
  * List of targeting types
  * @return targetingTypes
  */
  @JsonProperty("targeting_types")
 @Size(min=1,max=5)  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
 public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
  public TargetingTypeFilter targetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>targetingTypes</code> list.
   */
  public TargetingTypeFilter addTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTypeFilter {\n");
    
    sb.append("    targetingTypes: ").append(toIndentedString(targetingTypes)).append("\n");
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

