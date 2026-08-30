package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FreqBidMultiplierTimeWindow {

    WEEK("WEEK"),
    
    MONTH("MONTH")

    private final String value

    FreqBidMultiplierTimeWindow(String value) {
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
