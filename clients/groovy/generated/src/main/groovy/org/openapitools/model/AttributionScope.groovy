package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AttributionScope {

    VIEW("view"),
    
    ENGAGEMENT("engagement"),
    
    CLICK("click")

    private final String value

    AttributionScope(String value) {
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
