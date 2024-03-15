package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.model.CatalogsProductGroupFiltersRequestAnyOf;
import org.openapitools.model.CatalogsProductGroupFiltersRequestAnyOf1;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.")
public class CatalogsProductGroupFiltersRequest   {
  
  private List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();

  private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();

  /**
   **/
  public CatalogsProductGroupFiltersRequest anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("any_of")
  @NotNull
 @Size(min=1)  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsProductGroupFiltersRequest addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }


  /**
   **/
  public CatalogsProductGroupFiltersRequest allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("all_of")
  @NotNull
 @Size(min=1)  public List<CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsProductGroupFiltersRequest addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<>();
    }
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
    CatalogsProductGroupFiltersRequest catalogsProductGroupFiltersRequest = (CatalogsProductGroupFiltersRequest) o;
    return Objects.equals(this.anyOf, catalogsProductGroupFiltersRequest.anyOf) &&
        Objects.equals(this.allOf, catalogsProductGroupFiltersRequest.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFiltersRequest {\n");
    
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

