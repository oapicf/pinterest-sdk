package apimodels;

import apimodels.InterestsEnum;
import apimodels.ProductCategoryRegion;
import apimodels.TrendingTopic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Featured trending topics for a specific interest and market
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeaturedTrend   {
  @JsonProperty("interest")
  @NotNull
@Valid

  private InterestsEnum interest;

  @JsonProperty("market")
  @Valid

  private ProductCategoryRegion market;

  @JsonProperty("trends")
  @Valid

  private List<@Valid TrendingTopic> trends = null;

  public FeaturedTrend interest(InterestsEnum interest) {
    this.interest = interest;
    return this;
  }

   /**
   * The main interest category
   * @return interest
  **/
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
  **/
  public ProductCategoryRegion getMarket() {
    return market;
  }

  public void setMarket(ProductCategoryRegion market) {
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
  **/
  public List<@Valid TrendingTopic> getTrends() {
    return trends;
  }

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
    return Objects.equals(interest, featuredTrend.interest) &&
        Objects.equals(market, featuredTrend.market) &&
        Objects.equals(trends, featuredTrend.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interest, market, trends);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

