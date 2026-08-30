package org.openapitools.model;

import groovy.transform.Canonical

enum UserAccountType {

    PINNER("PINNER"),
    
    BUSINESS("BUSINESS")

    private final String value

    UserAccountType(String value) {
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
