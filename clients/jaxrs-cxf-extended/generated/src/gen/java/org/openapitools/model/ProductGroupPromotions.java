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


/**
 * Wrapper model for ProductGroupPromotion.
 */
@ApiModel(description="Wrapper model for ProductGroupPromotion.")

public class ProductGroupPromotions  {
  
 /**
  * Response-only: created or updated product group promotions, or exceptions.
  */
  @ApiModelProperty(value = "Response-only: created or updated product group promotions, or exceptions.")
  @Valid
  private List<@Valid ProductGroupPromotionResponseItem> items = new ArrayList<>();
 /**
  * Response-only: created or updated product group promotions, or exceptions.
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid ProductGroupPromotionResponseItem> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   * <br><em>N.B. <code>items</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setItems(List<@Valid ProductGroupPromotionResponseItem> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   * <br><em>N.B. <code>items</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ProductGroupPromotions items(List<@Valid ProductGroupPromotionResponseItem> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   * <br><em>N.B. <code>items</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ProductGroupPromotions addItemsItem(ProductGroupPromotionResponseItem itemsItem) {
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
    ProductGroupPromotions productGroupPromotions = (ProductGroupPromotions) o;
    return Objects.equals(this.items, productGroupPromotions.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotions {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

