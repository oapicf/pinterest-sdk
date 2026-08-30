package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductTagItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Request body for bulk deleting product tags from a pin.
 */

@Schema(name = "ProductTagsBulkDeleteRequest", description = "Request body for bulk deleting product tags from a pin.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsBulkDeleteRequest {

  @Valid
  private List<@Valid ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsBulkDeleteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductTagsBulkDeleteRequest(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  public ProductTagsBulkDeleteRequest productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  public ProductTagsBulkDeleteRequest addProductTagsItem(ProductTagItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * List of product tags to delete.
   * @return productTags
   */
  @NotNull @Valid @Size(min = 1, max = 24) 
  @Schema(name = "product_tags", description = "List of product tags to delete.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_tags")
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

