package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BasePreferredMediaType {

    @JsonProperty("VIDEO") VIDEO(String.valueOf("VIDEO")), @JsonProperty("IMAGE") IMAGE(String.valueOf("IMAGE"));


    private String value;

    BasePreferredMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BasePreferredMediaType fromValue(String value) {
        for (BasePreferredMediaType b : BasePreferredMediaType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



