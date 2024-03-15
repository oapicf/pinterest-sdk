package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.KeywordMetrics;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordMetricsResponse   {
  
  private String keyword;
  private KeywordMetrics metrics;

  public KeywordMetricsResponse () {

  }

  public KeywordMetricsResponse (String keyword, KeywordMetrics metrics) {
    this.keyword = keyword;
    this.metrics = metrics;
  }

    
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

    
  @JsonProperty("metrics")
  public KeywordMetrics getMetrics() {
    return metrics;
  }
  public void setMetrics(KeywordMetrics metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordMetricsResponse keywordMetricsResponse = (KeywordMetricsResponse) o;
    return Objects.equals(keyword, keywordMetricsResponse.keyword) &&
        Objects.equals(metrics, keywordMetricsResponse.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordMetricsResponse {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
