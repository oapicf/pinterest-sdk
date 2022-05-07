package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalogsProductGroupFiltersAnyOf  {
  
  @ApiModelProperty(value = "")
  private List<CatalogsProductGroupFilterKeys> anyOf = null;
 /**
   * Get anyOf
   * @return anyOf
  **/
  @JsonProperty("any_of")
  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsProductGroupFiltersAnyOf anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsProductGroupFiltersAnyOf addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    this.anyOf.add(anyOfItem);
    return this;
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

