package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum NullableLabelStatus {

    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED")

    private final String value

    NullableLabelStatus(String value) {
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
