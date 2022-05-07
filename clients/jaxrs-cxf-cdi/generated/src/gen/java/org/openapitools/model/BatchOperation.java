package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * The operation performed by the batch
 **/

public enum BatchOperation {

    UPDATE(String.valueOf("UPDATE")), CREATE(String.valueOf("CREATE")), UPSERT(String.valueOf("UPSERT"));


    private String value;

    BatchOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BatchOperation fromValue(String value) {
        for (BatchOperation b : BatchOperation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



