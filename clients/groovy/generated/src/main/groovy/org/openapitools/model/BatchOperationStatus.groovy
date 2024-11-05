package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BatchOperationStatus {

    PROCESSING("PROCESSING"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED")

    private final String value

    BatchOperationStatus(String value) {
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
