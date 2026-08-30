package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specify the timezone to be applied for the reporting.
 */

public enum ReportingTimeZone {

    PINTEREST_TIME_ZONE("PINTEREST_TIME_ZONE"),
    AD_ACCOUNT_TIME_ZONE("AD_ACCOUNT_TIME_ZONE");

    private String value;

    ReportingTimeZone(String value) {
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
    public static ReportingTimeZone fromValue(String text) {
        for (ReportingTimeZone b : ReportingTimeZone.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

