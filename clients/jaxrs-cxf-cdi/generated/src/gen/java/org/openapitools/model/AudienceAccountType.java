package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceAccountType {

    @JsonProperty("AD_ACCOUNT") AD_ACCOUNT(String.valueOf("AD_ACCOUNT")), @JsonProperty("BUSINESS_ACCOUNT") BUSINESS_ACCOUNT(String.valueOf("BUSINESS_ACCOUNT"));


    private String value;

    AudienceAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceAccountType fromValue(String value) {
        for (AudienceAccountType b : AudienceAccountType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



