package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model.
 */

@Schema(name = "CatalogUpdate", description = "Resource create or update operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsType catalogType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  public CatalogUpdate catalogType(@Nullable CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @Valid 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_type")
  public @Nullable CatalogsType getCatalogType() {
    return catalogType;
  }

  @JsonProperty("catalog_type")
  public void setCatalogType(@Nullable CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogUpdate name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name associated to a catalog entity.
   * @return name
   */
  
  @Schema(name = "name", description = "A human-friendly name associated to a catalog entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CatalogUpdate catalogUpdate = (CatalogUpdate) o;
    return Objects.equals(this.catalogType, catalogUpdate.catalogType) &&
        Objects.equals(this.name, catalogUpdate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogUpdate {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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

