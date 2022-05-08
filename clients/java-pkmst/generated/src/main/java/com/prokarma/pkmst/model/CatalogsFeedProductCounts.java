package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The counts can be null early in the process.
 */
@ApiModel(description = "The counts can be null early in the process.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-08T00:31:47.777767Z[Etc/UTC]")
public class CatalogsFeedProductCounts   {
  @JsonProperty("original")
  private Integer original;

  public CatalogsFeedProductCounts original(Integer original) {
    this.original = original;
    return this;
  }

   /**
   * The number of products in the feed file
   * @return original
  **/
  @ApiModelProperty(value = "The number of products in the feed file")
  public Integer getOriginal() {
    return original;
  }

  public void setOriginal(Integer original) {
    this.original = original;
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
    return Objects.equals(this.original, catalogsFeedProductCounts.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

