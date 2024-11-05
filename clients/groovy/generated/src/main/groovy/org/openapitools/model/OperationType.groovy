package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OperationType {

    SHARE("SHARE"),
    
    REVOKE("REVOKE")

    private final String value

    OperationType(String value) {
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
