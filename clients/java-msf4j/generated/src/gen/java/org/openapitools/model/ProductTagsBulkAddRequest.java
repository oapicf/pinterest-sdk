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
 * Request body for bulk adding product tags to a pin.
 */
@ApiModel(description = "Request body for bulk adding product tags to a pin.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsBulkAddRequest   {
  @JsonProperty("product_tags")
  private List<@Valid ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsBulkAddRequest productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  public ProductTagsBulkAddRequest addProductTagsItem(ProductTagItem productTagsItem) {
    this.productTags.add(productTagsItem);
    return this;
  }

   /**
   * List of product tags to add. Maximum 24 items allowed.
   * @return productTags
  **/
  @ApiModelProperty(required = true, value = "List of product tags to add. Maximum 24 items allowed.")
  public List<@Valid ProductTagItem> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<@Valid ProductTagItem> productTags) {
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

