package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BulkReportingJobStatus {

    DOES_NOT_EXIST("DOES_NOT_EXIST"),
    
    FINISHED("FINISHED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    EXPIRED("EXPIRED"),
    
    FAILED("FAILED"),
    
    CANCELLED("CANCELLED")

    private final String value

    BulkReportingJobStatus(String value) {
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
