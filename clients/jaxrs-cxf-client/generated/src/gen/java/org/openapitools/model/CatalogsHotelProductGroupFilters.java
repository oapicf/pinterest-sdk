package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelProductGroupFilterKeys;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAnyOf;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object holding a group of filters for a hotel product group
 **/
@ApiModel(description="Object holding a group of filters for a hotel product group")

public class CatalogsHotelProductGroupFilters  {
  
  @ApiModelProperty(required = true, value = "")
  private List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  private List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>();
 /**
   * Get anyOf
   * @return anyOf
  **/
  @JsonProperty("any_of")
  public List<CatalogsHotelProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsHotelProductGroupFilters anyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsHotelProductGroupFilters addAnyOfItem(CatalogsHotelProductGroupFilterKeys anyOfItem) {
    this.anyOf.add(anyOfItem);
    return this;
  }

 /**
   * Get allOf
   * @return allOf
  **/
  @JsonProperty("all_of")
  public List<CatalogsHotelProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsHotelProductGroupFilters allOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsHotelProductGroupFilters addAllOfItem(CatalogsHotelProductGroupFilterKeys allOfItem) {
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
    CatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters = (CatalogsHotelProductGroupFilters) o;
    return Objects.equals(this.anyOf, catalogsHotelProductGroupFilters.anyOf) &&
        Objects.equals(this.allOf, catalogsHotelProductGroupFilters.allOf);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

