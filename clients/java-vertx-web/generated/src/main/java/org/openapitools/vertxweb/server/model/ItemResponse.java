package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.vertxweb.server.model.CatalogsType;
import org.openapitools.vertxweb.server.model.ItemResponseAnyOf;
import org.openapitools.vertxweb.server.model.ItemResponseAnyOf1;
import org.openapitools.vertxweb.server.model.ItemValidationEvent;
import org.openapitools.vertxweb.server.model.Pin;

/**
 * Object describing an item record
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemResponse   {
  
  private CatalogsType catalogType;
  private String itemId;
  private List<Pin> pins;
  private CatalogsCreativeAssetsAttributes attributes;
  private String hotelId;
  private String creativeAssetsId;
  private List<ItemValidationEvent> errors = new ArrayList<>();

  public ItemResponse () {

  }

  public ItemResponse (CatalogsType catalogType, String itemId, List<Pin> pins, CatalogsCreativeAssetsAttributes attributes, String hotelId, String creativeAssetsId, List<ItemValidationEvent> errors) {
    this.catalogType = catalogType;
    this.itemId = itemId;
    this.pins = pins;
    this.attributes = attributes;
    this.hotelId = hotelId;
    this.creativeAssetsId = creativeAssetsId;
    this.errors = errors;
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
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

    
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

    
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponse itemResponse = (ItemResponse) o;
    return Objects.equals(catalogType, itemResponse.catalogType) &&
        Objects.equals(itemId, itemResponse.itemId) &&
        Objects.equals(pins, itemResponse.pins) &&
        Objects.equals(attributes, itemResponse.attributes) &&
        Objects.equals(hotelId, itemResponse.hotelId) &&
        Objects.equals(creativeAssetsId, itemResponse.creativeAssetsId) &&
        Objects.equals(errors, itemResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, pins, attributes, hotelId, creativeAssetsId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
