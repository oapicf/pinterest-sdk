package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AssetSearchBy {

    NAME("NAME"),
    
    ID("ID"),
    
    NAME_OR_ID("NAME_OR_ID"),
    
    OWNER_NAME("OWNER_NAME"),
    
    NAME_OR_OWNER("NAME_OR_OWNER")

    private final String value

    AssetSearchBy(String value) {
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
