package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdAccountEntityType {

    ADVERTISER("ADVERTISER"),
    
    CAMPAIGN("CAMPAIGN"),
    
    AD_GROUP("AD_GROUP"),
    
    AD("AD")

    private final String value

    AdAccountEntityType(String value) {
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
