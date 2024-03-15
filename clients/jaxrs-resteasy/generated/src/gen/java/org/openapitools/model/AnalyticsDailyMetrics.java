package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DataStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AnalyticsDailyMetrics   {
  
  private DataStatus dataStatus;
  private String date;
  private Map<String, BigDecimal> metrics = new HashMap<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_status")
  @Valid
  public DataStatus getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
  }

  /**
   * Metrics date (UTC): YYYY-MM-DD.
   **/
  
  @ApiModelProperty(example = "2019-12-01", value = "Metrics date (UTC): YYYY-MM-DD.")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * The metric name and daily value for each requested metric
   **/
  
  @ApiModelProperty(example = "{\"CLOSEUP\":1,\"CLOSEUP_RATE\":0,\"ENGAGEMENT\":1,\"ENGAGEMENT_RATE\":0,\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"OUTBOUND_CLICK_RATE\":0.08,\"PIN_CLICK\":37,\"PIN_CLICK_RATE\":0.15,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", value = "The metric name and daily value for each requested metric")
  @JsonProperty("metrics")
  @Valid
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

