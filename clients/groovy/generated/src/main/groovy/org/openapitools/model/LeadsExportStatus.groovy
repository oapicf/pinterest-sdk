package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LeadsExportStatus {

    IN_PROGRESS("IN_PROGRESS"),
    
    FINISHED("FINISHED"),
    
    FAILED("FAILED")

    private final String value

    LeadsExportStatus(String value) {
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
