package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.PinAnalyticsMetricsResponseDailyMetricsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinAnalyticsMetricsResponse  {
  
 /**
  * The lifetime metric name and value.
  */
  @ApiModelProperty(example = "{\"TOTAL_COMMENTS\":10,\"TOTAL_REACTIONS\":12}", value = "The lifetime metric name and value.")
  private Map<String, Integer> lifetimeMetrics = new HashMap<>();

 /**
  * Array with the requested daily metric records
  */
  @ApiModelProperty(value = "Array with the requested daily metric records")
  @Valid
  private List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics = new ArrayList<>();

 /**
  * The metric name and value over the requested period for each requested metric
  */
  @ApiModelProperty(example = "{\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"PIN_CLICK\":37,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", value = "The metric name and value over the requested period for each requested metric")
  @Valid
  private Map<String, BigDecimal> summaryMetrics = new HashMap<>();
 /**
  * The lifetime metric name and value.
  * @return lifetimeMetrics
  */
  @JsonProperty("lifetime_metrics")
  public Map<String, Integer> getLifetimeMetrics() {
    return lifetimeMetrics;
  }

  /**
   * Sets the <code>lifetimeMetrics</code> property.
   */
 public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
  }

  /**
   * Sets the <code>lifetimeMetrics</code> property.
   */
  public PinAnalyticsMetricsResponse lifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
    return this;
  }

  /**
   * Puts a new item into the <code>lifetimeMetrics</code> map.
   */
  public PinAnalyticsMetricsResponse putLifetimeMetricsItem(String key, Integer lifetimeMetricsItem) {
    this.lifetimeMetrics.put(key, lifetimeMetricsItem);
    return this;
  }

 /**
  * Array with the requested daily metric records
  * @return dailyMetrics
  */
  @JsonProperty("daily_metrics")
  public List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> getDailyMetrics() {
    return dailyMetrics;
  }

  /**
   * Sets the <code>dailyMetrics</code> property.
   */
 public void setDailyMetrics(List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  /**
   * Sets the <code>dailyMetrics</code> property.
   */
  public PinAnalyticsMetricsResponse dailyMetrics(List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  /**
   * Adds a new item to the <code>dailyMetrics</code> list.
   */
  public PinAnalyticsMetricsResponse addDailyMetricsItem(PinAnalyticsMetricsResponseDailyMetricsInner dailyMetricsItem) {
    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

 /**
  * The metric name and value over the requested period for each requested metric
  * @return summaryMetrics
  */
  @JsonProperty("summary_metrics")
  public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }

  /**
   * Sets the <code>summaryMetrics</code> property.
   */
 public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }

  /**
   * Sets the <code>summaryMetrics</code> property.
   */
  public PinAnalyticsMetricsResponse summaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    return this;
  }

  /**
   * Puts a new item into the <code>summaryMetrics</code> map.
   */
  public PinAnalyticsMetricsResponse putSummaryMetricsItem(String key, BigDecimal summaryMetricsItem) {
    this.summaryMetrics.put(key, summaryMetricsItem);
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
    PinAnalyticsMetricsResponse pinAnalyticsMetricsResponse = (PinAnalyticsMetricsResponse) o;
    return Objects.equals(this.lifetimeMetrics, pinAnalyticsMetricsResponse.lifetimeMetrics) &&
        Objects.equals(this.dailyMetrics, pinAnalyticsMetricsResponse.dailyMetrics) &&
        Objects.equals(this.summaryMetrics, pinAnalyticsMetricsResponse.summaryMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetimeMetrics, dailyMetrics, summaryMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinAnalyticsMetricsResponse {\n");
    
    sb.append("    lifetimeMetrics: ").append(toIndentedString(lifetimeMetrics)).append("\n");
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

