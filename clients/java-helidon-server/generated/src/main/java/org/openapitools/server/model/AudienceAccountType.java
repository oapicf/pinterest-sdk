package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Account type filter for audience sharing.
 */

public enum AudienceAccountType {

    AD_ACCOUNT("AD_ACCOUNT"),
    BUSINESS_ACCOUNT("BUSINESS_ACCOUNT");

    private String value;

    AudienceAccountType(String value) {
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
    public static AudienceAccountType fromValue(String text) {
        for (AudienceAccountType b : AudienceAccountType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

