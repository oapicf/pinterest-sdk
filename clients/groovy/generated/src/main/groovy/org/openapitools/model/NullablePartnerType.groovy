package org.openapitools.model;

import groovy.transform.Canonical

enum NullablePartnerType {

    INTERNAL("INTERNAL"),
    
    EXTERNAL("EXTERNAL")

    private final String value

    NullablePartnerType(String value) {
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
