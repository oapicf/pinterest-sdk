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
 * Request body for bulk adding product tags to a pin.
 **/
@ApiModel(description = "Request body for bulk adding product tags to a pin.")
@JsonTypeName("ProductTagsBulkAddRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsBulkAddRequest   {
  private @Valid List<@Valid ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsBulkAddRequest() {
  }

  @JsonCreator
  public ProductTagsBulkAddRequest(
    @JsonProperty(required = true, value = "product_tags") List<@Valid ProductTagItem> productTags
  ) {
    this.productTags = productTags;
  }

  /**
   * List of product tags to add. Maximum 24 items allowed.
   **/
  public ProductTagsBulkAddRequest productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of product tags to add. Maximum 24 items allowed.")
  @JsonProperty(required = true, value = "product_tags")
  @NotNull @Valid  @Size(min=1,max=24)public List<@Valid ProductTagItem> getProductTags() {
    return productTags;
  }

  @JsonProperty(required = true, value = "product_tags")
  public void setProductTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  public ProductTagsBulkAddRequest addProductTagsItem(ProductTagItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }

    this.productTags.add(productTagsItem);
    return this;
  }

  public ProductTagsBulkAddRequest removeProductTagsItem(ProductTagItem productTagsItem) {
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
