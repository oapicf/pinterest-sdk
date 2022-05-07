package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AnalyticsMetricsResponseDailyMetrics;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalyticsMetricsResponse  {
  
  @ApiModelProperty(value = "Array with the requested daily metric records")
 /**
   * Array with the requested daily metric records
  **/
  private List<AnalyticsMetricsResponseDailyMetrics> dailyMetrics = null;

  @ApiModelProperty(example = "{\"ENGAGEMENT\":100,\"CLICKTHROUGH_RATE\":0.2,\"CLICKTHROUGH\":200,\"CLOSEUP\":37,\"CLOSEUP_RATE\":0.5,\"ENGAGEMENT_RATE\":0.2,\"SAVE\":20,\"SAVE_RATE\":0.18,\"IMPRESSION\":240}", value = "The metric name and value over the requested period for each requested metric")
 /**
   * The metric name and value over the requested period for each requested metric
  **/
  private Map<String, BigDecimal> summaryMetrics = null;
 /**
   * Array with the requested daily metric records
   * @return dailyMetrics
  **/
  @JsonProperty("daily_metrics")
  public List<AnalyticsMetricsResponseDailyMetrics> getDailyMetrics() {
    return dailyMetrics;
  }

  public void setDailyMetrics(List<AnalyticsMetricsResponseDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public AnalyticsMetricsResponse dailyMetrics(List<AnalyticsMetricsResponseDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  public AnalyticsMetricsResponse addDailyMetricsItem(AnalyticsMetricsResponseDailyMetrics dailyMetricsItem) {
    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

 /**
   * The metric name and value over the requested period for each requested metric
   * @return summaryMetrics
  **/
  @JsonProperty("summary_metrics")
  public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }

  public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }

  public AnalyticsMetricsResponse summaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    return this;
  }

  public AnalyticsMetricsResponse putSummaryMetricsItem(String key, BigDecimal summaryMetricsItem) {
    this.summaryMetrics.put(key, summaryMetricsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsMetricsResponse {\n");
    
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
    sb.append("    summaryMetrics: ").append(toIndentedString(summaryMetrics)).append("\n");
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

