package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The counts can be null early in the process.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedProductCounts   {
  
  private Integer original;
  private Integer ingested;

  public CatalogsFeedProductCounts () {

  }

  public CatalogsFeedProductCounts (Integer original, Integer ingested) {
    this.original = original;
    this.ingested = ingested;
  }

    
  @JsonProperty("original")
  public Integer getOriginal() {
    return original;
  }
  public void setOriginal(Integer original) {
    this.original = original;
  }

    
  @JsonProperty("ingested")
  public Integer getIngested() {
    return ingested;
  }
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
    return Objects.equals(original, catalogsFeedProductCounts.original) &&
        Objects.equals(ingested, catalogsFeedProductCounts.ingested);
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
