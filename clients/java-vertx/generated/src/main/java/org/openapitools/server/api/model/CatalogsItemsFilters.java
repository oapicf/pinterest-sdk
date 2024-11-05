package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CatalogsCreativeAssetsItemsFilter;
import org.openapitools.server.api.model.CatalogsHotelItemsFilter;
import org.openapitools.server.api.model.CatalogsRetailItemsFilter;
import org.openapitools.server.api.model.CatalogsType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsFilters   {
  
  private CatalogsType catalogType;
  private List<String> itemIds = new ArrayList<>();
  private String catalogId;
  private List<String> hotelIds = new ArrayList<>();
  private List<String> creativeAssetsIds = new ArrayList<>();

  public CatalogsItemsFilters () {

  }

  public CatalogsItemsFilters (CatalogsType catalogType, List<String> itemIds, String catalogId, List<String> hotelIds, List<String> creativeAssetsIds) {
    this.catalogType = catalogType;
    this.itemIds = itemIds;
    this.catalogId = catalogId;
    this.hotelIds = hotelIds;
    this.creativeAssetsIds = creativeAssetsIds;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("item_ids")
  public List<String> getItemIds() {
    return itemIds;
  }
  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("hotel_ids")
  public List<String> getHotelIds() {
    return hotelIds;
  }
  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

    
  @JsonProperty("creative_assets_ids")
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
    CatalogsItemsFilters catalogsItemsFilters = (CatalogsItemsFilters) o;
    return Objects.equals(catalogType, catalogsItemsFilters.catalogType) &&
        Objects.equals(itemIds, catalogsItemsFilters.itemIds) &&
        Objects.equals(catalogId, catalogsItemsFilters.catalogId) &&
        Objects.equals(hotelIds, catalogsItemsFilters.hotelIds) &&
        Objects.equals(creativeAssetsIds, catalogsItemsFilters.creativeAssetsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId, hotelIds, creativeAssetsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsFilters {\n");
    
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
