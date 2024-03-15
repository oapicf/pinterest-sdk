package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Order Line Status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderLineStatus {

    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("DELETED") DELETED(String.valueOf("DELETED"));


    private String value;

    OrderLineStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderLineStatus fromValue(String value) {
        for (OrderLineStatus b : OrderLineStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



