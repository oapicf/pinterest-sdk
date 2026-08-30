package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Filter audiences by ownership type.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceOwnershipType {

    @JsonProperty("OWNED") OWNED(String.valueOf("OWNED")), @JsonProperty("RECEIVED") RECEIVED(String.valueOf("RECEIVED"));


    private String value;

    AudienceOwnershipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceOwnershipType fromValue(String value) {
        for (AudienceOwnershipType b : AudienceOwnershipType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



