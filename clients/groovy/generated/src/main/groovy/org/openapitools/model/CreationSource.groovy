package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CreationSource {

    ADS_API("ADS_API"),
    
    ADS_MANAGER_REPORTING_PAGE("ADS_MANAGER_REPORTING_PAGE"),
    
    ADS_MANAGER_REPORT_BUILDER("ADS_MANAGER_REPORT_BUILDER")

    private final String value

    CreationSource(String value) {
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
