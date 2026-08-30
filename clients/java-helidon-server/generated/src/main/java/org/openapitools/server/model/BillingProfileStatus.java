package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Billing profile status
 */

public enum BillingProfileStatus {

    UNSPECIFIED("UNSPECIFIED"),
    VALID("VALID"),
    INVALID("INVALID"),
    PENDING("PENDING"),
    DELETED("DELETED"),
    SECONDARY("SECONDARY"),
    PENDING_SECONDARY("PENDING_SECONDARY");

    private String value;

    BillingProfileStatus(String value) {
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
    public static BillingProfileStatus fromValue(String text) {
        for (BillingProfileStatus b : BillingProfileStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

