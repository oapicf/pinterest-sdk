package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ItemProcessingStatus {

    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    PROCESSING("PROCESSING")

    private final String value

    ItemProcessingStatus(String value) {
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
