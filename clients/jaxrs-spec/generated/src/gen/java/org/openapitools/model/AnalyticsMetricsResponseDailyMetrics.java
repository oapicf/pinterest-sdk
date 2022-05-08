package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AnalyticsMetricsResponse_daily_metrics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class AnalyticsMetricsResponseDailyMetrics   {
  

public enum DataStatusEnum {

    PROCESSING(String.valueOf("PROCESSING")), READY(String.valueOf("READY")), ESTIMATE(String.valueOf("ESTIMATE")), BEFORE_BUSINESS_CREATED(String.valueOf("BEFORE_BUSINESS_CREATED")), BEFORE_DATA_RETENTION_PERIOD(String.valueOf("BEFORE_DATA_RETENTION_PERIOD")), BEFORE_PIN_DATA_RETENTION_PERIOD(String.valueOf("BEFORE_PIN_DATA_RETENTION_PERIOD")), BEFORE_METRIC_START_DATE(String.valueOf("BEFORE_METRIC_START_DATE")), BEFORE_CORE_METRIC_START_DATE(String.valueOf("BEFORE_CORE_METRIC_START_DATE")), BEFORE_PIN_FORMAT_METRIC_START_DATE(String.valueOf("BEFORE_PIN_FORMAT_METRIC_START_DATE")), BEFORE_AUDIENCE_METRIC_START_DATE(String.valueOf("BEFORE_AUDIENCE_METRIC_START_DATE")), BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE(String.valueOf("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE")), BEFORE_VIDEO_METRIC_START_DATE(String.valueOf("BEFORE_VIDEO_METRIC_START_DATE")), BEFORE_CONVERSION_METRIC_START_DATE(String.valueOf("BEFORE_CONVERSION_METRIC_START_DATE")), PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD(String.valueOf("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD")), IN_BAD_TAG_DATE(String.valueOf("IN_BAD_TAG_DATE")), BEFORE_PUBLISHED_METRIC_START_DATE(String.valueOf("BEFORE_PUBLISHED_METRIC_START_DATE")), BEFORE_ASSIST_METRIC_START_DATE(String.valueOf("BEFORE_ASSIST_METRIC_START_DATE")), BEFORE_PIN_CREATED(String.valueOf("BEFORE_PIN_CREATED")), BEFORE_ACCOUNT_CLAIMED(String.valueOf("BEFORE_ACCOUNT_CLAIMED")), BEFORE_DEMOGRAPHIC_FILTERS_START_DATE(String.valueOf("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE")), AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD(String.valueOf("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD")), AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD(String.valueOf("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD")), BEFORE_PRODUCT_GROUP_FILTER_START_DATE(String.valueOf("BEFORE_PRODUCT_GROUP_FILTER_START_DATE"));


    private String value;

    DataStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static DataStatusEnum fromValue(String value) {
        for (DataStatusEnum b : DataStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid DataStatusEnum dataStatus;
  private @Valid String date;
  private @Valid Map<String, BigDecimal> metrics = new HashMap<String, BigDecimal>();

  /**
   * Metrics availablity, e.g., \&quot;READY\&quot;.
   **/
  public AnalyticsMetricsResponseDailyMetrics dataStatus(DataStatusEnum dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  

  
  @ApiModelProperty(example = "READY", value = "Metrics availablity, e.g., \"READY\".")
  @JsonProperty("data_status")
  public DataStatusEnum getDataStatus() {
    return dataStatus;
  }

  @JsonProperty("data_status")
  public void setDataStatus(DataStatusEnum dataStatus) {
    this.dataStatus = dataStatus;
  }

/**
   * Metrics date (UTC): YYYY-MM-DD.
   **/
  public AnalyticsMetricsResponseDailyMetrics date(String date) {
    this.date = date;
    return this;
  }

  

  
  @ApiModelProperty(example = "2019-12-01", value = "Metrics date (UTC): YYYY-MM-DD.")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(String date) {
    this.date = date;
  }

/**
   * The metric name and daily value for each requested metric
   **/
  public AnalyticsMetricsResponseDailyMetrics metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  

  
  @ApiModelProperty(example = "{\"ENGAGEMENT\":100,\"CLICKTHROUGH_RATE\":0.2,\"CLICKTHROUGH\":200,\"CLOSEUP\":37,\"CLOSEUP_RATE\":0.5,\"ENGAGEMENT_RATE\":0.2,\"SAVE\":20,\"SAVE_RATE\":0.18,\"IMPRESSION\":240}", value = "The metric name and daily value for each requested metric")
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  @JsonProperty("metrics")
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  public AnalyticsMetricsResponseDailyMetrics putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<String, BigDecimal>();
    }

    this.metrics.put(key, metricsItem);
    return this;
  }

  public AnalyticsMetricsResponseDailyMetrics removeMetricsItem(BigDecimal metricsItem) {
    if (metricsItem != null && this.metrics != null) {
      this.metrics.remove(metricsItem);
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
    AnalyticsMetricsResponseDailyMetrics analyticsMetricsResponseDailyMetrics = (AnalyticsMetricsResponseDailyMetrics) o;
    return Objects.equals(this.dataStatus, analyticsMetricsResponseDailyMetrics.dataStatus) &&
        Objects.equals(this.date, analyticsMetricsResponseDailyMetrics.date) &&
        Objects.equals(this.metrics, analyticsMetricsResponseDailyMetrics.metrics);
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

