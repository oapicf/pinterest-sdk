package org.openapitools.model;

import groovy.transform.Canonical

enum Gender {

    FEMALE("FEMALE"),
    
    MALE("MALE"),
    
    UNISEX("UNISEX")

    private final String value

    Gender(String value) {
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
