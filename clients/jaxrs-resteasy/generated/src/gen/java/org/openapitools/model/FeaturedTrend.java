package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Featured trending topics for a specific interest and market")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FeaturedTrend   {
  
  private InterestsEnum interest;
  private ProductCategoryRegion market;
  private List<@Valid TrendingTopic> trends = new ArrayList<>();

  /**
   * The main interest category
   **/
  
  @ApiModelProperty(required = true, value = "The main interest category")
  @JsonProperty("interest")
  @NotNull
  @Valid
  public InterestsEnum getInterest() {
    return interest;
  }
  public void setInterest(InterestsEnum interest) {
    this.interest = interest;
  }

  /**
   * Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
   **/
  
  @ApiModelProperty(value = "Market code (e.g., 'US', 'UK', etc.)")
  @JsonProperty("market")
  @Valid
  public ProductCategoryRegion getMarket() {
    return market;
  }
  public void setMarket(ProductCategoryRegion market) {
    this.market = market;
  }

  /**
   * List of trending topics within this interest category
   **/
  
  @ApiModelProperty(value = "List of trending topics within this interest category")
  @JsonProperty("trends")
  @Valid
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

