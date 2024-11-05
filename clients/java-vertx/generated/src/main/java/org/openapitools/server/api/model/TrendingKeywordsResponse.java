package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.TrendingKeywordsResponseTrendsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendingKeywordsResponse   {
  
  private List<TrendingKeywordsResponseTrendsInner> trends = new ArrayList<>();

  public TrendingKeywordsResponse () {

  }

  public TrendingKeywordsResponse (List<TrendingKeywordsResponseTrendsInner> trends) {
    this.trends = trends;
  }

    
  @JsonProperty("trends")
  public List<TrendingKeywordsResponseTrendsInner> getTrends() {
    return trends;
  }
  public void setTrends(List<TrendingKeywordsResponseTrendsInner> trends) {
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
    return Objects.equals(trends, trendingKeywordsResponse.trends);
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
