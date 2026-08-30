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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.Pin;



/**
 * Object describing a hotel record
 **/

@ApiModel(description = "Object describing a hotel record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelItemResponse   {
  @JsonProperty("attributes")
  private CatalogsHotelAttributes attributes;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

  @JsonProperty("hotel_id")
  private String hotelId;

  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  public enum ItemResponseKindEnum {
    HOTEL_ITEM("hotel_item");

    private String value;

    ItemResponseKindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ItemResponseKindEnum fromValue(String text) {
      for (ItemResponseKindEnum b : ItemResponseKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("item_response_kind")
  private ItemResponseKindEnum itemResponseKind;

  @JsonProperty("pins")
  private List<Pin> pins = null;

  /**
   **/
  public CatalogsHotelItemResponse attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   **/
  public CatalogsHotelItemResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * The catalog hotel id in the merchant namespace
   **/
  public CatalogsHotelItemResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   **/
  public CatalogsHotelItemResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this leaf inside an `ItemResponse` payload.")
  @JsonProperty("item_response_kind")
  public ItemResponseKindEnum getItemResponseKind() {
    return itemResponseKind;
  }
  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  /**
   * The pins mapped to the item
   **/
  public CatalogsHotelItemResponse pins(List<Pin> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(value = "The pins mapped to the item")
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }
  public void setPins(List<Pin> pins) {
    this.pins = pins;
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
    return Objects.equals(attributes, catalogsHotelItemResponse.attributes) &&
        Objects.equals(catalogType, catalogsHotelItemResponse.catalogType) &&
        Objects.equals(hotelId, catalogsHotelItemResponse.hotelId) &&
        Objects.equals(itemResponseKind, catalogsHotelItemResponse.itemResponseKind) &&
        Objects.equals(pins, catalogsHotelItemResponse.pins);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

