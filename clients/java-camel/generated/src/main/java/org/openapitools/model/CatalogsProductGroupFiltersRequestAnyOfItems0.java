package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsProductGroupFiltersRequestAnyOfItems0
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-07T04:06:05.360811865Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CatalogsProductGroupFiltersRequestAnyOfItems0 {

  private List<@Valid CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();

  public CatalogsProductGroupFiltersRequestAnyOfItems0() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupFiltersRequestAnyOfItems0(List<@Valid CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsProductGroupFiltersRequestAnyOfItems0 anyOf(List<@Valid CatalogsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsProductGroupFiltersRequestAnyOfItems0 addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
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
  @NotNull @Size(min = 1) 
  @Schema(name = "any_of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("any_of")
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

