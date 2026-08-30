package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum IngestionSource {

    @JsonProperty("TAG") TAG(String.valueOf("TAG")), @JsonProperty("MMP") MMP(String.valueOf("MMP")), @JsonProperty("FILE_UPLOAD") FILE_UPLOAD(String.valueOf("FILE_UPLOAD")), @JsonProperty("CONVERSIONS_API") CONVERSIONS_API(String.valueOf("CONVERSIONS_API")), @JsonProperty("NATIVE") NATIVE(String.valueOf("NATIVE"));


    private String value;

    IngestionSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IngestionSource fromValue(String value) {
        for (IngestionSource b : IngestionSource.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



