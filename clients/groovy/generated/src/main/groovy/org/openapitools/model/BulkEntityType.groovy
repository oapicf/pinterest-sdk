package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BulkEntityType {

    CAMPAIGN("CAMPAIGN"),
    
    AD_GROUP("AD_GROUP"),
    
    PRODUCT_GROUP("PRODUCT_GROUP"),
    
    AD("AD"),
    
    KEYWORD("KEYWORD")

    private final String value

    BulkEntityType(String value) {
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
