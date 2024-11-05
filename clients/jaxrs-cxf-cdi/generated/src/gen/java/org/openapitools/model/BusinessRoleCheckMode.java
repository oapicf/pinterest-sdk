package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Specifies if the partner is internal or external.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BusinessRoleCheckMode {

    @JsonProperty("INTERNAL") INTERNAL(String.valueOf("INTERNAL")), @JsonProperty("EXTERNAL") EXTERNAL(String.valueOf("EXTERNAL"));


    private String value;

    BusinessRoleCheckMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessRoleCheckMode fromValue(String value) {
        for (BusinessRoleCheckMode b : BusinessRoleCheckMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



