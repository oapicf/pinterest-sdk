package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionProductReportLevel {

    ADVERTISER("ADVERTISER"),
    
    CAMPAIGN("CAMPAIGN"),
    
    AD_GROUP("AD_GROUP")

    private final String value

    ConversionProductReportLevel(String value) {
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
