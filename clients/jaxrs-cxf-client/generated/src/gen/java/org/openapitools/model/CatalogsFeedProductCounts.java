package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The counts can be null early in the process.
 **/
@ApiModel(description="The counts can be null early in the process.")
public class CatalogsFeedProductCounts  {
  
  @ApiModelProperty(value = "The number of products in the feed file")
 /**
   * The number of products in the feed file
  **/
  private Integer original;
 /**
   * The number of products in the feed file
   * @return original
  **/
  @JsonProperty("original")
  public Integer getOriginal() {
    return original;
  }

  public void setOriginal(Integer original) {
    this.original = original;
  }

  public CatalogsFeedProductCounts original(Integer original) {
    this.original = original;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProductCounts {\n");
    
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

