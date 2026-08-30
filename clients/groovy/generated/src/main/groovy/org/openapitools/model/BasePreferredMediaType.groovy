package org.openapitools.model;

import groovy.transform.Canonical

enum BasePreferredMediaType {

    VIDEO("VIDEO"),
    
    IMAGE("IMAGE")

    private final String value

    BasePreferredMediaType(String value) {
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
