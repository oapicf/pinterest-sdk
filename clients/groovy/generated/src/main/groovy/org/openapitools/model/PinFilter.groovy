package org.openapitools.model;

import groovy.transform.Canonical

enum PinFilter {

    EXCLUDE_NATIVE("exclude_native"),
    
    EXCLUDE_REPINS("exclude_repins"),
    
    HAS_BEEN_PROMOTED("has_been_promoted")

    private final String value

    PinFilter(String value) {
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
