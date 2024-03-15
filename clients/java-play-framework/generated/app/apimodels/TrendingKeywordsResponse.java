package apimodels;

import apimodels.TrendingKeywordsResponseTrendsInner;
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
 * TrendingKeywordsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingKeywordsResponse   {
  @JsonProperty("trends")
  @Valid

  private List<@Valid TrendingKeywordsResponseTrendsInner> trends = null;

  public TrendingKeywordsResponse trends(List<@Valid TrendingKeywordsResponseTrendsInner> trends) {
    this.trends = trends;
    return this;
  }

  public TrendingKeywordsResponse addTrendsItem(TrendingKeywordsResponseTrendsInner trendsItem) {
    if (this.trends == null) {
      this.trends = new ArrayList<>();
    }
    this.trends.add(trendsItem);
    return this;
  }

   /**
   * The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
   * @return trends
  **/
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
    return Objects.equals(trends, trendingKeywordsResponse.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trends);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

