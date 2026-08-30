package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Set status to `ARCHIVED` to remove the label from the parent entity.
 */

public enum LabelStatusBulkUpdate {

    ARCHIVED("ARCHIVED");

    private String value;

    LabelStatusBulkUpdate(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LabelStatusBulkUpdate fromValue(String text) {
        for (LabelStatusBulkUpdate b : LabelStatusBulkUpdate.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

