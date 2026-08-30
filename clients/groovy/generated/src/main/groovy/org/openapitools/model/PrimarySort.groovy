package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PrimarySort {

    BY_ID("BY_ID"),
    
    BY_DATE("BY_DATE")

    private final String value

    PrimarySort(String value) {
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
