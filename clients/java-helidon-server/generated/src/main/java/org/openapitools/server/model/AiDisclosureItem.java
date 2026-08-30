package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AI disclosure declaration the creator has made about the Pin.
 */

public enum AiDisclosureItem {

    AI_MODIFIED("AI_MODIFIED"),
    SYNTHETIC_PERFORMER("SYNTHETIC_PERFORMER");

    private String value;

    AiDisclosureItem(String value) {
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
    public static AiDisclosureItem fromValue(String text) {
        for (AiDisclosureItem b : AiDisclosureItem.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

