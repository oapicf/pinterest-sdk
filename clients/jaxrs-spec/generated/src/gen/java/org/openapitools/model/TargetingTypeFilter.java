package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TargetingTypeFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TargetingTypeFilter   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TargetingTypesEnum fromString(String s) {
        for (TargetingTypesEnum b : TargetingTypesEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<TargetingTypesEnum> targetingTypes = new ArrayList<>();

  public TargetingTypeFilter() {
  }

  /**
   * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AUDIENCE_MULTIPLIER\&quot;] is only available in CAMPAIGN_TARGETING level. [\&quot;MEDIA_TYPE\&quot;] is only available in PRODUCT_ITEM_TARGETING level. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
   **/
  public TargetingTypeFilter targetingTypes(List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")
  @JsonProperty("targeting_types")
   @Size(min=1,max=5)public List<TargetingTypesEnum> getTargetingTypes() {
    return targetingTypes;
  }

  @JsonProperty("targeting_types")
  public void setTargetingTypes(List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public TargetingTypeFilter addTargetingTypesItem(TargetingTypesEnum targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }

    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  public TargetingTypeFilter removeTargetingTypesItem(TargetingTypesEnum targetingTypesItem) {
    if (targetingTypesItem != null && this.targetingTypes != null) {
      this.targetingTypes.remove(targetingTypesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

