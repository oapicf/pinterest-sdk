package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AnalyticsMetricsResponseDailyMetrics;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AnalyticsMetricsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class AnalyticsMetricsResponse   {
  
  private @Valid List<AnalyticsMetricsResponseDailyMetrics> dailyMetrics = new ArrayList<AnalyticsMetricsResponseDailyMetrics>();
  private @Valid Map<String, BigDecimal> summaryMetrics = new HashMap<String, BigDecimal>();

  /**
   * Array with the requested daily metric records
   **/
  public AnalyticsMetricsResponse dailyMetrics(List<AnalyticsMetricsResponseDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  

  
  @ApiModelProperty(value = "Array with the requested daily metric records")
  @JsonProperty("daily_metrics")
  public List<AnalyticsMetricsResponseDailyMetrics> getDailyMetrics() {
    return dailyMetrics;
  }

  @JsonProperty("daily_metrics")
  public void setDailyMetrics(List<AnalyticsMetricsResponseDailyMetrics> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public AnalyticsMetricsResponse addDailyMetricsItem(AnalyticsMetricsResponseDailyMetrics dailyMetricsItem) {
    if (this.dailyMetrics == null) {
      this.dailyMetrics = new ArrayList<AnalyticsMetricsResponseDailyMetrics>();
    }

    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

  public AnalyticsMetricsResponse removeDailyMetricsItem(AnalyticsMetricsResponseDailyMetrics dailyMetricsItem) {
    if (dailyMetricsItem != null && this.dailyMetrics != null) {
      this.dailyMetrics.remove(dailyMetricsItem);
    }

    return this;
  }
/**
   * The metric name and value over the requested period for each requested metric
   **/
  public AnalyticsMetricsResponse summaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    return this;
  }

  

  
  @ApiModelProperty(example = "{\"ENGAGEMENT\":100,\"CLICKTHROUGH_RATE\":0.2,\"CLICKTHROUGH\":200,\"CLOSEUP\":37,\"CLOSEUP_RATE\":0.5,\"ENGAGEMENT_RATE\":0.2,\"SAVE\":20,\"SAVE_RATE\":0.18,\"IMPRESSION\":240}", value = "The metric name and value over the requested period for each requested metric")
  @JsonProperty("summary_metrics")
  public Map<String, BigDecimal> getSummaryMetrics() {
    return summaryMetrics;
  }

  @JsonProperty("summary_metrics")
  public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
  }

  public AnalyticsMetricsResponse putSummaryMetricsItem(String key, BigDecimal summaryMetricsItem) {
    if (this.summaryMetrics == null) {
      this.summaryMetrics = new HashMap<String, BigDecimal>();
    }

    this.summaryMetrics.put(key, summaryMetricsItem);
    return this;
  }

  public AnalyticsMetricsResponse removeSummaryMetricsItem(BigDecimal summaryMetricsItem) {
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
    AnalyticsMetricsResponse analyticsMetricsResponse = (AnalyticsMetricsResponse) o;
    return Objects.equals(this.dailyMetrics, analyticsMetricsResponse.dailyMetrics) &&
        Objects.equals(this.summaryMetrics, analyticsMetricsResponse.summaryMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyMetrics, summaryMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsMetricsResponse {\n");
    
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

