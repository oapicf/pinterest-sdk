package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MMMReportLevel
 */

public enum MMMReportLevel {

    CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    AD_GROUP_TARGETING("AD_GROUP_TARGETING");

    private String value;

    MMMReportLevel(String value) {
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
    public static MMMReportLevel fromValue(String text) {
        for (MMMReportLevel b : MMMReportLevel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

