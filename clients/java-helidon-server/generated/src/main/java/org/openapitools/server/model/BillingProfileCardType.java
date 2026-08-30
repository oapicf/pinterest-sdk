package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the credit card.
 */

public enum BillingProfileCardType {

    UNKNOWN("UNKNOWN"),
    VISA("VISA"),
    MASTERCARD("MASTERCARD"),
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    DISCOVER("DISCOVER"),
    ELO("ELO");

    private String value;

    BillingProfileCardType(String value) {
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
    public static BillingProfileCardType fromValue(String text) {
        for (BillingProfileCardType b : BillingProfileCardType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

