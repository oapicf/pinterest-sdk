package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing a hotel record
 */
@ApiModel(description="Object describing a hotel record")

public class CatalogsHotelItemResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CatalogsHotelAttributes attributes;

public enum CatalogTypeEnum {

    @JsonProperty("HOTEL") HOTEL(String.valueOf("HOTEL"));

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
  * The catalog hotel id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  private String hotelId;

public enum ItemResponseKindEnum {

    @JsonProperty("hotel_item") HOTEL_ITEM(String.valueOf("hotel_item"));

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
  @Valid
  private List<@Valid Pin> pins;
 /**
  * Get attributes
  * @return attributes
  */
  @JsonProperty("attributes")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
 public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
  public CatalogsHotelItemResponse attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsHotelItemResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * The catalog hotel id in the merchant namespace
  * @return hotelId
  */
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  /**
   * Sets the <code>hotelId</code> property.
   */
 public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * Sets the <code>hotelId</code> property.
   */
  public CatalogsHotelItemResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

 /**
  * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
  * @return itemResponseKind
  */
  @JsonProperty("item_response_kind")
  @NotNull
  public String getItemResponseKind() {
    return itemResponseKind == null ? null : itemResponseKind.value();
  }

  /**
   * Sets the <code>itemResponseKind</code> property.
   */
 public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  /**
   * Sets the <code>itemResponseKind</code> property.
   */
  public CatalogsHotelItemResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
    return this;
  }

 /**
  * The pins mapped to the item
  * @return pins
  */
  @JsonProperty("pins")
 @Size(max=11)  public List<@Valid Pin> getPins() {
    return pins;
  }

  /**
   * Sets the <code>pins</code> property.
   */
 public void setPins(List<@Valid Pin> pins) {
    this.pins = pins;
  }

  /**
   * Sets the <code>pins</code> property.
   */
  public CatalogsHotelItemResponse pins(List<@Valid Pin> pins) {
    this.pins = pins;
    return this;
  }

  /**
   * Adds a new item to the <code>pins</code> list.
   */
  public CatalogsHotelItemResponse addPinsItem(Pin pinsItem) {
    this.pins.add(pinsItem);
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
    CatalogsHotelItemResponse catalogsHotelItemResponse = (CatalogsHotelItemResponse) o;
    return Objects.equals(this.attributes, catalogsHotelItemResponse.attributes) &&
        Objects.equals(this.catalogType, catalogsHotelItemResponse.catalogType) &&
        Objects.equals(this.hotelId, catalogsHotelItemResponse.hotelId) &&
        Objects.equals(this.itemResponseKind, catalogsHotelItemResponse.itemResponseKind) &&
        Objects.equals(this.pins, catalogsHotelItemResponse.pins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, catalogType, hotelId, itemResponseKind, pins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemResponse {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
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

