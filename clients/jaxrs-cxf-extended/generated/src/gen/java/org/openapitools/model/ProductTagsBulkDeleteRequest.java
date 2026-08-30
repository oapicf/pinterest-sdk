package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductTagItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request body for bulk deleting product tags from a pin.
 */
@ApiModel(description="Request body for bulk deleting product tags from a pin.")

public class ProductTagsBulkDeleteRequest  {
  
 /**
  * List of product tags to delete.
  */
  @ApiModelProperty(required = true, value = "List of product tags to delete.")
  @Valid
  private List<@Valid ProductTagItem> productTags = new ArrayList<>();
 /**
  * List of product tags to delete.
  * @return productTags
  */
  @JsonProperty("product_tags")
  @NotNull
 @Size(min=1,max=24)  public List<@Valid ProductTagItem> getProductTags() {
    return productTags;
  }

  /**
   * Sets the <code>productTags</code> property.
   */
 public void setProductTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  /**
   * Sets the <code>productTags</code> property.
   */
  public ProductTagsBulkDeleteRequest productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  /**
   * Adds a new item to the <code>productTags</code> list.
   */
  public ProductTagsBulkDeleteRequest addProductTagsItem(ProductTagItem productTagsItem) {
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
    ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest = (ProductTagsBulkDeleteRequest) o;
    return Objects.equals(this.productTags, productTagsBulkDeleteRequest.productTags);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

