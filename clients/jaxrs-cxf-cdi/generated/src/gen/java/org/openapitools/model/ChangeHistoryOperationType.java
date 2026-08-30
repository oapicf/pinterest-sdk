package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ChangeHistoryOperationType {

    @JsonProperty("CREATE") CREATE(String.valueOf("CREATE")), @JsonProperty("UPDATE") UPDATE(String.valueOf("UPDATE")), @JsonProperty("DELETE") DELETE(String.valueOf("DELETE"));


    private String value;

    ChangeHistoryOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ChangeHistoryOperationType fromValue(String value) {
        for (ChangeHistoryOperationType b : ChangeHistoryOperationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



