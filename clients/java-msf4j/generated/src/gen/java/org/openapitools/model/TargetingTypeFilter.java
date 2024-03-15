package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdsAnalyticsTargetingType;

/**
 * TargetingTypeFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TargetingTypeFilter   {
  @JsonProperty("targeting_types")
  private List<AdsAnalyticsTargetingType> targetingTypes = null;

  public TargetingTypeFilter targetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public TargetingTypeFilter addTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = ;
    }
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

   /**
   * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
   * @return targetingTypes
  **/
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.")
  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

