package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LabelStatusBulkUpdate {

    @JsonProperty("ARCHIVED") ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    LabelStatusBulkUpdate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LabelStatusBulkUpdate fromValue(String value) {
        for (LabelStatusBulkUpdate b : LabelStatusBulkUpdate.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



