package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsRetailItemsFilter  {
  
public enum CatalogTypeEnum {

    @JsonProperty("RETAIL") RETAIL(String.valueOf("RETAIL"));

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

 /**
  * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  */
  @ApiModelProperty(value = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog")
  private String catalogId;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsRetailItemsFilter catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get itemIds
  * @return itemIds
  */
  @JsonProperty("item_ids")
  @NotNull
 @Size(min=1,max=100)  public List<String> getItemIds() {
    return itemIds;
  }

  /**
   * Sets the <code>itemIds</code> property.
   */
 public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  /**
   * Sets the <code>itemIds</code> property.
   */
  public CatalogsRetailItemsFilter itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  /**
   * Adds a new item to the <code>itemIds</code> list.
   */
  public CatalogsRetailItemsFilter addItemIdsItem(String itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

 /**
  * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  * @return catalogId
  */
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsRetailItemsFilter catalogId(String catalogId) {
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
    CatalogsRetailItemsFilter catalogsRetailItemsFilter = (CatalogsRetailItemsFilter) o;
    return Objects.equals(this.catalogType, catalogsRetailItemsFilter.catalogType) &&
        Objects.equals(this.itemIds, catalogsRetailItemsFilter.itemIds) &&
        Objects.equals(this.catalogId, catalogsRetailItemsFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemsFilter {\n");
    
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

