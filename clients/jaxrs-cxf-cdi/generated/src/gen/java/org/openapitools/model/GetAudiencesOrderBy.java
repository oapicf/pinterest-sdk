package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetAudiencesOrderBy {

    @JsonProperty("NONE") NONE(String.valueOf("NONE")), @JsonProperty("ID") ID(String.valueOf("ID")), @JsonProperty("SIZE") SIZE(String.valueOf("SIZE")), @JsonProperty("CREATION_DATE") CREATION_DATE(String.valueOf("CREATION_DATE")), @JsonProperty("UPDATED_TIME") UPDATED_TIME(String.valueOf("UPDATED_TIME")), @JsonProperty("NAME") NAME(String.valueOf("NAME")), @JsonProperty("STATUS") STATUS(String.valueOf("STATUS")), @JsonProperty("TYPE") TYPE(String.valueOf("TYPE"));


    private String value;

    GetAudiencesOrderBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GetAudiencesOrderBy fromValue(String value) {
        for (GetAudiencesOrderBy b : GetAudiencesOrderBy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



