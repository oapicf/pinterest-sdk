package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TargetingTypeFilter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TargetingTypeFilter   {
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

    private String value;

    TargetingTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TargetingTypesEnum fromValue(String text) {
      for (TargetingTypesEnum b : TargetingTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("targeting_types")
  
  private List<TargetingTypesEnum> targetingTypes = null;

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
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")
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

