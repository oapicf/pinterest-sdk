package org.openapitools.model;

import groovy.transform.Canonical

enum BulkUpsertStatus {

    RUNNING("RUNNING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED")

    private final String value

    BulkUpsertStatus(String value) {
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
