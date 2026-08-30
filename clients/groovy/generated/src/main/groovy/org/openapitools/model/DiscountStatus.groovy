package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DiscountStatus {

    OTHER("OTHER"),
    
    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    SCHEDULED("SCHEDULED"),
    
    EXPIRED("EXPIRED")

    private final String value

    DiscountStatus(String value) {
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
