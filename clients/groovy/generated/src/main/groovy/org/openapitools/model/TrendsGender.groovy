package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TrendsGender {

    MALE("male"),
    
    FEMALE("female"),
    
    UNSPECIFIED("unspecified")

    private final String value

    TrendsGender(String value) {
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
