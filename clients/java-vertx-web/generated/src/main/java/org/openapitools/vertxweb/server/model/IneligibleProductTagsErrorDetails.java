package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.IneligibleProductTagErrorItem;

/**
 * Details about ineligible product tags in the request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IneligibleProductTagsErrorDetails   {
  
  private List<IneligibleProductTagErrorItem> productTags = new ArrayList<>();

  public IneligibleProductTagsErrorDetails () {

  }

  public IneligibleProductTagsErrorDetails (List<IneligibleProductTagErrorItem> productTags) {
    this.productTags = productTags;
  }

    
  @JsonProperty("product_tags")
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
    return Objects.equals(productTags, ineligibleProductTagsErrorDetails.productTags);
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
