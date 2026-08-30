package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsDataItemsCustomDataContentsItems {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String itemBrand;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String itemBrandId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String itemCategory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String itemName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String itemPrice;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Long quantity;

  public ConversionEventsDataItemsCustomDataContentsItems id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return id
   */
  
  @Schema(name = "id", description = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemBrand(@Nullable String itemBrand) {
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

  @JsonProperty("item_brand")
  public void setItemBrand(@Nullable String itemBrand) {
    this.itemBrand = itemBrand;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemBrandId(@Nullable String itemBrandId) {
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
  public @Nullable String getItemBrandId() {
    return itemBrandId;
  }

  @JsonProperty("item_brand_id")
  public void setItemBrandId(@Nullable String itemBrandId) {
    this.itemBrandId = itemBrandId;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemCategory(@Nullable String itemCategory) {
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

  @JsonProperty("item_category")
  public void setItemCategory(@Nullable String itemCategory) {
    this.itemCategory = itemCategory;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemName(@Nullable String itemName) {
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

  @JsonProperty("item_name")
  public void setItemName(@Nullable String itemName) {
    this.itemName = itemName;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemPrice(@Nullable String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return itemPrice
   */
  
  @Schema(name = "item_price", description = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_price")
  public @Nullable String getItemPrice() {
    return itemPrice;
  }

  @JsonProperty("item_price")
  public void setItemPrice(@Nullable String itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ConversionEventsDataItemsCustomDataContentsItems quantity(@Nullable Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return quantity
   */
  
  @Schema(name = "quantity", description = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Long getQuantity() {
    return quantity;
  }

  @JsonProperty("quantity")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

