package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing a hotel item error
 */
@ApiModel(description="Object describing a hotel item error")

public class CatalogsHotelItemErrorResponse  {
  
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
  * Array with the errors for the item id requested
  */
  @ApiModelProperty(required = true, value = "Array with the errors for the item id requested")
  @Valid
  private List<@Valid ItemValidationEvent> errors = new ArrayList<>();

 /**
  * The catalog hotel id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  private String hotelId;

public enum ItemResponseKindEnum {

    @JsonProperty("hotel_item_error") HOTEL_ITEM_ERROR(String.valueOf("hotel_item_error"));

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
  public CatalogsHotelItemErrorResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Array with the errors for the item id requested
  * @return errors
  */
  @JsonProperty("errors")
  @NotNull
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public CatalogsHotelItemErrorResponse errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public CatalogsHotelItemErrorResponse addErrorsItem(ItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
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
  public CatalogsHotelItemErrorResponse hotelId(String hotelId) {
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
  public CatalogsHotelItemErrorResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
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
    CatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse = (CatalogsHotelItemErrorResponse) o;
    return Objects.equals(this.catalogType, catalogsHotelItemErrorResponse.catalogType) &&
        Objects.equals(this.errors, catalogsHotelItemErrorResponse.errors) &&
        Objects.equals(this.hotelId, catalogsHotelItemErrorResponse.hotelId) &&
        Objects.equals(this.itemResponseKind, catalogsHotelItemErrorResponse.itemResponseKind);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

