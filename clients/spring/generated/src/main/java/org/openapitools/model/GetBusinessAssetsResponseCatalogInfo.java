package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
 */

@Schema(name = "GetBusinessAssetsResponse_catalog_info", description = "An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.")
@JsonTypeName("GetBusinessAssetsResponse_catalog_info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GetBusinessAssetsResponseCatalogInfo {

  private @Nullable String catalogType;

  private @Nullable String id;

  private @Nullable String name;

  public GetBusinessAssetsResponseCatalogInfo catalogType(@Nullable String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Catalog type
   * @return catalogType
   */
  
  @Schema(name = "catalog_type", example = "PRODUCT", description = "Catalog type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_type")
  public @Nullable String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(@Nullable String catalogType) {
    this.catalogType = catalogType;
  }

  public GetBusinessAssetsResponseCatalogInfo id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Catalog ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "4836859046874", description = "Catalog ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public GetBusinessAssetsResponseCatalogInfo name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Catalog name
   * @return name
   */
  
  @Schema(name = "name", example = "Canada Catalog", description = "Catalog name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

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
    GetBusinessAssetsResponseCatalogInfo getBusinessAssetsResponseCatalogInfo = (GetBusinessAssetsResponseCatalogInfo) o;
    return Objects.equals(this.catalogType, getBusinessAssetsResponseCatalogInfo.catalogType) &&
        Objects.equals(this.id, getBusinessAssetsResponseCatalogInfo.id) &&
        Objects.equals(this.name, getBusinessAssetsResponseCatalogInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessAssetsResponseCatalogInfo {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

