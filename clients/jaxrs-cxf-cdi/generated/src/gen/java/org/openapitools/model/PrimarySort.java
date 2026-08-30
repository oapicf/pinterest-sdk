package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Whether to first sort the report by date or by ID
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PrimarySort {

    @JsonProperty("BY_ID") BY_ID(String.valueOf("BY_ID")), @JsonProperty("BY_DATE") BY_DATE(String.valueOf("BY_DATE"));


    private String value;

    PrimarySort(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PrimarySort fromValue(String value) {
        for (PrimarySort b : PrimarySort.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



