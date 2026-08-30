package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TieBreakerType {

    RANDOM("RANDOM"),
    
    CUSTOM("CUSTOM")

    private final String value

    TieBreakerType(String value) {
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
