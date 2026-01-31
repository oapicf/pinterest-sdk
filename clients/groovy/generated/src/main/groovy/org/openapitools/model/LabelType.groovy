package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LabelType {

    BRAND("BRAND"),
    
    CUSTOM("CUSTOM")

    private final String value

    LabelType(String value) {
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
