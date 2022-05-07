package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyticsMetricsResponseDailyMetrics   {
  


  public enum DataStatusEnum {
    PROCESSING("PROCESSING"),
    READY("READY"),
    ESTIMATE("ESTIMATE"),
    BEFORE_BUSINESS_CREATED("BEFORE_BUSINESS_CREATED"),
    BEFORE_DATA_RETENTION_PERIOD("BEFORE_DATA_RETENTION_PERIOD"),
    BEFORE_PIN_DATA_RETENTION_PERIOD("BEFORE_PIN_DATA_RETENTION_PERIOD"),
    BEFORE_METRIC_START_DATE("BEFORE_METRIC_START_DATE"),
    BEFORE_CORE_METRIC_START_DATE("BEFORE_CORE_METRIC_START_DATE"),
    BEFORE_PIN_FORMAT_METRIC_START_DATE("BEFORE_PIN_FORMAT_METRIC_START_DATE"),
    BEFORE_AUDIENCE_METRIC_START_DATE("BEFORE_AUDIENCE_METRIC_START_DATE"),
    BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE"),
    BEFORE_VIDEO_METRIC_START_DATE("BEFORE_VIDEO_METRIC_START_DATE"),
    BEFORE_CONVERSION_METRIC_START_DATE("BEFORE_CONVERSION_METRIC_START_DATE"),
    PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD"),
    IN_BAD_TAG_DATE("IN_BAD_TAG_DATE"),
    BEFORE_PUBLISHED_METRIC_START_DATE("BEFORE_PUBLISHED_METRIC_START_DATE"),
    BEFORE_ASSIST_METRIC_START_DATE("BEFORE_ASSIST_METRIC_START_DATE"),
    BEFORE_PIN_CREATED("BEFORE_PIN_CREATED"),
    BEFORE_ACCOUNT_CLAIMED("BEFORE_ACCOUNT_CLAIMED"),
    BEFORE_DEMOGRAPHIC_FILTERS_START_DATE("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE"),
    AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD"),
    AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD"),
    BEFORE_PRODUCT_GROUP_FILTER_START_DATE("BEFORE_PRODUCT_GROUP_FILTER_START_DATE");

    private String value;

    DataStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DataStatusEnum dataStatus;
  private String date;
  private Map<String, BigDecimal> metrics = new HashMap<>();

  public AnalyticsMetricsResponseDailyMetrics () {

  }

  public AnalyticsMetricsResponseDailyMetrics (DataStatusEnum dataStatus, String date, Map<String, BigDecimal> metrics) {
    this.dataStatus = dataStatus;
    this.date = date;
    this.metrics = metrics;
  }

    
  @JsonProperty("data_status")
  public DataStatusEnum getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(DataStatusEnum dataStatus) {
    this.dataStatus = dataStatus;
  }

    
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

    
  @JsonProperty("metrics")
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
    AnalyticsMetricsResponseDailyMetrics analyticsMetricsResponseDailyMetrics = (AnalyticsMetricsResponseDailyMetrics) o;
    return Objects.equals(dataStatus, analyticsMetricsResponseDailyMetrics.dataStatus) &&
        Objects.equals(date, analyticsMetricsResponseDailyMetrics.date) &&
        Objects.equals(metrics, analyticsMetricsResponseDailyMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, date, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsMetricsResponseDailyMetrics {\n");
    
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
