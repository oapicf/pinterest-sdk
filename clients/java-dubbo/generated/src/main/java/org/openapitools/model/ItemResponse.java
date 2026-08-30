package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsCreativeAssetsItemErrorResponse;
import org.openapitools.model.CatalogsCreativeAssetsItemResponse;
import org.openapitools.model.CatalogsHotelItemErrorResponse;
import org.openapitools.model.CatalogsHotelItemResponse;
import org.openapitools.model.CatalogsRetailItemErrorResponse;
import org.openapitools.model.CatalogsRetailItemResponse;
import org.openapitools.model.ItemValidationEvent;
import org.openapitools.model.Pin;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
 */
public class ItemResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private CatalogsCreativeAssetsAttributes attributes;

  @JsonProperty("catalog_type")
  private String catalogType;

  /**
   * The catalog item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   */
  @JsonProperty("item_response_kind")
  private String itemResponseKind;

  /**
   * The pins mapped to the item
   */
  @JsonProperty("pins")
  private List<Pin> pins;

  /**
   * The catalog hotel id in the merchant namespace
   */
  @JsonProperty("hotel_id")
  private String hotelId;

  /**
   * The catalog creative assets id in the merchant namespace
   */
  @JsonProperty("creative_assets_id")
  private String creativeAssetsId;

  /**
   * Array with the errors for the item id requested
   */
  @JsonProperty("errors")
  private List<ItemValidationEvent> errors = new ArrayList<>();

  /**
   * 
   * @return attributes
   */
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   * @return itemResponseKind
   */
  public String getItemResponseKind() {
    return itemResponseKind;
  }

  public void setItemResponseKind(String itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  /**
   * The pins mapped to the item
   * @return pins
   */
  public List<Pin> getPins() {
    return pins;
  }

  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }

  /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
   */
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
   */
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Array with the errors for the item id requested
   * @return errors
   */
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
    return Objects.equals(this.attributes, itemResponse.attributes) &&
        Objects.equals(this.catalogType, itemResponse.catalogType) &&
        Objects.equals(this.itemId, itemResponse.itemId) &&
        Objects.equals(this.itemResponseKind, itemResponse.itemResponseKind) &&
        Objects.equals(this.pins, itemResponse.pins) &&
        Objects.equals(this.hotelId, itemResponse.hotelId) &&
        Objects.equals(this.creativeAssetsId, itemResponse.creativeAssetsId) &&
        Objects.equals(this.errors, itemResponse.errors);
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
