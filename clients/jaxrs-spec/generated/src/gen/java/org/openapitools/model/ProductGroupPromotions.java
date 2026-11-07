package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotionResponseItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Wrapper model for ProductGroupPromotion.
 **/
@ApiModel(description = "Wrapper model for ProductGroupPromotion.")
@JsonTypeName("ProductGroupPromotions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-07T02:51:53.160510316Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ProductGroupPromotions   {
  private List<@Valid ProductGroupPromotionResponseItem> items = new ArrayList<>();

  public ProductGroupPromotions() {
  }

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

  @JsonProperty("items")
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

  public ProductGroupPromotions removeItemsItem(ProductGroupPromotionResponseItem itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

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
