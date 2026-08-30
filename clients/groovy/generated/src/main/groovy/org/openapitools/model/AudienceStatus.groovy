package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudienceStatus {

    INITIALIZING("INITIALIZING"),
    
    READY("READY"),
    
    TOO_SMALL("TOO_SMALL"),
    
    ELIGIBLE("ELIGIBLE"),
    
    PERSONAS_INELIGIBLE_SIZE("PERSONAS_INELIGIBLE_SIZE"),
    
    PERSONAS_INITIALIZING("PERSONAS_INITIALIZING")

    private final String value

    AudienceStatus(String value) {
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
