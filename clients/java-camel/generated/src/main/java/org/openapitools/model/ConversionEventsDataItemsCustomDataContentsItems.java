package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionEventsDataItemsCustomDataContentsItems
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsDataItemsCustomDataContentsItems {

  private String id;

  private String itemBrand;

  private String itemBrandId;

  private String itemCategory;

  private String itemName;

  private String itemPrice;

  private Long quantity;

  public ConversionEventsDataItemsCustomDataContentsItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return id
   */
  
  @Schema(name = "id", description = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
    return this;
  }

  /**
   * The brand of a product.
   * @return itemBrand
   */
  
  @Schema(name = "item_brand", description = "The brand of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_brand")
  public String getItemBrand() {
    return itemBrand;
  }

  public void setItemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemBrandId(String itemBrandId) {
    this.itemBrandId = itemBrandId;
    return this;
  }

  /**
   * The brand ID of a product.
   * @return itemBrandId
   */
  @Size(max = 64) 
  @Schema(name = "item_brand_id", description = "The brand ID of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_brand_id")
  public String getItemBrandId() {
    return itemBrandId;
  }

  public void setItemBrandId(String itemBrandId) {
    this.itemBrandId = itemBrandId;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
    return this;
  }

  /**
   * The category of a product.
   * @return itemCategory
   */
  
  @Schema(name = "item_category", description = "The category of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_category")
  public String getItemCategory() {
    return itemCategory;
  }

  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * The name of a product.
   * @return itemName
   */
  
  @Schema(name = "item_name", description = "The name of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_name")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return itemPrice
   */
  
  @Schema(name = "item_price", description = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_price")
  public String getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ConversionEventsDataItemsCustomDataContentsItems quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return quantity
   */
  
  @Schema(name = "quantity", description = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
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
    ConversionEventsDataItemsCustomDataContentsItems conversionEventsDataItemsCustomDataContentsItems = (ConversionEventsDataItemsCustomDataContentsItems) o;
    return Objects.equals(this.id, conversionEventsDataItemsCustomDataContentsItems.id) &&
        Objects.equals(this.itemBrand, conversionEventsDataItemsCustomDataContentsItems.itemBrand) &&
        Objects.equals(this.itemBrandId, conversionEventsDataItemsCustomDataContentsItems.itemBrandId) &&
        Objects.equals(this.itemCategory, conversionEventsDataItemsCustomDataContentsItems.itemCategory) &&
        Objects.equals(this.itemName, conversionEventsDataItemsCustomDataContentsItems.itemName) &&
        Objects.equals(this.itemPrice, conversionEventsDataItemsCustomDataContentsItems.itemPrice) &&
        Objects.equals(this.quantity, conversionEventsDataItemsCustomDataContentsItems.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemBrand, itemBrandId, itemCategory, itemName, itemPrice, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataItemsCustomDataContentsItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemBrand: ").append(toIndentedString(itemBrand)).append("\n");
    sb.append("    itemBrandId: ").append(toIndentedString(itemBrandId)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

