package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Workload processing state
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum WorkloadState {

    @JsonProperty("NOT_STARTED") NOT_STARTED(String.valueOf("NOT_STARTED")), @JsonProperty("RUNNING") RUNNING(String.valueOf("RUNNING")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("SUCCEEDED") SUCCEEDED(String.valueOf("SUCCEEDED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    WorkloadState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WorkloadState fromValue(String value) {
        for (WorkloadState b : WorkloadState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



