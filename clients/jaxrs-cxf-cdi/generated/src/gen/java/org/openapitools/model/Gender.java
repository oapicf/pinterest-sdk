package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {

    @JsonProperty("FEMALE") FEMALE(String.valueOf("FEMALE")), @JsonProperty("MALE") MALE(String.valueOf("MALE")), @JsonProperty("UNISEX") UNISEX(String.valueOf("UNISEX"));


    private String value;

    Gender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Gender fromValue(String value) {
        for (Gender b : Gender.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



