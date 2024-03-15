package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TargetingTypeFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TargetingTypeFilter {

  @Valid
  private List<AdsAnalyticsTargetingType> targetingTypes;

  public TargetingTypeFilter targetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public TargetingTypeFilter addTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  /**
   * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
   * @return targetingTypes
  */
  @Valid @Size(min = 1, max = 5) 
  @Schema(name = "targeting_types", description = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_types")
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

