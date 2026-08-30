package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingTopic;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Featured trending topics for a specific interest and market
 */

@Schema(name = "FeaturedTrend", description = "Featured trending topics for a specific interest and market")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FeaturedTrend {

  private InterestsEnum interest;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProductCategoryRegion market;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid TrendingTopic> trends = new ArrayList<>();

  public FeaturedTrend() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeaturedTrend(InterestsEnum interest) {
    this.interest = interest;
  }

  public FeaturedTrend interest(InterestsEnum interest) {
    this.interest = interest;
    return this;
  }

  /**
   * The main interest category
   * @return interest
   */
  @NotNull @Valid 
  @Schema(name = "interest", description = "The main interest category", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("interest")
  public InterestsEnum getInterest() {
    return interest;
  }

  @JsonProperty("interest")
  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  public FeaturedTrend market(@Nullable ProductCategoryRegion market) {
    this.market = market;
    return this;
  }

  /**
   * Market code (e.g., 'US', 'UK', etc.)
   * @return market
   */
  @Valid 
  @Schema(name = "market", description = "Market code (e.g., 'US', 'UK', etc.)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("market")
  public @Nullable ProductCategoryRegion getMarket() {
    return market;
  }

  @JsonProperty("market")
  public void setMarket(@Nullable ProductCategoryRegion market) {
    this.market = market;
  }

  public FeaturedTrend trends(List<@Valid TrendingTopic> trends) {
    this.trends = trends;
    return this;
  }

  public FeaturedTrend addTrendsItem(TrendingTopic trendsItem) {
    if (this.trends == null) {
      this.trends = new ArrayList<>();
    }
    this.trends.add(trendsItem);
    return this;
  }

  /**
   * List of trending topics within this interest category
   * @return trends
   */
  @Valid 
  @Schema(name = "trends", description = "List of trending topics within this interest category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trends")
  public List<@Valid TrendingTopic> getTrends() {
    return trends;
  }

  @JsonProperty("trends")
  public void setTrends(List<@Valid TrendingTopic> trends) {
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
    FeaturedTrend featuredTrend = (FeaturedTrend) o;
    return Objects.equals(this.interest, featuredTrend.interest) &&
        Objects.equals(this.market, featuredTrend.market) &&
        Objects.equals(this.trends, featuredTrend.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interest, market, trends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedTrend {\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
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

