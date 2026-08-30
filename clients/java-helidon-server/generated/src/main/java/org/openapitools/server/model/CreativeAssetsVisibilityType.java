package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Creative assets visibility.
 */

public enum CreativeAssetsVisibilityType {

    VISIBLE("VISIBLE"),
    HIDDEN("HIDDEN");

    private String value;

    CreativeAssetsVisibilityType(String value) {
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
    public static CreativeAssetsVisibilityType fromValue(String text) {
        for (CreativeAssetsVisibilityType b : CreativeAssetsVisibilityType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

