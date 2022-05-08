package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CatalogsProductGroupFilterKeys;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsProductGroupFiltersAllOf
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-08T00:31:47.777767Z[Etc/UTC]")
public class CatalogsProductGroupFiltersAllOf   {
  @JsonProperty("all_of")
  
  private List<CatalogsProductGroupFilterKeys> allOf = null;

  public CatalogsProductGroupFiltersAllOf allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsProductGroupFiltersAllOf addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<>();
    }
    this.allOf.add(allOfItem);
    return this;
  }

   /**
   * Get allOf
   * @return allOf
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

