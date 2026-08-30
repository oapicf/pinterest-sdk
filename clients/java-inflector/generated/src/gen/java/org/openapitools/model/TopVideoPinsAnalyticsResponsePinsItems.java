package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;



/**
 * Array with metrics, status, and pin id for the requested metric
 **/

@ApiModel(description = "Array with metrics, status, and pin id for the requested metric")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopVideoPinsAnalyticsResponsePinsItems   {
  @JsonProperty("data_status")
  private Map<String, DataStatus> dataStatus = null;

  @JsonProperty("metrics")
  private Map<String, BigDecimal> metrics = null;

  @JsonProperty("pin_id")
  private String pinId;

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
  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }

  /**
   **/
  public TopVideoPinsAnalyticsResponsePinsItems metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
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
    return Objects.equals(dataStatus, topVideoPinsAnalyticsResponsePinsItems.dataStatus) &&
        Objects.equals(metrics, topVideoPinsAnalyticsResponsePinsItems.metrics) &&
        Objects.equals(pinId, topVideoPinsAnalyticsResponsePinsItems.pinId);
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

