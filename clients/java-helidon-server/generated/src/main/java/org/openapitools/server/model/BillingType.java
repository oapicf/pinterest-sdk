package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Advertisers billing type
 */

public enum BillingType {

    CREDIT_CARD("CREDIT_CARD"),
    INVOICE("INVOICE"),
    INTERNAL("INTERNAL"),
    RECURRING("RECURRING"),
    PREPAID("PREPAID");

    private String value;

    BillingType(String value) {
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
    public static BillingType fromValue(String text) {
        for (BillingType b : BillingType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

