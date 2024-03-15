package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BulkUpsertStatus {

    @JsonProperty("RUNNING") RUNNING(String.valueOf("RUNNING")), @JsonProperty("SUCCEEDED") SUCCEEDED(String.valueOf("SUCCEEDED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    BulkUpsertStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BulkUpsertStatus fromValue(String value) {
        for (BulkUpsertStatus b : BulkUpsertStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



