package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Conversion report time type
 */

public enum ConversionReportTimeType {

    TIME_OF_AD_ACTION("TIME_OF_AD_ACTION"),
    TIME_OF_CONVERSION("TIME_OF_CONVERSION");

    private String value;

    ConversionReportTimeType(String value) {
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
    public static ConversionReportTimeType fromValue(String text) {
        for (ConversionReportTimeType b : ConversionReportTimeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

