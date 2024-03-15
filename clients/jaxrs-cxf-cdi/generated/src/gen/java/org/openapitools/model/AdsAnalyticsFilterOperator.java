package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Filter operator for sync reporting
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdsAnalyticsFilterOperator {

    @JsonProperty("LESS_THAN") LESS_THAN(String.valueOf("LESS_THAN")), @JsonProperty("GREATER_THAN") GREATER_THAN(String.valueOf("GREATER_THAN"));


    private String value;

    AdsAnalyticsFilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdsAnalyticsFilterOperator fromValue(String value) {
        for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



