package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The type of a billing invoice document.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingInvoiceDocumentType {

    @JsonProperty("INVOICE") INVOICE(String.valueOf("INVOICE")), @JsonProperty("CREDIT_MEMO") CREDIT_MEMO(String.valueOf("CREDIT_MEMO"));


    private String value;

    BillingInvoiceDocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingInvoiceDocumentType fromValue(String value) {
        for (BillingInvoiceDocumentType b : BillingInvoiceDocumentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



