package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionObjectiveType {

    AWARENESS("AWARENESS"),
    
    CONSIDERATION("CONSIDERATION"),
    
    WEB_CONVERSION("WEB_CONVERSION"),
    
    CATALOG_SALES("CATALOG_SALES"),
    
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    
    APP_INSTALL("APP_INSTALL"),
    
    SALES("SALES"),
    
    LEADS("LEADS"),
    
    CTV_CONSIDERATION("CTV_CONSIDERATION")

    private final String value

    ConversionObjectiveType(String value) {
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
