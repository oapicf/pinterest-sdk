package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventsDataInnerCustomDataContentsInner   {
  
  private String id;
  private String itemPrice;
  private Long quantity;
  private String itemName;
  private String itemCategory;
  private String itemBrand;

  public ConversionEventsDataInnerCustomDataContentsInner () {

  }

  public ConversionEventsDataInnerCustomDataContentsInner (String id, String itemPrice, Long quantity, String itemName, String itemCategory, String itemBrand) {
    this.id = id;
    this.itemPrice = itemPrice;
    this.quantity = quantity;
    this.itemName = itemName;
    this.itemCategory = itemCategory;
    this.itemBrand = itemBrand;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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

    
  @JsonProperty("item_name")
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

    
  @JsonProperty("item_category")
  public String getItemCategory() {
    return itemCategory;
  }
  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

    
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
    return Objects.equals(id, conversionEventsDataInnerCustomDataContentsInner.id) &&
        Objects.equals(itemPrice, conversionEventsDataInnerCustomDataContentsInner.itemPrice) &&
        Objects.equals(quantity, conversionEventsDataInnerCustomDataContentsInner.quantity) &&
        Objects.equals(itemName, conversionEventsDataInnerCustomDataContentsInner.itemName) &&
        Objects.equals(itemCategory, conversionEventsDataInnerCustomDataContentsInner.itemCategory) &&
        Objects.equals(itemBrand, conversionEventsDataInnerCustomDataContentsInner.itemBrand);
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
