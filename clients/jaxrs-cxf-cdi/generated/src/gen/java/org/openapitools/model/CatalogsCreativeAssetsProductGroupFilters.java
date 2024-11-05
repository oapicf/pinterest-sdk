package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilterKeys;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object holding a group of filters for a creative assets product group
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object holding a group of filters for a creative assets product group")
public class CatalogsCreativeAssetsProductGroupFilters   {
  
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>();

  private List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf = new ArrayList<>();

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilters anyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("any_of")
  @NotNull
  public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsCreativeAssetsProductGroupFilters addAnyOfItem(CatalogsCreativeAssetsProductGroupFilterKeys anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }


  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilters allOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("all_of")
  @NotNull
  public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsCreativeAssetsProductGroupFilters addAllOfItem(CatalogsCreativeAssetsProductGroupFilterKeys allOfItem) {
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
    CatalogsCreativeAssetsProductGroupFilters catalogsCreativeAssetsProductGroupFilters = (CatalogsCreativeAssetsProductGroupFilters) o;
    return Objects.equals(this.anyOf, catalogsCreativeAssetsProductGroupFilters.anyOf) &&
        Objects.equals(this.allOf, catalogsCreativeAssetsProductGroupFilters.allOf);
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

