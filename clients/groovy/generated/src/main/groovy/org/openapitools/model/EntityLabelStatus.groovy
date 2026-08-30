package org.openapitools.model;

import groovy.transform.Canonical

enum EntityLabelStatus {

    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED"),
    
    NULL("NULL")

    private final String value

    EntityLabelStatus(String value) {
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
