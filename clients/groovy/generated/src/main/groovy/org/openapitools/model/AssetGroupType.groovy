package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AssetGroupType {

    BRAND("BRAND"),
    
    LOCATION_OR_LANGUAGE("LOCATION_OR_LANGUAGE"),
    
    PRODUCT_LINE("PRODUCT_LINE"),
    
    OTHER("OTHER")

    private final String value

    AssetGroupType(String value) {
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
