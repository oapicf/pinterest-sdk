package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BulkRequestStatus {

    RUNNING("RUNNING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED")

    private final String value

    BulkRequestStatus(String value) {
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
