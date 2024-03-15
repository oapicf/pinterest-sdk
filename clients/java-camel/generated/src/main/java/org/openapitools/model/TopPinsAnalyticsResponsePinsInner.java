package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Array with metrics, status, and pin id for the requested metric
 */

@Schema(name = "TopPinsAnalyticsResponse_pins_inner", description = "Array with metrics, status, and pin id for the requested metric")
@JsonTypeName("TopPinsAnalyticsResponse_pins_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TopPinsAnalyticsResponsePinsInner {

  @Valid
  private Map<String, BigDecimal> metrics = new HashMap<>();

  @Valid
  private Map<String, DataStatus> dataStatus = new HashMap<>();

  private String pinId;

  public TopPinsAnalyticsResponsePinsInner metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public TopPinsAnalyticsResponsePinsInner putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * The metric name and daily value for each requested metric
   * @return metrics
  */
  @Valid 
  @Schema(name = "metrics", example = "{\"CLOSEUP\":1,\"CLOSEUP_RATE\":0,\"ENGAGEMENT\":1,\"ENGAGEMENT_RATE\":0,\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"OUTBOUND_CLICK_RATE\":0.08,\"PIN_CLICK\":37,\"PIN_CLICK_RATE\":0.15,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", description = "The metric name and daily value for each requested metric", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  public TopPinsAnalyticsResponsePinsInner dataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  public TopPinsAnalyticsResponsePinsInner putDataStatusItem(String key, DataStatus dataStatusItem) {
    if (this.dataStatus == null) {
      this.dataStatus = new HashMap<>();
    }
    this.dataStatus.put(key, dataStatusItem);
    return this;
  }

  /**
   * Get dataStatus
   * @return dataStatus
  */
  @Valid 
  @Schema(name = "data_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_status")
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

  public TopPinsAnalyticsResponsePinsInner pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * The pin id
   * @return pinId
  */
  
  @Schema(name = "pin_id", example = "642396334344813594", description = "The pin id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_id")
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
    TopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner = (TopPinsAnalyticsResponsePinsInner) o;
    return Objects.equals(this.metrics, topPinsAnalyticsResponsePinsInner.metrics) &&
        Objects.equals(this.dataStatus, topPinsAnalyticsResponsePinsInner.dataStatus) &&
        Objects.equals(this.pinId, topPinsAnalyticsResponsePinsInner.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, dataStatus, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponsePinsInner {\n");
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

