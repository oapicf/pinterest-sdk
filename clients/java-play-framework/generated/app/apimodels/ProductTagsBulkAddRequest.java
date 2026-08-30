package apimodels;

import apimodels.ProductTagItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Request body for bulk adding product tags to a pin.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductTagsBulkAddRequest   {
  @JsonProperty("product_tags")
  @NotNull
@Size(min=1,max=24)
@Valid

  private List<@Valid ProductTagItem> productTags = new ArrayList<>();

  public ProductTagsBulkAddRequest productTags(List<@Valid ProductTagItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  public ProductTagsBulkAddRequest addProductTagsItem(ProductTagItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

   /**
   * List of product tags to add. Maximum 24 items allowed.
   * @return productTags
  **/
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
    return Objects.equals(productTags, productTagsBulkAddRequest.productTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTags);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

