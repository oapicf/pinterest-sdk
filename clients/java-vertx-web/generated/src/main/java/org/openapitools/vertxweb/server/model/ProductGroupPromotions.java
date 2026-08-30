package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionResponseItem;

/**
 * Wrapper model for ProductGroupPromotion.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductGroupPromotions   {
  
  private List<ProductGroupPromotionResponseItem> items = new ArrayList<>();

  public ProductGroupPromotions () {

  }

  public ProductGroupPromotions (List<ProductGroupPromotionResponseItem> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<ProductGroupPromotionResponseItem> getItems() {
    return items;
  }
  public void setItems(List<ProductGroupPromotionResponseItem> items) {
    this.items = items;
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
    return Objects.equals(items, productGroupPromotions.items);
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
