package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupFiltersAnyOf  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();
 /**
  * Get anyOf
  * @return anyOf
  */
  @JsonProperty("any_of")
  @NotNull
  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  /**
   * Sets the <code>anyOf</code> property.
   */
 public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  /**
   * Sets the <code>anyOf</code> property.
   */
  public CatalogsProductGroupFiltersAnyOf anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  /**
   * Adds a new item to the <code>anyOf</code> list.
   */
  public CatalogsProductGroupFiltersAnyOf addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
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
    return Objects.equals(this.anyOf, catalogsProductGroupFiltersAnyOf.anyOf);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

