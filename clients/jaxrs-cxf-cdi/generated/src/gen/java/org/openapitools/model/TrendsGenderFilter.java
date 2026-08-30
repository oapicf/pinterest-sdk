package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Gender category for trends demographic distribution.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TrendsGenderFilter {

    @JsonProperty("male") MALE(String.valueOf("male")), @JsonProperty("female") FEMALE(String.valueOf("female")), @JsonProperty("unknown") UNKNOWN(String.valueOf("unknown"));


    private String value;

    TrendsGenderFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TrendsGenderFilter fromValue(String value) {
        for (TrendsGenderFilter b : TrendsGenderFilter.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



