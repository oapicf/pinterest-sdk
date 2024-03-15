package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelItemsFilter;
import org.openapitools.model.CatalogsRetailItemsFilter;
import org.openapitools.model.CatalogsType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelItemsFilter.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailItemsFilter.class, name = "RETAIL"),
})

public class CatalogsItemsFilters  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

  @ApiModelProperty(required = true, value = "")
  private List<String> itemIds = new ArrayList<>();

 /**
  * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  */
  @ApiModelProperty(value = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
  private String catalogId;

  @ApiModelProperty(required = true, value = "")
  private List<String> hotelIds = new ArrayList<>();
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
  public CatalogsItemsFilters catalogType(CatalogsType catalogType) {
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
  public CatalogsItemsFilters itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  /**
   * Adds a new item to the <code>itemIds</code> list.
   */
  public CatalogsItemsFilters addItemIdsItem(String itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

 /**
  * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
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
  public CatalogsItemsFilters catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Get hotelIds
  * @return hotelIds
  */
  @JsonProperty("hotel_ids")
  @NotNull
 @Size(min=1,max=100)  public List<String> getHotelIds() {
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
  public CatalogsItemsFilters hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  /**
   * Adds a new item to the <code>hotelIds</code> list.
   */
  public CatalogsItemsFilters addHotelIdsItem(String hotelIdsItem) {
    this.hotelIds.add(hotelIdsItem);
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
    CatalogsItemsFilters catalogsItemsFilters = (CatalogsItemsFilters) o;
    return Objects.equals(this.catalogType, catalogsItemsFilters.catalogType) &&
        Objects.equals(this.itemIds, catalogsItemsFilters.itemIds) &&
        Objects.equals(this.catalogId, catalogsItemsFilters.catalogId) &&
        Objects.equals(this.hotelIds, catalogsItemsFilters.hotelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId, hotelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsFilters {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    hotelIds: ").append(toIndentedString(hotelIds)).append("\n");
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

