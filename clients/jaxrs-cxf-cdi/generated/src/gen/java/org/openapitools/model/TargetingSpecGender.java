package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TargetingSpecGender {

    @JsonProperty("unknown") UNKNOWN(String.valueOf("unknown")), @JsonProperty("male") MALE(String.valueOf("male")), @JsonProperty("female") FEMALE(String.valueOf("female"));


    private String value;

    TargetingSpecGender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetingSpecGender fromValue(String value) {
        for (TargetingSpecGender b : TargetingSpecGender.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



