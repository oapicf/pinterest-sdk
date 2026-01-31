package org.openapitools.model;

import groovy.transform.Canonical

enum BoardPrivacyFilter {

    ALL("ALL"),
    
    PUBLIC("PUBLIC"),
    
    PROTECTED("PROTECTED"),
    
    SECRET("SECRET"),
    
    PUBLIC_AND_SECRET("PUBLIC_AND_SECRET")

    private final String value

    BoardPrivacyFilter(String value) {
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
