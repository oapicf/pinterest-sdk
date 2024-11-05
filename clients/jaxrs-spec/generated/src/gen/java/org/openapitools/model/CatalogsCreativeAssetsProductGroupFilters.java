package org.openapitools.model;

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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object holding a group of filters for a creative assets product group
 **/
@ApiModel(description = "Object holding a group of filters for a creative assets product group")
@JsonTypeName("CatalogsCreativeAssetsProductGroupFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsProductGroupFilters   {
  private @Valid List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>();
  private @Valid List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf = new ArrayList<>();

  /**
   **/
  public CatalogsCreativeAssetsProductGroupFilters anyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("any_of")
  @NotNull @Valid public List<@Valid CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  @JsonProperty("any_of")
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

  public CatalogsCreativeAssetsProductGroupFilters removeAnyOfItem(CatalogsCreativeAssetsProductGroupFilterKeys anyOfItem) {
    if (anyOfItem != null && this.anyOf != null) {
      this.anyOf.remove(anyOfItem);
    }

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
  @NotNull @Valid public List<@Valid CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  @JsonProperty("all_of")
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

  public CatalogsCreativeAssetsProductGroupFilters removeAllOfItem(CatalogsCreativeAssetsProductGroupFilterKeys allOfItem) {
    if (allOfItem != null && this.allOf != null) {
      this.allOf.remove(allOfItem);
    }

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

