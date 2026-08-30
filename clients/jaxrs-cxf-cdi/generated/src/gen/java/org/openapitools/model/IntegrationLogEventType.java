package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Log event type for integration applications.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum IntegrationLogEventType {

    @JsonProperty("APP") APP(String.valueOf("APP")), @JsonProperty("API") API(String.valueOf("API"));


    private String value;

    IntegrationLogEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IntegrationLogEventType fromValue(String value) {
        for (IntegrationLogEventType b : IntegrationLogEventType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



