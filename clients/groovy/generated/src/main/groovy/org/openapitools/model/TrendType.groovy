package org.openapitools.model;

import groovy.transform.Canonical

enum TrendType {

    GROWING("growing"),
    
    MONTHLY("monthly"),
    
    YEARLY("yearly"),
    
    SEASONAL("seasonal")

    private final String value

    TrendType(String value) {
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
