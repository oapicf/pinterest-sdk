package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelProductGroupFilterKeys;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object holding a group of filters for a hotel product group
 */

@Schema(name = "CatalogsHotelProductGroupFilters", description = "Object holding a group of filters for a hotel product group")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelProductGroupFilters {

  @Valid
  private List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>();

  @Valid
  private List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>();

  public CatalogsHotelProductGroupFilters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsHotelProductGroupFilters(List<CatalogsHotelProductGroupFilterKeys> anyOf, List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.anyOf = anyOf;
    this.allOf = allOf;
  }

  public CatalogsHotelProductGroupFilters anyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public CatalogsHotelProductGroupFilters addAnyOfItem(CatalogsHotelProductGroupFilterKeys anyOfItem) {
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
  public List<CatalogsHotelProductGroupFilterKeys> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsHotelProductGroupFilters allOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  public CatalogsHotelProductGroupFilters addAllOfItem(CatalogsHotelProductGroupFilterKeys allOfItem) {
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
  public List<CatalogsHotelProductGroupFilterKeys> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
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
    CatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters = (CatalogsHotelProductGroupFilters) o;
    return Objects.equals(this.anyOf, catalogsHotelProductGroupFilters.anyOf) &&
        Objects.equals(this.allOf, catalogsHotelProductGroupFilters.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf, allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupFilters {\n");
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

