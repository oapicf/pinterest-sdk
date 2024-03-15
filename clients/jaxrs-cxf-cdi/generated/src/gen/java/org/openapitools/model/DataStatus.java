package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Metrics availablity, e.g., \&quot;READY\&quot;.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DataStatus {

    @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")), @JsonProperty("READY") READY(String.valueOf("READY")), @JsonProperty("ESTIMATE") ESTIMATE(String.valueOf("ESTIMATE")), @JsonProperty("BEFORE_BUSINESS_CREATED") BEFORE_BUSINESS_CREATED(String.valueOf("BEFORE_BUSINESS_CREATED")), @JsonProperty("BEFORE_DATA_RETENTION_PERIOD") BEFORE_DATA_RETENTION_PERIOD(String.valueOf("BEFORE_DATA_RETENTION_PERIOD")), @JsonProperty("BEFORE_PIN_DATA_RETENTION_PERIOD") BEFORE_PIN_DATA_RETENTION_PERIOD(String.valueOf("BEFORE_PIN_DATA_RETENTION_PERIOD")), @JsonProperty("BEFORE_METRIC_START_DATE") BEFORE_METRIC_START_DATE(String.valueOf("BEFORE_METRIC_START_DATE")), @JsonProperty("BEFORE_CORE_METRIC_START_DATE") BEFORE_CORE_METRIC_START_DATE(String.valueOf("BEFORE_CORE_METRIC_START_DATE")), @JsonProperty("BEFORE_PIN_FORMAT_METRIC_START_DATE") BEFORE_PIN_FORMAT_METRIC_START_DATE(String.valueOf("BEFORE_PIN_FORMAT_METRIC_START_DATE")), @JsonProperty("BEFORE_AUDIENCE_METRIC_START_DATE") BEFORE_AUDIENCE_METRIC_START_DATE(String.valueOf("BEFORE_AUDIENCE_METRIC_START_DATE")), @JsonProperty("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE") BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE(String.valueOf("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE")), @JsonProperty("BEFORE_VIDEO_METRIC_START_DATE") BEFORE_VIDEO_METRIC_START_DATE(String.valueOf("BEFORE_VIDEO_METRIC_START_DATE")), @JsonProperty("BEFORE_CONVERSION_METRIC_START_DATE") BEFORE_CONVERSION_METRIC_START_DATE(String.valueOf("BEFORE_CONVERSION_METRIC_START_DATE")), @JsonProperty("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD") PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD(String.valueOf("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD")), @JsonProperty("IN_BAD_TAG_DATE") IN_BAD_TAG_DATE(String.valueOf("IN_BAD_TAG_DATE")), @JsonProperty("BEFORE_PUBLISHED_METRIC_START_DATE") BEFORE_PUBLISHED_METRIC_START_DATE(String.valueOf("BEFORE_PUBLISHED_METRIC_START_DATE")), @JsonProperty("BEFORE_ASSIST_METRIC_START_DATE") BEFORE_ASSIST_METRIC_START_DATE(String.valueOf("BEFORE_ASSIST_METRIC_START_DATE")), @JsonProperty("BEFORE_PIN_CREATED") BEFORE_PIN_CREATED(String.valueOf("BEFORE_PIN_CREATED")), @JsonProperty("BEFORE_ACCOUNT_CLAIMED") BEFORE_ACCOUNT_CLAIMED(String.valueOf("BEFORE_ACCOUNT_CLAIMED")), @JsonProperty("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE") BEFORE_DEMOGRAPHIC_FILTERS_START_DATE(String.valueOf("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE")), @JsonProperty("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD") AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD(String.valueOf("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD")), @JsonProperty("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD") AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD(String.valueOf("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD")), @JsonProperty("BEFORE_PRODUCT_GROUP_FILTER_START_DATE") BEFORE_PRODUCT_GROUP_FILTER_START_DATE(String.valueOf("BEFORE_PRODUCT_GROUP_FILTER_START_DATE"));


    private String value;

    DataStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DataStatus fromValue(String value) {
        for (DataStatus b : DataStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



