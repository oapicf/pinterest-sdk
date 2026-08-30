package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum IntegrationLogEventType {

    APP("APP"),
    
    API("API")

    private final String value

    IntegrationLogEventType(String value) {
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
