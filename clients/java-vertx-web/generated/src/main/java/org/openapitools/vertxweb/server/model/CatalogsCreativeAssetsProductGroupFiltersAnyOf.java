package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsProductGroupFilterKeys;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsProductGroupFiltersAnyOf   {
  
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>();

  public CatalogsCreativeAssetsProductGroupFiltersAnyOf () {

  }

  public CatalogsCreativeAssetsProductGroupFiltersAnyOf (List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

    
  @JsonProperty("any_of")
  public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }
  public void setAnyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
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
    CatalogsCreativeAssetsProductGroupFiltersAnyOf catalogsCreativeAssetsProductGroupFiltersAnyOf = (CatalogsCreativeAssetsProductGroupFiltersAnyOf) o;
    return Objects.equals(anyOf, catalogsCreativeAssetsProductGroupFiltersAnyOf.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupFiltersAnyOf {\n");
    
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
