package org.openapitools.model;

import groovy.transform.Canonical

enum BoardPrivacy {

    PUBLIC("PUBLIC"),
    
    PROTECTED("PROTECTED"),
    
    SECRET("SECRET")

    private final String value

    BoardPrivacy(String value) {
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
