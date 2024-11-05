package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Operation type to share a specific audience or revoke access to a previously shared audience
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OperationType {

    @JsonProperty("SHARE") SHARE(String.valueOf("SHARE")), @JsonProperty("REVOKE") REVOKE(String.valueOf("REVOKE"));


    private String value;

    OperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationType fromValue(String value) {
        for (OperationType b : OperationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



