package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudienceSharingType {

    CUSTOM("CUSTOM"),
    
    SYNDICATED("SYNDICATED")

    private final String value

    AudienceSharingType(String value) {
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
