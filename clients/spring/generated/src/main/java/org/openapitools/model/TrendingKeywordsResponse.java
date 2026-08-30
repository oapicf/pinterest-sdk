package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TrendingKeyword;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TrendingKeywordsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingKeywordsResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid TrendingKeyword> trends = new ArrayList<>();

  public TrendingKeywordsResponse trends(List<@Valid TrendingKeyword> trends) {
    this.trends = trends;
    return this;
  }

  public TrendingKeywordsResponse addTrendsItem(TrendingKeyword trendsItem) {
    if (this.trends == null) {
      this.trends = new ArrayList<>();
    }
    this.trends.add(trendsItem);
    return this;
  }

  /**
   * The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.
   * @return trends
   */
  @Valid 
  @Schema(name = "trends", description = "The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trends")
  public List<@Valid TrendingKeyword> getTrends() {
    return trends;
  }

  @JsonProperty("trends")
  public void setTrends(List<@Valid TrendingKeyword> trends) {
    this.trends = trends;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingKeywordsResponse trendingKeywordsResponse = (TrendingKeywordsResponse) o;
    return Objects.equals(this.trends, trendingKeywordsResponse.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordsResponse {\n");
    sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
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

