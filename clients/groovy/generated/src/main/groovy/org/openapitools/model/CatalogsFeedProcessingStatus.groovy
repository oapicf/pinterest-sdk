package org.openapitools.model;

import groovy.transform.Canonical

enum CatalogsFeedProcessingStatus {

    COMPLETED("COMPLETED"),
    
    COMPLETED_EARLY("COMPLETED_EARLY"),
    
    DISAPPROVED("DISAPPROVED"),
    
    FAILED("FAILED"),
    
    PROCESSING("PROCESSING"),
    
    QUEUED_FOR_PROCESSING("QUEUED_FOR_PROCESSING"),
    
    UNDER_APPEAL("UNDER_APPEAL"),
    
    UNDER_REVIEW("UNDER_REVIEW")

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
