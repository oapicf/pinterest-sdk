package org.openapitools.model;

import groovy.transform.Canonical

enum ProductCondition {

    NEW("NEW"),
    
    USED("USED"),
    
    REFURBISHED("REFURBISHED")

    private final String value

    ProductCondition(String value) {
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
