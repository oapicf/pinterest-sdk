package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Brand of the payment method.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingProfilePaymentMethodBrand {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("VISA") VISA(String.valueOf("VISA")), @JsonProperty("MASTERCARD") MASTERCARD(String.valueOf("MASTERCARD")), @JsonProperty("AMERICAN_EXPRESS") AMERICAN_EXPRESS(String.valueOf("AMERICAN_EXPRESS")), @JsonProperty("DISCOVER") DISCOVER(String.valueOf("DISCOVER")), @JsonProperty("SOFORT") SOFORT(String.valueOf("SOFORT")), @JsonProperty("DINERS_CLUB") DINERS_CLUB(String.valueOf("DINERS_CLUB")), @JsonProperty("ELO") ELO(String.valueOf("ELO")), @JsonProperty("CARTE_BANCAIRE") CARTE_BANCAIRE(String.valueOf("CARTE_BANCAIRE"));


    private String value;

    BillingProfilePaymentMethodBrand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingProfilePaymentMethodBrand fromValue(String value) {
        for (BillingProfilePaymentMethodBrand b : BillingProfilePaymentMethodBrand.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



