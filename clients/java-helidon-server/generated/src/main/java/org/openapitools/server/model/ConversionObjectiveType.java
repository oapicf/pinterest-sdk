package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
 */

public enum ConversionObjectiveType {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    WEB_CONVERSION("WEB_CONVERSION"),
    CATALOG_SALES("CATALOG_SALES"),
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    APP_INSTALL("APP_INSTALL"),
    SALES("SALES"),
    LEADS("LEADS"),
    CTV_CONSIDERATION("CTV_CONSIDERATION");

    private String value;

    ConversionObjectiveType(String value) {
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
    public static ConversionObjectiveType fromValue(String text) {
        for (ConversionObjectiveType b : ConversionObjectiveType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

