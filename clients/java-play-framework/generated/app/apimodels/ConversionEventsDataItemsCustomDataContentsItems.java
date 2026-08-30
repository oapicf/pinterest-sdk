package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionEventsDataItemsCustomDataContentsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventsDataItemsCustomDataContentsItems   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("item_brand")
  
  private String itemBrand;

  @JsonProperty("item_brand_id")
  @Size(max=64)

  private String itemBrandId;

  @JsonProperty("item_category")
  
  private String itemCategory;

  @JsonProperty("item_name")
  
  private String itemName;

  @JsonProperty("item_price")
  
  private String itemPrice;

  @JsonProperty("quantity")
  
  private Long quantity;

  public ConversionEventsDataItemsCustomDataContentsItems id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

