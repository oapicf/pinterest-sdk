package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopPinsAnalyticsResponseDateAvailability   {
  
  private BigDecimal latestAvailableTimestamp;
  private Boolean isRealtime;

  public TopPinsAnalyticsResponseDateAvailability () {

  }

  public TopPinsAnalyticsResponseDateAvailability (BigDecimal latestAvailableTimestamp, Boolean isRealtime) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
    this.isRealtime = isRealtime;
  }

    
  @JsonProperty("latest_available_timestamp")
  public BigDecimal getLatestAvailableTimestamp() {
    return latestAvailableTimestamp;
  }
  public void setLatestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
  }

    
  @JsonProperty("is_realtime")
  public Boolean getIsRealtime() {
    return isRealtime;
  }
  public void setIsRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
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
    return Objects.equals(latestAvailableTimestamp, topPinsAnalyticsResponseDateAvailability.latestAvailableTimestamp) &&
        Objects.equals(isRealtime, topPinsAnalyticsResponseDateAvailability.isRealtime);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
