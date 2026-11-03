package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsBaseFilterKeys;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsBaseFiltersAllOf
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-03T06:14:39.705183431Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CatalogsBaseFiltersAllOf {

  private List<@Valid CatalogsBaseFilterKeys> allOf = new ArrayList<>();

  public CatalogsBaseFiltersAllOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsBaseFiltersAllOf(List<@Valid CatalogsBaseFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsBaseFiltersAllOf allOf(List<@Valid CatalogsBaseFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsBaseFiltersAllOf addAllOfItem(CatalogsBaseFilterKeys allOfItem) {
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
  @NotNull @Size(min = 1) 
  @Schema(name = "all_of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("all_of")
  public List<@Valid CatalogsBaseFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<@Valid CatalogsBaseFilterKeys> allOf) {
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
    CatalogsBaseFiltersAllOf catalogsBaseFiltersAllOf = (CatalogsBaseFiltersAllOf) o;
    return Objects.equals(this.allOf, catalogsBaseFiltersAllOf.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsBaseFiltersAllOf {\n");
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
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

