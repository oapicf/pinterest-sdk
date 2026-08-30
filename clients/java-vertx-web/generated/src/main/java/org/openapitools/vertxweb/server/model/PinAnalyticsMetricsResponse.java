package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.PinAnalyticsDailyMetrics;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinAnalyticsMetricsResponse   {
  
  private List<PinAnalyticsDailyMetrics> dailyMetrics = new ArrayList<>();
  private Map<String, Integer> lifetimeMetrics = new HashMap<>();
  private Map<String, BigDecimal> summaryMetrics = new HashMap<>();

  public PinAnalyticsMetricsResponse () {

  }

  public PinAnalyticsMetricsResponse (List<PinAnalyticsDailyMetrics> dailyMetrics, Map<String, Integer> lifetimeMetrics, Map<String, BigDecimal> summaryMetrics) {
    this.dailyMetrics = dailyMetrics;
    this.lifetimeMetrics = lifetimeMetrics;
    this.summaryMetrics = summaryMetrics;
  }

    
  @JsonProperty("daily_metrics")
  public List<PinAnalyticsDailyMetrics> getDailyMetrics() {
    return dailyMetrics;
  }
  public void setDailyMetrics(List<PinAnalyticsDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

    
  @JsonProperty("lifetime_metrics")
  public Map<String, Integer> getLifetimeMetrics() {
    return lifetimeMetrics;
  }
  public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
  }

    
  @JsonProperty("summary_metrics")
  public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }
  public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinAnalyticsMetricsResponse pinAnalyticsMetricsResponse = (PinAnalyticsMetricsResponse) o;
    return Objects.equals(dailyMetrics, pinAnalyticsMetricsResponse.dailyMetrics) &&
        Objects.equals(lifetimeMetrics, pinAnalyticsMetricsResponse.lifetimeMetrics) &&
        Objects.equals(summaryMetrics, pinAnalyticsMetricsResponse.summaryMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyMetrics, lifetimeMetrics, summaryMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinAnalyticsMetricsResponse {\n");
    
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
    sb.append("    lifetimeMetrics: ").append(toIndentedString(lifetimeMetrics)).append("\n");
    sb.append("    summaryMetrics: ").append(toIndentedString(summaryMetrics)).append("\n");
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
