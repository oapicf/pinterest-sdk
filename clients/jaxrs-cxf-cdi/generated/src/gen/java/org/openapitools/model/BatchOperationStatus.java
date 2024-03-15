package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The status of the operation performed by the batch
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BatchOperationStatus {

    @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")), @JsonProperty("COMPLETED") COMPLETED(String.valueOf("COMPLETED"));


    private String value;

    BatchOperationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BatchOperationStatus fromValue(String value) {
        for (BatchOperationStatus b : BatchOperationStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



