package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CustomerListStatus {

    PROCESSING("PROCESSING"),
    
    READY("READY"),
    
    TOO_SMALL("TOO_SMALL"),
    
    UPLOADING("UPLOADING")

    private final String value

    CustomerListStatus(String value) {
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
