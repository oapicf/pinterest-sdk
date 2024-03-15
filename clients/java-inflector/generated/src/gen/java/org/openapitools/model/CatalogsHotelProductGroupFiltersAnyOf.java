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
public class CatalogsHotelProductGroupFiltersAnyOf   {
  @JsonProperty("any_of")
  private List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>();

  /**
   **/
  public CatalogsHotelProductGroupFiltersAnyOf anyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("any_of")
  public List<CatalogsHotelProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelProductGroupFiltersAnyOf catalogsHotelProductGroupFiltersAnyOf = (CatalogsHotelProductGroupFiltersAnyOf) o;
    return Objects.equals(anyOf, catalogsHotelProductGroupFiltersAnyOf.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupFiltersAnyOf {\n");
    
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

