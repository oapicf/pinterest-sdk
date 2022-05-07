package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.model.CatalogsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsProductGroupFiltersAnyOf;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object holding a group of filters for a catalog product group
 **/
@ApiModel(description="Object holding a group of filters for a catalog product group")
public class CatalogsProductGroupFilters  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<CatalogsProductGroupFilterKeys> anyOf = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<CatalogsProductGroupFilterKeys> allOf = null;
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

  public CatalogsProductGroupFilters anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsProductGroupFilters addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    this.anyOf.add(anyOfItem);
    return this;
  }

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

  public CatalogsProductGroupFilters allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsProductGroupFilters addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    this.allOf.add(allOfItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

