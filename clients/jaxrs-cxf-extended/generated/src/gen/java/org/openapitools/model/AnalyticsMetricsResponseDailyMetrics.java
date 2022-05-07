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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AnalyticsMetricsResponseDailyMetrics  {
  
public enum DataStatusEnum {

    @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")),
    @JsonProperty("READY") READY(String.valueOf("READY")),
    @JsonProperty("ESTIMATE") ESTIMATE(String.valueOf("ESTIMATE")),
    @JsonProperty("BEFORE_BUSINESS_CREATED") BEFORE_BUSINESS_CREATED(String.valueOf("BEFORE_BUSINESS_CREATED")),
    @JsonProperty("BEFORE_DATA_RETENTION_PERIOD") BEFORE_DATA_RETENTION_PERIOD(String.valueOf("BEFORE_DATA_RETENTION_PERIOD")),
    @JsonProperty("BEFORE_PIN_DATA_RETENTION_PERIOD") BEFORE_PIN_DATA_RETENTION_PERIOD(String.valueOf("BEFORE_PIN_DATA_RETENTION_PERIOD")),
    @JsonProperty("BEFORE_METRIC_START_DATE") BEFORE_METRIC_START_DATE(String.valueOf("BEFORE_METRIC_START_DATE")),
    @JsonProperty("BEFORE_CORE_METRIC_START_DATE") BEFORE_CORE_METRIC_START_DATE(String.valueOf("BEFORE_CORE_METRIC_START_DATE")),
    @JsonProperty("BEFORE_PIN_FORMAT_METRIC_START_DATE") BEFORE_PIN_FORMAT_METRIC_START_DATE(String.valueOf("BEFORE_PIN_FORMAT_METRIC_START_DATE")),
    @JsonProperty("BEFORE_AUDIENCE_METRIC_START_DATE") BEFORE_AUDIENCE_METRIC_START_DATE(String.valueOf("BEFORE_AUDIENCE_METRIC_START_DATE")),
    @JsonProperty("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE") BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE(String.valueOf("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE")),
    @JsonProperty("BEFORE_VIDEO_METRIC_START_DATE") BEFORE_VIDEO_METRIC_START_DATE(String.valueOf("BEFORE_VIDEO_METRIC_START_DATE")),
    @JsonProperty("BEFORE_CONVERSION_METRIC_START_DATE") BEFORE_CONVERSION_METRIC_START_DATE(String.valueOf("BEFORE_CONVERSION_METRIC_START_DATE")),
    @JsonProperty("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD") PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD(String.valueOf("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD")),
    @JsonProperty("IN_BAD_TAG_DATE") IN_BAD_TAG_DATE(String.valueOf("IN_BAD_TAG_DATE")),
    @JsonProperty("BEFORE_PUBLISHED_METRIC_START_DATE") BEFORE_PUBLISHED_METRIC_START_DATE(String.valueOf("BEFORE_PUBLISHED_METRIC_START_DATE")),
    @JsonProperty("BEFORE_ASSIST_METRIC_START_DATE") BEFORE_ASSIST_METRIC_START_DATE(String.valueOf("BEFORE_ASSIST_METRIC_START_DATE")),
    @JsonProperty("BEFORE_PIN_CREATED") BEFORE_PIN_CREATED(String.valueOf("BEFORE_PIN_CREATED")),
    @JsonProperty("BEFORE_ACCOUNT_CLAIMED") BEFORE_ACCOUNT_CLAIMED(String.valueOf("BEFORE_ACCOUNT_CLAIMED")),
    @JsonProperty("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE") BEFORE_DEMOGRAPHIC_FILTERS_START_DATE(String.valueOf("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE")),
    @JsonProperty("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD") AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD(String.valueOf("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD")),
    @JsonProperty("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD") AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD(String.valueOf("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD")),
    @JsonProperty("BEFORE_PRODUCT_GROUP_FILTER_START_DATE") BEFORE_PRODUCT_GROUP_FILTER_START_DATE(String.valueOf("BEFORE_PRODUCT_GROUP_FILTER_START_DATE"));

    private String value;

    DataStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DataStatusEnum fromValue(String value) {
        for (DataStatusEnum b : DataStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Metrics availablity, e.g., \"READY\".
  */
  @ApiModelProperty(example = "READY", value = "Metrics availablity, e.g., \"READY\".")
  private DataStatusEnum dataStatus;

 /**
  * Metrics date (UTC): YYYY-MM-DD.
  */
  @ApiModelProperty(example = "2019-12-01", value = "Metrics date (UTC): YYYY-MM-DD.")
  private String date;

 /**
  * The metric name and daily value for each requested metric
  */
  @ApiModelProperty(example = "{\"ENGAGEMENT\":100,\"CLICKTHROUGH_RATE\":0.2,\"CLICKTHROUGH\":200,\"CLOSEUP\":37,\"CLOSEUP_RATE\":0.5,\"ENGAGEMENT_RATE\":0.2,\"SAVE\":20,\"SAVE_RATE\":0.18,\"IMPRESSION\":240}", value = "The metric name and daily value for each requested metric")
  @Valid
  private Map<String, BigDecimal> metrics = null;
 /**
  * Metrics availablity, e.g., \&quot;READY\&quot;.
  * @return dataStatus
  */
  @JsonProperty("data_status")
  public String getDataStatus() {
    return dataStatus == null ? null : dataStatus.value();
  }

  /**
   * Sets the <code>dataStatus</code> property.
   */
 public void setDataStatus(DataStatusEnum dataStatus) {
    this.dataStatus = dataStatus;
  }

  /**
   * Sets the <code>dataStatus</code> property.
   */
  public AnalyticsMetricsResponseDailyMetrics dataStatus(DataStatusEnum dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

 /**
  * Metrics date (UTC): YYYY-MM-DD.
  * @return date
  */
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(String date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public AnalyticsMetricsResponseDailyMetrics date(String date) {
    this.date = date;
    return this;
  }

 /**
  * The metric name and daily value for each requested metric
  * @return metrics
  */
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  /**
   * Sets the <code>metrics</code> property.
   */
 public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }

  /**
   * Sets the <code>metrics</code> property.
   */
  public AnalyticsMetricsResponseDailyMetrics metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Puts a new item into the <code>metrics</code> map.
   */
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

