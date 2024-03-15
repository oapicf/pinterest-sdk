package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelProductGroupFilterKeys;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAnyOf;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object holding a group of filters for a hotel product group
 */
@ApiModel(description="Object holding a group of filters for a hotel product group")

public class CatalogsHotelProductGroupFilters  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>();
 /**
  * Get anyOf
  * @return anyOf
  */
  @JsonProperty("any_of")
  @NotNull
  public List<CatalogsHotelProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  /**
   * Sets the <code>anyOf</code> property.
   */
 public void setAnyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  /**
   * Sets the <code>anyOf</code> property.
   */
  public CatalogsHotelProductGroupFilters anyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  /**
   * Adds a new item to the <code>anyOf</code> list.
   */
  public CatalogsHotelProductGroupFilters addAnyOfItem(CatalogsHotelProductGroupFilterKeys anyOfItem) {
    this.anyOf.add(anyOfItem);
    return this;
  }

 /**
  * Get allOf
  * @return allOf
  */
  @JsonProperty("all_of")
  @NotNull
  public List<CatalogsHotelProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  /**
   * Sets the <code>allOf</code> property.
   */
 public void setAllOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  /**
   * Sets the <code>allOf</code> property.
   */
  public CatalogsHotelProductGroupFilters allOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  /**
   * Adds a new item to the <code>allOf</code> list.
   */
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

