package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.model.CatalogsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsProductGroupFiltersAnyOf;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object holding a group of filters for a catalog product group
 **/
@ApiModel(description = "Object holding a group of filters for a catalog product group")
@JsonTypeName("CatalogsProductGroupFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class CatalogsProductGroupFilters   {
  
  private @Valid List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<CatalogsProductGroupFilterKeys>();
  private @Valid List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<CatalogsProductGroupFilterKeys>();

  /**
   **/
  public CatalogsProductGroupFilters anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("any_of")
  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  @JsonProperty("any_of")
  public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsProductGroupFilters addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<CatalogsProductGroupFilterKeys>();
    }

    this.anyOf.add(anyOfItem);
    return this;
  }

  public CatalogsProductGroupFilters removeAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    if (anyOfItem != null && this.anyOf != null) {
      this.anyOf.remove(anyOfItem);
    }

    return this;
  }
/**
   **/
  public CatalogsProductGroupFilters allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("all_of")
  public List<CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  @JsonProperty("all_of")
  public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsProductGroupFilters addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<CatalogsProductGroupFilterKeys>();
    }

    this.allOf.add(allOfItem);
    return this;
  }

  public CatalogsProductGroupFilters removeAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
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
    CatalogsProductGroupFilters catalogsProductGroupFilters = (CatalogsProductGroupFilters) o;
    return Objects.equals(this.anyOf, catalogsProductGroupFilters.anyOf) &&
        Objects.equals(this.allOf, catalogsProductGroupFilters.allOf);
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

