package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingTopic;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Featured trending topics for a specific interest and market
 **/
@ApiModel(description = "Featured trending topics for a specific interest and market")
@JsonTypeName("FeaturedTrend")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FeaturedTrend   {
  private InterestsEnum interest;
  private ProductCategoryRegion market;
  private @Valid List<@Valid TrendingTopic> trends = new ArrayList<>();

  public FeaturedTrend() {
  }

  @JsonCreator
  public FeaturedTrend(
    @JsonProperty(required = true, value = "interest") InterestsEnum interest
  ) {
    this.interest = interest;
  }

  /**
   * The main interest category
   **/
  public FeaturedTrend interest(InterestsEnum interest) {
    this.interest = interest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The main interest category")
  @JsonProperty(required = true, value = "interest")
  @NotNull public InterestsEnum getInterest() {
    return interest;
  }

  @JsonProperty(required = true, value = "interest")
  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  /**
   * Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
   **/
  public FeaturedTrend market(ProductCategoryRegion market) {
    this.market = market;
    return this;
  }

  
  @ApiModelProperty(value = "Market code (e.g., 'US', 'UK', etc.)")
  @JsonProperty("market")
  public ProductCategoryRegion getMarket() {
    return market;
  }

  @JsonProperty("market")
  public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

  /**
   * List of trending topics within this interest category
   **/
  public FeaturedTrend trends(List<@Valid TrendingTopic> trends) {
    this.trends = trends;
    return this;
  }

  
  @ApiModelProperty(value = "List of trending topics within this interest category")
  @JsonProperty("trends")
  @Valid public List<@Valid TrendingTopic> getTrends() {
    return trends;
  }

  @JsonProperty("trends")
  public void setTrends(List<@Valid TrendingTopic> trends) {
    this.trends = trends;
  }

  public FeaturedTrend addTrendsItem(TrendingTopic trendsItem) {
    if (this.trends == null) {
      this.trends = new ArrayList<>();
    }

    this.trends.add(trendsItem);
    return this;
  }

  public FeaturedTrend removeTrendsItem(TrendingTopic trendsItem) {
    if (trendsItem != null && this.trends != null) {
      this.trends.remove(trendsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

