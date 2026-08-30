package org.openapitools.model;

import groovy.transform.Canonical

enum PinType {

    PRIVATE("PRIVATE")

    private final String value

    PinType(String value) {
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
