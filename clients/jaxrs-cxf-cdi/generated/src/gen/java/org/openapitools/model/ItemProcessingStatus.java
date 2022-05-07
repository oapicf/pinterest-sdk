package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * The status of the item processing record
 **/

public enum ItemProcessingStatus {

    SUCCESS(String.valueOf("SUCCESS")), FAILURE(String.valueOf("FAILURE")), PROCESSING(String.valueOf("PROCESSING"));


    private String value;

    ItemProcessingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ItemProcessingStatus fromValue(String value) {
        for (ItemProcessingStatus b : ItemProcessingStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



