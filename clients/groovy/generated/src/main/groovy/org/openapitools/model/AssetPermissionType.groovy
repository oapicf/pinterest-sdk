package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AssetPermissionType {

    AGGREGATED_PERMISSION("AGGREGATED_PERMISSION"),
    
    DIRECT_PERMISSION("DIRECT_PERMISSION")

    private final String value

    AssetPermissionType(String value) {
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
