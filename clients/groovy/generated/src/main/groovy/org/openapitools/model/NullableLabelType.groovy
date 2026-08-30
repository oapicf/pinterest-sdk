package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum NullableLabelType {

    BRAND("BRAND"),
    
    CUSTOM("CUSTOM")

    private final String value

    NullableLabelType(String value) {
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
