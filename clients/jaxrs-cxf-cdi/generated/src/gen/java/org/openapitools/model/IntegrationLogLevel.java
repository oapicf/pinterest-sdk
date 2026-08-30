package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Log level type for integration applications.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum IntegrationLogLevel {

    @JsonProperty("INFO") INFO(String.valueOf("INFO")), @JsonProperty("WARN") WARN(String.valueOf("WARN")), @JsonProperty("ERROR") ERROR(String.valueOf("ERROR"));


    private String value;

    IntegrationLogLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IntegrationLogLevel fromValue(String value) {
        for (IntegrationLogLevel b : IntegrationLogLevel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



