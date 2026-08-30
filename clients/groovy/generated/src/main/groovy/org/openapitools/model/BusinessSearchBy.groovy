package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BusinessSearchBy {

    FULL_NAME("FULL_NAME"),
    
    USERNAME("USERNAME"),
    
    BUSINESS_ID("BUSINESS_ID"),
    
    EMAIL("EMAIL")

    private final String value

    BusinessSearchBy(String value) {
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
