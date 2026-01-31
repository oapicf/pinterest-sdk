package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingTypeFilter   {
  


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
      return value;
    }
  }

  private List<TargetingTypesEnum> targetingTypes = new ArrayList<>();

  public TargetingTypeFilter () {

  }

  public TargetingTypeFilter (List<TargetingTypesEnum> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

    
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
    return Objects.equals(targetingTypes, targetingTypeFilter.targetingTypes);
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
