package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReportingTimeZone {

    PINTEREST_TIME_ZONE("PINTEREST_TIME_ZONE"),
    
    AD_ACCOUNT_TIME_ZONE("AD_ACCOUNT_TIME_ZONE")

    private final String value

    ReportingTimeZone(String value) {
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
