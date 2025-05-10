package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionReportTimeType {

    TIME_OF_AD_ACTION("TIME_OF_AD_ACTION"),
    
    TIME_OF_CONVERSION("TIME_OF_CONVERSION")

    private final String value

    ConversionReportTimeType(String value) {
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
