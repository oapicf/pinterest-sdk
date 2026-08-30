package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.InterestsEnum;
import com.prokarma.pkmst.model.ProductCategoryRegion;
import com.prokarma.pkmst.model.TrendingTopic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Featured trending topics for a specific interest and market
 */
@ApiModel(description = "Featured trending topics for a specific interest and market")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FeaturedTrend   {
  @JsonProperty("interest")
  private InterestsEnum interest;

  @JsonProperty("market")
  private ProductCategoryRegion market;

  @JsonProperty("trends")
  
  private List<TrendingTopic> trends = null;

  public FeaturedTrend interest(InterestsEnum interest) {
    this.interest = interest;
    return this;
  }

  /**
   * The main interest category
   * @return interest
   */
  @ApiModelProperty(required = true, value = "The main interest category")
  public InterestsEnum getInterest() {
    return interest;
  }

  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  public FeaturedTrend market(ProductCategoryRegion market) {
    this.market = market;
    return this;
  }

  /**
   * Market code (e.g., 'US', 'UK', etc.)
   * @return market
   */
  @ApiModelProperty(value = "Market code (e.g., 'US', 'UK', etc.)")
  public ProductCategoryRegion getMarket() {
    return market;
  }

  public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

  public FeaturedTrend trends(List<TrendingTopic> trends) {
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
  @ApiModelProperty(value = "List of trending topics within this interest category")
  public List<TrendingTopic> getTrends() {
    return trends;
  }

  public void setTrends(List<TrendingTopic> trends) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

