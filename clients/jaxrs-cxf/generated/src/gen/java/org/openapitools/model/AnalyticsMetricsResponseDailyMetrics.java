package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalyticsMetricsResponseDailyMetrics  {
  
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

  @ApiModelProperty(example = "READY", value = "Metrics availablity, e.g., \"READY\".")
 /**
   * Metrics availablity, e.g., \"READY\".
  **/
  private DataStatusEnum dataStatus;

  @ApiModelProperty(example = "2019-12-01", value = "Metrics date (UTC): YYYY-MM-DD.")
 /**
   * Metrics date (UTC): YYYY-MM-DD.
  **/
  private String date;

  @ApiModelProperty(example = "{\"ENGAGEMENT\":100,\"CLICKTHROUGH_RATE\":0.2,\"CLICKTHROUGH\":200,\"CLOSEUP\":37,\"CLOSEUP_RATE\":0.5,\"ENGAGEMENT_RATE\":0.2,\"SAVE\":20,\"SAVE_RATE\":0.18,\"IMPRESSION\":240}", value = "The metric name and daily value for each requested metric")
  @Valid
 /**
   * The metric name and daily value for each requested metric
  **/
  private Map<String, BigDecimal> metrics = null;
 /**
   * Metrics availablity, e.g., \&quot;READY\&quot;.
   * @return dataStatus
  **/
  @JsonProperty("data_status")
  public String getDataStatus() {
    if (dataStatus == null) {
      return null;
    }
    return dataStatus.value();
  }

  public void setDataStatus(DataStatusEnum dataStatus) {
    this.dataStatus = dataStatus;
  }

  public AnalyticsMetricsResponseDailyMetrics dataStatus(DataStatusEnum dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

 /**
   * Metrics date (UTC): YYYY-MM-DD.
   * @return date
  **/
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AnalyticsMetricsResponseDailyMetrics date(String date) {
    this.date = date;
    return this;
  }

 /**
   * The metric name and daily value for each requested metric
   * @return metrics
  **/
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  public AnalyticsMetricsResponseDailyMetrics metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public AnalyticsMetricsResponseDailyMetrics putMetricsItem(String key, BigDecimal metricsItem) {
    this.metrics.put(key, metricsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

