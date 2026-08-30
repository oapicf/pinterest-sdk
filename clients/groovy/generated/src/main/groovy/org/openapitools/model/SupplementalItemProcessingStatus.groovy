package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SupplementalItemProcessingStatus {

    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    PROCESSING("PROCESSING")

    private final String value

    SupplementalItemProcessingStatus(String value) {
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
