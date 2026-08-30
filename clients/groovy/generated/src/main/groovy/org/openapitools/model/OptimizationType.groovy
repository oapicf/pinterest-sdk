package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OptimizationType {

    CLICKTHROUGH("CLICKTHROUGH"),
    
    IMPRESSION("IMPRESSION"),
    
    WEB_CONVERSION("WEB_CONVERSION"),
    
    ROAS("ROAS"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK")

    private final String value

    OptimizationType(String value) {
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
