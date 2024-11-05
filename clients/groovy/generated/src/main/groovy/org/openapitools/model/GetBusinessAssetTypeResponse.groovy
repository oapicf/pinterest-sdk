package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum GetBusinessAssetTypeResponse {

    AD_ACCOUNT("AD_ACCOUNT"),
    
    PROFILE("PROFILE"),
    
    ASSET_GROUP("ASSET_GROUP"),
    
    CONVERSION_TAG("CONVERSION_TAG")

    private final String value

    GetBusinessAssetTypeResponse(String value) {
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
