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

/**
 * Array with metrics, status, and pin id for the requested metric
 **/
@ApiModel(description = "Array with metrics, status, and pin id for the requested metric")
@JsonTypeName("TopVideoPinsAnalyticsResponsePinsItems")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopVideoPinsAnalyticsResponsePinsItems   {
  private @Valid Map<String, DataStatus> dataStatus = new HashMap<>();
  private @Valid Map<String, BigDecimal> metrics = new HashMap<>();
  private String pinId;

  public TopVideoPinsAnalyticsResponsePinsItems() {
  }

  /**
   **/
  public TopVideoPinsAnalyticsResponsePinsItems dataStatus(Map<String, DataStatus> dataStatus) {
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

  public TopVideoPinsAnalyticsResponsePinsItems putDataStatusItem(String key, DataStatus dataStatusItem) {
    if (this.dataStatus == null) {
      this.dataStatus = new HashMap<>();
    }

    this.dataStatus.put(key, dataStatusItem);
    return this;
  }

  public TopVideoPinsAnalyticsResponsePinsItems removeDataStatusItem(String key) {
    if (this.dataStatus != null) {
      this.dataStatus.remove(key);
    }

    return this;
  }
  /**
   **/
  public TopVideoPinsAnalyticsResponsePinsItems metrics(Map<String, BigDecimal> metrics) {
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

  public TopVideoPinsAnalyticsResponsePinsItems putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }

    this.metrics.put(key, metricsItem);
    return this;
  }

  public TopVideoPinsAnalyticsResponsePinsItems removeMetricsItem(String key) {
    if (this.metrics != null) {
      this.metrics.remove(key);
    }

    return this;
  }
  /**
   * The pin id
   **/
  public TopVideoPinsAnalyticsResponsePinsItems pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(value = "The pin id")
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
    TopVideoPinsAnalyticsResponsePinsItems topVideoPinsAnalyticsResponsePinsItems = (TopVideoPinsAnalyticsResponsePinsItems) o;
    return Objects.equals(this.dataStatus, topVideoPinsAnalyticsResponsePinsItems.dataStatus) &&
        Objects.equals(this.metrics, topVideoPinsAnalyticsResponsePinsItems.metrics) &&
        Objects.equals(this.pinId, topVideoPinsAnalyticsResponsePinsItems.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, metrics, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopVideoPinsAnalyticsResponsePinsItems {\n");
    
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
