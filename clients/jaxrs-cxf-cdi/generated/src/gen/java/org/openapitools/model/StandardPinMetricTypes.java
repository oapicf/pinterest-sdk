package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Standard Pin metric types
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum StandardPinMetricTypes {

    @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("OUTBOUND_CLICK") OUTBOUND_CLICK(String.valueOf("OUTBOUND_CLICK")), @JsonProperty("PIN_CLICK") PIN_CLICK(String.valueOf("PIN_CLICK")), @JsonProperty("SAVE") SAVE(String.valueOf("SAVE")), @JsonProperty("SAVE_RATE") SAVE_RATE(String.valueOf("SAVE_RATE")), @JsonProperty("TOTAL_COMMENTS") TOTAL_COMMENTS(String.valueOf("TOTAL_COMMENTS")), @JsonProperty("TOTAL_REACTIONS") TOTAL_REACTIONS(String.valueOf("TOTAL_REACTIONS")), @JsonProperty("USER_FOLLOW") USER_FOLLOW(String.valueOf("USER_FOLLOW")), @JsonProperty("PROFILE_VISIT") PROFILE_VISIT(String.valueOf("PROFILE_VISIT"));


    private String value;

    StandardPinMetricTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StandardPinMetricTypes fromValue(String value) {
        for (StandardPinMetricTypes b : StandardPinMetricTypes.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



