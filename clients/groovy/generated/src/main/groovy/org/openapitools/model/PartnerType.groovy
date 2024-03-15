package org.openapitools.model;

import groovy.transform.Canonical

enum PartnerType {

    INTERNAL("INTERNAL"),
    
    EXTERNAL("EXTERNAL")

    private final String value

    PartnerType(String value) {
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
