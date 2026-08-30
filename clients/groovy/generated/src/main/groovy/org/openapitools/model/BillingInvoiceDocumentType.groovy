package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BillingInvoiceDocumentType {

    INVOICE("INVOICE"),
    
    CREDIT_MEMO("CREDIT_MEMO")

    private final String value

    BillingInvoiceDocumentType(String value) {
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
