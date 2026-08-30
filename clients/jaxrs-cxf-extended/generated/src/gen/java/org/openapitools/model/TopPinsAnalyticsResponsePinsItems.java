package org.openapitools.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Array with metrics, status, and pin id for the requested metric
 */
@ApiModel(description="Array with metrics, status, and pin id for the requested metric")

public class TopPinsAnalyticsResponsePinsItems  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Map<String, DataStatus> dataStatus = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, BigDecimal> metrics = new HashMap<>();

 /**
  * The pin id
  */
  @ApiModelProperty(value = "The pin id")
  private String pinId;
 /**
  * Get dataStatus
  * @return dataStatus
  */
  @JsonProperty("data_status")
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }

  /**
   * Sets the <code>dataStatus</code> property.
   */
 public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

  /**
   * Sets the <code>dataStatus</code> property.
   */
  public TopPinsAnalyticsResponsePinsItems dataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  /**
   * Puts a new item into the <code>dataStatus</code> map.
   */
  public TopPinsAnalyticsResponsePinsItems putDataStatusItem(String key, DataStatus dataStatusItem) {
    this.dataStatus.put(key, dataStatusItem);
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
  public TopPinsAnalyticsResponsePinsItems metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Puts a new item into the <code>metrics</code> map.
   */
  public TopPinsAnalyticsResponsePinsItems putMetricsItem(String key, BigDecimal metricsItem) {
    this.metrics.put(key, metricsItem);
    return this;
  }

 /**
  * The pin id
  * @return pinId
  */
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   */
 public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   */
  public TopPinsAnalyticsResponsePinsItems pinId(String pinId) {
    this.pinId = pinId;
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
    TopPinsAnalyticsResponsePinsItems topPinsAnalyticsResponsePinsItems = (TopPinsAnalyticsResponsePinsItems) o;
    return Objects.equals(this.dataStatus, topPinsAnalyticsResponsePinsItems.dataStatus) &&
        Objects.equals(this.metrics, topPinsAnalyticsResponsePinsItems.metrics) &&
        Objects.equals(this.pinId, topPinsAnalyticsResponsePinsItems.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, metrics, pinId);
  }

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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

