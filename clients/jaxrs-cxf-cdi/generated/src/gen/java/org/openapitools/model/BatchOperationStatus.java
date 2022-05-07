package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * The status of the operation performed by the batch
 **/

public enum BatchOperationStatus {

    PROCESSING(String.valueOf("PROCESSING")), COMPLETED(String.valueOf("COMPLETED"));


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



