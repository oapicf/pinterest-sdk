package org.openapitools.model;

import org.openapitools.model.KeywordMetrics;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordMetricsResponse  {
  
  @ApiModelProperty(example = "animals", value = "Keyword name, e.g., \"keyword\":\"fashion outfits\"")
 /**
   * Keyword name, e.g., \"keyword\":\"fashion outfits\"
  **/
  private String keyword;

  @ApiModelProperty(value = "")
  private KeywordMetrics metrics;
 /**
   * Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;
   * @return keyword
  **/
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public KeywordMetricsResponse keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

 /**
   * Get metrics
   * @return metrics
  **/
  @JsonProperty("metrics")
  public KeywordMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(KeywordMetrics metrics) {
    this.metrics = metrics;
  }

  public KeywordMetricsResponse metrics(KeywordMetrics metrics) {
    this.metrics = metrics;
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
    KeywordMetricsResponse keywordMetricsResponse = (KeywordMetricsResponse) o;
    return Objects.equals(this.keyword, keywordMetricsResponse.keyword) &&
        Objects.equals(this.metrics, keywordMetricsResponse.metrics);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

