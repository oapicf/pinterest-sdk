package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AssetSortBy {

    NAME("NAME"),
    
    ID("ID"),
    
    PERMISSIONS("PERMISSIONS")

    private final String value

    AssetSortBy(String value) {
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
