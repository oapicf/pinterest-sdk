package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 {

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private CatalogsProductGroupFiltersRequest filters;

  @Deprecated
  private Boolean isFeatured;

  private String name;

  private String id;

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0(String id) {
    this.id = id;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 description(String description) {
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

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 filters(CatalogsProductGroupFiltersRequest filters) {
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
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
   * @deprecated
   */
  
  @Schema(name = "is_featured", description = "boolean indicator of whether the product group is being featured or not", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_featured")
  @Deprecated
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the product group.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", description = "ID of the product group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 catalogsProductGroupUpdateManyRequestItemsOneOfItems0 = (CatalogsProductGroupUpdateManyRequestItemsOneOfItems0) o;
    return equalsNullable(this.description, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.description) &&
        Objects.equals(this.filters, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.isFeatured) &&
        Objects.equals(this.name, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.name) &&
        Objects.equals(this.id, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), filters, isFeatured, name, id);
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
    sb.append("class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

