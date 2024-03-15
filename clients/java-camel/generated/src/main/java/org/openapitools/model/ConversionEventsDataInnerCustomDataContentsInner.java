package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionEventsDataInnerCustomDataContentsInner {

  private String id;

  private String itemPrice;

  private Long quantity;

  private String itemName;

  private String itemCategory;

  private String itemBrand;

  public ConversionEventsDataInnerCustomDataContentsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return id
  */
  
  @Schema(name = "id", example = "red-pinterest-shirt-logo-1", description = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return itemPrice
  */
  
  @Schema(name = "item_price", example = "1325.12", description = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_price")
  public String getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ConversionEventsDataInnerCustomDataContentsInner quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return quantity
  */
  
  @Schema(name = "quantity", example = "5", description = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * The name of a product.
   * @return itemName
  */
  
  @Schema(name = "item_name", example = "pinterest-clothing-shirt", description = "The name of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_name")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
    return this;
  }

  /**
   * The category of a product.
   * @return itemCategory
  */
  
  @Schema(name = "item_category", example = "pinterest-entertainment", description = "The category of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_category")
  public String getItemCategory() {
    return itemCategory;
  }

  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
    return this;
  }

  /**
   * The brand of a product.
   * @return itemBrand
  */
  
  @Schema(name = "item_brand", example = "pinterest", description = "The brand of a product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_brand")
  public String getItemBrand() {
    return itemBrand;
  }

  public void setItemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
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
        Objects.equals(this.itemPrice, conversionEventsDataInnerCustomDataContentsInner.itemPrice) &&
        Objects.equals(this.quantity, conversionEventsDataInnerCustomDataContentsInner.quantity) &&
        Objects.equals(this.itemName, conversionEventsDataInnerCustomDataContentsInner.itemName) &&
        Objects.equals(this.itemCategory, conversionEventsDataInnerCustomDataContentsInner.itemCategory) &&
        Objects.equals(this.itemBrand, conversionEventsDataInnerCustomDataContentsInner.itemBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemPrice, quantity, itemName, itemCategory, itemBrand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInnerCustomDataContentsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
    sb.append("    itemBrand: ").append(toIndentedString(itemBrand)).append("\n");
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

