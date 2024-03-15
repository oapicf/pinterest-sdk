package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The counts can be null early in the process.
 **/
@ApiModel(description="The counts can be null early in the process.")

public class CatalogsFeedProductCounts  {
  
  @ApiModelProperty(value = "The number of products in the feed file.")
 /**
   * The number of products in the feed file.
  **/
  private Integer original;

  @ApiModelProperty(value = "The number of products successfully ingested from the feed file.")
 /**
   * The number of products successfully ingested from the feed file.
  **/
  private Integer ingested;
 /**
   * The number of products in the feed file.
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

 /**
   * The number of products successfully ingested from the feed file.
   * @return ingested
  **/
  @JsonProperty("ingested")
  public Integer getIngested() {
    return ingested;
  }

  public void setIngested(Integer ingested) {
    this.ingested = ingested;
  }

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

