package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Billing profile status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingProfileStatus {

    @JsonProperty("UNSPECIFIED") UNSPECIFIED(String.valueOf("UNSPECIFIED")), @JsonProperty("VALID") VALID(String.valueOf("VALID")), @JsonProperty("INVALID") INVALID(String.valueOf("INVALID")), @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("DELETED") DELETED(String.valueOf("DELETED")), @JsonProperty("SECONDARY") SECONDARY(String.valueOf("SECONDARY")), @JsonProperty("PENDING_SECONDARY") PENDING_SECONDARY(String.valueOf("PENDING_SECONDARY"));


    private String value;

    BillingProfileStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingProfileStatus fromValue(String value) {
        for (BillingProfileStatus b : BillingProfileStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



