package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AttributionMatchType {

    P("P"),
    
    D("D"),
    
    NA("NA")

    private final String value

    AttributionMatchType(String value) {
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
