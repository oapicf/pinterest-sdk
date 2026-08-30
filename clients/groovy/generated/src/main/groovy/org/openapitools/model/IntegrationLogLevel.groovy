package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum IntegrationLogLevel {

    INFO("INFO"),
    
    WARN("WARN"),
    
    ERROR("ERROR")

    private final String value

    IntegrationLogLevel(String value) {
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
