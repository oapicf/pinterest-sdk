package org.openapitools.model;

import org.openapitools.model.IneligibleProductTagErrorItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Details about ineligible product tags in the request.
 */
public class IneligibleProductTagsErrorDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of product tags that failed eligibility check.
   */
  @JsonProperty("product_tags")
  private List<IneligibleProductTagErrorItem> productTags = new ArrayList<>();

  /**
   * List of product tags that failed eligibility check.
   * @return productTags
   */
  public List<IneligibleProductTagErrorItem> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<IneligibleProductTagErrorItem> productTags) {
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
    return Objects.equals(this.productTags, ineligibleProductTagsErrorDetails.productTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTags);
  }

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
