package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.model.CatalogsProductGroupFiltersRequestAnyOfItems0;
import org.openapitools.model.CatalogsProductGroupFiltersRequestAnyOfItems1;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 */
public class CatalogsProductGroupFiltersRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("any_of")
  private List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();

  @JsonProperty("all_of")
  private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();

  /**
   * 
   * @return anyOf
   */
  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  /**
   * 
   * @return allOf
   */
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
    CatalogsProductGroupFiltersRequest catalogsProductGroupFiltersRequest = (CatalogsProductGroupFiltersRequest) o;
    return Objects.equals(this.anyOf, catalogsProductGroupFiltersRequest.anyOf) &&
        Objects.equals(this.allOf, catalogsProductGroupFiltersRequest.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFiltersRequest {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
