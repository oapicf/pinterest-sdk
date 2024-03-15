package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ObjectiveType {

    AWARENESS("AWARENESS"),
    
    CONSIDERATION("CONSIDERATION"),
    
    VIDEO_VIEW("VIDEO_VIEW"),
    
    WEB_CONVERSION("WEB_CONVERSION"),
    
    CATALOG_SALES("CATALOG_SALES"),
    
    WEB_SESSIONS("WEB_SESSIONS")

    private final String value

    ObjectiveType(String value) {
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
