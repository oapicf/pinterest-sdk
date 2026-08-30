package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Refers ads entity type.
 */

public enum BulkEntityType {

    CAMPAIGN("CAMPAIGN"),
    AD_GROUP("AD_GROUP"),
    PRODUCT_GROUP("PRODUCT_GROUP"),
    AD("AD"),
    KEYWORD("KEYWORD"),
    LABEL("LABEL"),
    SCHEDULE("SCHEDULE"),
    ENTITY_HISTORY("ENTITY_HISTORY");

    private String value;

    BulkEntityType(String value) {
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
    public static BulkEntityType fromValue(String text) {
        for (BulkEntityType b : BulkEntityType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

