package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum WorkloadState {

    NOT_STARTED("NOT_STARTED"),
    
    RUNNING("RUNNING"),
    
    PAUSED("PAUSED"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED")

    private final String value

    WorkloadState(String value) {
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
