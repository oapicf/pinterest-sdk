package org.openapitools.model;

import groovy.transform.Canonical

enum TargetingSpecListOperation {

    SET("SET"),
    
    ADD("ADD"),
    
    REMOVE("REMOVE")

    private final String value

    TargetingSpecListOperation(String value) {
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
