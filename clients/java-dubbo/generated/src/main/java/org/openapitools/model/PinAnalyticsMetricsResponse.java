package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.PinAnalyticsDailyMetrics;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PinAnalyticsMetricsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Array with the requested daily metric records
   */
  @JsonProperty("daily_metrics")
  private List<PinAnalyticsDailyMetrics> dailyMetrics = new ArrayList<>();

  /**
   * The lifetime metric name and value.
   */
  @JsonProperty("lifetime_metrics")
  private Map<String, Integer> lifetimeMetrics = new HashMap<>();

  /**
   * The metric name and value over the requested period for each requested metric
   */
  @JsonProperty("summary_metrics")
  private Map<String, BigDecimal> summaryMetrics = new HashMap<>();

  /**
   * Array with the requested daily metric records
   * @return dailyMetrics
   */
  public List<PinAnalyticsDailyMetrics> getDailyMetrics() {
    return dailyMetrics;
  }

  public void setDailyMetrics(List<PinAnalyticsDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  /**
   * The lifetime metric name and value.
   * @return lifetimeMetrics
   */
  public Map<String, Integer> getLifetimeMetrics() {
    return lifetimeMetrics;
  }

  public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
  }

  /**
   * The metric name and value over the requested period for each requested metric
   * @return summaryMetrics
   */
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
    return Objects.equals(this.dailyMetrics, pinAnalyticsMetricsResponse.dailyMetrics) &&
        Objects.equals(this.lifetimeMetrics, pinAnalyticsMetricsResponse.lifetimeMetrics) &&
        Objects.equals(this.summaryMetrics, pinAnalyticsMetricsResponse.summaryMetrics);
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
