package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Possible status for a bulk reporting job
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BulkReportingJobStatus {

    @JsonProperty("DOES_NOT_EXIST") DOES_NOT_EXIST(String.valueOf("DOES_NOT_EXIST")), @JsonProperty("FINISHED") FINISHED(String.valueOf("FINISHED")), @JsonProperty("IN_PROGRESS") IN_PROGRESS(String.valueOf("IN_PROGRESS")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED"));


    private String value;

    BulkReportingJobStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BulkReportingJobStatus fromValue(String value) {
        for (BulkReportingJobStatus b : BulkReportingJobStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



