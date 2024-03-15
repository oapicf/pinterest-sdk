package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LeadFormStatus {

    DRAFT("DRAFT"),
    
    ACTIVE("ACTIVE")

    private final String value

    LeadFormStatus(String value) {
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
