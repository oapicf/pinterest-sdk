package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTypeFilter  {
  
public enum TargetingTypesEnum {

KEYWORD(String.valueOf("KEYWORD")), APPTYPE(String.valueOf("APPTYPE")), GENDER(String.valueOf("GENDER")), LOCATION(String.valueOf("LOCATION")), PLACEMENT(String.valueOf("PLACEMENT")), COUNTRY(String.valueOf("COUNTRY")), TARGETED_INTEREST(String.valueOf("TARGETED_INTEREST")), PINNER_INTEREST(String.valueOf("PINNER_INTEREST")), AUDIENCE_INCLUDE(String.valueOf("AUDIENCE_INCLUDE")), GEO(String.valueOf("GEO")), AGE_BUCKET(String.valueOf("AGE_BUCKET")), REGION(String.valueOf("REGION")), MEDIA_TYPE(String.valueOf("MEDIA_TYPE")), AGE_BUCKET_AND_GENDER(String.valueOf("AGE_BUCKET_AND_GENDER")), AUDIENCE_MULTIPLIER(String.valueOf("AUDIENCE_MULTIPLIER")), CREATIVE_ENHANCEMENTS(String.valueOf("CREATIVE_ENHANCEMENTS")), LOCAL_ADS_STORE_CODE(String.valueOf("LOCAL_ADS_STORE_CODE"));


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
  **/
  @JsonProperty("targeting_types")
  public List<TargetingTypesEnum> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public TargetingTypeFilter targetingTypes(List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

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

