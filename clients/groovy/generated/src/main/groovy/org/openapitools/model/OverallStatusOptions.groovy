package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OverallStatusOptions {

    NEEDS_IMPROVEMENT("NEEDS_IMPROVEMENT"),
    
    FAIR("FAIR"),
    
    GOOD("GOOD")

    private final String value

    OverallStatusOptions(String value) {
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
