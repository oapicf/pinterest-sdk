package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicate targeting template is active or Deleted
 */

public enum TargetingTemplateStatus {

    ACTIVE("ACTIVE"),
    DELETED("DELETED");

    private String value;

    TargetingTemplateStatus(String value) {
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
    public static TargetingTemplateStatus fromValue(String text) {
        for (TargetingTemplateStatus b : TargetingTemplateStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

