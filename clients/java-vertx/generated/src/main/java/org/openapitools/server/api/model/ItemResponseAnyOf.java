package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsHotelAttributes;
import org.openapitools.server.api.model.CatalogsHotelItemResponse;
import org.openapitools.server.api.model.CatalogsRetailItemResponse;
import org.openapitools.server.api.model.CatalogsType;
import org.openapitools.server.api.model.Pin;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemResponseAnyOf   {
  
  private CatalogsType catalogType;
  private String itemId;
  private List<Pin> pins;
  private CatalogsHotelAttributes attributes;
  private String hotelId;

  public ItemResponseAnyOf () {

  }

  public ItemResponseAnyOf (CatalogsType catalogType, String itemId, List<Pin> pins, CatalogsHotelAttributes attributes, String hotelId) {
    this.catalogType = catalogType;
    this.itemId = itemId;
    this.pins = pins;
    this.attributes = attributes;
    this.hotelId = hotelId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }
  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }

    
  @JsonProperty("attributes")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponseAnyOf itemResponseAnyOf = (ItemResponseAnyOf) o;
    return Objects.equals(catalogType, itemResponseAnyOf.catalogType) &&
        Objects.equals(itemId, itemResponseAnyOf.itemId) &&
        Objects.equals(pins, itemResponseAnyOf.pins) &&
        Objects.equals(attributes, itemResponseAnyOf.attributes) &&
        Objects.equals(hotelId, itemResponseAnyOf.hotelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, pins, attributes, hotelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseAnyOf {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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
