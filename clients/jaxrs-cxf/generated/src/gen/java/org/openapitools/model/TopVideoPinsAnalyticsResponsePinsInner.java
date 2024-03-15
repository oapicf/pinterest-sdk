package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Array with metrics, status, and pin id for the requested metric
 **/
@ApiModel(description="Array with metrics, status, and pin id for the requested metric")

public class TopVideoPinsAnalyticsResponsePinsInner  {
  
  @ApiModelProperty(example = "{\"IMPRESSION\":7,\"QUARTILE_95_PERCENT_VIEW\":2,\"SAVE\":1,\"VIDEO_10S_VIEW\":5,\"VIDEO_AVG_WATCH_TIME\":86989,\"VIDEO_MRC_VIEW\":2,\"VIDEO_START\":2,\"VIDEO_V50_WATCH_TIME\":173979,\"OUTBOUND_CLICK\":2}", value = "The metric name and daily value for each requested metric")
  @Valid
 /**
   * The metric name and daily value for each requested metric
  **/
  private Map<String, BigDecimal> metrics = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, DataStatus> dataStatus = new HashMap<>();

  @ApiModelProperty(example = "642396334344813594", value = "The pin id")
 /**
   * The pin id
  **/
  private String pinId;
 /**
   * The metric name and daily value for each requested metric
   * @return metrics
  **/
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  public TopVideoPinsAnalyticsResponsePinsInner metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public TopVideoPinsAnalyticsResponsePinsInner putMetricsItem(String key, BigDecimal metricsItem) {
    this.metrics.put(key, metricsItem);
    return this;
  }

 /**
   * Get dataStatus
   * @return dataStatus
  **/
  @JsonProperty("data_status")
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

  public TopVideoPinsAnalyticsResponsePinsInner dataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  public TopVideoPinsAnalyticsResponsePinsInner putDataStatusItem(String key, DataStatus dataStatusItem) {
    this.dataStatus.put(key, dataStatusItem);
    return this;
  }

 /**
   * The pin id
   * @return pinId
  **/
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public TopVideoPinsAnalyticsResponsePinsInner pinId(String pinId) {
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
    TopVideoPinsAnalyticsResponsePinsInner topVideoPinsAnalyticsResponsePinsInner = (TopVideoPinsAnalyticsResponsePinsInner) o;
    return Objects.equals(this.metrics, topVideoPinsAnalyticsResponsePinsInner.metrics) &&
        Objects.equals(this.dataStatus, topVideoPinsAnalyticsResponsePinsInner.dataStatus) &&
        Objects.equals(this.pinId, topVideoPinsAnalyticsResponsePinsInner.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, dataStatus, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopVideoPinsAnalyticsResponsePinsInner {\n");
    
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

