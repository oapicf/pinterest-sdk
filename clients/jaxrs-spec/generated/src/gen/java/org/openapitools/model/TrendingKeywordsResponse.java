package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TrendingKeywordsResponseTrendsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TrendingKeywordsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TrendingKeywordsResponse   {
  private @Valid List<@Valid TrendingKeywordsResponseTrendsInner> trends = new ArrayList<>();

  /**
   * The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend.
   **/
  public TrendingKeywordsResponse trends(List<@Valid TrendingKeywordsResponseTrendsInner> trends) {
    this.trends = trends;
    return this;
  }

  
  @ApiModelProperty(value = "The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.")
  @JsonProperty("trends")
  @Valid public List<@Valid TrendingKeywordsResponseTrendsInner> getTrends() {
    return trends;
  }

  @JsonProperty("trends")
  public void setTrends(List<@Valid TrendingKeywordsResponseTrendsInner> trends) {
    this.trends = trends;
  }

  public TrendingKeywordsResponse addTrendsItem(TrendingKeywordsResponseTrendsInner trendsItem) {
    if (this.trends == null) {
      this.trends = new ArrayList<>();
    }

    this.trends.add(trendsItem);
    return this;
  }

  public TrendingKeywordsResponse removeTrendsItem(TrendingKeywordsResponseTrendsInner trendsItem) {
    if (trendsItem != null && this.trends != null) {
      this.trends.remove(trendsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

