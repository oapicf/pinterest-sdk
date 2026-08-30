package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductTagItem;



/**
 * Request body for bulk deleting product tags from a pin.
 **/

@ApiModel(description = "Request body for bulk deleting product tags from a pin.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsBulkDeleteRequest   {
  @JsonProperty("product_tags")
  private List<ProductTagItem> productTags = new ArrayList<>();

  /**
   * List of product tags to delete.
   **/
  public ProductTagsBulkDeleteRequest productTags(List<ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of product tags to delete.")
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
    ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest = (ProductTagsBulkDeleteRequest) o;
    return Objects.equals(productTags, productTagsBulkDeleteRequest.productTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTagsBulkDeleteRequest {\n");
    
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

