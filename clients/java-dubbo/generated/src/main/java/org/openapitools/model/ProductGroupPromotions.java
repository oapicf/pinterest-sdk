package org.openapitools.model;

import org.openapitools.model.ProductGroupPromotionResponseItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Wrapper model for ProductGroupPromotion.
 */
public class ProductGroupPromotions implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Response-only: created or updated product group promotions, or exceptions.
   */
  @JsonProperty("items")
  private List<ProductGroupPromotionResponseItem> items = new ArrayList<>();

  /**
   * Response-only: created or updated product group promotions, or exceptions.
   * @return items
   */
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
