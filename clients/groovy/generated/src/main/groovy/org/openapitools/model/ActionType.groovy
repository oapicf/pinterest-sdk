package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ActionType {

    CLICKTHROUGH("CLICKTHROUGH"),
    
    IMPRESSION("IMPRESSION"),
    
    VIDEO_V_50_MRC("VIDEO_V_50_MRC")

    private final String value

    ActionType(String value) {
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
