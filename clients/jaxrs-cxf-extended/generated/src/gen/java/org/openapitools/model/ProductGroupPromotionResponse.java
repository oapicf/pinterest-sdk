package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotionResponseItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductGroupPromotionResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid ProductGroupPromotionResponseItem> items;
 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid ProductGroupPromotionResponseItem> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ProductGroupPromotionResponseItem> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public ProductGroupPromotionResponse items(List<@Valid ProductGroupPromotionResponseItem> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public ProductGroupPromotionResponse addItemsItem(ProductGroupPromotionResponseItem itemsItem) {
    this.items.add(itemsItem);
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
    ProductGroupPromotionResponse productGroupPromotionResponse = (ProductGroupPromotionResponse) o;
    return Objects.equals(this.items, productGroupPromotionResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

