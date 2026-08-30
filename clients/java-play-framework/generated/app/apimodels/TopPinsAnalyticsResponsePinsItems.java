package apimodels;

import apimodels.DataStatus;
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
 * Array with metrics, status, and pin id for the requested metric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TopPinsAnalyticsResponsePinsItems   {
  @JsonProperty("data_status")
  @Valid

  private Map<String, DataStatus> dataStatus = null;

  @JsonProperty("metrics")
  @Valid

  private Map<String, BigDecimal> metrics = null;

  @JsonProperty("pin_id")
  
  private String pinId;

  public TopPinsAnalyticsResponsePinsItems dataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  public TopPinsAnalyticsResponsePinsItems putDataStatusItem(String key, DataStatus dataStatusItem) {
    if (this.dataStatus == null) {
      this.dataStatus = new HashMap<>();
    }
    this.dataStatus.put(key, dataStatusItem);
    return this;
  }

   /**
   * Get dataStatus
   * @return dataStatus
  **/
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

  public TopPinsAnalyticsResponsePinsItems metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public TopPinsAnalyticsResponsePinsItems putMetricsItem(String key, BigDecimal metricsItem) {
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
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  public TopPinsAnalyticsResponsePinsItems pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * The pin id
   * @return pinId
  **/
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopPinsAnalyticsResponsePinsItems topPinsAnalyticsResponsePinsItems = (TopPinsAnalyticsResponsePinsItems) o;
    return Objects.equals(dataStatus, topPinsAnalyticsResponsePinsItems.dataStatus) &&
        Objects.equals(metrics, topPinsAnalyticsResponsePinsItems.metrics) &&
        Objects.equals(pinId, topPinsAnalyticsResponsePinsItems.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, metrics, pinId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponsePinsItems {\n");
    
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

