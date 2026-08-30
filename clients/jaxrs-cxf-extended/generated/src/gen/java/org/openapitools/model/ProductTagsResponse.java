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
 * Response containing a list of product tags for a pin.
 */
@ApiModel(description="Response containing a list of product tags for a pin.")

public class ProductTagsResponse  {
  
 /**
  * List of product tags on the pin.
  */
  @ApiModelProperty(required = true, value = "List of product tags on the pin.")
  @Valid
  private List<@Valid ProductTagItem> productTags = new ArrayList<>();
 /**
  * List of product tags on the pin.
  * @return productTags
  */
  @JsonProperty("product_tags")
  @NotNull
  public List<@Valid ProductTagItem> getProductTags() {
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
  public ProductTagsResponse productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  /**
   * Adds a new item to the <code>productTags</code> list.
   */
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

