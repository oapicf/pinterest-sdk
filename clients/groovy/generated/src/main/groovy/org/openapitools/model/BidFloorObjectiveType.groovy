package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BidFloorObjectiveType {

    AWARENESS("AWARENESS"),
    
    CONSIDERATION("CONSIDERATION"),
    
    WEB_CONVERSION("WEB_CONVERSION"),
    
    CATALOG_SALES("CATALOG_SALES"),
    
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    
    SALES("SALES")

    private final String value

    BidFloorObjectiveType(String value) {
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
