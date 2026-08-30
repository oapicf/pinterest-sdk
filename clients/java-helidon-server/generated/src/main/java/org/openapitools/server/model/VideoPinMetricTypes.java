package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Video Pin metric types
 */

public enum VideoPinMetricTypes {

    IMPRESSION("IMPRESSION"),
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    PIN_CLICK("PIN_CLICK"),
    SAVE("SAVE"),
    SAVE_RATE("SAVE_RATE"),
    VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
    VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
    QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
    VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
    VIDEO_START("VIDEO_START"),
    VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
    TOTAL_COMMENTS("TOTAL_COMMENTS"),
    TOTAL_REACTIONS("TOTAL_REACTIONS");

    private String value;

    VideoPinMetricTypes(String value) {
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
    public static VideoPinMetricTypes fromValue(String text) {
        for (VideoPinMetricTypes b : VideoPinMetricTypes.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

