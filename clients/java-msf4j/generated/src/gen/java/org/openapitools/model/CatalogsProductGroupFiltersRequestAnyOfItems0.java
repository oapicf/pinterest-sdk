package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;

/**
 * CatalogsProductGroupFiltersRequestAnyOfItems0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-07T02:50:03.251555637Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CatalogsProductGroupFiltersRequestAnyOfItems0   {
  @JsonProperty("any_of")
  private List<@Valid CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();

  public CatalogsProductGroupFiltersRequestAnyOfItems0 anyOf(List<@Valid CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsProductGroupFiltersRequestAnyOfItems0 addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    this.anyOf.add(anyOfItem);
    return this;
  }

   /**
   * Get anyOf
   * @return anyOf
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<@Valid CatalogsProductGroupFilterKeys> anyOf) {
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
    CatalogsProductGroupFiltersRequestAnyOfItems0 catalogsProductGroupFiltersRequestAnyOfItems0 = (CatalogsProductGroupFiltersRequestAnyOfItems0) o;
    return Objects.equals(this.anyOf, catalogsProductGroupFiltersRequestAnyOfItems0.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFiltersRequestAnyOfItems0 {\n");
    
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

