package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PlacementGroupType {

    ALL("ALL"),
    
    SEARCH("SEARCH"),
    
    BROWSE("BROWSE"),
    
    OTHER("OTHER")

    private final String value

    PlacementGroupType(String value) {
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
