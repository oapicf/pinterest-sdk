package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum UserListOperationType {

    ADD("ADD"),
    
    REMOVE("REMOVE")

    private final String value

    UserListOperationType(String value) {
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
