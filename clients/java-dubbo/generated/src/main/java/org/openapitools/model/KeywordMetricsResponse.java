package org.openapitools.model;

import org.openapitools.model.KeywordMetrics;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class KeywordMetricsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;
   */
  @JsonProperty("keyword")
  private String keyword;

  @JsonProperty("metrics")
  private KeywordMetrics metrics;

  /**
   * Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;
   * @return keyword
   */
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  /**
   * 
   * @return metrics
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
