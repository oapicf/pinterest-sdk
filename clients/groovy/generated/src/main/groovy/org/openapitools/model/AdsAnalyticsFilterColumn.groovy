package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdsAnalyticsFilterColumn {

    SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
    
    TOTAL_IMPRESSION("TOTAL_IMPRESSION")

    private final String value

    AdsAnalyticsFilterColumn(String value) {
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
