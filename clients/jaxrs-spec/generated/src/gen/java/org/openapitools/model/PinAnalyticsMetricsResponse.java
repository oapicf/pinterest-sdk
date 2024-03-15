package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.PinAnalyticsMetricsResponseDailyMetricsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PinAnalyticsMetricsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinAnalyticsMetricsResponse   {
  private @Valid Map<String, Integer> lifetimeMetrics = new HashMap<>();
  private @Valid List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics;
  private @Valid Map<String, BigDecimal> summaryMetrics = new HashMap<>();

  /**
   * The lifetime metric name and value.
   **/
  public PinAnalyticsMetricsResponse lifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
    return this;
  }

  
  @ApiModelProperty(example = "{\"TOTAL_COMMENTS\":10,\"TOTAL_REACTIONS\":12}", value = "The lifetime metric name and value.")
  @JsonProperty("lifetime_metrics")
  public Map<String, Integer> getLifetimeMetrics() {
    return lifetimeMetrics;
  }

  @JsonProperty("lifetime_metrics")
  public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
  }

  public PinAnalyticsMetricsResponse putLifetimeMetricsItem(String key, Integer lifetimeMetricsItem) {
    if (this.lifetimeMetrics == null) {
      this.lifetimeMetrics = new HashMap<>();
    }

    this.lifetimeMetrics.put(key, lifetimeMetricsItem);
    return this;
  }

  public PinAnalyticsMetricsResponse removeLifetimeMetricsItem(Integer lifetimeMetricsItem) {
    if (lifetimeMetricsItem != null && this.lifetimeMetrics != null) {
      this.lifetimeMetrics.remove(lifetimeMetricsItem);
    }

    return this;
  }
  /**
   * Array with the requested daily metric records
   **/
  public PinAnalyticsMetricsResponse dailyMetrics(List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the requested daily metric records")
  @JsonProperty("daily_metrics")
  public List<PinAnalyticsMetricsResponseDailyMetricsInner> getDailyMetrics() {
    return dailyMetrics;
  }

  @JsonProperty("daily_metrics")
  public void setDailyMetrics(List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public PinAnalyticsMetricsResponse addDailyMetricsItem(PinAnalyticsMetricsResponseDailyMetricsInner dailyMetricsItem) {
    if (this.dailyMetrics == null) {
      this.dailyMetrics = new ArrayList<>();
    }

    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

  public PinAnalyticsMetricsResponse removeDailyMetricsItem(PinAnalyticsMetricsResponseDailyMetricsInner dailyMetricsItem) {
    if (dailyMetricsItem != null && this.dailyMetrics != null) {
      this.dailyMetrics.remove(dailyMetricsItem);
    }

    return this;
  }
  /**
   * The metric name and value over the requested period for each requested metric
   **/
  public PinAnalyticsMetricsResponse summaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    return this;
  }

  
  @ApiModelProperty(example = "{\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"PIN_CLICK\":37,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", value = "The metric name and value over the requested period for each requested metric")
  @JsonProperty("summary_metrics")
  public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }

  @JsonProperty("summary_metrics")
  public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }

  public PinAnalyticsMetricsResponse putSummaryMetricsItem(String key, BigDecimal summaryMetricsItem) {
    if (this.summaryMetrics == null) {
      this.summaryMetrics = new HashMap<>();
    }

    this.summaryMetrics.put(key, summaryMetricsItem);
    return this;
  }

  public PinAnalyticsMetricsResponse removeSummaryMetricsItem(BigDecimal summaryMetricsItem) {
    if (summaryMetricsItem != null && this.summaryMetrics != null) {
      this.summaryMetrics.remove(summaryMetricsItem);
    }

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

