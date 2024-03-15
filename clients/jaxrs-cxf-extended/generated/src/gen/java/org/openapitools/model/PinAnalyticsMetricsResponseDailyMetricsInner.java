package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinAnalyticsMetricsResponseDailyMetricsInner  {
  
  @ApiModelProperty(value = "")
  @Valid
  private DataStatus dataStatus;

 /**
  * Metrics date (UTC): YYYY-MM-DD.
  */
  @ApiModelProperty(example = "2019-12-01", value = "Metrics date (UTC): YYYY-MM-DD.")
  private String date;

 /**
  * The metric name and daily value for each requested metric
  */
  @ApiModelProperty(example = "{\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"PIN_CLICK\":37,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", value = "The metric name and daily value for each requested metric")
  @Valid
  private Map<String, BigDecimal> metrics = new HashMap<>();
 /**
  * Get dataStatus
  * @return dataStatus
  */
  @JsonProperty("data_status")
  public DataStatus getDataStatus() {
    return dataStatus;
  }

  /**
   * Sets the <code>dataStatus</code> property.
   */
 public void setDataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
  }

  /**
   * Sets the <code>dataStatus</code> property.
   */
  public PinAnalyticsMetricsResponseDailyMetricsInner dataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

 /**
  * Metrics date (UTC): YYYY-MM-DD.
  * @return date
  */
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(String date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public PinAnalyticsMetricsResponseDailyMetricsInner date(String date) {
    this.date = date;
    return this;
  }

 /**
  * The metric name and daily value for each requested metric
  * @return metrics
  */
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  /**
   * Sets the <code>metrics</code> property.
   */
 public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  /**
   * Sets the <code>metrics</code> property.
   */
  public PinAnalyticsMetricsResponseDailyMetricsInner metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Puts a new item into the <code>metrics</code> map.
   */
  public PinAnalyticsMetricsResponseDailyMetricsInner putMetricsItem(String key, BigDecimal metricsItem) {
    this.metrics.put(key, metricsItem);
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
    PinAnalyticsMetricsResponseDailyMetricsInner pinAnalyticsMetricsResponseDailyMetricsInner = (PinAnalyticsMetricsResponseDailyMetricsInner) o;
    return Objects.equals(this.dataStatus, pinAnalyticsMetricsResponseDailyMetricsInner.dataStatus) &&
        Objects.equals(this.date, pinAnalyticsMetricsResponseDailyMetricsInner.date) &&
        Objects.equals(this.metrics, pinAnalyticsMetricsResponseDailyMetricsInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, date, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinAnalyticsMetricsResponseDailyMetricsInner {\n");
    
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

