package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum InviteFilterStatus {

    PENDING("PENDING"),
    
    EXPIRED("EXPIRED")

    private final String value

    InviteFilterStatus(String value) {
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
