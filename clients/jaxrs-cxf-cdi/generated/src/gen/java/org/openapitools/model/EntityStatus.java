package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Entity status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum EntityStatus {

    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("ARCHIVED") ARCHIVED(String.valueOf("ARCHIVED")), @JsonProperty("DRAFT") DRAFT(String.valueOf("DRAFT")), @JsonProperty("DELETED_DRAFT") DELETED_DRAFT(String.valueOf("DELETED_DRAFT"));


    private String value;

    EntityStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityStatus fromValue(String value) {
        for (EntityStatus b : EntityStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



