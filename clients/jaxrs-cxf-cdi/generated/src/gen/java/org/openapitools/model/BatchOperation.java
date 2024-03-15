package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BatchOperation {

    @JsonProperty("UPDATE") UPDATE(String.valueOf("UPDATE")), @JsonProperty("UPSERT") UPSERT(String.valueOf("UPSERT")), @JsonProperty("CREATE") CREATE(String.valueOf("CREATE")), @JsonProperty("DELETE_DISCONTINUED") DELETE_DISCONTINUED(String.valueOf("DELETE_DISCONTINUED")), @JsonProperty("DELETE") DELETE(String.valueOf("DELETE"));


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



