package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsBaseFilterKeys;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsBaseFiltersAnyOf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsBaseFiltersAnyOf {

  private List<CatalogsBaseFilterKeys> anyOf = new ArrayList<>();

  public CatalogsBaseFiltersAnyOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsBaseFiltersAnyOf(List<CatalogsBaseFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsBaseFiltersAnyOf anyOf(List<CatalogsBaseFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsBaseFiltersAnyOf addAnyOfItem(CatalogsBaseFilterKeys anyOfItem) {
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
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "any_of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("any_of")
  public List<CatalogsBaseFilterKeys> getAnyOf() {
    return anyOf;
  }

  @JsonProperty("any_of")
  public void setAnyOf(List<CatalogsBaseFilterKeys> anyOf) {
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
    CatalogsBaseFiltersAnyOf catalogsBaseFiltersAnyOf = (CatalogsBaseFiltersAnyOf) o;
    return Objects.equals(this.anyOf, catalogsBaseFiltersAnyOf.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsBaseFiltersAnyOf {\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

