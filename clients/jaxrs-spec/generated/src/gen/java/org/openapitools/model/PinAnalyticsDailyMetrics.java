package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PinAnalyticsDailyMetrics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinAnalyticsDailyMetrics   {
  private DataStatus dataStatus;
  private String date;
  private @Valid Map<String, BigDecimal> metrics = new HashMap<>();

  public PinAnalyticsDailyMetrics() {
  }

  /**
   **/
  public PinAnalyticsDailyMetrics dataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data_status")
  public DataStatus getDataStatus() {
    return dataStatus;
  }

  @JsonProperty("data_status")
  public void setDataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
  }

  /**
   * Metrics date (UTC): YYYY-MM-DD.
   **/
  public PinAnalyticsDailyMetrics date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "Metrics date (UTC): YYYY-MM-DD.")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(String date) {
    this.date = date;
  }

  /**
   **/
  public PinAnalyticsDailyMetrics metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("metrics")
  @Valid public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  @JsonProperty("metrics")
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  public PinAnalyticsDailyMetrics putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }

    this.metrics.put(key, metricsItem);
    return this;
  }

  public PinAnalyticsDailyMetrics removeMetricsItem(String key) {
    if (this.metrics != null) {
      this.metrics.remove(key);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
