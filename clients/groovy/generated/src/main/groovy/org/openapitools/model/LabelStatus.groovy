package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LabelStatus {

    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED")

    private final String value

    LabelStatus(String value) {
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
