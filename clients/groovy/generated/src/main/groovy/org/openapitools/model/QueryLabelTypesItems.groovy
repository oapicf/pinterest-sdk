package org.openapitools.model;

import groovy.transform.Canonical

enum QueryLabelTypesItems {

    BRAND("BRAND"),
    
    CUSTOM("CUSTOM")

    private final String value

    QueryLabelTypesItems(String value) {
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
