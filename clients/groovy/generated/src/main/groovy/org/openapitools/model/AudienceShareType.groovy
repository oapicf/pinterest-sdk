package org.openapitools.model;

import groovy.transform.Canonical

enum AudienceShareType {

    SHARED("SHARED"),
    
    RECEIVED("RECEIVED")

    private final String value

    AudienceShareType(String value) {
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
