package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum StandardPinMetricTypes {

    IMPRESSION("IMPRESSION"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    
    PIN_CLICK("PIN_CLICK"),
    
    SAVE("SAVE"),
    
    SAVE_RATE("SAVE_RATE"),
    
    TOTAL_COMMENTS("TOTAL_COMMENTS"),
    
    TOTAL_REACTIONS("TOTAL_REACTIONS"),
    
    USER_FOLLOW("USER_FOLLOW"),
    
    PROFILE_VISIT("PROFILE_VISIT")

    private final String value

    StandardPinMetricTypes(String value) {
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
