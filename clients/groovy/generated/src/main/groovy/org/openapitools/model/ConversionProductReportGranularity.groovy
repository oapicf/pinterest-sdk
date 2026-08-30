package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionProductReportGranularity {

    TOTAL("TOTAL"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH")

    private final String value

    ConversionProductReportGranularity(String value) {
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
