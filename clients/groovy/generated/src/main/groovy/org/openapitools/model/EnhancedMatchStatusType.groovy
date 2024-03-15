package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EnhancedMatchStatusType {

    UNKNOWN("UNKNOWN"),
    
    NOT_VALIDATED("NOT_VALIDATED"),
    
    VALIDATING_IN_PROGRESS("VALIDATING_IN_PROGRESS"),
    
    VALIDATION_COMPLETE("VALIDATION_COMPLETE"),
    
    NULL("null")

    private final String value

    EnhancedMatchStatusType(String value) {
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
