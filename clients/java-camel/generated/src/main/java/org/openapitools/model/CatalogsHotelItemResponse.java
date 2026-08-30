package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.Pin;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object describing a hotel record
 */

@Schema(name = "CatalogsHotelItemResponse", description = "Object describing a hotel record")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelItemResponse implements ItemResponse {

  private CatalogsHotelAttributes attributes;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CatalogTypeEnum catalogType;

  private String hotelId;

  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  public enum ItemResponseKindEnum {
    HOTEL_ITEM("hotel_item");

    private final String value;

    ItemResponseKindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ItemResponseKindEnum fromValue(String value) {
      for (ItemResponseKindEnum b : ItemResponseKindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ItemResponseKindEnum itemResponseKind;

  @Valid
  private JsonNullable<List<@Valid Pin>> pins = JsonNullable.<List<@Valid Pin>>undefined();

  public CatalogsHotelItemResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsHotelItemResponse(CatalogTypeEnum catalogType, ItemResponseKindEnum itemResponseKind) {
    this.catalogType = catalogType;
    this.itemResponseKind = itemResponseKind;
  }

  public CatalogsHotelItemResponse attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogsHotelItemResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
   */
  
  @Schema(name = "hotel_id", example = "DS0294-M", description = "The catalog hotel id in the merchant namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public CatalogsHotelItemResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
    return this;
  }

  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   * @return itemResponseKind
   */
  @NotNull 
  @Schema(name = "item_response_kind", description = "Discriminator literal identifying this leaf inside an `ItemResponse` payload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_response_kind")
  public ItemResponseKindEnum getItemResponseKind() {
    return itemResponseKind;
  }

  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  public CatalogsHotelItemResponse pins(List<@Valid Pin> pins) {
    this.pins = JsonNullable.of(pins);
    return this;
  }

  public CatalogsHotelItemResponse addPinsItem(Pin pinsItem) {
    if (this.pins == null || !this.pins.isPresent()) {
      this.pins = JsonNullable.of(new ArrayList<>());
    }
    this.pins.get().add(pinsItem);
    return this;
  }

  /**
   * The pins mapped to the item
   * @return pins
   */
  @Valid @Size(max = 11) 
  @Schema(name = "pins", description = "The pins mapped to the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pins")
  public JsonNullable<List<@Valid Pin>> getPins() {
    return pins;
  }

  public void setPins(JsonNullable<List<@Valid Pin>> pins) {
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
    return Objects.equals(this.attributes, catalogsHotelItemResponse.attributes) &&
        Objects.equals(this.catalogType, catalogsHotelItemResponse.catalogType) &&
        Objects.equals(this.hotelId, catalogsHotelItemResponse.hotelId) &&
        Objects.equals(this.itemResponseKind, catalogsHotelItemResponse.itemResponseKind) &&
        equalsNullable(this.pins, catalogsHotelItemResponse.pins);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, catalogType, hotelId, itemResponseKind, hashCodeNullable(pins));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

