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
 * CatalogsRetailItemsPostFilter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailItemsPostFilter implements CatalogsItemsPostFilters {

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

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
  private List<String> itemIds = new ArrayList<>();

  private String catalogId;

  public CatalogsRetailItemsPostFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailItemsPostFilter(CatalogTypeEnum catalogType, List<String> itemIds) {
    this.catalogType = catalogType;
    this.itemIds = itemIds;
  }

  public CatalogsRetailItemsPostFilter catalogType(CatalogTypeEnum catalogType) {
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

  public CatalogsRetailItemsPostFilter itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public CatalogsRetailItemsPostFilter addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

  /**
   * Get itemIds
   * @return itemIds
   */
  @NotNull @Size(min = 1, max = 1000) 
  @Schema(name = "item_ids", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_ids")
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public CatalogsRetailItemsPostFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
   * @return catalogId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", description = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter = (CatalogsRetailItemsPostFilter) o;
    return Objects.equals(this.catalogType, catalogsRetailItemsPostFilter.catalogType) &&
        Objects.equals(this.itemIds, catalogsRetailItemsPostFilter.itemIds) &&
        Objects.equals(this.catalogId, catalogsRetailItemsPostFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemsPostFilter {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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

