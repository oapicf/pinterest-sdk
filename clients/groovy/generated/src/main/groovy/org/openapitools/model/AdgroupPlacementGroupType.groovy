package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdgroupPlacementGroupType {

    ALL("ALL"),
    
    SEARCH("SEARCH"),
    
    BROWSE("BROWSE"),
    
    OTHER("OTHER")

    private final String value

    AdgroupPlacementGroupType(String value) {
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
