package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AssetTypeResponse {

    AD_ACCOUNT("AD_ACCOUNT"),
    
    MERCHANT("MERCHANT"),
    
    PROFILE("PROFILE"),
    
    ASSET_GROUP("ASSET_GROUP"),
    
    PINNER_LIST("PINNER_LIST"),
    
    CONVERSION_TAG("CONVERSION_TAG"),
    
    CATALOG("CATALOG"),
    
    CONVERSION_SEGMENT("CONVERSION_SEGMENT")

    private final String value

    AssetTypeResponse(String value) {
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
