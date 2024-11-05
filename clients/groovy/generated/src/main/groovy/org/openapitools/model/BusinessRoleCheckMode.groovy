package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BusinessRoleCheckMode {

    INTERNAL("INTERNAL"),
    
    EXTERNAL("EXTERNAL")

    private final String value

    BusinessRoleCheckMode(String value) {
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
