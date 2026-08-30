package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum NullablePartnerType {

    @JsonProperty("INTERNAL") INTERNAL(String.valueOf("INTERNAL")), @JsonProperty("EXTERNAL") EXTERNAL(String.valueOf("EXTERNAL"));


    private String value;

    NullablePartnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NullablePartnerType fromValue(String value) {
        for (NullablePartnerType b : NullablePartnerType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



