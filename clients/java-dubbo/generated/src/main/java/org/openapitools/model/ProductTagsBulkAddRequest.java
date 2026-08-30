package org.openapitools.model;

import org.openapitools.model.ProductTagItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request body for bulk adding product tags to a pin.
 */
public class ProductTagsBulkAddRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of product tags to add. Maximum 24 items allowed.
   */
  @JsonProperty("product_tags")
  private List<ProductTagItem> productTags = new ArrayList<>();

  /**
   * List of product tags to add. Maximum 24 items allowed.
   * @return productTags
   */
  public List<ProductTagItem> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<ProductTagItem> productTags) {
    this.productTags = productTags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTagsBulkAddRequest productTagsBulkAddRequest = (ProductTagsBulkAddRequest) o;
    return Objects.equals(this.productTags, productTagsBulkAddRequest.productTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTagsBulkAddRequest {\n");
    
    sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
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
