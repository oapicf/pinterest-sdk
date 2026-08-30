package org.openapitools.model;

import groovy.transform.Canonical

enum Order {

    ASCENDING("ASCENDING"),
    
    DESCENDING("DESCENDING")

    private final String value

    Order(String value) {
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
