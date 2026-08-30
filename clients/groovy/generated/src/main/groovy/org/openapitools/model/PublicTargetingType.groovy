package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PublicTargetingType {

    APPTYPE("APPTYPE"),
    
    GENDER("GENDER"),
    
    LOCALE("LOCALE"),
    
    AGE_BUCKET("AGE_BUCKET"),
    
    LOCATION("LOCATION"),
    
    GEO("GEO"),
    
    INTEREST("INTEREST"),
    
    KEYWORD("KEYWORD"),
    
    AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
    
    AUDIENCE_EXCLUDE("AUDIENCE_EXCLUDE")

    private final String value

    PublicTargetingType(String value) {
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
