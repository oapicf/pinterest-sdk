package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsProductGroupStatus {

    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("INACTIVE") INACTIVE(String.valueOf("INACTIVE"));


    private String value;

    CatalogsProductGroupStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsProductGroupStatus fromValue(String value) {
        for (CatalogsProductGroupStatus b : CatalogsProductGroupStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



