package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelProductGroupFilterKeys;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelProductGroupFiltersAllOf   {
  @JsonProperty("all_of")
  private List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>();

  /**
   **/
  public CatalogsHotelProductGroupFiltersAllOf allOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("all_of")
  public List<CatalogsHotelProductGroupFilterKeys> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
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
    CatalogsHotelProductGroupFiltersAllOf catalogsHotelProductGroupFiltersAllOf = (CatalogsHotelProductGroupFiltersAllOf) o;
    return Objects.equals(allOf, catalogsHotelProductGroupFiltersAllOf.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupFiltersAllOf {\n");
    
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

