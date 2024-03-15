package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum GridClickType {

    CLOSEUP("CLOSEUP"),
    
    DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION")

    private final String value

    GridClickType(String value) {
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
