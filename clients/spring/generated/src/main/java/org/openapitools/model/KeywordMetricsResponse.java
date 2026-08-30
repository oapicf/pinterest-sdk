package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.KeywordMetrics;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * KeywordMetricsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordMetricsResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String keyword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable KeywordMetrics metrics;

  public KeywordMetricsResponse keyword(@Nullable String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Keyword name, e.g., \"keyword\":\"fashion outfits\"
   * @return keyword
   */
  
  @Schema(name = "keyword", example = "animals", description = "Keyword name, e.g., \"keyword\":\"fashion outfits\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyword")
  public @Nullable String getKeyword() {
    return keyword;
  }

  @JsonProperty("keyword")
  public void setKeyword(@Nullable String keyword) {
    this.keyword = keyword;
  }

  public KeywordMetricsResponse metrics(@Nullable KeywordMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Get metrics
   * @return metrics
   */
  @Valid 
  @Schema(name = "metrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics")
  public @Nullable KeywordMetrics getMetrics() {
    return metrics;
  }

  @JsonProperty("metrics")
  public void setMetrics(@Nullable KeywordMetrics metrics) {
    this.metrics = metrics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordMetricsResponse keywordMetricsResponse = (KeywordMetricsResponse) o;
    return Objects.equals(this.keyword, keywordMetricsResponse.keyword) &&
        Objects.equals(this.metrics, keywordMetricsResponse.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordMetricsResponse {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

