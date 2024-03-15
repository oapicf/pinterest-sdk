package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Audience operation type (update or remove).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceUpdateOperationType {

    @JsonProperty("UPDATE") UPDATE(String.valueOf("UPDATE")), @JsonProperty("REMOVE") REMOVE(String.valueOf("REMOVE"));


    private String value;

    AudienceUpdateOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceUpdateOperationType fromValue(String value) {
        for (AudienceUpdateOperationType b : AudienceUpdateOperationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



