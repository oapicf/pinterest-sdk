package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EventProcessingStatus {

    FAILED("failed"),
    
    PROCESSED("processed")

    private final String value

    EventProcessingStatus(String value) {
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
