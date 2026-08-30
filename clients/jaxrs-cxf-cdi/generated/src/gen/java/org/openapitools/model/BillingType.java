package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Advertisers billing type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingType {

    @JsonProperty("CREDIT_CARD") CREDIT_CARD(String.valueOf("CREDIT_CARD")), @JsonProperty("INVOICE") INVOICE(String.valueOf("INVOICE")), @JsonProperty("INTERNAL") INTERNAL(String.valueOf("INTERNAL")), @JsonProperty("RECURRING") RECURRING(String.valueOf("RECURRING")), @JsonProperty("PREPAID") PREPAID(String.valueOf("PREPAID"));


    private String value;

    BillingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingType fromValue(String value) {
        for (BillingType b : BillingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



