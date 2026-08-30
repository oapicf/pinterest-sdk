package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The status of a billing invoice.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingInvoiceStatus {

    @JsonProperty("OPEN") OPEN(String.valueOf("OPEN")), @JsonProperty("CLOSED") CLOSED(String.valueOf("CLOSED"));


    private String value;

    BillingInvoiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingInvoiceStatus fromValue(String value) {
        for (BillingInvoiceStatus b : BillingInvoiceStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



