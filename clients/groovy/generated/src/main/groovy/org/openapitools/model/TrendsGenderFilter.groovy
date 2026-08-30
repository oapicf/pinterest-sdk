package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TrendsGenderFilter {

    MALE("male"),
    
    FEMALE("female"),
    
    UNKNOWN("unknown")

    private final String value

    TrendsGenderFilter(String value) {
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
