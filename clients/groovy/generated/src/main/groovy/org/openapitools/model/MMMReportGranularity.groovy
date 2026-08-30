package org.openapitools.model;

import groovy.transform.Canonical

enum MMMReportGranularity {

    DAY("DAY"),
    
    WEEK("WEEK")

    private final String value

    MMMReportGranularity(String value) {
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
