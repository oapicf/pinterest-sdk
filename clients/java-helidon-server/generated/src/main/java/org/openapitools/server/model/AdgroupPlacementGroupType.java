package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Campaign placement group type
 */

public enum AdgroupPlacementGroupType {

    ALL("ALL"),
    SEARCH("SEARCH"),
    BROWSE("BROWSE"),
    OTHER("OTHER");

    private String value;

    AdgroupPlacementGroupType(String value) {
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
    public static AdgroupPlacementGroupType fromValue(String text) {
        for (AdgroupPlacementGroupType b : AdgroupPlacementGroupType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

