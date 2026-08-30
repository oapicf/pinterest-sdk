package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason why a product pin is ineligible for tagging.
 */

public enum IneligibleProductTagReason {

    PIN_MISSING("PIN_MISSING"),
    PIN_IS_PRIVATE("PIN_IS_PRIVATE"),
    PRODUCT_METADATA_MISSING("PRODUCT_METADATA_MISSING"),
    PIN_NOT_FROM_VERIFIED_DOMAIN("PIN_NOT_FROM_VERIFIED_DOMAIN"),
    PIN_NOT_FROM_SAME_USER_AS_HERO_PIN("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN");

    private String value;

    IneligibleProductTagReason(String value) {
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
    public static IneligibleProductTagReason fromValue(String text) {
        for (IneligibleProductTagReason b : IneligibleProductTagReason.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

