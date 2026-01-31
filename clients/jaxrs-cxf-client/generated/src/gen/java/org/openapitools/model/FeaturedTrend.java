package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingTopic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Featured trending topics for a specific interest and market
 */
@ApiModel(description="Featured trending topics for a specific interest and market")

public class FeaturedTrend  {
  
 /**
  * The main interest category
  */
  @ApiModelProperty(required = true, value = "The main interest category")

  private InterestsEnum interest;

 /**
  * Market code (e.g., 'US', 'UK', etc.)
  */
  @ApiModelProperty(value = "Market code (e.g., 'US', 'UK', etc.)")

  private ProductCategoryRegion market;

 /**
  * List of trending topics within this interest category
  */
  @ApiModelProperty(value = "List of trending topics within this interest category")

  private List<TrendingTopic> trends = new ArrayList<>();
 /**
   * The main interest category
   * @return interest
  **/
  @JsonProperty("interest")
  public InterestsEnum getInterest() {
    return interest;
  }

  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  public FeaturedTrend interest(InterestsEnum interest) {
    this.interest = interest;
    return this;
  }

 /**
   * Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
   * @return market
  **/
  @JsonProperty("market")
  public ProductCategoryRegion getMarket() {
    return market;
  }

  public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

  public FeaturedTrend market(ProductCategoryRegion market) {
    this.market = market;
    return this;
  }

 /**
   * List of trending topics within this interest category
   * @return trends
  **/
  @JsonProperty("trends")
  public List<TrendingTopic> getTrends() {
    return trends;
  }

  public void setTrends(List<TrendingTopic> trends) {
    this.trends = trends;
  }

  public FeaturedTrend trends(List<TrendingTopic> trends) {
    this.trends = trends;
    return this;
  }

  public FeaturedTrend addTrendsItem(TrendingTopic trendsItem) {
    this.trends.add(trendsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

