package org.openapitools.model;

import groovy.transform.Canonical

enum CatalogsFeedProcessingStatus {

    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    PROCESSING("PROCESSING")

    private final String value

    CatalogsFeedProcessingStatus(String value) {
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
