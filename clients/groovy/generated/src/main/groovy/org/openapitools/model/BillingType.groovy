package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BillingType {

    CREDIT_CARD("CREDIT_CARD"),
    
    INVOICE("INVOICE"),
    
    INTERNAL("INTERNAL"),
    
    RECURRING("RECURRING"),
    
    PREPAID("PREPAID")

    private final String value

    BillingType(String value) {
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
