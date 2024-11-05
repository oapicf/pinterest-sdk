package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsItemsPostFilter;
import org.openapitools.model.CatalogsHotelItemsPostFilter;
import org.openapitools.model.CatalogsRetailItemsPostFilter;
import org.openapitools.model.CatalogsType;

/**
 * CatalogsItemsPostFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsItemsPostFilters   {
  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("item_ids")
  private List<String> itemIds = new ArrayList<>();

  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("hotel_ids")
  private List<String> hotelIds = new ArrayList<>();

  @JsonProperty("creative_assets_ids")
  private List<String> creativeAssetsIds = new ArrayList<>();

  public CatalogsItemsPostFilters catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
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
   * Get itemIds
   * @return itemIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public CatalogsItemsPostFilters catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
  **/
  @ApiModelProperty(value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
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
   * Get hotelIds
   * @return hotelIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getHotelIds() {
    return hotelIds;
  }

  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  public CatalogsItemsPostFilters creativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
    return this;
  }

  public CatalogsItemsPostFilters addCreativeAssetsIdsItem(String creativeAssetsIdsItem) {
    this.creativeAssetsIds.add(creativeAssetsIdsItem);
    return this;
  }

   /**
   * Get creativeAssetsIds
   * @return creativeAssetsIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

