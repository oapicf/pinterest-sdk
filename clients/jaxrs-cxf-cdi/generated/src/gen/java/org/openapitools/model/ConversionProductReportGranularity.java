package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionProductReportGranularity {

    @JsonProperty("TOTAL") TOTAL(String.valueOf("TOTAL")), @JsonProperty("WEEK") WEEK(String.valueOf("WEEK")), @JsonProperty("MONTH") MONTH(String.valueOf("MONTH"));


    private String value;

    ConversionProductReportGranularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionProductReportGranularity fromValue(String value) {
        for (ConversionProductReportGranularity b : ConversionProductReportGranularity.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



