package org.openapitools.model;

import groovy.transform.Canonical

enum QueryLabelEntityStatusesItems {

    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED")

    private final String value

    QueryLabelEntityStatusesItems(String value) {
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
