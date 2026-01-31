package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TargetingTypeFilter {

  /**
   * Reporting targeting type
   */
  public enum TargetingTypesEnum {
    KEYWORD("KEYWORD"),
    
    APPTYPE("APPTYPE"),
    
    GENDER("GENDER"),
    
    LOCATION("LOCATION"),
    
    PLACEMENT("PLACEMENT"),
    
    COUNTRY("COUNTRY"),
    
    TARGETED_INTEREST("TARGETED_INTEREST"),
    
    PINNER_INTEREST("PINNER_INTEREST"),
    
    AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
    
    GEO("GEO"),
    
    AGE_BUCKET("AGE_BUCKET"),
    
    REGION("REGION"),
    
    MEDIA_TYPE("MEDIA_TYPE"),
    
    AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER"),
    
    AUDIENCE_MULTIPLIER("AUDIENCE_MULTIPLIER"),
    
    CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS"),
    
    LOCAL_ADS_STORE_CODE("LOCAL_ADS_STORE_CODE");

    private final String value;

    TargetingTypesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TargetingTypesEnum fromValue(String value) {
      for (TargetingTypesEnum b : TargetingTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<TargetingTypesEnum> targetingTypes = new ArrayList<>();

  public TargetingTypeFilter targetingTypes(List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public TargetingTypeFilter addTargetingTypesItem(TargetingTypesEnum targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  /**
   * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
   * @return targetingTypes
   */
  @Size(min = 1, max = 5) 
  @Schema(name = "targeting_types", description = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_types")
  public List<TargetingTypesEnum> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<TargetingTypesEnum> targetingTypes) {
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

