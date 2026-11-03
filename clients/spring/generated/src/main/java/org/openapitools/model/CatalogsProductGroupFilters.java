package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.model.CatalogsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsProductGroupFiltersAnyOf;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object holding a group of filters for a catalog product group
 */

@Schema(name = "CatalogsProductGroupFilters", description = "Object holding a group of filters for a catalog product group")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-03T06:26:04.764536247Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CatalogsProductGroupFilters {

  private List<@Valid CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();

  private List<@Valid CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();

  public CatalogsProductGroupFilters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupFilters(List<@Valid CatalogsProductGroupFilterKeys> anyOf, List<@Valid CatalogsProductGroupFilterKeys> allOf) {
    this.anyOf = anyOf;
    this.allOf = allOf;
  }

  public CatalogsProductGroupFilters anyOf(List<@Valid CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsProductGroupFilters addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }

  /**
   * Get anyOf
   * @return anyOf
   */
  @NotNull 
  @Schema(name = "any_of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("any_of")
  public List<@Valid CatalogsProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  @JsonProperty("any_of")
  public void setAnyOf(List<@Valid CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsProductGroupFilters allOf(List<@Valid CatalogsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsProductGroupFilters addAllOfItem(CatalogsProductGroupFilterKeys allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<>();
    }
    this.allOf.add(allOfItem);
    return this;
  }

  /**
   * Get allOf
   * @return allOf
   */
  @NotNull 
  @Schema(name = "all_of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("all_of")
  public List<@Valid CatalogsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  @JsonProperty("all_of")
  public void setAllOf(List<@Valid CatalogsProductGroupFilterKeys> allOf) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

