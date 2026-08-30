package org.openapitools.model;

import groovy.transform.Canonical

enum ReportType {

    SYNC("SYNC"),
    
    ASYNC("ASYNC")

    private final String value

    ReportType(String value) {
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
