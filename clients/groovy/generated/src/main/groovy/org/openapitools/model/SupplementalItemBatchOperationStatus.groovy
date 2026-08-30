package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SupplementalItemBatchOperationStatus {

    PROCESSING("PROCESSING"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED")

    private final String value

    SupplementalItemBatchOperationStatus(String value) {
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
