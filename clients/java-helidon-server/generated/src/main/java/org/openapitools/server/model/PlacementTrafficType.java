package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */

public enum PlacementTrafficType {

    ALL("ALL"),
    TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
    FULLSCREEN_FEED("FULLSCREEN_FEED");

    private String value;

    PlacementTrafficType(String value) {
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
    public static PlacementTrafficType fromValue(String text) {
        for (PlacementTrafficType b : PlacementTrafficType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

