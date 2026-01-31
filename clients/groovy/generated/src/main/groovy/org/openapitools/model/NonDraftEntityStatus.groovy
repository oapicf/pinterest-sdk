package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum NonDraftEntityStatus {

    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    ARCHIVED("ARCHIVED")

    private final String value

    NonDraftEntityStatus(String value) {
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
