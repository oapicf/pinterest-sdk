package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.InterestsEnum;
import org.openapitools.vertxweb.server.model.ProductCategoryRegion;
import org.openapitools.vertxweb.server.model.TrendingTopic;

/**
 * Featured trending topics for a specific interest and market
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeaturedTrend   {
  
  private InterestsEnum interest;
  private ProductCategoryRegion market;
  private List<TrendingTopic> trends = new ArrayList<>();

  public FeaturedTrend () {

  }

  public FeaturedTrend (InterestsEnum interest, ProductCategoryRegion market, List<TrendingTopic> trends) {
    this.interest = interest;
    this.market = market;
    this.trends = trends;
  }

    
  @JsonProperty("interest")
  public InterestsEnum getInterest() {
    return interest;
  }
  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

    
  @JsonProperty("market")
  public ProductCategoryRegion getMarket() {
    return market;
  }
  public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

    
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
