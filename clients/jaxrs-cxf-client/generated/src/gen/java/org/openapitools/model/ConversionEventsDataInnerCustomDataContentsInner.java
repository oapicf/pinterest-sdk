package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionEventsDataInnerCustomDataContentsInner  {
  
  @ApiModelProperty(example = "red-pinterest-shirt-logo-1", value = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
 /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  **/
  private String id;

  @ApiModelProperty(example = "1325.12", value = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
 /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  **/
  private String itemPrice;

  @ApiModelProperty(example = "5", value = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
 /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  **/
  private Long quantity;

  @ApiModelProperty(example = "pinterest-clothing-shirt", value = "The name of a product.")
 /**
   * The name of a product.
  **/
  private String itemName;

  @ApiModelProperty(example = "pinterest-entertainment", value = "The category of a product.")
 /**
   * The category of a product.
  **/
  private String itemCategory;

  @ApiModelProperty(example = "pinterest", value = "The brand of a product.")
 /**
   * The brand of a product.
  **/
  private String itemBrand;
 /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionEventsDataInnerCustomDataContentsInner id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
   * @return itemPrice
  **/
  @JsonProperty("item_price")
  public String getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ConversionEventsDataInnerCustomDataContentsInner itemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

 /**
   * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public ConversionEventsDataInnerCustomDataContentsInner quantity(Long quantity) {
    this.quantity = quantity;
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

  public ConversionEventsDataInnerCustomDataContentsInner itemName(String itemName) {
    this.itemName = itemName;
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

  public ConversionEventsDataInnerCustomDataContentsInner itemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
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

