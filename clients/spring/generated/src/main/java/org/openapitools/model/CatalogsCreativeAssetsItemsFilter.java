package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * CatalogsCreativeAssetsItemsFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsItemsFilter implements CatalogsItemsFilters {

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

  @Valid
  private List<String> creativeAssetsIds = new ArrayList<>();

  private String catalogId;

  public CatalogsCreativeAssetsItemsFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsItemsFilter(CatalogTypeEnum catalogType, List<String> creativeAssetsIds) {
    this.catalogType = catalogType;
    this.creativeAssetsIds = creativeAssetsIds;
  }

  public CatalogsCreativeAssetsItemsFilter catalogType(CatalogTypeEnum catalogType) {
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

  public CatalogsCreativeAssetsItemsFilter creativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
    return this;
  }

  public CatalogsCreativeAssetsItemsFilter addCreativeAssetsIdsItem(String creativeAssetsIdsItem) {
    if (this.creativeAssetsIds == null) {
      this.creativeAssetsIds = new ArrayList<>();
    }
    this.creativeAssetsIds.add(creativeAssetsIdsItem);
    return this;
  }

  /**
   * Get creativeAssetsIds
   * @return creativeAssetsIds
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "creative_assets_ids", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creative_assets_ids")
  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
  }

  public CatalogsCreativeAssetsItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", description = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter = (CatalogsCreativeAssetsItemsFilter) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsItemsFilter.catalogType) &&
        Objects.equals(this.creativeAssetsIds, catalogsCreativeAssetsItemsFilter.creativeAssetsIds) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsItemsFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsIds, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemsFilter {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetsIds: ").append(toIndentedString(creativeAssetsIds)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

