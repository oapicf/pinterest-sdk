package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionEventsDataInnerCustomDataContentsInner  {
  
 /**
  * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  */
  @ApiModelProperty(example = "red-pinterest-shirt-logo-1", value = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  private String id;

 /**
  * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  */
  @ApiModelProperty(example = "1325.12", value = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  private String itemPrice;

 /**
  * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  */
  @ApiModelProperty(example = "5", value = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  private Long quantity;

 /**
  * The name of a product.
  */
  @ApiModelProperty(example = "pinterest-clothing-shirt", value = "The name of a product.")
  private String itemName;

 /**
  * The category of a product.
  */
  @ApiModelProperty(example = "pinterest-entertainment", value = "The category of a product.")
  private String itemCategory;

 /**
  * The brand of a product.
  */
  @ApiModelProperty(example = "pinterest", value = "The brand of a product.")
  private String itemBrand;
 /**
  * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ConversionEventsDataInnerCustomDataContentsInner id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
  * @return itemPrice
  */
  @JsonProperty("item_price")
  public String getItemPrice() {
    return itemPrice;
  }

  /**
   * Sets the <code>itemPrice</code> property.
   */
 public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

  /**
   * Sets the <code>itemPrice</code> property.
   */
  public ConversionEventsDataInnerCustomDataContentsInner itemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

 /**
  * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
  * @return quantity
  */
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }

  /**
   * Sets the <code>quantity</code> property.
   */
 public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  /**
   * Sets the <code>quantity</code> property.
   */
  public ConversionEventsDataInnerCustomDataContentsInner quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
  * The name of a product.
  * @return itemName
  */
  @JsonProperty("item_name")
  public String getItemName() {
    return itemName;
  }

  /**
   * Sets the <code>itemName</code> property.
   */
 public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  /**
   * Sets the <code>itemName</code> property.
   */
  public ConversionEventsDataInnerCustomDataContentsInner itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

 /**
  * The category of a product.
  * @return itemCategory
  */
  @JsonProperty("item_category")
  public String getItemCategory() {
    return itemCategory;
  }

  /**
   * Sets the <code>itemCategory</code> property.
   */
 public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

  /**
   * Sets the <code>itemCategory</code> property.
   */
  public ConversionEventsDataInnerCustomDataContentsInner itemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
    return this;
  }

 /**
  * The brand of a product.
  * @return itemBrand
  */
  @JsonProperty("item_brand")
  public String getItemBrand() {
    return itemBrand;
  }

  /**
   * Sets the <code>itemBrand</code> property.
   */
 public void setItemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
  }

  /**
   * Sets the <code>itemBrand</code> property.
   */
  public ConversionEventsDataInnerCustomDataContentsInner itemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

