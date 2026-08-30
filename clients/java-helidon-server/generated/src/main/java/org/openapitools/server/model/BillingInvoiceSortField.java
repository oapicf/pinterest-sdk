package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Field by which to sort billing invoices.
 */

public enum BillingInvoiceSortField {

    DUE_DATE("DUE_DATE"),
    BILLING_PERIOD("BILLING_PERIOD"),
    DOCUMENT_TYPE("DOCUMENT_TYPE"),
    TOTAL_AMOUNT("TOTAL_AMOUNT"),
    INVOICE_NUMBER("INVOICE_NUMBER");

    private String value;

    BillingInvoiceSortField(String value) {
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
    public static BillingInvoiceSortField fromValue(String text) {
        for (BillingInvoiceSortField b : BillingInvoiceSortField.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

