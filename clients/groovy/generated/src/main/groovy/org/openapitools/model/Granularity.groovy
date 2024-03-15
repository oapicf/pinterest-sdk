package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum Granularity {

    TOTAL("TOTAL"),
    
    DAY("DAY"),
    
    HOUR("HOUR"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH")

    private final String value

    Granularity(String value) {
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
