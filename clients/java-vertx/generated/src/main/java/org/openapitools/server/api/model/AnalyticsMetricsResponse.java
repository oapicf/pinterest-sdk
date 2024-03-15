package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.api.model.AnalyticsDailyMetrics;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyticsMetricsResponse   {
  
  private Map<String, BigDecimal> summaryMetrics = new HashMap<>();
  private List<AnalyticsDailyMetrics> dailyMetrics;

  public AnalyticsMetricsResponse () {

  }

  public AnalyticsMetricsResponse (Map<String, BigDecimal> summaryMetrics, List<AnalyticsDailyMetrics> dailyMetrics) {
    this.summaryMetrics = summaryMetrics;
    this.dailyMetrics = dailyMetrics;
  }

    
  @JsonProperty("summary_metrics")
  public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }
  public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }

    
  @JsonProperty("daily_metrics")
  public List<AnalyticsDailyMetrics> getDailyMetrics() {
    return dailyMetrics;
  }
  public void setDailyMetrics(List<AnalyticsDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
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
    return Objects.equals(summaryMetrics, analyticsMetricsResponse.summaryMetrics) &&
        Objects.equals(dailyMetrics, analyticsMetricsResponse.dailyMetrics);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
