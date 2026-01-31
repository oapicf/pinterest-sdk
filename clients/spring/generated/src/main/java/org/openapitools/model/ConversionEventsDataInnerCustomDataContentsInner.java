package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionEventsDataInnerCustomDataContentsInner
 */

@JsonTypeName("ConversionEvents_data_inner_custom_data_contents_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionEventsDataInnerCustomDataContentsInner {

  private @Nullable String id;

  private @Nullable String itemBrand;

  private @Nullable String itemCategory;

  private @Nullable String itemName;

  private @Nullable String itemPrice;

  private @Nullable Long quantity;

  public ConversionEventsDataInnerCustomDataContentsInner id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return id
   */
  
  @Schema(name = "id", description = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemBrand(@Nullable String itemBrand) {
    this.itemBrand = itemBrand;
    return this;
  }

  /**
   * The brand of a product.
   * @return itemBrand
   */
  
  @Schema(name = "item_brand", description = "The brand of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_brand")
  public @Nullable String getItemBrand() {
    return itemBrand;
  }

  public void setItemBrand(@Nullable String itemBrand) {
    this.itemBrand = itemBrand;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemCategory(@Nullable String itemCategory) {
    this.itemCategory = itemCategory;
    return this;
  }

  /**
   * The category of a product.
   * @return itemCategory
   */
  
  @Schema(name = "item_category", description = "The category of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_category")
  public @Nullable String getItemCategory() {
    return itemCategory;
  }

  public void setItemCategory(@Nullable String itemCategory) {
    this.itemCategory = itemCategory;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemName(@Nullable String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * The name of a product.
   * @return itemName
   */
  
  @Schema(name = "item_name", description = "The name of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_name")
  public @Nullable String getItemName() {
    return itemName;
  }

  public void setItemName(@Nullable String itemName) {
    this.itemName = itemName;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemPrice(@Nullable String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return itemPrice
   */
  
  @Schema(name = "item_price", description = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_price")
  public @Nullable String getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(@Nullable String itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ConversionEventsDataInnerCustomDataContentsInner quantity(@Nullable Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return quantity
   */
  
  @Schema(name = "quantity", description = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Long getQuantity() {
    return quantity;
  }

  public void setQuantity(@Nullable Long quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsDataInnerCustomDataContentsInner conversionEventsDataInnerCustomDataContentsInner = (ConversionEventsDataInnerCustomDataContentsInner) o;
    return Objects.equals(this.id, conversionEventsDataInnerCustomDataContentsInner.id) &&
        Objects.equals(this.itemBrand, conversionEventsDataInnerCustomDataContentsInner.itemBrand) &&
        Objects.equals(this.itemCategory, conversionEventsDataInnerCustomDataContentsInner.itemCategory) &&
        Objects.equals(this.itemName, conversionEventsDataInnerCustomDataContentsInner.itemName) &&
        Objects.equals(this.itemPrice, conversionEventsDataInnerCustomDataContentsInner.itemPrice) &&
        Objects.equals(this.quantity, conversionEventsDataInnerCustomDataContentsInner.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemBrand, itemCategory, itemName, itemPrice, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInnerCustomDataContentsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemBrand: ").append(toIndentedString(itemBrand)).append("\n");
    sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

