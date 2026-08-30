package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ItemValidationEvent;

/**
 * Object describing a hotel item error
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelItemErrorResponse   {
  


  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

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
  private List<ItemValidationEvent> errors = new ArrayList<>();
  private String hotelId;


  public enum ItemResponseKindEnum {
    HOTEL_ITEM_ERROR("hotel_item_error");

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

  public CatalogsHotelItemErrorResponse () {

  }

  public CatalogsHotelItemErrorResponse (CatalogTypeEnum catalogType, List<ItemValidationEvent> errors, String hotelId, ItemResponseKindEnum itemResponseKind) {
    this.catalogType = catalogType;
    this.errors = errors;
    this.hotelId = hotelId;
    this.itemResponseKind = itemResponseKind;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

    
  @JsonProperty("item_response_kind")
  public ItemResponseKindEnum getItemResponseKind() {
    return itemResponseKind;
  }
  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse = (CatalogsHotelItemErrorResponse) o;
    return Objects.equals(catalogType, catalogsHotelItemErrorResponse.catalogType) &&
        Objects.equals(errors, catalogsHotelItemErrorResponse.errors) &&
        Objects.equals(hotelId, catalogsHotelItemErrorResponse.hotelId) &&
        Objects.equals(itemResponseKind, catalogsHotelItemErrorResponse.itemResponseKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, errors, hotelId, itemResponseKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemErrorResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
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
