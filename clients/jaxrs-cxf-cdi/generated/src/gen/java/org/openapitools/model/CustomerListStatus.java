package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CustomerListStatus {

    @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")), @JsonProperty("READY") READY(String.valueOf("READY")), @JsonProperty("TOO_SMALL") TOO_SMALL(String.valueOf("TOO_SMALL")), @JsonProperty("UPLOADING") UPLOADING(String.valueOf("UPLOADING"));


    private String value;

    CustomerListStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CustomerListStatus fromValue(String value) {
        for (CustomerListStatus b : CustomerListStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



