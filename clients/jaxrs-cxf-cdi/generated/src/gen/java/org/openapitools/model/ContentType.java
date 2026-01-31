package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContentType {

    @JsonProperty("image/jpeg") IMAGE_JPEG(String.valueOf("image/jpeg")), @JsonProperty("image/png") IMAGE_PNG(String.valueOf("image/png"));


    private String value;

    ContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContentType fromValue(String value) {
        for (ContentType b : ContentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



