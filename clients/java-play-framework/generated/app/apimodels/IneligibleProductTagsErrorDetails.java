package apimodels;

import apimodels.IneligibleProductTagErrorItem;
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
 * Details about ineligible product tags in the request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IneligibleProductTagsErrorDetails   {
  @JsonProperty("product_tags")
  @NotNull
@Valid

  private List<@Valid IneligibleProductTagErrorItem> productTags = new ArrayList<>();

  public IneligibleProductTagsErrorDetails productTags(List<@Valid IneligibleProductTagErrorItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  public IneligibleProductTagsErrorDetails addProductTagsItem(IneligibleProductTagErrorItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

   /**
   * List of product tags that failed eligibility check.
   * @return productTags
  **/
  public List<@Valid IneligibleProductTagErrorItem> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<@Valid IneligibleProductTagErrorItem> productTags) {
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
    IneligibleProductTagsErrorDetails ineligibleProductTagsErrorDetails = (IneligibleProductTagsErrorDetails) o;
    return Objects.equals(productTags, ineligibleProductTagsErrorDetails.productTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTags);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IneligibleProductTagsErrorDetails {\n");
    
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

