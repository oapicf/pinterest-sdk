package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Information about a catalog asset.
 */

@Schema(name = "CatalogBinding", description = "Information about a catalog asset.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogBinding {

  private String catalogType;

  private String id;

  private String name;

  public CatalogBinding catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Catalog type
   * @return catalogType
   */
  
  @Schema(name = "catalog_type", description = "Catalog type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogBinding id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Catalog ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", description = "Catalog ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogBinding name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Catalog name
   * @return name
   */
  
  @Schema(name = "name", description = "Catalog name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
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
    CatalogBinding catalogBinding = (CatalogBinding) o;
    return Objects.equals(this.catalogType, catalogBinding.catalogType) &&
        Objects.equals(this.id, catalogBinding.id) &&
        Objects.equals(this.name, catalogBinding.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogBinding {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

