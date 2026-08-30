package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
 */

public enum CustomerListStatus {

    PROCESSING("PROCESSING"),
    READY("READY"),
    TOO_SMALL("TOO_SMALL"),
    UPLOADING("UPLOADING");

    private String value;

    CustomerListStatus(String value) {
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
    public static CustomerListStatus fromValue(String text) {
        for (CustomerListStatus b : CustomerListStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

