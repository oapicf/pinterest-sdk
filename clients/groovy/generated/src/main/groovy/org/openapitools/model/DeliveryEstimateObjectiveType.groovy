package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DeliveryEstimateObjectiveType {

    AWARENESS("AWARENESS"),
    
    CONSIDERATION("CONSIDERATION"),
    
    CATALOG_SALES("CATALOG_SALES"),
    
    WEB_CONVERSION("WEB_CONVERSION")

    private final String value

    DeliveryEstimateObjectiveType(String value) {
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
