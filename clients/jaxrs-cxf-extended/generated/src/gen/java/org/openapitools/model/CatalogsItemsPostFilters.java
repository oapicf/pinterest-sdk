package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsItemsPostFilter;
import org.openapitools.model.CatalogsHotelItemsPostFilter;
import org.openapitools.model.CatalogsRetailItemsPostFilter;
import org.openapitools.model.CatalogsType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsItemsPostFilter.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelItemsPostFilter.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailItemsPostFilter.class, name = "RETAIL"),
})

public class CatalogsItemsPostFilters  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

  @ApiModelProperty(required = true, value = "")
  private List<String> itemIds = new ArrayList<>();

 /**
  * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
  @ApiModelProperty(value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
  private String catalogId;

  @ApiModelProperty(required = true, value = "")
  private List<String> hotelIds = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  private List<String> creativeAssetsIds = new ArrayList<>();
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsItemsPostFilters catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get itemIds
  * @return itemIds
  */
  @JsonProperty("item_ids")
  @NotNull
 @Size(min=1,max=1000)  public List<String> getItemIds() {
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
  public CatalogsItemsPostFilters itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  /**
   * Adds a new item to the <code>itemIds</code> list.
   */
  public CatalogsItemsPostFilters addItemIdsItem(String itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

 /**
  * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
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
  public CatalogsItemsPostFilters catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Get hotelIds
  * @return hotelIds
  */
  @JsonProperty("hotel_ids")
  @NotNull
 @Size(min=1,max=1000)  public List<String> getHotelIds() {
    return hotelIds;
  }

  /**
   * Sets the <code>hotelIds</code> property.
   */
 public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  /**
   * Sets the <code>hotelIds</code> property.
   */
  public CatalogsItemsPostFilters hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  /**
   * Adds a new item to the <code>hotelIds</code> list.
   */
  public CatalogsItemsPostFilters addHotelIdsItem(String hotelIdsItem) {
    this.hotelIds.add(hotelIdsItem);
    return this;
  }

 /**
  * Get creativeAssetsIds
  * @return creativeAssetsIds
  */
  @JsonProperty("creative_assets_ids")
  @NotNull
 @Size(min=1,max=1000)  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  /**
   * Sets the <code>creativeAssetsIds</code> property.
   */
 public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
  }

  /**
   * Sets the <code>creativeAssetsIds</code> property.
   */
  public CatalogsItemsPostFilters creativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
    return this;
  }

  /**
   * Adds a new item to the <code>creativeAssetsIds</code> list.
   */
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

