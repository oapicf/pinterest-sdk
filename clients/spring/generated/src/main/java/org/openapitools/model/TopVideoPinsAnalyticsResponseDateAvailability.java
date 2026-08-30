package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TopVideoPinsAnalyticsResponseDateAvailability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopVideoPinsAnalyticsResponseDateAvailability {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isRealtime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal latestAvailableTimestamp;

  public TopVideoPinsAnalyticsResponseDateAvailability isRealtime(@Nullable Boolean isRealtime) {
    this.isRealtime = isRealtime;
    return this;
  }

  /**
   * Get isRealtime
   * @return isRealtime
   */
  
  @Schema(name = "is_realtime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_realtime")
  public @Nullable Boolean getIsRealtime() {
    return isRealtime;
  }

  @JsonProperty("is_realtime")
  public void setIsRealtime(@Nullable Boolean isRealtime) {
    this.isRealtime = isRealtime;
  }

  public TopVideoPinsAnalyticsResponseDateAvailability latestAvailableTimestamp(@Nullable BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
    return this;
  }

  /**
   * Get latestAvailableTimestamp
   * @return latestAvailableTimestamp
   */
  @Valid 
  @Schema(name = "latest_available_timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest_available_timestamp")
  public @Nullable BigDecimal getLatestAvailableTimestamp() {
    return latestAvailableTimestamp;
  }

  @JsonProperty("latest_available_timestamp")
  public void setLatestAvailableTimestamp(@Nullable BigDecimal latestAvailableTimestamp) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

