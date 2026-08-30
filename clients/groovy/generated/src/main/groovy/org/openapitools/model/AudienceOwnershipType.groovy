package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudienceOwnershipType {

    OWNED("OWNED"),
    
    RECEIVED("RECEIVED")

    private final String value

    AudienceOwnershipType(String value) {
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
