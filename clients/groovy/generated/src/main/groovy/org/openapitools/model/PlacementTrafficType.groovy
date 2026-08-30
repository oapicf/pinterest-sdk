package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PlacementTrafficType {

    ALL("ALL"),
    
    TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
    
    FULLSCREEN_FEED("FULLSCREEN_FEED")

    private final String value

    PlacementTrafficType(String value) {
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
