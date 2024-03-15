package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.PinAnalyticsMetricsResponseDailyMetricsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PinAnalyticsMetricsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinAnalyticsMetricsResponse {

  @Valid
  private Map<String, Integer> lifetimeMetrics = new HashMap<>();

  @Valid
  private List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics;

  @Valid
  private Map<String, BigDecimal> summaryMetrics = new HashMap<>();

  public PinAnalyticsMetricsResponse lifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
    return this;
  }

  public PinAnalyticsMetricsResponse putLifetimeMetricsItem(String key, Integer lifetimeMetricsItem) {
    if (this.lifetimeMetrics == null) {
      this.lifetimeMetrics = new HashMap<>();
    }
    this.lifetimeMetrics.put(key, lifetimeMetricsItem);
    return this;
  }

  /**
   * The lifetime metric name and value.
   * @return lifetimeMetrics
  */
  
  @Schema(name = "lifetime_metrics", example = "{\"TOTAL_COMMENTS\":10,\"TOTAL_REACTIONS\":12}", description = "The lifetime metric name and value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_metrics")
  public Map<String, Integer> getLifetimeMetrics() {
    return lifetimeMetrics;
  }

  public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
  }

  public PinAnalyticsMetricsResponse dailyMetrics(List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  public PinAnalyticsMetricsResponse addDailyMetricsItem(PinAnalyticsMetricsResponseDailyMetricsInner dailyMetricsItem) {
    if (this.dailyMetrics == null) {
      this.dailyMetrics = new ArrayList<>();
    }
    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

  /**
   * Array with the requested daily metric records
   * @return dailyMetrics
  */
  @Valid 
  @Schema(name = "daily_metrics", description = "Array with the requested daily metric records", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daily_metrics")
  public List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> getDailyMetrics() {
    return dailyMetrics;
  }

  public void setDailyMetrics(List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public PinAnalyticsMetricsResponse summaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    return this;
  }

  public PinAnalyticsMetricsResponse putSummaryMetricsItem(String key, BigDecimal summaryMetricsItem) {
    if (this.summaryMetrics == null) {
      this.summaryMetrics = new HashMap<>();
    }
    this.summaryMetrics.put(key, summaryMetricsItem);
    return this;
  }

  /**
   * The metric name and value over the requested period for each requested metric
   * @return summaryMetrics
  */
  @Valid 
  @Schema(name = "summary_metrics", example = "{\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"PIN_CLICK\":37,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", description = "The metric name and value over the requested period for each requested metric", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary_metrics")
  public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }

  public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinAnalyticsMetricsResponse pinAnalyticsMetricsResponse = (PinAnalyticsMetricsResponse) o;
    return Objects.equals(this.lifetimeMetrics, pinAnalyticsMetricsResponse.lifetimeMetrics) &&
        Objects.equals(this.dailyMetrics, pinAnalyticsMetricsResponse.dailyMetrics) &&
        Objects.equals(this.summaryMetrics, pinAnalyticsMetricsResponse.summaryMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetimeMetrics, dailyMetrics, summaryMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinAnalyticsMetricsResponse {\n");
    sb.append("    lifetimeMetrics: ").append(toIndentedString(lifetimeMetrics)).append("\n");
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
    sb.append("    summaryMetrics: ").append(toIndentedString(summaryMetrics)).append("\n");
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

