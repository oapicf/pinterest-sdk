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

public enum TrendsGender {

    @JsonProperty("male") MALE(String.valueOf("male")), @JsonProperty("female") FEMALE(String.valueOf("female")), @JsonProperty("unspecified") UNSPECIFIED(String.valueOf("unspecified"));


    private String value;

    TrendsGender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TrendsGender fromValue(String value) {
        for (TrendsGender b : TrendsGender.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



