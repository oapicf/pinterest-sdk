package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum QueryLabelEntityStatusesItems {

    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("ARCHIVED") ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    QueryLabelEntityStatusesItems(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QueryLabelEntityStatusesItems fromValue(String value) {
        for (QueryLabelEntityStatusesItems b : QueryLabelEntityStatusesItems.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



