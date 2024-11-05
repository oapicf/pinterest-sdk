package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsRetailItemsPostFilter  {
  
public enum CatalogTypeEnum {

RETAIL(String.valueOf("RETAIL"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(required = true, value = "")
  private List<String> itemIds = new ArrayList<>();

  @ApiModelProperty(value = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog")
 /**
   * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  **/
  private String catalogId;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailItemsPostFilter catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Get itemIds
   * @return itemIds
  **/
  @JsonProperty("item_ids")
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public CatalogsRetailItemsPostFilter itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public CatalogsRetailItemsPostFilter addItemIdsItem(String itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

 /**
   * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailItemsPostFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

