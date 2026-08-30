package org.openapitools.model;

import groovy.transform.Canonical

enum FilterOperatorType {

    IS("IS"),
    
    CONTAINS("CONTAINS")

    private final String value

    FilterOperatorType(String value) {
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
