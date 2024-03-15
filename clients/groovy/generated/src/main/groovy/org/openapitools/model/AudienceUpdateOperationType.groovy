package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudienceUpdateOperationType {

    UPDATE("UPDATE"),
    
    REMOVE("REMOVE")

    private final String value

    AudienceUpdateOperationType(String value) {
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
