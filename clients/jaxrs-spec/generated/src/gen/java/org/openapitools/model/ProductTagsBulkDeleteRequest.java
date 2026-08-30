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
 * Request body for bulk deleting product tags from a pin.
 **/
@ApiModel(description = "Request body for bulk deleting product tags from a pin.")
@JsonTypeName("ProductTagsBulkDeleteRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsBulkDeleteRequest   {
  private @Valid List<@Valid ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsBulkDeleteRequest() {
  }

  @JsonCreator
  public ProductTagsBulkDeleteRequest(
    @JsonProperty(required = true, value = "product_tags") List<@Valid ProductTagItem> productTags
  ) {
    this.productTags = productTags;
  }

  /**
   * List of product tags to delete.
   **/
  public ProductTagsBulkDeleteRequest productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of product tags to delete.")
  @JsonProperty(required = true, value = "product_tags")
  @NotNull @Valid  @Size(min=1,max=24)public List<@Valid ProductTagItem> getProductTags() {
    return productTags;
  }

  @JsonProperty(required = true, value = "product_tags")
  public void setProductTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  public ProductTagsBulkDeleteRequest addProductTagsItem(ProductTagItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }

    this.productTags.add(productTagsItem);
    return this;
  }

  public ProductTagsBulkDeleteRequest removeProductTagsItem(ProductTagItem productTagsItem) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
