package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BillingProfileCardType {

    UNKNOWN("UNKNOWN"),
    
    VISA("VISA"),
    
    MASTERCARD("MASTERCARD"),
    
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    
    DISCOVER("DISCOVER"),
    
    ELO("ELO")

    private final String value

    BillingProfileCardType(String value) {
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
