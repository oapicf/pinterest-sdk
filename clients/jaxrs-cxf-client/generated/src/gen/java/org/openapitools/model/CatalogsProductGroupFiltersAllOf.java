package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupFiltersAllOf  {
  
  @ApiModelProperty(required = true, value = "")
  private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();
 /**
   * Get allOf
   * @return allOf
  **/
  @JsonProperty("all_of")
  public List<CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsProductGroupFiltersAllOf allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsProductGroupFiltersAllOf addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    this.allOf.add(allOfItem);
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
    CatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf = (CatalogsProductGroupFiltersAllOf) o;
    return Objects.equals(this.allOf, catalogsProductGroupFiltersAllOf.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFiltersAllOf {\n");
    
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
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

