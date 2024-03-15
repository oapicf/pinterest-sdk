package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.KeywordMetrics;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class KeywordMetricsResponse   {
  
  private String keyword;

  private KeywordMetrics metrics;

  /**
   * Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

