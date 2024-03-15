package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MMMReportingTargetingType {

    APPTYPE("APPTYPE"),
    
    COUNTRY("COUNTRY"),
    
    CREATIVE_TYPE("CREATIVE_TYPE"),
    
    GENDER("GENDER"),
    
    LOCATION("LOCATION")

    private final String value

    MMMReportingTargetingType(String value) {
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
