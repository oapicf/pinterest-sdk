package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingTopic;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private InterestsEnum interest;

 /**
  * Market code (e.g., 'US', 'UK', etc.)
  */
  @ApiModelProperty(value = "Market code (e.g., 'US', 'UK', etc.)")
  @Valid
  private ProductCategoryRegion market;

 /**
  * List of trending topics within this interest category
  */
  @ApiModelProperty(value = "List of trending topics within this interest category")
  @Valid
  private List<@Valid TrendingTopic> trends = new ArrayList<>();
 /**
  * The main interest category
  * @return interest
  */
  @JsonProperty("interest")
  @NotNull
  public InterestsEnum getInterest() {
    return interest;
  }

  /**
   * Sets the <code>interest</code> property.
   */
 public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  /**
   * Sets the <code>interest</code> property.
   */
  public FeaturedTrend interest(InterestsEnum interest) {
    this.interest = interest;
    return this;
  }

 /**
  * Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
  * @return market
  */
  @JsonProperty("market")
  public ProductCategoryRegion getMarket() {
    return market;
  }

  /**
   * Sets the <code>market</code> property.
   */
 public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

  /**
   * Sets the <code>market</code> property.
   */
  public FeaturedTrend market(ProductCategoryRegion market) {
    this.market = market;
    return this;
  }

 /**
  * List of trending topics within this interest category
  * @return trends
  */
  @JsonProperty("trends")
  public List<@Valid TrendingTopic> getTrends() {
    return trends;
  }

  /**
   * Sets the <code>trends</code> property.
   */
 public void setTrends(List<@Valid TrendingTopic> trends) {
    this.trends = trends;
  }

  /**
   * Sets the <code>trends</code> property.
   */
  public FeaturedTrend trends(List<@Valid TrendingTopic> trends) {
    this.trends = trends;
    return this;
  }

  /**
   * Adds a new item to the <code>trends</code> list.
   */
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

