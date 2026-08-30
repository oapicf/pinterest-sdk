package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudienceObjectiveType {

    AWARENESS("AWARENESS"),
    
    CONSIDERATION("CONSIDERATION"),
    
    WEB_CONVERSION("WEB_CONVERSION"),
    
    CATALOG_SALES("CATALOG_SALES"),
    
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    
    SALES("SALES")

    private final String value

    AudienceObjectiveType(String value) {
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
