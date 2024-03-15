package org.openapitools.model;

import groovy.transform.Canonical

enum CatalogsProductGroupStatus {

    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE")

    private final String value

    CatalogsProductGroupStatus(String value) {
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
