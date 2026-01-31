package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Days in lookback window in the GET Conversion EQS response.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LookbackPeriodOptions {

    @JsonProperty("1d") _1D(String.valueOf("1d")), @JsonProperty("14d") _14D(String.valueOf("14d"));


    private String value;

    LookbackPeriodOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LookbackPeriodOptions fromValue(String value) {
        for (LookbackPeriodOptions b : LookbackPeriodOptions.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



