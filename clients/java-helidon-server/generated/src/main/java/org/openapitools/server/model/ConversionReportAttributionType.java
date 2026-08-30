package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */

public enum ConversionReportAttributionType {

    INDIVIDUAL("INDIVIDUAL"),
    HOUSEHOLD("HOUSEHOLD");

    private String value;

    ConversionReportAttributionType(String value) {
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
    public static ConversionReportAttributionType fromValue(String text) {
        for (ConversionReportAttributionType b : ConversionReportAttributionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

