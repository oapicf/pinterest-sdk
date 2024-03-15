package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.KeywordMetrics;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordMetricsResponse   {
  @JsonProperty("keyword")
  private String keyword;

  @JsonProperty("metrics")
  private KeywordMetrics metrics;

  /**
   * Keyword name, e.g., \"keyword\":\"fashion outfits\"
   **/
  public KeywordMetricsResponse keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  
  @ApiModelProperty(example = "animals", value = "Keyword name, e.g., \"keyword\":\"fashion outfits\"")
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  /**
   **/
  public KeywordMetricsResponse metrics(KeywordMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

