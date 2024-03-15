package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TrendType {

    @JsonProperty("growing") GROWING(String.valueOf("growing")), @JsonProperty("monthly") MONTHLY(String.valueOf("monthly")), @JsonProperty("yearly") YEARLY(String.valueOf("yearly")), @JsonProperty("seasonal") SEASONAL(String.valueOf("seasonal"));


    private String value;

    TrendType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TrendType fromValue(String value) {
        for (TrendType b : TrendType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



