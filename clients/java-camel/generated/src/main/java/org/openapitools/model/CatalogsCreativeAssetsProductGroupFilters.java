package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilterKeys;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object holding a group of filters for a creative assets product group
 */

@Schema(name = "CatalogsCreativeAssetsProductGroupFilters", description = "Object holding a group of filters for a creative assets product group")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsProductGroupFilters {

  @Valid
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>();

  @Valid
  private List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf = new ArrayList<>();

  public CatalogsCreativeAssetsProductGroupFilters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsProductGroupFilters(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf, List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.anyOf = anyOf;
    this.allOf = allOf;
  }

  public CatalogsCreativeAssetsProductGroupFilters anyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsCreativeAssetsProductGroupFilters addAnyOfItem(CatalogsCreativeAssetsProductGroupFilterKeys anyOfItem) {
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

  public CatalogsCreativeAssetsProductGroupFilters allOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsCreativeAssetsProductGroupFilters addAllOfItem(CatalogsCreativeAssetsProductGroupFilterKeys allOfItem) {
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
  @NotNull @Valid 
  @Schema(name = "all_of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("all_of")
  public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
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
    CatalogsCreativeAssetsProductGroupFilters catalogsCreativeAssetsProductGroupFilters = (CatalogsCreativeAssetsProductGroupFilters) o;
    return Objects.equals(this.anyOf, catalogsCreativeAssetsProductGroupFilters.anyOf) &&
        Objects.equals(this.allOf, catalogsCreativeAssetsProductGroupFilters.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupFilters {\n");
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

