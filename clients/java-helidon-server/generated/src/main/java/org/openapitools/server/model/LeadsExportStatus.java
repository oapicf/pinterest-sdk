package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of a leads export job
 */

public enum LeadsExportStatus {

    IN_PROGRESS("IN_PROGRESS"),
    FINISHED("FINISHED"),
    FAILED("FAILED");

    private String value;

    LeadsExportStatus(String value) {
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
    public static LeadsExportStatus fromValue(String text) {
        for (LeadsExportStatus b : LeadsExportStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

