package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The status of the batch operation
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum SupplementalItemBatchOperationStatus {

    @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")), @JsonProperty("COMPLETED") COMPLETED(String.valueOf("COMPLETED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    SupplementalItemBatchOperationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SupplementalItemBatchOperationStatus fromValue(String value) {
        for (SupplementalItemBatchOperationStatus b : SupplementalItemBatchOperationStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



