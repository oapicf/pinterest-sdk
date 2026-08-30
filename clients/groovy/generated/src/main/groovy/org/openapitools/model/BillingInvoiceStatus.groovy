package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BillingInvoiceStatus {

    OPEN("OPEN"),
    
    CLOSED("CLOSED")

    private final String value

    BillingInvoiceStatus(String value) {
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
