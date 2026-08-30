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
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsItemResponse;
import org.openapitools.vertxweb.server.model.CatalogsHotelItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsHotelItemResponse;
import org.openapitools.vertxweb.server.model.CatalogsRetailItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsRetailItemResponse;
import org.openapitools.vertxweb.server.model.ItemValidationEvent;
import org.openapitools.vertxweb.server.model.Pin;

/**
 * Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemResponse   {
  
  private CatalogsCreativeAssetsAttributes attributes;


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
  private String itemId;


  public enum ItemResponseKindEnum {
    CREATIVE_ASSETS_ITEM_ERROR("creative_assets_item_error");

    private String value;

    ItemResponseKindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ItemResponseKindEnum itemResponseKind;
  private List<Pin> pins;
  private String hotelId;
  private String creativeAssetsId;
  private List<ItemValidationEvent> errors = new ArrayList<>();

  public ItemResponse () {

  }

  public ItemResponse (CatalogsCreativeAssetsAttributes attributes, CatalogTypeEnum catalogType, String itemId, ItemResponseKindEnum itemResponseKind, List<Pin> pins, String hotelId, String creativeAssetsId, List<ItemValidationEvent> errors) {
    this.attributes = attributes;
    this.catalogType = catalogType;
    this.itemId = itemId;
    this.itemResponseKind = itemResponseKind;
    this.pins = pins;
    this.hotelId = hotelId;
    this.creativeAssetsId = creativeAssetsId;
    this.errors = errors;
  }

    
  @JsonProperty("attributes")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("item_response_kind")
  public ItemResponseKindEnum getItemResponseKind() {
    return itemResponseKind;
  }
  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

    
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }
  public void setPins(List<Pin> pins) {
    this.pins = pins;
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
    return Objects.equals(attributes, itemResponse.attributes) &&
        Objects.equals(catalogType, itemResponse.catalogType) &&
        Objects.equals(itemId, itemResponse.itemId) &&
        Objects.equals(itemResponseKind, itemResponse.itemResponseKind) &&
        Objects.equals(pins, itemResponse.pins) &&
        Objects.equals(hotelId, itemResponse.hotelId) &&
        Objects.equals(creativeAssetsId, itemResponse.creativeAssetsId) &&
        Objects.equals(errors, itemResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, catalogType, itemId, itemResponseKind, pins, hotelId, creativeAssetsId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponse {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
