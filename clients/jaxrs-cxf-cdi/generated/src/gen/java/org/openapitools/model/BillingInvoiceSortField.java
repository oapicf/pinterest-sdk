package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Field by which to sort billing invoices.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingInvoiceSortField {

    @JsonProperty("DUE_DATE") DUE_DATE(String.valueOf("DUE_DATE")), @JsonProperty("BILLING_PERIOD") BILLING_PERIOD(String.valueOf("BILLING_PERIOD")), @JsonProperty("DOCUMENT_TYPE") DOCUMENT_TYPE(String.valueOf("DOCUMENT_TYPE")), @JsonProperty("TOTAL_AMOUNT") TOTAL_AMOUNT(String.valueOf("TOTAL_AMOUNT")), @JsonProperty("INVOICE_NUMBER") INVOICE_NUMBER(String.valueOf("INVOICE_NUMBER"));


    private String value;

    BillingInvoiceSortField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingInvoiceSortField fromValue(String value) {
        for (BillingInvoiceSortField b : BillingInvoiceSortField.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



