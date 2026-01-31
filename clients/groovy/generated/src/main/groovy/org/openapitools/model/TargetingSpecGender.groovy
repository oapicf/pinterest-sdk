package org.openapitools.model;

import groovy.transform.Canonical

enum TargetingSpecGender {

    UNKNOWN("unknown"),
    
    MALE("male"),
    
    FEMALE("female")

    private final String value

    TargetingSpecGender(String value) {
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
