package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ProductTagItem;

/**
 * Response containing a list of product tags for a pin.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductTagsResponse   {
  
  private List<ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsResponse () {

  }

  public ProductTagsResponse (List<ProductTagItem> productTags) {
    this.productTags = productTags;
  }

    
  @JsonProperty("product_tags")
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
    return Objects.equals(productTags, productTagsResponse.productTags);
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
