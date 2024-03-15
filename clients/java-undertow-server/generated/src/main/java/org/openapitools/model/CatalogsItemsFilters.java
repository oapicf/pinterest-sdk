/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelItemsFilter;
import org.openapitools.model.CatalogsRetailItemsFilter;
import org.openapitools.model.CatalogsType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsItemsFilters   {
  
  private CatalogsType catalogType;
  private List<String> itemIds = new ArrayList<>();
  private String catalogId;
  private List<String> hotelIds = new ArrayList<>();

  /**
   */
  public CatalogsItemsFilters catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   */
  public CatalogsItemsFilters itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item_ids")
  public List<String> getItemIds() {
    return itemIds;
  }
  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   */
  public CatalogsItemsFilters catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   */
  public CatalogsItemsFilters hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hotel_ids")
  public List<String> getHotelIds() {
    return hotelIds;
  }
  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
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
        Objects.equals(hotelIds, catalogsItemsFilters.hotelIds);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

