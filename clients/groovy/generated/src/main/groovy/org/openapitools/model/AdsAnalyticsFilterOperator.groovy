package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdsAnalyticsFilterOperator {

    LESS_THAN("LESS_THAN"),
    
    GREATER_THAN("GREATER_THAN")

    private final String value

    AdsAnalyticsFilterOperator(String value) {
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
