package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionLearningModeType {

    NOT_ACTIVE("NOT_ACTIVE"),
    
    ACTIVE("ACTIVE")

    private final String value

    ConversionLearningModeType(String value) {
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
