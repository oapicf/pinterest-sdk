package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Default availability for products in a feed.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProductAvailabilityType {

    @JsonProperty("IN_STOCK") IN_STOCK(String.valueOf("IN_STOCK")), @JsonProperty("OUT_OF_STOCK") OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")), @JsonProperty("PREORDER") PREORDER(String.valueOf("PREORDER")), @JsonProperty("null") NULL(String.valueOf("null"));


    private String value;

    ProductAvailabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductAvailabilityType fromValue(String value) {
        for (ProductAvailabilityType b : ProductAvailabilityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



