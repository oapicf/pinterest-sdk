package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The counts can be null early in the process.
 */

@Schema(name = "CatalogsFeedProductCounts", description = "The counts can be null early in the process.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedProductCounts {

  private Integer ingested;

  private Integer original;

  public CatalogsFeedProductCounts ingested(Integer ingested) {
    this.ingested = ingested;
    return this;
  }

  /**
   * The number of products successfully ingested from the feed file.
   * @return ingested
   */
  
  @Schema(name = "ingested", description = "The number of products successfully ingested from the feed file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ingested")
  public Integer getIngested() {
    return ingested;
  }

  public void setIngested(Integer ingested) {
    this.ingested = ingested;
  }

  public CatalogsFeedProductCounts original(Integer original) {
    this.original = original;
    return this;
  }

  /**
   * The number of products in the feed file.
   * @return original
   */
  
  @Schema(name = "original", description = "The number of products in the feed file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("original")
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

