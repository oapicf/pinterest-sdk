package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductTagItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Response containing a list of product tags for a pin.
 */

@Schema(name = "ProductTagsResponse", description = "Response containing a list of product tags for a pin.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsResponse {

  private List<@Valid ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductTagsResponse(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
  }

  public ProductTagsResponse productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  public ProductTagsResponse addProductTagsItem(ProductTagItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * List of product tags on the pin.
   * @return productTags
   */
  @NotNull @Valid 
  @Schema(name = "product_tags", description = "List of product tags on the pin.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_tags")
  public List<@Valid ProductTagItem> getProductTags() {
    return productTags;
  }

  @JsonProperty("product_tags")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

