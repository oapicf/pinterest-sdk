package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The names of fields that business accounts are searched by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BusinessSearchBy {

    @JsonProperty("FULL_NAME") FULL_NAME(String.valueOf("FULL_NAME")), @JsonProperty("USERNAME") USERNAME(String.valueOf("USERNAME")), @JsonProperty("BUSINESS_ID") BUSINESS_ID(String.valueOf("BUSINESS_ID")), @JsonProperty("EMAIL") EMAIL(String.valueOf("EMAIL"));


    private String value;

    BusinessSearchBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessSearchBy fromValue(String value) {
        for (BusinessSearchBy b : BusinessSearchBy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



