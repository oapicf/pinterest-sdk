package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TopVideoPinsAnalyticsResponsePinsInner   {
  @JsonProperty("metrics")
  private Map<String, BigDecimal> metrics = null;

  @JsonProperty("data_status")
  private Map<String, DataStatus> dataStatus = null;

  @JsonProperty("pin_id")
  private String pinId;

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
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
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
  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
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
    return Objects.equals(metrics, topVideoPinsAnalyticsResponsePinsInner.metrics) &&
        Objects.equals(dataStatus, topVideoPinsAnalyticsResponsePinsInner.dataStatus) &&
        Objects.equals(pinId, topVideoPinsAnalyticsResponsePinsInner.pinId);
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

