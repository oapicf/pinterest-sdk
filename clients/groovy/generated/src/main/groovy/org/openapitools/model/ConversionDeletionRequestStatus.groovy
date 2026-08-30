package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionDeletionRequestStatus {

    PENDING("PENDING"),
    
    SUBMITTED("SUBMITTED"),
    
    CANCELLED("CANCELLED")

    private final String value

    ConversionDeletionRequestStatus(String value) {
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
