package apimodels;

import apimodels.PinAnalyticsMetricsResponseDailyMetricsInner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PinAnalyticsMetricsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinAnalyticsMetricsResponse   {
  @JsonProperty("daily_metrics")
  @Valid

  private List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics = null;

  @JsonProperty("lifetime_metrics")
  
  private Map<String, Integer> lifetimeMetrics = null;

  @JsonProperty("summary_metrics")
  @Valid

  private Map<String, BigDecimal> summaryMetrics = null;

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
  **/
  public List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> getDailyMetrics() {
    return dailyMetrics;
  }

  public void setDailyMetrics(List<@Valid PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

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
  **/
  public Map<String, Integer> getLifetimeMetrics() {
    return lifetimeMetrics;
  }

  public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
    this.lifetimeMetrics = lifetimeMetrics;
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
  **/
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
    return Objects.equals(dailyMetrics, pinAnalyticsMetricsResponse.dailyMetrics) &&
        Objects.equals(lifetimeMetrics, pinAnalyticsMetricsResponse.lifetimeMetrics) &&
        Objects.equals(summaryMetrics, pinAnalyticsMetricsResponse.summaryMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyMetrics, lifetimeMetrics, summaryMetrics);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinAnalyticsMetricsResponse {\n");
    
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
    sb.append("    lifetimeMetrics: ").append(toIndentedString(lifetimeMetrics)).append("\n");
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

