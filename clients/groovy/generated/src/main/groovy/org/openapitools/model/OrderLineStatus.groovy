package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderLineStatus {

    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    DELETED("DELETED")

    private final String value

    OrderLineStatus(String value) {
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
