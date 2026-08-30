package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BillingInvoiceSortField {

    DUE_DATE("DUE_DATE"),
    
    BILLING_PERIOD("BILLING_PERIOD"),
    
    DOCUMENT_TYPE("DOCUMENT_TYPE"),
    
    TOTAL_AMOUNT("TOTAL_AMOUNT"),
    
    INVOICE_NUMBER("INVOICE_NUMBER")

    private final String value

    BillingInvoiceSortField(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
