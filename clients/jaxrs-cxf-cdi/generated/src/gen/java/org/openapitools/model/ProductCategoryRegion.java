package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProductCategoryRegion {

    @JsonProperty("US") US(String.valueOf("US")), @JsonProperty("GB+IE") GB_IE(String.valueOf("GB+IE")), @JsonProperty("CA") CA(String.valueOf("CA"));


    private String value;

    ProductCategoryRegion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductCategoryRegion fromValue(String value) {
        for (ProductCategoryRegion b : ProductCategoryRegion.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



