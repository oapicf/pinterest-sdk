package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CatalogsHotelItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsRetailItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsType;
import org.openapitools.vertxweb.server.model.ItemValidationEvent;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemResponseAnyOf1   {
  
  private CatalogsType catalogType;
  private String itemId;
  private List<ItemValidationEvent> errors;
  private String hotelId;

  public ItemResponseAnyOf1 () {

  }

  public ItemResponseAnyOf1 (CatalogsType catalogType, String itemId, List<ItemValidationEvent> errors, String hotelId) {
    this.catalogType = catalogType;
    this.itemId = itemId;
    this.errors = errors;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponseAnyOf1 itemResponseAnyOf1 = (ItemResponseAnyOf1) o;
    return Objects.equals(catalogType, itemResponseAnyOf1.catalogType) &&
        Objects.equals(itemId, itemResponseAnyOf1.itemId) &&
        Objects.equals(errors, itemResponseAnyOf1.errors) &&
        Objects.equals(hotelId, itemResponseAnyOf1.hotelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, errors, hotelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseAnyOf1 {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
