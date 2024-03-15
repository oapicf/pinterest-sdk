package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudienceType {

    CUSTOMER_LIST("CUSTOMER_LIST"),
    
    VISITOR("VISITOR"),
    
    ENGAGEMENT("ENGAGEMENT"),
    
    ACTALIKE("ACTALIKE"),
    
    PERSONA("PERSONA")

    private final String value

    AudienceType(String value) {
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
