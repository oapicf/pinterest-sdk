package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ProductCategoryDetailLookbackWindow
 */

public enum ProductCategoryDetailLookbackWindow {

    NUMBER_90(new BigDecimal("90")),
    NUMBER_180(new BigDecimal("180")),
    NUMBER_365(new BigDecimal("365")),
    NUMBER_730(new BigDecimal("730"));

    private BigDecimal value;

    ProductCategoryDetailLookbackWindow(BigDecimal value) {
        this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ProductCategoryDetailLookbackWindow fromValue(String text) {
        for (ProductCategoryDetailLookbackWindow b : ProductCategoryDetailLookbackWindow.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

