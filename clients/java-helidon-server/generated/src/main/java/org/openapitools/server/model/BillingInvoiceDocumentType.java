package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a billing invoice document.
 */

public enum BillingInvoiceDocumentType {

    INVOICE("INVOICE"),
    CREDIT_MEMO("CREDIT_MEMO");

    private String value;

    BillingInvoiceDocumentType(String value) {
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
    public static BillingInvoiceDocumentType fromValue(String text) {
        for (BillingInvoiceDocumentType b : BillingInvoiceDocumentType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

