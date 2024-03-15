package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.vertxweb.server.model.DataStatus;

/**
 * Array with metrics, status, and pin id for the requested metric
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopPinsAnalyticsResponsePinsInner   {
  
  private Map<String, BigDecimal> metrics = new HashMap<>();
  private Map<String, DataStatus> dataStatus = new HashMap<>();
  private String pinId;

  public TopPinsAnalyticsResponsePinsInner () {

  }

  public TopPinsAnalyticsResponsePinsInner (Map<String, BigDecimal> metrics, Map<String, DataStatus> dataStatus, String pinId) {
    this.metrics = metrics;
    this.dataStatus = dataStatus;
    this.pinId = pinId;
  }

    
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

    
  @JsonProperty("data_status")
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

    
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
    return Objects.equals(metrics, topPinsAnalyticsResponsePinsInner.metrics) &&
        Objects.equals(dataStatus, topPinsAnalyticsResponsePinsInner.dataStatus) &&
        Objects.equals(pinId, topPinsAnalyticsResponsePinsInner.pinId);
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
