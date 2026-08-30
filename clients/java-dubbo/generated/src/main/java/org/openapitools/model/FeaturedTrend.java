package org.openapitools.model;

import org.openapitools.model.InterestsEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingTopic;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Featured trending topics for a specific interest and market
 */
public class FeaturedTrend implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The main interest category
   */
  @JsonProperty("interest")
  private InterestsEnum interest;

  /**
   * Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
   */
  @JsonProperty("market")
  private ProductCategoryRegion market;

  /**
   * List of trending topics within this interest category
   */
  @JsonProperty("trends")
  private List<TrendingTopic> trends = new ArrayList<>();

  /**
   * The main interest category
   * @return interest
   */
  public InterestsEnum getInterest() {
    return interest;
  }

  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  /**
   * Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
   * @return market
   */
  public ProductCategoryRegion getMarket() {
    return market;
  }

  public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

  /**
   * List of trending topics within this interest category
   * @return trends
   */
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
