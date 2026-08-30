package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductTagItem;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response containing a list of product tags for a pin.
 */
@ApiModel(description="Response containing a list of product tags for a pin.")

public class ProductTagsResponse  {
  
 /**
  * List of product tags on the pin.
  */
  @ApiModelProperty(required = true, value = "List of product tags on the pin.")

  private List<ProductTagItem> productTags = new ArrayList<>();
 /**
   * List of product tags on the pin.
   * @return productTags
  **/
  @JsonProperty("product_tags")
  public List<ProductTagItem> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  public ProductTagsResponse productTags(List<ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  public ProductTagsResponse addProductTagsItem(ProductTagItem productTagsItem) {
    this.productTags.add(productTagsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

