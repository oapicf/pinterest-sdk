package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad targeting types for MMM report
 */

public enum MMMReportingTargetingType {

    APPTYPE("APPTYPE"),
    COUNTRY("COUNTRY"),
    CREATIVE_TYPE("CREATIVE_TYPE"),
    GENDER("GENDER"),
    LOCATION("LOCATION"),
    PLACEMENT("PLACEMENT"),
    AUDIENCE_INCLUDE("AUDIENCE_INCLUDE");

    private String value;

    MMMReportingTargetingType(String value) {
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
    public static MMMReportingTargetingType fromValue(String text) {
        for (MMMReportingTargetingType b : MMMReportingTargetingType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

