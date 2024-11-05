package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request object to list products for a given creative assets catalog_id and product group filter.
 */

@Schema(name = "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest", description = "Request object to list products for a given creative assets catalog_id and product group filter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest implements CatalogsVerticalsListProductsByCatalogBasedFilterRequest {

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CatalogTypeEnum catalogType;

  private String catalogId;

  private CatalogsCreativeAssetsProductGroupFilters filters;

  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(CatalogTypeEnum catalogType, String catalogId, CatalogsCreativeAssetsProductGroupFilters filters) {
    this.catalogType = catalogType;
    this.catalogId = catalogId;
    this.filters = filters;
  }

  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the creative assets product group.
   * @return catalogId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", example = "2680059592705", description = "Catalog id pertaining to the creative assets product group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest filters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @NotNull @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filters")
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = (CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(this.filters, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, catalogId, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

