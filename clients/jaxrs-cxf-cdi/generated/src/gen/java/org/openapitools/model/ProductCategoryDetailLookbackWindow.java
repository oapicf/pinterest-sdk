package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProductCategoryDetailLookbackWindow {

    @JsonProperty("new BigDecimal("90")") NUMBER_90(BigDecimal.valueOf(new BigDecimal("90"))), @JsonProperty("new BigDecimal("180")") NUMBER_180(BigDecimal.valueOf(new BigDecimal("180"))), @JsonProperty("new BigDecimal("365")") NUMBER_365(BigDecimal.valueOf(new BigDecimal("365"))), @JsonProperty("new BigDecimal("730")") NUMBER_730(BigDecimal.valueOf(new BigDecimal("730")));


    private BigDecimal value;

    ProductCategoryDetailLookbackWindow(BigDecimal v) {
        value = v;
    }

    public BigDecimal value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductCategoryDetailLookbackWindow fromValue(BigDecimal value) {
        for (ProductCategoryDetailLookbackWindow b : ProductCategoryDetailLookbackWindow.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



