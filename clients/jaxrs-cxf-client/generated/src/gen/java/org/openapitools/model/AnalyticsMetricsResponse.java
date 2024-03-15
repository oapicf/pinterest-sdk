package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AnalyticsDailyMetrics;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AnalyticsMetricsResponse  {
  
  @ApiModelProperty(example = "{\"CLOSEUP\":1,\"CLOSEUP_RATE\":0,\"ENGAGEMENT\":1,\"ENGAGEMENT_RATE\":0,\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"OUTBOUND_CLICK_RATE\":0.08,\"PIN_CLICK\":37,\"PIN_CLICK_RATE\":0.15,\"PROFILE_VISIT\":0,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", value = "The metric name and value over the requested period for each requested metric")
 /**
   * The metric name and value over the requested period for each requested metric
  **/
  private Map<String, BigDecimal> summaryMetrics = new HashMap<>();

  @ApiModelProperty(value = "Array with the requested daily metric records")
 /**
   * Array with the requested daily metric records
  **/
  private List<AnalyticsDailyMetrics> dailyMetrics;
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

 /**
   * Array with the requested daily metric records
   * @return dailyMetrics
  **/
  @JsonProperty("daily_metrics")
  public List<AnalyticsDailyMetrics> getDailyMetrics() {
    return dailyMetrics;
  }

  public void setDailyMetrics(List<AnalyticsDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public AnalyticsMetricsResponse dailyMetrics(List<AnalyticsDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  public AnalyticsMetricsResponse addDailyMetricsItem(AnalyticsDailyMetrics dailyMetricsItem) {
    this.dailyMetrics.add(dailyMetricsItem);
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
    AnalyticsMetricsResponse analyticsMetricsResponse = (AnalyticsMetricsResponse) o;
    return Objects.equals(this.summaryMetrics, analyticsMetricsResponse.summaryMetrics) &&
        Objects.equals(this.dailyMetrics, analyticsMetricsResponse.dailyMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryMetrics, dailyMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsMetricsResponse {\n");
    
    sb.append("    summaryMetrics: ").append(toIndentedString(summaryMetrics)).append("\n");
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
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

