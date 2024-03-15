package apimodels;

import apimodels.DataStatus;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PinAnalyticsMetricsResponseDailyMetricsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinAnalyticsMetricsResponseDailyMetricsInner   {
  @JsonProperty("data_status")
  @Valid

  private DataStatus dataStatus;

  @JsonProperty("date")
  
  private String date;

  @JsonProperty("metrics")
  @Valid

  private Map<String, BigDecimal> metrics = null;

  public PinAnalyticsMetricsResponseDailyMetricsInner dataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

   /**
   * Get dataStatus
   * @return dataStatus
  **/
  public DataStatus getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
  }

  public PinAnalyticsMetricsResponseDailyMetricsInner date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Metrics date (UTC): YYYY-MM-DD.
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PinAnalyticsMetricsResponseDailyMetricsInner metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public PinAnalyticsMetricsResponseDailyMetricsInner putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

   /**
   * The metric name and daily value for each requested metric
   * @return metrics
  **/
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
    PinAnalyticsMetricsResponseDailyMetricsInner pinAnalyticsMetricsResponseDailyMetricsInner = (PinAnalyticsMetricsResponseDailyMetricsInner) o;
    return Objects.equals(dataStatus, pinAnalyticsMetricsResponseDailyMetricsInner.dataStatus) &&
        Objects.equals(date, pinAnalyticsMetricsResponseDailyMetricsInner.date) &&
        Objects.equals(metrics, pinAnalyticsMetricsResponseDailyMetricsInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, date, metrics);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

