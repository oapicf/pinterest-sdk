package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionProductReportBreakdownType {

    @JsonProperty("PRODUCT_BRAND") PRODUCT_BRAND(String.valueOf("PRODUCT_BRAND")), @JsonProperty("PRODUCT_CATEGORY") PRODUCT_CATEGORY(String.valueOf("PRODUCT_CATEGORY")), @JsonProperty("PRODUCT_BRAND_AND_CATEGORY") PRODUCT_BRAND_AND_CATEGORY(String.valueOf("PRODUCT_BRAND_AND_CATEGORY")), @JsonProperty("PRODUCT_SKU") PRODUCT_SKU(String.valueOf("PRODUCT_SKU")), @JsonProperty("PRODUCT_SKU_GROUP") PRODUCT_SKU_GROUP(String.valueOf("PRODUCT_SKU_GROUP"));


    private String value;

    ConversionProductReportBreakdownType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionProductReportBreakdownType fromValue(String value) {
        for (ConversionProductReportBreakdownType b : ConversionProductReportBreakdownType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



