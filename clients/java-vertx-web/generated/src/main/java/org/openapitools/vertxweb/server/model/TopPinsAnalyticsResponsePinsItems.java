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
public class TopPinsAnalyticsResponsePinsItems   {
  
  private Map<String, DataStatus> dataStatus = new HashMap<>();
  private Map<String, BigDecimal> metrics = new HashMap<>();
  private String pinId;

  public TopPinsAnalyticsResponsePinsItems () {

  }

  public TopPinsAnalyticsResponsePinsItems (Map<String, DataStatus> dataStatus, Map<String, BigDecimal> metrics, String pinId) {
    this.dataStatus = dataStatus;
    this.metrics = metrics;
    this.pinId = pinId;
  }

    
  @JsonProperty("data_status")
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

    
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
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
    TopPinsAnalyticsResponsePinsItems topPinsAnalyticsResponsePinsItems = (TopPinsAnalyticsResponsePinsItems) o;
    return Objects.equals(dataStatus, topPinsAnalyticsResponsePinsItems.dataStatus) &&
        Objects.equals(metrics, topPinsAnalyticsResponsePinsItems.metrics) &&
        Objects.equals(pinId, topPinsAnalyticsResponsePinsItems.pinId);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
