package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilterKeys;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsCreativeAssetsProductGroupFiltersAllOf  {
  
  @ApiModelProperty(required = true, value = "")
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf = new ArrayList<>();
 /**
   * Get allOf
   * @return allOf
  **/
  @JsonProperty("all_of")
  public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsCreativeAssetsProductGroupFiltersAllOf allOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsCreativeAssetsProductGroupFiltersAllOf addAllOfItem(CatalogsCreativeAssetsProductGroupFilterKeys allOfItem) {
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
    CatalogsCreativeAssetsProductGroupFiltersAllOf catalogsCreativeAssetsProductGroupFiltersAllOf = (CatalogsCreativeAssetsProductGroupFiltersAllOf) o;
    return Objects.equals(this.allOf, catalogsCreativeAssetsProductGroupFiltersAllOf.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupFiltersAllOf {\n");
    
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

