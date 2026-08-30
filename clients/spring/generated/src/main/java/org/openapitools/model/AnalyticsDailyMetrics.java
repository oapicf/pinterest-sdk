package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalyticsDailyMetrics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AnalyticsDailyMetrics {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable DataStatus dataStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String date;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Map<String, BigDecimal> metrics = new HashMap<>();

  public AnalyticsDailyMetrics dataStatus(@Nullable DataStatus dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  /**
   * Get dataStatus
   * @return dataStatus
   */
  @Valid 
  @Schema(name = "data_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_status")
  public @Nullable DataStatus getDataStatus() {
    return dataStatus;
  }

  @JsonProperty("data_status")
  public void setDataStatus(@Nullable DataStatus dataStatus) {
    this.dataStatus = dataStatus;
  }

  public AnalyticsDailyMetrics date(@Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Metrics date (UTC): YYYY-MM-DD.
   * @return date
   */
  
  @Schema(name = "date", example = "2019-12-01", description = "Metrics date (UTC): YYYY-MM-DD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public @Nullable String getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(@Nullable String date) {
    this.date = date;
  }

  public AnalyticsDailyMetrics metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public AnalyticsDailyMetrics putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * Get metrics
   * @return metrics
   */
  @Valid 
  @Schema(name = "metrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  @JsonProperty("metrics")
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsDailyMetrics analyticsDailyMetrics = (AnalyticsDailyMetrics) o;
    return Objects.equals(this.dataStatus, analyticsDailyMetrics.dataStatus) &&
        Objects.equals(this.date, analyticsDailyMetrics.date) &&
        Objects.equals(this.metrics, analyticsDailyMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, date, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsDailyMetrics {\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

