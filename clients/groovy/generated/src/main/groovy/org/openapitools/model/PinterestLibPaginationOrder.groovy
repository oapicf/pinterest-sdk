package org.openapitools.model;

import groovy.transform.Canonical

enum PinterestLibPaginationOrder {

    ASCENDING("ASCENDING"),
    
    DESCENDING("DESCENDING")

    private final String value

    PinterestLibPaginationOrder(String value) {
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
