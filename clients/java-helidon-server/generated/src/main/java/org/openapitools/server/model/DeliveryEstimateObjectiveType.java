package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Objective type for delivery estimates.
 */

public enum DeliveryEstimateObjectiveType {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    CATALOG_SALES("CATALOG_SALES"),
    WEB_CONVERSION("WEB_CONVERSION");

    private String value;

    DeliveryEstimateObjectiveType(String value) {
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
    public static DeliveryEstimateObjectiveType fromValue(String text) {
        for (DeliveryEstimateObjectiveType b : DeliveryEstimateObjectiveType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

