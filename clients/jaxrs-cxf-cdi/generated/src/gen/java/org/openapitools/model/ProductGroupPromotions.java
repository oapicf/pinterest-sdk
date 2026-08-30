package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotionResponseItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Wrapper model for ProductGroupPromotion.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Wrapper model for ProductGroupPromotion.")
public class ProductGroupPromotions   {
  
  private List<@Valid ProductGroupPromotionResponseItem> items = new ArrayList<>();

  /**
   * Response-only: created or updated product group promotions, or exceptions.
   **/
  public ProductGroupPromotions items(List<@Valid ProductGroupPromotionResponseItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "Response-only: created or updated product group promotions, or exceptions.")
  @JsonProperty("items")
  public List<@Valid ProductGroupPromotionResponseItem> getItems() {
    return items;
  }
  public void setItems(List<@Valid ProductGroupPromotionResponseItem> items) {
    this.items = items;
  }

  public ProductGroupPromotions addItemsItem(ProductGroupPromotionResponseItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

