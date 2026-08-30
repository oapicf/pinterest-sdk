package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsBaseFilterKeys;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsBaseFiltersAllOf  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<CatalogsBaseFilterKeys> allOf = new ArrayList<>();
 /**
   * Get allOf
   * @return allOf
  **/
  @JsonProperty("all_of")
  @NotNull
 @Size(min=1)  public List<CatalogsBaseFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<CatalogsBaseFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsBaseFiltersAllOf allOf(List<CatalogsBaseFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsBaseFiltersAllOf addAllOfItem(CatalogsBaseFilterKeys allOfItem) {
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
    CatalogsBaseFiltersAllOf catalogsBaseFiltersAllOf = (CatalogsBaseFiltersAllOf) o;
    return Objects.equals(this.allOf, catalogsBaseFiltersAllOf.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsBaseFiltersAllOf {\n");
    
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

