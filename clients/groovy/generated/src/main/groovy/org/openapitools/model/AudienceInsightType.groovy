package org.openapitools.model;

import groovy.transform.Canonical

enum AudienceInsightType {

    YOUR_TOTAL_AUDIENCE("YOUR_TOTAL_AUDIENCE"),
    
    YOUR_ENGAGED_AUDIENCE("YOUR_ENGAGED_AUDIENCE"),
    
    PINTEREST_TOTAL_AUDIENCE("PINTEREST_TOTAL_AUDIENCE")

    private final String value

    AudienceInsightType(String value) {
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
