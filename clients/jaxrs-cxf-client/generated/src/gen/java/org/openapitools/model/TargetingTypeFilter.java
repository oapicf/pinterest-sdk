package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdsAnalyticsTargetingType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTypeFilter  {
  
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.")
 /**
   * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  **/
  private List<AdsAnalyticsTargetingType> targetingTypes;
 /**
   * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
   * @return targetingTypes
  **/
  @JsonProperty("targeting_types")
  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public TargetingTypeFilter targetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public TargetingTypeFilter addTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    this.targetingTypes.add(targetingTypesItem);
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
    TargetingTypeFilter targetingTypeFilter = (TargetingTypeFilter) o;
    return Objects.equals(this.targetingTypes, targetingTypeFilter.targetingTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetingTypes);
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

