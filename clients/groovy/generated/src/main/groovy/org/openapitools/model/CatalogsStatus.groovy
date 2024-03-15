package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CatalogsStatus {

    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE")

    private final String value

    CatalogsStatus(String value) {
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
