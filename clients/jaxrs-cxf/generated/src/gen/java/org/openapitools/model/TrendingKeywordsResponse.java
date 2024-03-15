package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TrendingKeywordsResponseTrendsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TrendingKeywordsResponse  {
  
  @ApiModelProperty(value = "The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.")
  @Valid
 /**
   * The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
  **/
  private List<@Valid TrendingKeywordsResponseTrendsInner> trends;
 /**
   * The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend.
   * @return trends
  **/
  @JsonProperty("trends")
  public List<@Valid TrendingKeywordsResponseTrendsInner> getTrends() {
    return trends;
  }

  public void setTrends(List<@Valid TrendingKeywordsResponseTrendsInner> trends) {
    this.trends = trends;
  }

  public TrendingKeywordsResponse trends(List<@Valid TrendingKeywordsResponseTrendsInner> trends) {
    this.trends = trends;
    return this;
  }

  public TrendingKeywordsResponse addTrendsItem(TrendingKeywordsResponseTrendsInner trendsItem) {
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
    TrendingKeywordsResponse trendingKeywordsResponse = (TrendingKeywordsResponse) o;
    return Objects.equals(this.trends, trendingKeywordsResponse.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordsResponse {\n");
    
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

