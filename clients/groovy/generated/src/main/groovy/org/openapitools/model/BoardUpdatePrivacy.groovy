package org.openapitools.model;

import groovy.transform.Canonical

enum BoardUpdatePrivacy {

    PUBLIC("PUBLIC"),
    
    SECRET("SECRET")

    private final String value

    BoardUpdatePrivacy(String value) {
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
