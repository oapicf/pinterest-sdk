package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The &#x60;HOUR&#x60; enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Granularity {

    @JsonProperty("TOTAL") TOTAL(String.valueOf("TOTAL")), @JsonProperty("DAY") DAY(String.valueOf("DAY")), @JsonProperty("HOUR") HOUR(String.valueOf("HOUR")), @JsonProperty("WEEK") WEEK(String.valueOf("WEEK")), @JsonProperty("MONTH") MONTH(String.valueOf("MONTH"));


    private String value;

    Granularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Granularity fromValue(String value) {
        for (Granularity b : Granularity.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



