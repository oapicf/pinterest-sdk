package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LookbackPeriodOptions {

    _1D("1d"),
    
    _14D("14d")

    private final String value

    LookbackPeriodOptions(String value) {
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
