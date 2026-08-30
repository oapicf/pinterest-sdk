/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsDataItemsCustomDataContentsItems   {
  
  private String id;
  private String itemBrand;
  private String itemBrandId;
  private String itemCategory;
  private String itemName;
  private String itemPrice;
  private Long quantity;

  /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   */
  public ConversionEventsDataItemsCustomDataContentsItems id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The brand of a product.
   */
  public ConversionEventsDataItemsCustomDataContentsItems itemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
    return this;
  }

  
  @ApiModelProperty(value = "The brand of a product.")
  @JsonProperty("item_brand")
  public String getItemBrand() {
    return itemBrand;
  }
  public void setItemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
  }

  /**
   * The brand ID of a product.
   */
  public ConversionEventsDataItemsCustomDataContentsItems itemBrandId(String itemBrandId) {
    this.itemBrandId = itemBrandId;
    return this;
  }

  
  @ApiModelProperty(value = "The brand ID of a product.")
  @JsonProperty("item_brand_id")
  public String getItemBrandId() {
    return itemBrandId;
  }
  public void setItemBrandId(String itemBrandId) {
    this.itemBrandId = itemBrandId;
  }

  /**
   * The category of a product.
   */
  public ConversionEventsDataItemsCustomDataContentsItems itemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
    return this;
  }

  
  @ApiModelProperty(value = "The category of a product.")
  @JsonProperty("item_category")
  public String getItemCategory() {
    return itemCategory;
  }
  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

  /**
   * The name of a product.
   */
  public ConversionEventsDataItemsCustomDataContentsItems itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  
  @ApiModelProperty(value = "The name of a product.")
  @JsonProperty("item_name")
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   */
  public ConversionEventsDataItemsCustomDataContentsItems itemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  
  @ApiModelProperty(value = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
  @JsonProperty("item_price")
  public String getItemPrice() {
    return itemPrice;
  }
  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

  /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   */
  public ConversionEventsDataItemsCustomDataContentsItems quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(value = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
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
    return Objects.equals(id, conversionEventsDataItemsCustomDataContentsItems.id) &&
        Objects.equals(itemBrand, conversionEventsDataItemsCustomDataContentsItems.itemBrand) &&
        Objects.equals(itemBrandId, conversionEventsDataItemsCustomDataContentsItems.itemBrandId) &&
        Objects.equals(itemCategory, conversionEventsDataItemsCustomDataContentsItems.itemCategory) &&
        Objects.equals(itemName, conversionEventsDataItemsCustomDataContentsItems.itemName) &&
        Objects.equals(itemPrice, conversionEventsDataItemsCustomDataContentsItems.itemPrice) &&
        Objects.equals(quantity, conversionEventsDataItemsCustomDataContentsItems.quantity);
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

