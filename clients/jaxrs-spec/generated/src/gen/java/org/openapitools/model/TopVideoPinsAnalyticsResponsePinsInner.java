package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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

/**
 * Array with metrics, status, and pin id for the requested metric
 **/
@ApiModel(description = "Array with metrics, status, and pin id for the requested metric")
@JsonTypeName("TopVideoPinsAnalyticsResponse_pins_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TopVideoPinsAnalyticsResponsePinsInner   {
  private @Valid Map<String, BigDecimal> metrics = new HashMap<>();
  private @Valid Map<String, DataStatus> dataStatus = new HashMap<>();
  private @Valid String pinId;

  /**
   * The metric name and daily value for each requested metric
   **/
  public TopVideoPinsAnalyticsResponsePinsInner metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(example = "{\"IMPRESSION\":7,\"QUARTILE_95_PERCENT_VIEW\":2,\"SAVE\":1,\"VIDEO_10S_VIEW\":5,\"VIDEO_AVG_WATCH_TIME\":86989,\"VIDEO_MRC_VIEW\":2,\"VIDEO_START\":2,\"VIDEO_V50_WATCH_TIME\":173979,\"OUTBOUND_CLICK\":2}", value = "The metric name and daily value for each requested metric")
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  @JsonProperty("metrics")
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  public TopVideoPinsAnalyticsResponsePinsInner putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }

    this.metrics.put(key, metricsItem);
    return this;
  }

  public TopVideoPinsAnalyticsResponsePinsInner removeMetricsItem(BigDecimal metricsItem) {
    if (metricsItem != null && this.metrics != null) {
      this.metrics.remove(metricsItem);
    }

    return this;
  }
  /**
   **/
  public TopVideoPinsAnalyticsResponsePinsInner dataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data_status")
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }

  @JsonProperty("data_status")
  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

  public TopVideoPinsAnalyticsResponsePinsInner putDataStatusItem(String key, DataStatus dataStatusItem) {
    if (this.dataStatus == null) {
      this.dataStatus = new HashMap<>();
    }

    this.dataStatus.put(key, dataStatusItem);
    return this;
  }

  public TopVideoPinsAnalyticsResponsePinsInner removeDataStatusItem(DataStatus dataStatusItem) {
    if (dataStatusItem != null && this.dataStatus != null) {
      this.dataStatus.remove(dataStatusItem);
    }

    return this;
  }
  /**
   * The pin id
   **/
  public TopVideoPinsAnalyticsResponsePinsInner pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(example = "642396334344813594", value = "The pin id")
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  @JsonProperty("pin_id")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

