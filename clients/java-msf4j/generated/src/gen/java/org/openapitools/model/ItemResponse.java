package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
 */
@ApiModel(description = "Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ItemResponse   {
  @JsonProperty("attributes")
  private CatalogsCreativeAssetsAttributes attributes;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

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

  @JsonProperty("item_id")
  private String itemId;

  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  public enum ItemResponseKindEnum {
    CREATIVE_ASSETS_ITEM_ERROR("creative_assets_item_error");

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
  private List<@Valid Pin> pins = null;

  @JsonProperty("hotel_id")
  private String hotelId;

  @JsonProperty("creative_assets_id")
  private String creativeAssetsId;

  @JsonProperty("errors")
  private List<@Valid ItemValidationEvent> errors = new ArrayList<>();

  public ItemResponse attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  public ItemResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public ItemResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
    return this;
  }

   /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   * @return itemResponseKind
  **/
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this leaf inside an `ItemResponse` payload.")
  public ItemResponseKindEnum getItemResponseKind() {
    return itemResponseKind;
  }

  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  public ItemResponse pins(List<@Valid Pin> pins) {
    this.pins = pins;
    return this;
  }

  public ItemResponse addPinsItem(Pin pinsItem) {
    if (this.pins == null) {
      this.pins = ;
    }
    this.pins.add(pinsItem);
    return this;
  }

   /**
   * The pins mapped to the item
   * @return pins
  **/
  @ApiModelProperty(value = "The pins mapped to the item")
  public List<@Valid Pin> getPins() {
    return pins;
  }

  public void setPins(List<@Valid Pin> pins) {
    this.pins = pins;
  }

  public ItemResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

   /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
  **/
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public ItemResponse creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

   /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
  **/
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public ItemResponse errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public ItemResponse addErrorsItem(ItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Array with the errors for the item id requested
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "Array with the errors for the item id requested")
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ItemValidationEvent> errors) {
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

