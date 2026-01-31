package org.openapitools.model;

import groovy.transform.Canonical

enum GenderBucket {

    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    UNSPECIFIED("UNSPECIFIED")

    private final String value

    GenderBucket(String value) {
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
