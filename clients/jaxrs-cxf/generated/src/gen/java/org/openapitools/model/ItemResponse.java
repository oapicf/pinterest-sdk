package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemResponseAnyOf;
import org.openapitools.model.ItemResponseAnyOf1;
import org.openapitools.model.ItemValidationEvent;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing an item record
 **/
@ApiModel(description="Object describing an item record")

public class ItemResponse  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")
 /**
   * The catalog item id in the merchant namespace
  **/
  private String itemId;

  @ApiModelProperty(value = "Array with the errors for the item id requested")
  @Valid
 /**
   * Array with the errors for the item id requested
  **/
  private List<@Valid ItemValidationEvent> errors;

  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
 /**
   * The catalog hotel id in the merchant namespace
  **/
  private String hotelId;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public ItemResponse catalogType(CatalogsType catalogType) {
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
   * Array with the errors for the item id requested
   * @return errors
  **/
  @JsonProperty("errors")
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponse itemResponse = (ItemResponse) o;
    return Objects.equals(this.catalogType, itemResponse.catalogType) &&
        Objects.equals(this.itemId, itemResponse.itemId) &&
        Objects.equals(this.errors, itemResponse.errors) &&
        Objects.equals(this.hotelId, itemResponse.hotelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, errors, hotelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponse {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

