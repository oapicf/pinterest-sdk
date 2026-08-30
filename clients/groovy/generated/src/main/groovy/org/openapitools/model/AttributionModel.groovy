package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AttributionModel {

    FIRST_TOUCH("first_touch"),
    
    LAST_TOUCH("last_touch"),
    
    MULTI_TOUCH("multi_touch"),
    
    MMM("mmm")

    private final String value

    AttributionModel(String value) {
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
