package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ProductCategoriesEngagementType
 */

public enum ProductCategoriesEngagementType {

    ENGAGEMENT("ENGAGEMENT"),
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    SAVE("SAVE");

    private String value;

    ProductCategoriesEngagementType(String value) {
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
    public static ProductCategoriesEngagementType fromValue(String text) {
        for (ProductCategoriesEngagementType b : ProductCategoriesEngagementType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

