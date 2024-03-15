package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The counts can be null early in the process.
 */
@ApiModel(description="The counts can be null early in the process.")

public class CatalogsFeedProductCounts  {
  
 /**
  * The number of products in the feed file.
  */
  @ApiModelProperty(value = "The number of products in the feed file.")
  private Integer original;

 /**
  * The number of products successfully ingested from the feed file.
  */
  @ApiModelProperty(value = "The number of products successfully ingested from the feed file.")
  private Integer ingested;
 /**
  * The number of products in the feed file.
  * @return original
  */
  @JsonProperty("original")
  public Integer getOriginal() {
    return original;
  }

  /**
   * Sets the <code>original</code> property.
   */
 public void setOriginal(Integer original) {
    this.original = original;
  }

  /**
   * Sets the <code>original</code> property.
   */
  public CatalogsFeedProductCounts original(Integer original) {
    this.original = original;
    return this;
  }

 /**
  * The number of products successfully ingested from the feed file.
  * @return ingested
  */
  @JsonProperty("ingested")
  public Integer getIngested() {
    return ingested;
  }

  /**
   * Sets the <code>ingested</code> property.
   */
 public void setIngested(Integer ingested) {
    this.ingested = ingested;
  }

  /**
   * Sets the <code>ingested</code> property.
   */
  public CatalogsFeedProductCounts ingested(Integer ingested) {
    this.ingested = ingested;
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
    CatalogsFeedProductCounts catalogsFeedProductCounts = (CatalogsFeedProductCounts) o;
    return Objects.equals(this.original, catalogsFeedProductCounts.original) &&
        Objects.equals(this.ingested, catalogsFeedProductCounts.ingested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, ingested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProductCounts {\n");
    
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    ingested: ").append(toIndentedString(ingested)).append("\n");
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

