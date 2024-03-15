package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TrendingKeywordsResponseTrendsInner;

/**
 * TrendingKeywordsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TrendingKeywordsResponse   {
  @JsonProperty("trends")
  private List<@Valid TrendingKeywordsResponseTrendsInner> trends = null;

  public TrendingKeywordsResponse trends(List<@Valid TrendingKeywordsResponseTrendsInner> trends) {
    this.trends = trends;
    return this;
  }

  public TrendingKeywordsResponse addTrendsItem(TrendingKeywordsResponseTrendsInner trendsItem) {
    if (this.trends == null) {
      this.trends = ;
    }
    this.trends.add(trendsItem);
    return this;
  }

   /**
   * The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
   * @return trends
  **/
  @ApiModelProperty(value = "The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.")
  public List<@Valid TrendingKeywordsResponseTrendsInner> getTrends() {
    return trends;
  }

  public void setTrends(List<@Valid TrendingKeywordsResponseTrendsInner> trends) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

