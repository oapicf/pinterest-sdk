package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum QueryLabelTypesItems {

    @JsonProperty("BRAND") BRAND(String.valueOf("BRAND")), @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    QueryLabelTypesItems(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QueryLabelTypesItems fromValue(String value) {
        for (QueryLabelTypesItems b : QueryLabelTypesItems.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



