package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Placement type for bid multiplier targeting.
 */

public enum PlacementType {

    SEARCH("SEARCH"),
    BROWSE("BROWSE"),
    RELATED_PINS("RELATED_PINS");

    private String value;

    PlacementType(String value) {
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
    public static PlacementType fromValue(String text) {
        for (PlacementType b : PlacementType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

