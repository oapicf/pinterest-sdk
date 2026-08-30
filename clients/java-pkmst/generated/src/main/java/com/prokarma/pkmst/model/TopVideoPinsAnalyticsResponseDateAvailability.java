package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TopVideoPinsAnalyticsResponseDateAvailability
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopVideoPinsAnalyticsResponseDateAvailability   {
  @JsonProperty("is_realtime")
  private Boolean isRealtime;

  @JsonProperty("latest_available_timestamp")
  private BigDecimal latestAvailableTimestamp;

  public TopVideoPinsAnalyticsResponseDateAvailability isRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
    return this;
  }

  /**
   * Get isRealtime
   * @return isRealtime
   */
  @ApiModelProperty(value = "")
  public Boolean getIsRealtime() {
    return isRealtime;
  }

  public void setIsRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
  }

  public TopVideoPinsAnalyticsResponseDateAvailability latestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
    return this;
  }

  /**
   * Get latestAvailableTimestamp
   * @return latestAvailableTimestamp
   */
  @ApiModelProperty(value = "")
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
    TopVideoPinsAnalyticsResponseDateAvailability topVideoPinsAnalyticsResponseDateAvailability = (TopVideoPinsAnalyticsResponseDateAvailability) o;
    return Objects.equals(this.isRealtime, topVideoPinsAnalyticsResponseDateAvailability.isRealtime) &&
        Objects.equals(this.latestAvailableTimestamp, topVideoPinsAnalyticsResponseDateAvailability.latestAvailableTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRealtime, latestAvailableTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopVideoPinsAnalyticsResponseDateAvailability {\n");
    
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

