package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Workload processing state
 */

public enum WorkloadState {

    NOT_STARTED("NOT_STARTED"),
    RUNNING("RUNNING"),
    PAUSED("PAUSED"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED");

    private String value;

    WorkloadState(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static WorkloadState fromValue(String text) {
        for (WorkloadState b : WorkloadState.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

