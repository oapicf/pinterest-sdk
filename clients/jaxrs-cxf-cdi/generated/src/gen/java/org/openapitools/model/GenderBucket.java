package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum GenderBucket {

    @JsonProperty("MALE") MALE(String.valueOf("MALE")), @JsonProperty("FEMALE") FEMALE(String.valueOf("FEMALE")), @JsonProperty("UNSPECIFIED") UNSPECIFIED(String.valueOf("UNSPECIFIED"));


    private String value;

    GenderBucket(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GenderBucket fromValue(String value) {
        for (GenderBucket b : GenderBucket.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



