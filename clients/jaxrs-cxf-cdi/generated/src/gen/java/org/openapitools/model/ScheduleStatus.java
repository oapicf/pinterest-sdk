package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Schedule status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ScheduleStatus {

    @JsonProperty("DRAFT") DRAFT(String.valueOf("DRAFT")), @JsonProperty("CREATED") CREATED(String.valueOf("CREATED")), @JsonProperty("SCHEDULED") SCHEDULED(String.valueOf("SCHEDULED")), @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("COMPLETED") COMPLETED(String.valueOf("COMPLETED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED")), @JsonProperty("CANCELED") CANCELED(String.valueOf("CANCELED"));


    private String value;

    ScheduleStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ScheduleStatus fromValue(String value) {
        for (ScheduleStatus b : ScheduleStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



