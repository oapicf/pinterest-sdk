package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ConversionProductReportBreakdownType
 */

public enum ConversionProductReportBreakdownType {

    PRODUCT_BRAND("PRODUCT_BRAND"),
    PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
    PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
    PRODUCT_SKU("PRODUCT_SKU"),
    PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP");

    private String value;

    ConversionProductReportBreakdownType(String value) {
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
    public static ConversionProductReportBreakdownType fromValue(String text) {
        for (ConversionProductReportBreakdownType b : ConversionProductReportBreakdownType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

