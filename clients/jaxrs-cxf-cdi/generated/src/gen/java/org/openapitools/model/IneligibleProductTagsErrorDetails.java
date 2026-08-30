package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IneligibleProductTagErrorItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details about ineligible product tags in the request.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Details about ineligible product tags in the request.")
public class IneligibleProductTagsErrorDetails   {
  
  private List<@Valid IneligibleProductTagErrorItem> productTags = new ArrayList<>();

  /**
   * List of product tags that failed eligibility check.
   **/
  public IneligibleProductTagsErrorDetails productTags(List<@Valid IneligibleProductTagErrorItem> productTags) {
    this.productTags = productTags;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of product tags that failed eligibility check.")
  @JsonProperty("product_tags")
  @NotNull
  public List<@Valid IneligibleProductTagErrorItem> getProductTags() {
    return productTags;
  }
  public void setProductTags(List<@Valid IneligibleProductTagErrorItem> productTags) {
    this.productTags = productTags;
  }

  public IneligibleProductTagsErrorDetails addProductTagsItem(IneligibleProductTagErrorItem productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
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

