package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PreferredMediaType {

    VIDEO("VIDEO"),
    
    IMAGE("IMAGE")

    private final String value

    PreferredMediaType(String value) {
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
