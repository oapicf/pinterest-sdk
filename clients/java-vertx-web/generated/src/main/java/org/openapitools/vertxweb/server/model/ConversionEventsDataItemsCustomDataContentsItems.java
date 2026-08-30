package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventsDataItemsCustomDataContentsItems   {
  
  private String id;
  private String itemBrand;
  private String itemBrandId;
  private String itemCategory;
  private String itemName;
  private String itemPrice;
  private Long quantity;

  public ConversionEventsDataItemsCustomDataContentsItems () {

  }

  public ConversionEventsDataItemsCustomDataContentsItems (String id, String itemBrand, String itemBrandId, String itemCategory, String itemName, String itemPrice, Long quantity) {
    this.id = id;
    this.itemBrand = itemBrand;
    this.itemBrandId = itemBrandId;
    this.itemCategory = itemCategory;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.quantity = quantity;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("item_brand")
  public String getItemBrand() {
    return itemBrand;
  }
  public void setItemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
  }

    
  @JsonProperty("item_brand_id")
  public String getItemBrandId() {
    return itemBrandId;
  }
  public void setItemBrandId(String itemBrandId) {
    this.itemBrandId = itemBrandId;
  }

    
  @JsonProperty("item_category")
  public String getItemCategory() {
    return itemCategory;
  }
  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

    
  @JsonProperty("item_name")
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

    
  @JsonProperty("item_price")
  public String getItemPrice() {
    return itemPrice;
  }
  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

    
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
