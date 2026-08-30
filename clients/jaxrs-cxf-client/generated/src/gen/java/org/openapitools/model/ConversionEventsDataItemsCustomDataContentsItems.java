package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionEventsDataItemsCustomDataContentsItems  {
  
 /**
  * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  */
  @ApiModelProperty(value = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")

  private String id;

 /**
  * The brand of a product.
  */
  @ApiModelProperty(value = "The brand of a product.")

  private String itemBrand;

 /**
  * The brand ID of a product.
  */
  @ApiModelProperty(value = "The brand ID of a product.")

  private String itemBrandId;

 /**
  * The category of a product.
  */
  @ApiModelProperty(value = "The category of a product.")

  private String itemCategory;

 /**
  * The name of a product.
  */
  @ApiModelProperty(value = "The name of a product.")

  private String itemName;

 /**
  * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  */
  @ApiModelProperty(value = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")

  private String itemPrice;

 /**
  * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  */
  @ApiModelProperty(value = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")

  private Long quantity;
 /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionEventsDataItemsCustomDataContentsItems id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The brand of a product.
   * @return itemBrand
  **/
  @JsonProperty("item_brand")
  public String getItemBrand() {
    return itemBrand;
  }

  public void setItemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
    return this;
  }

 /**
   * The brand ID of a product.
   * @return itemBrandId
  **/
  @JsonProperty("item_brand_id")
  public String getItemBrandId() {
    return itemBrandId;
  }

  public void setItemBrandId(String itemBrandId) {
    this.itemBrandId = itemBrandId;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemBrandId(String itemBrandId) {
    this.itemBrandId = itemBrandId;
    return this;
  }

 /**
   * The category of a product.
   * @return itemCategory
  **/
  @JsonProperty("item_category")
  public String getItemCategory() {
    return itemCategory;
  }

  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
    return this;
  }

 /**
   * The name of a product.
   * @return itemName
  **/
  @JsonProperty("item_name")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

 /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return itemPrice
  **/
  @JsonProperty("item_price")
  public String getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ConversionEventsDataItemsCustomDataContentsItems itemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

 /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public ConversionEventsDataItemsCustomDataContentsItems quantity(Long quantity) {
    this.quantity = quantity;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

