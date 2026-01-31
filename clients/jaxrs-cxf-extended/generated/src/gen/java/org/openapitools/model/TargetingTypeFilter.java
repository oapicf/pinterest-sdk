package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTypeFilter  {
  
public enum TargetingTypesEnum {

    @JsonProperty("KEYWORD") KEYWORD(String.valueOf("KEYWORD")),
    @JsonProperty("APPTYPE") APPTYPE(String.valueOf("APPTYPE")),
    @JsonProperty("GENDER") GENDER(String.valueOf("GENDER")),
    @JsonProperty("LOCATION") LOCATION(String.valueOf("LOCATION")),
    @JsonProperty("PLACEMENT") PLACEMENT(String.valueOf("PLACEMENT")),
    @JsonProperty("COUNTRY") COUNTRY(String.valueOf("COUNTRY")),
    @JsonProperty("TARGETED_INTEREST") TARGETED_INTEREST(String.valueOf("TARGETED_INTEREST")),
    @JsonProperty("PINNER_INTEREST") PINNER_INTEREST(String.valueOf("PINNER_INTEREST")),
    @JsonProperty("AUDIENCE_INCLUDE") AUDIENCE_INCLUDE(String.valueOf("AUDIENCE_INCLUDE")),
    @JsonProperty("GEO") GEO(String.valueOf("GEO")),
    @JsonProperty("AGE_BUCKET") AGE_BUCKET(String.valueOf("AGE_BUCKET")),
    @JsonProperty("REGION") REGION(String.valueOf("REGION")),
    @JsonProperty("MEDIA_TYPE") MEDIA_TYPE(String.valueOf("MEDIA_TYPE")),
    @JsonProperty("AGE_BUCKET_AND_GENDER") AGE_BUCKET_AND_GENDER(String.valueOf("AGE_BUCKET_AND_GENDER")),
    @JsonProperty("AUDIENCE_MULTIPLIER") AUDIENCE_MULTIPLIER(String.valueOf("AUDIENCE_MULTIPLIER")),
    @JsonProperty("CREATIVE_ENHANCEMENTS") CREATIVE_ENHANCEMENTS(String.valueOf("CREATIVE_ENHANCEMENTS")),
    @JsonProperty("LOCAL_ADS_STORE_CODE") LOCAL_ADS_STORE_CODE(String.valueOf("LOCAL_ADS_STORE_CODE"));

    private String value;

    TargetingTypesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetingTypesEnum fromValue(String value) {
        for (TargetingTypesEnum b : TargetingTypesEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  */
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")
  private List<TargetingTypesEnum> targetingTypes = new ArrayList<>();
 /**
  * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AUDIENCE_MULTIPLIER\&quot;] is only available in CAMPAIGN_TARGETING level. [\&quot;MEDIA_TYPE\&quot;] is only available in PRODUCT_ITEM_TARGETING level. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
  * @return targetingTypes
  */
  @JsonProperty("targeting_types")
 @Size(min=1,max=5)  public List<TargetingTypesEnum> getTargetingTypes() {
    return targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
 public void setTargetingTypes(List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
  public TargetingTypeFilter targetingTypes(List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>targetingTypes</code> list.
   */
  public TargetingTypeFilter addTargetingTypesItem(TargetingTypesEnum targetingTypesItem) {
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

