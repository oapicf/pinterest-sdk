package org.openapitools.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TopPinsAnalyticsResponseDateAvailability  {
  
  @ApiModelProperty(example = "1649116799000", value = "")
  private BigDecimal latestAvailableTimestamp;

  @ApiModelProperty(example = "false", value = "")
  private Boolean isRealtime;
 /**
   * Get latestAvailableTimestamp
   * @return latestAvailableTimestamp
  **/
  @JsonProperty("latest_available_timestamp")
  public BigDecimal getLatestAvailableTimestamp() {
    return latestAvailableTimestamp;
  }

  public void setLatestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
  }

  public TopPinsAnalyticsResponseDateAvailability latestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
    return this;
  }

 /**
   * Get isRealtime
   * @return isRealtime
  **/
  @JsonProperty("is_realtime")
  public Boolean getIsRealtime() {
    return isRealtime;
  }

  public void setIsRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
  }

  public TopPinsAnalyticsResponseDateAvailability isRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
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
    TopPinsAnalyticsResponseDateAvailability topPinsAnalyticsResponseDateAvailability = (TopPinsAnalyticsResponseDateAvailability) o;
    return Objects.equals(this.latestAvailableTimestamp, topPinsAnalyticsResponseDateAvailability.latestAvailableTimestamp) &&
        Objects.equals(this.isRealtime, topPinsAnalyticsResponseDateAvailability.isRealtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestAvailableTimestamp, isRealtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponseDateAvailability {\n");
    
    sb.append("    latestAvailableTimestamp: ").append(toIndentedString(latestAvailableTimestamp)).append("\n");
    sb.append("    isRealtime: ").append(toIndentedString(isRealtime)).append("\n");
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

