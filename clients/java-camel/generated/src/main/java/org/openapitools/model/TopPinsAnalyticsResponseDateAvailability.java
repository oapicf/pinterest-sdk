package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TopPinsAnalyticsResponseDateAvailability
 */

@JsonTypeName("TopPinsAnalyticsResponse_date_availability")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TopPinsAnalyticsResponseDateAvailability {

  private BigDecimal latestAvailableTimestamp;

  private Boolean isRealtime;

  public TopPinsAnalyticsResponseDateAvailability latestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
    return this;
  }

  /**
   * Get latestAvailableTimestamp
   * @return latestAvailableTimestamp
  */
  @Valid 
  @Schema(name = "latest_available_timestamp", example = "1649116799000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest_available_timestamp")
  public BigDecimal getLatestAvailableTimestamp() {
    return latestAvailableTimestamp;
  }

  public void setLatestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
  }

  public TopPinsAnalyticsResponseDateAvailability isRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
    return this;
  }

  /**
   * Get isRealtime
   * @return isRealtime
  */
  
  @Schema(name = "is_realtime", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

