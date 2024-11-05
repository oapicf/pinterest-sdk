package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilterKeys;
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAllOf;
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf;

/**
 * Object holding a group of filters for a creative assets product group
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsProductGroupFilters   {
  
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>();
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf = new ArrayList<>();

  public CatalogsCreativeAssetsProductGroupFilters () {

  }

  public CatalogsCreativeAssetsProductGroupFilters (List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf, List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.anyOf = anyOf;
    this.allOf = allOf;
  }

    
  @JsonProperty("any_of")
  public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

    
  @JsonProperty("all_of")
  public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsProductGroupFilters catalogsCreativeAssetsProductGroupFilters = (CatalogsCreativeAssetsProductGroupFilters) o;
    return Objects.equals(anyOf, catalogsCreativeAssetsProductGroupFilters.anyOf) &&
        Objects.equals(allOf, catalogsCreativeAssetsProductGroupFilters.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupFilters {\n");
    
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
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
