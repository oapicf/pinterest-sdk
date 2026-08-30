package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Request object for updating a product group.
 */

@Schema(name = "CatalogsProductGroupUpdateRequest", description = "Request object for updating a product group.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupUpdateRequest implements BulkUpsertRequestUpdateCatalogProductGroupsItems, CatalogsProductGroupsUpdateRequestSchema {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsProductGroupFiltersRequest filters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Deprecated
  private @Nullable Boolean isFeatured;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  public CatalogsProductGroupUpdateRequest description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public CatalogsProductGroupUpdateRequest filters(@Nullable CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public @Nullable CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  @JsonProperty("filters")
  public void setFilters(@Nullable CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  public CatalogsProductGroupUpdateRequest isFeatured(@Nullable Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
   * @deprecated
   */
  
  @Schema(name = "is_featured", description = "boolean indicator of whether the product group is being featured or not", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @Deprecated
  @JsonProperty("is_featured")
  public @Nullable Boolean getIsFeatured() {
    return isFeatured;
  }

  /**
   * @deprecated
   */
  @Deprecated
  @JsonProperty("is_featured")
  public void setIsFeatured(@Nullable Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsProductGroupUpdateRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = (CatalogsProductGroupUpdateRequest) o;
    return equalsNullable(this.description, catalogsProductGroupUpdateRequest.description) &&
        Objects.equals(this.filters, catalogsProductGroupUpdateRequest.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupUpdateRequest.isFeatured) &&
        Objects.equals(this.name, catalogsProductGroupUpdateRequest.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), filters, isFeatured, name);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupUpdateRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

