package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum NumericFilterOperatorType {

    @JsonProperty("GREATER_THAN") GREATER_THAN(String.valueOf("GREATER_THAN")), @JsonProperty("GREATER_THAN_OR_EQUALS") GREATER_THAN_OR_EQUALS(String.valueOf("GREATER_THAN_OR_EQUALS")), @JsonProperty("LESS_THAN") LESS_THAN(String.valueOf("LESS_THAN")), @JsonProperty("LESS_THAN_OR_EQUALS") LESS_THAN_OR_EQUALS(String.valueOf("LESS_THAN_OR_EQUALS"));


    private String value;

    NumericFilterOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NumericFilterOperatorType fromValue(String value) {
        for (NumericFilterOperatorType b : NumericFilterOperatorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



