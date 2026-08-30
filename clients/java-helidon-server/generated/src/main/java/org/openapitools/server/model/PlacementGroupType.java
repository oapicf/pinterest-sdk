package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Campaign placement group type
 */

public enum PlacementGroupType {

    ALL("ALL"),
    SEARCH("SEARCH"),
    BROWSE("BROWSE"),
    OTHER("OTHER");

    private String value;

    PlacementGroupType(String value) {
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
    public static PlacementGroupType fromValue(String text) {
        for (PlacementGroupType b : PlacementGroupType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

