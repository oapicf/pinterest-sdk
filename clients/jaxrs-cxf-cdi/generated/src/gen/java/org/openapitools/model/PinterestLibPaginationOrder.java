package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PinterestLibPaginationOrder {

    @JsonProperty("ASCENDING") ASCENDING(String.valueOf("ASCENDING")), @JsonProperty("DESCENDING") DESCENDING(String.valueOf("DESCENDING"));


    private String value;

    PinterestLibPaginationOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PinterestLibPaginationOrder fromValue(String value) {
        for (PinterestLibPaginationOrder b : PinterestLibPaginationOrder.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



