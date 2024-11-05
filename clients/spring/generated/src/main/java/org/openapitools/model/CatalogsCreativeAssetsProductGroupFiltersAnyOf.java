package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilterKeys;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsCreativeAssetsProductGroupFiltersAnyOf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsProductGroupFiltersAnyOf {

  @Valid
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>();

  public CatalogsCreativeAssetsProductGroupFiltersAnyOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsProductGroupFiltersAnyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsCreativeAssetsProductGroupFiltersAnyOf anyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsCreativeAssetsProductGroupFiltersAnyOf addAnyOfItem(CatalogsCreativeAssetsProductGroupFilterKeys anyOfItem) {
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
  @NotNull @Valid 
  @Schema(name = "any_of", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.anyOf, catalogsCreativeAssetsProductGroupFiltersAnyOf.anyOf);
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

