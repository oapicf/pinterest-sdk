package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AnalyticsDailyMetrics;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AnalyticsMetricsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AnalyticsMetricsResponse   {
  private @Valid Map<String, BigDecimal> summaryMetrics = new HashMap<>();
  private @Valid List<@Valid AnalyticsDailyMetrics> dailyMetrics = new ArrayList<>();

  /**
   * The metric name and value over the requested period for each requested metric
   **/
  public AnalyticsMetricsResponse summaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    return this;
  }

  
  @ApiModelProperty(example = "{\"CLOSEUP\":1,\"CLOSEUP_RATE\":0,\"ENGAGEMENT\":1,\"ENGAGEMENT_RATE\":0,\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"OUTBOUND_CLICK_RATE\":0.08,\"PIN_CLICK\":37,\"PIN_CLICK_RATE\":0.15,\"PROFILE_VISIT\":0,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", value = "The metric name and value over the requested period for each requested metric")
  @JsonProperty("summary_metrics")
  @Valid public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }

  @JsonProperty("summary_metrics")
  public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }

  public AnalyticsMetricsResponse putSummaryMetricsItem(String key, BigDecimal summaryMetricsItem) {
    if (this.summaryMetrics == null) {
      this.summaryMetrics = new HashMap<>();
    }

    this.summaryMetrics.put(key, summaryMetricsItem);
    return this;
  }

  public AnalyticsMetricsResponse removeSummaryMetricsItem(String key) {
    if (this.summaryMetrics != null) {
      this.summaryMetrics.remove(key);
    }

    return this;
  }
  /**
   * Array with the requested daily metric records
   **/
  public AnalyticsMetricsResponse dailyMetrics(List<@Valid AnalyticsDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the requested daily metric records")
  @JsonProperty("daily_metrics")
  @Valid public List<@Valid AnalyticsDailyMetrics> getDailyMetrics() {
    return dailyMetrics;
  }

  @JsonProperty("daily_metrics")
  public void setDailyMetrics(List<@Valid AnalyticsDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public AnalyticsMetricsResponse addDailyMetricsItem(AnalyticsDailyMetrics dailyMetricsItem) {
    if (this.dailyMetrics == null) {
      this.dailyMetrics = new ArrayList<>();
    }

    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

  public AnalyticsMetricsResponse removeDailyMetricsItem(AnalyticsDailyMetrics dailyMetricsItem) {
    if (dailyMetricsItem != null && this.dailyMetrics != null) {
      this.dailyMetrics.remove(dailyMetricsItem);
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
    AnalyticsMetricsResponse analyticsMetricsResponse = (AnalyticsMetricsResponse) o;
    return Objects.equals(this.summaryMetrics, analyticsMetricsResponse.summaryMetrics) &&
        Objects.equals(this.dailyMetrics, analyticsMetricsResponse.dailyMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryMetrics, dailyMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsMetricsResponse {\n");
    
    sb.append("    summaryMetrics: ").append(toIndentedString(summaryMetrics)).append("\n");
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
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

