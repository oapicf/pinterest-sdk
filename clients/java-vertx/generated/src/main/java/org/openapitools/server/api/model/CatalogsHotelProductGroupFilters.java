package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CatalogsHotelProductGroupFilterKeys;
import org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAllOf;
import org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAnyOf;

/**
 * Object holding a group of filters for a hotel product group
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelProductGroupFilters   {
  
  private List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>();
  private List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>();

  public CatalogsHotelProductGroupFilters () {

  }

  public CatalogsHotelProductGroupFilters (List<CatalogsHotelProductGroupFilterKeys> anyOf, List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.anyOf = anyOf;
    this.allOf = allOf;
  }

    
  @JsonProperty("any_of")
  public List<CatalogsHotelProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

    
  @JsonProperty("all_of")
  public List<CatalogsHotelProductGroupFilterKeys> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
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
    CatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters = (CatalogsHotelProductGroupFilters) o;
    return Objects.equals(anyOf, catalogsHotelProductGroupFilters.anyOf) &&
        Objects.equals(allOf, catalogsHotelProductGroupFilters.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupFilters {\n");
    
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
