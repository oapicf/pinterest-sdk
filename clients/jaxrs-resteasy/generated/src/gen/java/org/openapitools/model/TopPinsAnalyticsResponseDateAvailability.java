package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopPinsAnalyticsResponseDateAvailability   {
  
  private Boolean isRealtime;
  private BigDecimal latestAvailableTimestamp;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("is_realtime")
  public Boolean getIsRealtime() {
    return isRealtime;
  }
  public void setIsRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latest_available_timestamp")
  @Valid
  public BigDecimal getLatestAvailableTimestamp() {
    return latestAvailableTimestamp;
  }
  public void setLatestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
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
    return Objects.equals(this.isRealtime, topPinsAnalyticsResponseDateAvailability.isRealtime) &&
        Objects.equals(this.latestAvailableTimestamp, topPinsAnalyticsResponseDateAvailability.latestAvailableTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRealtime, latestAvailableTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponseDateAvailability {\n");
    
    sb.append("    isRealtime: ").append(toIndentedString(isRealtime)).append("\n");
    sb.append("    latestAvailableTimestamp: ").append(toIndentedString(latestAvailableTimestamp)).append("\n");
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

