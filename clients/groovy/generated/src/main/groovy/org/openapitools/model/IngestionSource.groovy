package org.openapitools.model;

import groovy.transform.Canonical

enum IngestionSource {

    TAG("TAG"),
    
    MMP("MMP"),
    
    FILE_UPLOAD("FILE_UPLOAD"),
    
    CONVERSIONS_API("CONVERSIONS_API"),
    
    NATIVE("NATIVE")

    private final String value

    IngestionSource(String value) {
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
