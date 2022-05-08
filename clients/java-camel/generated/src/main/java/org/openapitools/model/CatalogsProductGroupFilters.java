package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.model.CatalogsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsProductGroupFiltersAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object holding a group of filters for a catalog product group
 */

@Schema(name = "CatalogsProductGroupFilters", description = "Object holding a group of filters for a catalog product group")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-08T00:32:37.756477Z[Etc/UTC]")
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
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<CatalogsProductGroupFilterKeys>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }

  /**
   * Get anyOf
   * @return anyOf
  */
  @Valid 
  @Schema(name = "any_of", required = false)
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
    if (this.allOf == null) {
      this.allOf = new ArrayList<CatalogsProductGroupFilterKeys>();
    }
    this.allOf.add(allOfItem);
    return this;
  }

  /**
   * Get allOf
   * @return allOf
  */
  @Valid 
  @Schema(name = "all_of", required = false)
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
    return Objects.equals(this.anyOf, catalogsProductGroupFilters.anyOf) &&
        Objects.equals(this.allOf, catalogsProductGroupFilters.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

