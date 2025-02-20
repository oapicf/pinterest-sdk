/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map;
import org.openapitools.client.model.PinAnalyticsMetricsResponseDailyMetricsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PinAnalyticsMetricsResponse {
  
  @SerializedName("lifetime_metrics")
  private Map<String, Integer> lifetimeMetrics = null;
  @SerializedName("daily_metrics")
  private List<PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics = null;
  @SerializedName("summary_metrics")
  private Map<String, BigDecimal> summaryMetrics = null;

  /**
   * The lifetime metric name and value.
   **/
  @ApiModelProperty(value = "The lifetime metric name and value.")
  public Map<String, Integer> getLifetimeMetrics() {
    return lifetimeMetrics;
  }
  public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
  }

  /**
   * Array with the requested daily metric records
   **/
  @ApiModelProperty(value = "Array with the requested daily metric records")
  public List<PinAnalyticsMetricsResponseDailyMetricsInner> getDailyMetrics() {
    return dailyMetrics;
  }
  public void setDailyMetrics(List<PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  /**
   * The metric name and value over the requested period for each requested metric
   **/
  @ApiModelProperty(value = "The metric name and value over the requested period for each requested metric")
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
    return (this.lifetimeMetrics == null ? pinAnalyticsMetricsResponse.lifetimeMetrics == null : this.lifetimeMetrics.equals(pinAnalyticsMetricsResponse.lifetimeMetrics)) &&
        (this.dailyMetrics == null ? pinAnalyticsMetricsResponse.dailyMetrics == null : this.dailyMetrics.equals(pinAnalyticsMetricsResponse.dailyMetrics)) &&
        (this.summaryMetrics == null ? pinAnalyticsMetricsResponse.summaryMetrics == null : this.summaryMetrics.equals(pinAnalyticsMetricsResponse.summaryMetrics));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.lifetimeMetrics == null ? 0: this.lifetimeMetrics.hashCode());
    result = 31 * result + (this.dailyMetrics == null ? 0: this.dailyMetrics.hashCode());
    result = 31 * result + (this.summaryMetrics == null ? 0: this.summaryMetrics.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinAnalyticsMetricsResponse {\n");
    
    sb.append("  lifetimeMetrics: ").append(lifetimeMetrics).append("\n");
    sb.append("  dailyMetrics: ").append(dailyMetrics).append("\n");
    sb.append("  summaryMetrics: ").append(summaryMetrics).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
