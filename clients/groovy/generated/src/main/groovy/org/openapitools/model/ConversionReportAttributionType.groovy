package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionReportAttributionType {

    INDIVIDUAL("INDIVIDUAL"),
    
    HOUSEHOLD("HOUSEHOLD")

    private final String value

    ConversionReportAttributionType(String value) {
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
