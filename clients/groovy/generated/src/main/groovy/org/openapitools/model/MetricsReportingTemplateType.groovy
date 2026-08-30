package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MetricsReportingTemplateType {

    UNSPECIFIED("UNSPECIFIED"),
    
    BULK("BULK"),
    
    OVERVIEW("OVERVIEW"),
    
    TABLE("TABLE"),
    
    MMM("MMM"),
    
    BRAND_CATEGORY("BRAND_CATEGORY")

    private final String value

    MetricsReportingTemplateType(String value) {
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
