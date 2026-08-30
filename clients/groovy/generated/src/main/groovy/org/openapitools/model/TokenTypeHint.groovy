package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TokenTypeHint {

    ACCESS_TOKEN("access_token"),
    
    REFRESH_TOKEN("refresh_token")

    private final String value

    TokenTypeHint(String value) {
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
