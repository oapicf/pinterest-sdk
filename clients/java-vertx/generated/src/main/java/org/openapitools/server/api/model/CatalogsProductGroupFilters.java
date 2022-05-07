package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.CatalogsProductGroupFilterKeys;
import org.openapitools.server.api.model.CatalogsProductGroupFiltersAllOf;
import org.openapitools.server.api.model.CatalogsProductGroupFiltersAnyOf;

/**
 * Object holding a group of filters for a catalog product group
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupFilters   {
  
  private List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();
  private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();

  public CatalogsProductGroupFilters () {

  }

  public CatalogsProductGroupFilters (List<CatalogsProductGroupFilterKeys> anyOf, List<CatalogsProductGroupFilterKeys> allOf) {
    this.anyOf = anyOf;
    this.allOf = allOf;
  }

    
  @JsonProperty("any_of")
  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

    
  @JsonProperty("all_of")
  public List<CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
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
    CatalogsProductGroupFilters catalogsProductGroupFilters = (CatalogsProductGroupFilters) o;
    return Objects.equals(anyOf, catalogsProductGroupFilters.anyOf) &&
        Objects.equals(allOf, catalogsProductGroupFilters.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFilters {\n");
    
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
