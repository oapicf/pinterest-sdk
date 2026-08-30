package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets QueryvideopinmetrictypesItems
 */

public enum QueryvideopinmetrictypesItems {

    IMPRESSION("IMPRESSION"),
    SAVE("SAVE"),
    VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
    VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
    VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
    QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
    VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
    VIDEO_START("VIDEO_START"),
    OUTBOUND_CLICK("OUTBOUND_CLICK");

    private String value;

    QueryvideopinmetrictypesItems(String value) {
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
    public static QueryvideopinmetrictypesItems fromValue(String text) {
        for (QueryvideopinmetrictypesItems b : QueryvideopinmetrictypesItems.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

