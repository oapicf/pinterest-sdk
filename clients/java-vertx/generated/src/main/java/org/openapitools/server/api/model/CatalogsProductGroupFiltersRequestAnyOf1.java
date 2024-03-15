package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CatalogsProductGroupFilterKeys;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupFiltersRequestAnyOf1   {
  
  private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();

  public CatalogsProductGroupFiltersRequestAnyOf1 () {

  }

  public CatalogsProductGroupFiltersRequestAnyOf1 (List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

    
  @JsonProperty("all_of")
  public List<CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
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
    return Objects.equals(allOf, catalogsProductGroupFiltersRequestAnyOf1.allOf);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
