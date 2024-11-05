package org.openapitools.model;

import groovy.transform.Canonical

enum MediaType {

    IMAGE("IMAGE"),
    
    VIDEO("VIDEO")

    private final String value

    MediaType(String value) {
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
