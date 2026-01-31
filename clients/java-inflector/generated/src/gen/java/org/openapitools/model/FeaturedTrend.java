package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingTopic;



/**
 * Featured trending topics for a specific interest and market
 **/

@ApiModel(description = "Featured trending topics for a specific interest and market")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FeaturedTrend   {
  @JsonProperty("interest")
  private InterestsEnum interest;

  @JsonProperty("market")
  private ProductCategoryRegion market;

  @JsonProperty("trends")
  private List<TrendingTopic> trends = null;

  /**
   * The main interest category
   **/
  public FeaturedTrend interest(InterestsEnum interest) {
    this.interest = interest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The main interest category")
  @JsonProperty("interest")
  public InterestsEnum getInterest() {
    return interest;
  }
  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  /**
   * Market code (e.g., 'US', 'UK', etc.)
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
  public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

  /**
   * List of trending topics within this interest category
   **/
  public FeaturedTrend trends(List<TrendingTopic> trends) {
    this.trends = trends;
    return this;
  }

  
  @ApiModelProperty(value = "List of trending topics within this interest category")
  @JsonProperty("trends")
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
    return Objects.equals(interest, featuredTrend.interest) &&
        Objects.equals(market, featuredTrend.market) &&
        Objects.equals(trends, featuredTrend.trends);
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

