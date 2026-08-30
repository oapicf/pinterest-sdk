package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */

public enum CatalogsAiContentDisclosureLabel {

    AI_MODIFIED("ai_modified"),
    SYNTHETIC_PERFORMER("synthetic_performer");

    private String value;

    CatalogsAiContentDisclosureLabel(String value) {
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
    public static CatalogsAiContentDisclosureLabel fromValue(String text) {
        for (CatalogsAiContentDisclosureLabel b : CatalogsAiContentDisclosureLabel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

