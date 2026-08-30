package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PlacementType {

    SEARCH("SEARCH"),
    
    BROWSE("BROWSE"),
    
    RELATED_PINS("RELATED_PINS")

    private final String value

    PlacementType(String value) {
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
