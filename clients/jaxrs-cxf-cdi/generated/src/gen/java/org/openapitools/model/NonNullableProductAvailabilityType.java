package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Product availability.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum NonNullableProductAvailabilityType {

    @JsonProperty("IN_STOCK") IN_STOCK(String.valueOf("IN_STOCK")), @JsonProperty("OUT_OF_STOCK") OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")), @JsonProperty("PREORDER") PREORDER(String.valueOf("PREORDER"));


    private String value;

    NonNullableProductAvailabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NonNullableProductAvailabilityType fromValue(String value) {
        for (NonNullableProductAvailabilityType b : NonNullableProductAvailabilityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



