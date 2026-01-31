package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum IngestionSourceOptions {

    TAG("TAG"),
    
    MMP("MMP"),
    
    FILE_UPLOAD("FILE_UPLOAD"),
    
    CONVERSIONS_API("CONVERSIONS_API"),
    
    NATIVE("NATIVE")

    private final String value

    IngestionSourceOptions(String value) {
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
