package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsHotelItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsRetailItemErrorResponse;
import org.openapitools.vertxweb.server.model.CatalogsType;
import org.openapitools.vertxweb.server.model.ItemValidationEvent;

/**
 * Error item response
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemResponseOneOf1   {
  
  private CatalogsType catalogType;
  private List<ItemValidationEvent> errors = new ArrayList<>();
  private String itemId;
  private String hotelId;
  private String creativeAssetsId;

  public ItemResponseOneOf1 () {

  }

  public ItemResponseOneOf1 (CatalogsType catalogType, List<ItemValidationEvent> errors, String itemId, String hotelId, String creativeAssetsId) {
    this.catalogType = catalogType;
    this.errors = errors;
    this.itemId = itemId;
    this.hotelId = hotelId;
    this.creativeAssetsId = creativeAssetsId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponseOneOf1 itemResponseOneOf1 = (ItemResponseOneOf1) o;
    return Objects.equals(catalogType, itemResponseOneOf1.catalogType) &&
        Objects.equals(errors, itemResponseOneOf1.errors) &&
        Objects.equals(itemId, itemResponseOneOf1.itemId) &&
        Objects.equals(hotelId, itemResponseOneOf1.hotelId) &&
        Objects.equals(creativeAssetsId, itemResponseOneOf1.creativeAssetsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, errors, itemId, hotelId, creativeAssetsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseOneOf1 {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
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
