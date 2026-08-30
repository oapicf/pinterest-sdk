package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TargetingTemplateStatus {

    ACTIVE("ACTIVE"),
    
    DELETED("DELETED")

    private final String value

    TargetingTemplateStatus(String value) {
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
