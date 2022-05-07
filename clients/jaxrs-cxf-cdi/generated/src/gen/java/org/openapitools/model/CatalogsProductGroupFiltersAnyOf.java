package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsProductGroupFiltersAnyOf   {
  
  private List<CatalogsProductGroupFilterKeys> anyOf = null;


  /**
   **/
  public CatalogsProductGroupFiltersAnyOf anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("any_of")
  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsProductGroupFiltersAnyOf addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<CatalogsProductGroupFilterKeys>();
    }
    this.anyOf.add(anyOfItem);
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
    CatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf = (CatalogsProductGroupFiltersAnyOf) o;
    return Objects.equals(anyOf, catalogsProductGroupFiltersAnyOf.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFiltersAnyOf {\n");
    
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

