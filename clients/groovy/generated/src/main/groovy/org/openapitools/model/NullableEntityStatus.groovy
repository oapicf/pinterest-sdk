package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum NullableEntityStatus {

    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    ARCHIVED("ARCHIVED"),
    
    DRAFT("DRAFT"),
    
    DELETED_DRAFT("DELETED_DRAFT")

    private final String value

    NullableEntityStatus(String value) {
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
