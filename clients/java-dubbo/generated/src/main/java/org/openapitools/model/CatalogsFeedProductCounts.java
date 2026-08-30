package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The counts can be null early in the process.
 */
public class CatalogsFeedProductCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The number of products successfully ingested from the feed file.
   */
  @JsonProperty("ingested")
  private Integer ingested;

  /**
   * The number of products in the feed file.
   */
  @JsonProperty("original")
  private Integer original;

  /**
   * The number of products successfully ingested from the feed file.
   * @return ingested
   */
  public Integer getIngested() {
    return ingested;
  }

  public void setIngested(Integer ingested) {
    this.ingested = ingested;
  }

  /**
   * The number of products in the feed file.
   * @return original
   */
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
    return Objects.equals(this.ingested, catalogsFeedProductCounts.ingested) &&
        Objects.equals(this.original, catalogsFeedProductCounts.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingested, original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProductCounts {\n");
    
    sb.append("    ingested: ").append(toIndentedString(ingested)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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
