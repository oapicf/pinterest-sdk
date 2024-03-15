package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The counts can be null early in the process.
 **/
@ApiModel(description = "The counts can be null early in the process.")
@JsonTypeName("CatalogsFeedProductCounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsFeedProductCounts   {
  private @Valid Integer original;
  private @Valid Integer ingested;

  /**
   * The number of products in the feed file.
   **/
  public CatalogsFeedProductCounts original(Integer original) {
    this.original = original;
    return this;
  }

  
  @ApiModelProperty(value = "The number of products in the feed file.")
  @JsonProperty("original")
  public Integer getOriginal() {
    return original;
  }

  @JsonProperty("original")
  public void setOriginal(Integer original) {
    this.original = original;
  }

  /**
   * The number of products successfully ingested from the feed file.
   **/
  public CatalogsFeedProductCounts ingested(Integer ingested) {
    this.ingested = ingested;
    return this;
  }

  
  @ApiModelProperty(value = "The number of products successfully ingested from the feed file.")
  @JsonProperty("ingested")
  public Integer getIngested() {
    return ingested;
  }

  @JsonProperty("ingested")
  public void setIngested(Integer ingested) {
    this.ingested = ingested;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

