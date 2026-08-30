package apimodels;

import apimodels.CatalogsCreativeAssetsAttributes;
import apimodels.CatalogsCreativeAssetsItemErrorResponse;
import apimodels.CatalogsCreativeAssetsItemResponse;
import apimodels.CatalogsHotelItemErrorResponse;
import apimodels.CatalogsHotelItemResponse;
import apimodels.CatalogsRetailItemErrorResponse;
import apimodels.CatalogsRetailItemResponse;
import apimodels.ItemValidationEvent;
import apimodels.Pin;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemResponse   {
  @JsonProperty("attributes")
  @Valid

  private CatalogsCreativeAssetsAttributes attributes;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("catalog_type")
  @NotNull

  private CatalogTypeEnum catalogType;

  @JsonProperty("item_id")
  
  private String itemId;

  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  public enum ItemResponseKindEnum {
    CREATIVE_ASSETS_ITEM_ERROR("creative_assets_item_error");

    private final String value;

    ItemResponseKindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("item_response_kind")
  @NotNull

  private ItemResponseKindEnum itemResponseKind;

  @JsonProperty("pins")
  @Size(max=11)
@Valid

  private List<@Valid Pin> pins = null;

  @JsonProperty("hotel_id")
  
  private String hotelId;

  @JsonProperty("creative_assets_id")
  
  private String creativeAssetsId;

  @JsonProperty("errors")
  @NotNull
@Valid

  private List<@Valid ItemValidationEvent> errors = new ArrayList<>();

  public ItemResponse attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
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
      this.pins = new ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }

   /**
   * The pins mapped to the item
   * @return pins
  **/
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
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Array with the errors for the item id requested
   * @return errors
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

