package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PinnerListType {

    CUSTOMER_LIST("CUSTOMER_LIST"),
    
    VISITOR("VISITOR"),
    
    ENGAGEMENT("ENGAGEMENT"),
    
    LOOKALIKE("LOOKALIKE"),
    
    ACTALIKE("ACTALIKE"),
    
    PERSONA("PERSONA")

    private final String value

    PinnerListType(String value) {
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
