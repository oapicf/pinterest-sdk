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


public class CatalogsProductGroupFiltersAllOf  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();
 /**
  * Get allOf
  * @return allOf
  */
  @JsonProperty("all_of")
  @NotNull
  public List<CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  /**
   * Sets the <code>allOf</code> property.
   */
 public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  /**
   * Sets the <code>allOf</code> property.
   */
  public CatalogsProductGroupFiltersAllOf allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  /**
   * Adds a new item to the <code>allOf</code> list.
   */
  public CatalogsProductGroupFiltersAllOf addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
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
    CatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf = (CatalogsProductGroupFiltersAllOf) o;
    return Objects.equals(this.allOf, catalogsProductGroupFiltersAllOf.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFiltersAllOf {\n");
    
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

