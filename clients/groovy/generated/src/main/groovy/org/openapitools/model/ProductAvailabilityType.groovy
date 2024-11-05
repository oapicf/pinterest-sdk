package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ProductAvailabilityType {

    IN_STOCK("IN_STOCK"),
    
    OUT_OF_STOCK("OUT_OF_STOCK"),
    
    PREORDER("PREORDER")

    private final String value

    ProductAvailabilityType(String value) {
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
