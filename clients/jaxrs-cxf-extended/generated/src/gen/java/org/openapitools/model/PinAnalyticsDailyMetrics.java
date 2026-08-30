package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
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


public class PinAnalyticsDailyMetrics  {
  
  @ApiModelProperty(value = "")
  @Valid
  private DataStatus dataStatus;

 /**
  * Metrics date (UTC): YYYY-MM-DD.
  */
  @ApiModelProperty(value = "Metrics date (UTC): YYYY-MM-DD.")
  private String date;

  @ApiModelProperty(value = "")
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
  public PinAnalyticsDailyMetrics dataStatus(DataStatus dataStatus) {
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
  public PinAnalyticsDailyMetrics date(String date) {
    this.date = date;
    return this;
  }

 /**
  * Get metrics
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
  public PinAnalyticsDailyMetrics metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Puts a new item into the <code>metrics</code> map.
   */
  public PinAnalyticsDailyMetrics putMetricsItem(String key, BigDecimal metricsItem) {
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
    PinAnalyticsDailyMetrics pinAnalyticsDailyMetrics = (PinAnalyticsDailyMetrics) o;
    return Objects.equals(this.dataStatus, pinAnalyticsDailyMetrics.dataStatus) &&
        Objects.equals(this.date, pinAnalyticsDailyMetrics.date) &&
        Objects.equals(this.metrics, pinAnalyticsDailyMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, date, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinAnalyticsDailyMetrics {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

