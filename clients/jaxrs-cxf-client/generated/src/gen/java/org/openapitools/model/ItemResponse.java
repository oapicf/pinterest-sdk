package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
 */
@ApiModel(description="Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).")

public class ItemResponse  {
  
  @ApiModelProperty(value = "")

  private CatalogsCreativeAssetsAttributes attributes;

public enum CatalogTypeEnum {

CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private CatalogTypeEnum catalogType;

 /**
  * The catalog item id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")

  private String itemId;

public enum ItemResponseKindEnum {

CREATIVE_ASSETS_ITEM_ERROR(String.valueOf("creative_assets_item_error"));


    private String value;

    ItemResponseKindEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ItemResponseKindEnum fromValue(String value) {
        for (ItemResponseKindEnum b : ItemResponseKindEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  */
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this leaf inside an `ItemResponse` payload.")

  private ItemResponseKindEnum itemResponseKind;

 /**
  * The pins mapped to the item
  */
  @ApiModelProperty(value = "The pins mapped to the item")

  private List<Pin> pins;

 /**
  * The catalog hotel id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")

  private String hotelId;

 /**
  * The catalog creative assets id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")

  private String creativeAssetsId;

 /**
  * Array with the errors for the item id requested
  */
  @ApiModelProperty(required = true, value = "Array with the errors for the item id requested")

  private List<ItemValidationEvent> errors = new ArrayList<>();
 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  public ItemResponse attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public ItemResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   * @return itemResponseKind
  **/
  @JsonProperty("item_response_kind")
  public String getItemResponseKind() {
    if (itemResponseKind == null) {
      return null;
    }
    return itemResponseKind.value();
  }

  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  public ItemResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
    return this;
  }

 /**
   * The pins mapped to the item
   * @return pins
  **/
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }

  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }

  public ItemResponse pins(List<Pin> pins) {
    this.pins = pins;
    return this;
  }

  public ItemResponse addPinsItem(Pin pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

 /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
  **/
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public ItemResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

 /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
  **/
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public ItemResponse creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
   * Array with the errors for the item id requested
   * @return errors
  **/
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public ItemResponse errors(List<ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public ItemResponse addErrorsItem(ItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

