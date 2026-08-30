package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductTagItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Response containing a list of product tags for a pin.
 **/
@ApiModel(description = "Response containing a list of product tags for a pin.")
@JsonTypeName("ProductTagsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsResponse   {
  private @Valid List<@Valid ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsResponse() {
  }

  @JsonCreator
  public ProductTagsResponse(
    @JsonProperty(required = true, value = "product_tags") List<@Valid ProductTagItem> productTags
  ) {
    this.productTags = productTags;
  }

  /**
   * List of product tags on the pin.
   **/
  public ProductTagsResponse productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of product tags on the pin.")
  @JsonProperty(required = true, value = "product_tags")
  @NotNull @Valid public List<@Valid ProductTagItem> getProductTags() {
    return productTags;
  }

  @JsonProperty(required = true, value = "product_tags")
  public void setProductTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  public ProductTagsResponse addProductTagsItem(ProductTagItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }

    this.productTags.add(productTagsItem);
    return this;
  }

  public ProductTagsResponse removeProductTagsItem(ProductTagItem productTagsItem) {
    if (productTagsItem != null && this.productTags != null) {
      this.productTags.remove(productTagsItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
