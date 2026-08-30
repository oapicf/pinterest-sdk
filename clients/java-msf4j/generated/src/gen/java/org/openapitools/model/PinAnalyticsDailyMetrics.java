package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;

/**
 * PinAnalyticsDailyMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinAnalyticsDailyMetrics   {
  @JsonProperty("data_status")
  private DataStatus dataStatus;

  @JsonProperty("date")
  private String date;

  @JsonProperty("metrics")
  private Map<String, BigDecimal> metrics = null;

  public PinAnalyticsDailyMetrics dataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

   /**
   * Get dataStatus
   * @return dataStatus
  **/
  @ApiModelProperty(value = "")
  public DataStatus getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
  }

  public PinAnalyticsDailyMetrics date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Metrics date (UTC): YYYY-MM-DD.
   * @return date
  **/
  @ApiModelProperty(value = "Metrics date (UTC): YYYY-MM-DD.")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PinAnalyticsDailyMetrics metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public PinAnalyticsDailyMetrics putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @ApiModelProperty(value = "")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, BigDecimal> metrics) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

