package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsItemsPostFilter;
import org.openapitools.vertxweb.server.model.CatalogsHotelItemsPostFilter;
import org.openapitools.vertxweb.server.model.CatalogsRetailItemsPostFilter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsPostFilters   {
  
  private String catalogId;


  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private List<String> itemIds = new ArrayList<>();
  private List<String> hotelIds = new ArrayList<>();
  private List<String> creativeAssetsIds = new ArrayList<>();

  public CatalogsItemsPostFilters () {

  }

  public CatalogsItemsPostFilters (String catalogId, CatalogTypeEnum catalogType, List<String> itemIds, List<String> hotelIds, List<String> creativeAssetsIds) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.itemIds = itemIds;
    this.hotelIds = hotelIds;
    this.creativeAssetsIds = creativeAssetsIds;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("item_ids")
  public List<String> getItemIds() {
    return itemIds;
  }
  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
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
    CatalogsItemsPostFilters catalogsItemsPostFilters = (CatalogsItemsPostFilters) o;
    return Objects.equals(catalogId, catalogsItemsPostFilters.catalogId) &&
        Objects.equals(catalogType, catalogsItemsPostFilters.catalogType) &&
        Objects.equals(itemIds, catalogsItemsPostFilters.itemIds) &&
        Objects.equals(hotelIds, catalogsItemsPostFilters.hotelIds) &&
        Objects.equals(creativeAssetsIds, catalogsItemsPostFilters.creativeAssetsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, itemIds, hotelIds, creativeAssetsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsPostFilters {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
