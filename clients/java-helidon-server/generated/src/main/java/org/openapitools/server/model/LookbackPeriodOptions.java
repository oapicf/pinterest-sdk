package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Days in lookback window in the GET Conversion EQS response.
 */

public enum LookbackPeriodOptions {

    _1D("1d"),
    _14D("14d");

    private String value;

    LookbackPeriodOptions(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LookbackPeriodOptions fromValue(String text) {
        for (LookbackPeriodOptions b : LookbackPeriodOptions.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

