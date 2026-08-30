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
 * Request body for bulk adding product tags to a pin.
 */
@ApiModel(description="Request body for bulk adding product tags to a pin.")

public class ProductTagsBulkAddRequest  {
  
 /**
  * List of product tags to add. Maximum 24 items allowed.
  */
  @ApiModelProperty(required = true, value = "List of product tags to add. Maximum 24 items allowed.")

  private List<ProductTagItem> productTags = new ArrayList<>();
 /**
   * List of product tags to add. Maximum 24 items allowed.
   * @return productTags
  **/
  @JsonProperty("product_tags")
  public List<ProductTagItem> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  public ProductTagsBulkAddRequest productTags(List<ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  public ProductTagsBulkAddRequest addProductTagsItem(ProductTagItem productTagsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

