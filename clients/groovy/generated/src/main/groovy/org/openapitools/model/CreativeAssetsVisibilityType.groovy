package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CreativeAssetsVisibilityType {

    VISIBLE("VISIBLE"),
    
    HIDDEN("HIDDEN")

    private final String value

    CreativeAssetsVisibilityType(String value) {
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
