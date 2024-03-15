package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MediaUploadStatus {

    REGISTERED("registered"),
    
    PROCESSING("processing"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed")

    private final String value

    MediaUploadStatus(String value) {
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
