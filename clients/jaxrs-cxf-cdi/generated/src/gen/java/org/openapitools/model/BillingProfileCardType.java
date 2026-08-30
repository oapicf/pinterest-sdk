package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Type of the credit card.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingProfileCardType {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("VISA") VISA(String.valueOf("VISA")), @JsonProperty("MASTERCARD") MASTERCARD(String.valueOf("MASTERCARD")), @JsonProperty("AMERICAN_EXPRESS") AMERICAN_EXPRESS(String.valueOf("AMERICAN_EXPRESS")), @JsonProperty("DISCOVER") DISCOVER(String.valueOf("DISCOVER")), @JsonProperty("ELO") ELO(String.valueOf("ELO"));


    private String value;

    BillingProfileCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingProfileCardType fromValue(String value) {
        for (BillingProfileCardType b : BillingProfileCardType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



