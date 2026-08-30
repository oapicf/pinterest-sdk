package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Bulk request status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BulkRequestStatus {

    @JsonProperty("RUNNING") RUNNING(String.valueOf("RUNNING")), @JsonProperty("SUCCEEDED") SUCCEEDED(String.valueOf("SUCCEEDED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    BulkRequestStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BulkRequestStatus fromValue(String value) {
        for (BulkRequestStatus b : BulkRequestStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



