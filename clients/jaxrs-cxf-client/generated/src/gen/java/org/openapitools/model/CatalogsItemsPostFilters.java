package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsItemsPostFilter;
import org.openapitools.model.CatalogsHotelItemsPostFilter;
import org.openapitools.model.CatalogsRetailItemsPostFilter;
import org.openapitools.model.CatalogsType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsItemsPostFilters  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsType catalogType;

  @ApiModelProperty(required = true, value = "")
  private List<String> itemIds = new ArrayList<>();

  @ApiModelProperty(value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
 /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  **/
  private String catalogId;

  @ApiModelProperty(required = true, value = "")
  private List<String> hotelIds = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  private List<String> creativeAssetsIds = new ArrayList<>();
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsItemsPostFilters catalogType(CatalogsType catalogType) {
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

  public CatalogsItemsPostFilters itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public CatalogsItemsPostFilters addItemIdsItem(String itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

 /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsItemsPostFilters catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Get hotelIds
   * @return hotelIds
  **/
  @JsonProperty("hotel_ids")
  public List<String> getHotelIds() {
    return hotelIds;
  }

  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  public CatalogsItemsPostFilters hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  public CatalogsItemsPostFilters addHotelIdsItem(String hotelIdsItem) {
    this.hotelIds.add(hotelIdsItem);
    return this;
  }

 /**
   * Get creativeAssetsIds
   * @return creativeAssetsIds
  **/
  @JsonProperty("creative_assets_ids")
  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
  }

  public CatalogsItemsPostFilters creativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
    return this;
  }

  public CatalogsItemsPostFilters addCreativeAssetsIdsItem(String creativeAssetsIdsItem) {
    this.creativeAssetsIds.add(creativeAssetsIdsItem);
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
    CatalogsItemsPostFilters catalogsItemsPostFilters = (CatalogsItemsPostFilters) o;
    return Objects.equals(this.catalogType, catalogsItemsPostFilters.catalogType) &&
        Objects.equals(this.itemIds, catalogsItemsPostFilters.itemIds) &&
        Objects.equals(this.catalogId, catalogsItemsPostFilters.catalogId) &&
        Objects.equals(this.hotelIds, catalogsItemsPostFilters.hotelIds) &&
        Objects.equals(this.creativeAssetsIds, catalogsItemsPostFilters.creativeAssetsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId, hotelIds, creativeAssetsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsPostFilters {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    hotelIds: ").append(toIndentedString(hotelIds)).append("\n");
    sb.append("    creativeAssetsIds: ").append(toIndentedString(creativeAssetsIds)).append("\n");
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

