package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalogsProductGroupFiltersAllOf  {
  
  @ApiModelProperty(value = "")
  private List<CatalogsProductGroupFilterKeys> allOf = null;
 /**
   * Get allOf
   * @return allOf
  **/
  @JsonProperty("all_of")
  public List<CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsProductGroupFiltersAllOf allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsProductGroupFiltersAllOf addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    this.allOf.add(allOfItem);
    return this;
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

