package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.DataStatus;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Array with metrics, status, and pin id for the requested metric
 */
public class TopVideoPinsAnalyticsResponsePinsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data_status")
  private Map<String, DataStatus> dataStatus = new HashMap<>();

  @JsonProperty("metrics")
  private Map<String, BigDecimal> metrics = new HashMap<>();

  /**
   * The pin id
   */
  @JsonProperty("pin_id")
  private String pinId;

  /**
   * 
   * @return dataStatus
   */
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

  /**
   * 
   * @return metrics
   */
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  /**
   * The pin id
   * @return pinId
   */
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
