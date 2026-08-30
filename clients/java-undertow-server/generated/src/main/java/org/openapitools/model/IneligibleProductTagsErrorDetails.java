/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IneligibleProductTagErrorItem;



/**
 * Details about ineligible product tags in the request.
 */

@ApiModel(description = "Details about ineligible product tags in the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IneligibleProductTagsErrorDetails   {
  
  private List<IneligibleProductTagErrorItem> productTags = new ArrayList<>();

  /**
   * List of product tags that failed eligibility check.
   */
  public IneligibleProductTagsErrorDetails productTags(List<IneligibleProductTagErrorItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of product tags that failed eligibility check.")
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

