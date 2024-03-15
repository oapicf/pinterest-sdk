package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupFiltersRequestAnyOf1  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();
 /**
  * Get allOf
  * @return allOf
  */
  @JsonProperty("all_of")
  @NotNull
 @Size(min=1)  public List<CatalogsProductGroupFilterKeys> getAllOf() {
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
  public CatalogsProductGroupFiltersRequestAnyOf1 allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  /**
   * Adds a new item to the <code>allOf</code> list.
   */
  public CatalogsProductGroupFiltersRequestAnyOf1 addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
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
    CatalogsProductGroupFiltersRequestAnyOf1 catalogsProductGroupFiltersRequestAnyOf1 = (CatalogsProductGroupFiltersRequestAnyOf1) o;
    return Objects.equals(this.allOf, catalogsProductGroupFiltersRequestAnyOf1.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFiltersRequestAnyOf1 {\n");
    
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

