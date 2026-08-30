package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ScheduleStatus {

    DRAFT("DRAFT"),
    
    CREATED("CREATED"),
    
    SCHEDULED("SCHEDULED"),
    
    ACTIVE("ACTIVE"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    CANCELED("CANCELED")

    private final String value

    ScheduleStatus(String value) {
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
