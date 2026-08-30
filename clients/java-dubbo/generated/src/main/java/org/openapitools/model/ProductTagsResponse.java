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
 * Response containing a list of product tags for a pin.
 */
public class ProductTagsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of product tags on the pin.
   */
  @JsonProperty("product_tags")
  private List<ProductTagItem> productTags = new ArrayList<>();

  /**
   * List of product tags on the pin.
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
    ProductTagsResponse productTagsResponse = (ProductTagsResponse) o;
    return Objects.equals(this.productTags, productTagsResponse.productTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTagsResponse {\n");
    
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
