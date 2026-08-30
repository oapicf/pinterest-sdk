package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProductCondition {

    @JsonProperty("NEW") NEW(String.valueOf("NEW")), @JsonProperty("USED") USED(String.valueOf("USED")), @JsonProperty("REFURBISHED") REFURBISHED(String.valueOf("REFURBISHED"));


    private String value;

    ProductCondition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductCondition fromValue(String value) {
        for (ProductCondition b : ProductCondition.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



