package apimodels;

import apimodels.CatalogsProductGroupFilterKeys;
import apimodels.CatalogsProductGroupFiltersAllOf;
import apimodels.CatalogsProductGroupFiltersAnyOf;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Object holding a group of filters for a catalog product group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupFilters   {
  @JsonProperty("any_of")
  @Valid

  private List<CatalogsProductGroupFilterKeys> anyOf = null;

  @JsonProperty("all_of")
  @Valid

  private List<CatalogsProductGroupFilterKeys> allOf = null;

  public CatalogsProductGroupFilters anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsProductGroupFilters addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    if (anyOf == null) {
      anyOf = new ArrayList<>();
    }
    anyOf.add(anyOfItem);
    return this;
  }

   /**
   * Get anyOf
   * @return anyOf
  **/
  public List<CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsProductGroupFilters allOf(List<CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsProductGroupFilters addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    if (allOf == null) {
      allOf = new ArrayList<>();
    }
    allOf.add(allOfItem);
    return this;
  }

   /**
   * Get allOf
   * @return allOf
  **/
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
    CatalogsProductGroupFilters catalogsProductGroupFilters = (CatalogsProductGroupFilters) o;
    return Objects.equals(anyOf, catalogsProductGroupFilters.anyOf) &&
        Objects.equals(allOf, catalogsProductGroupFilters.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

