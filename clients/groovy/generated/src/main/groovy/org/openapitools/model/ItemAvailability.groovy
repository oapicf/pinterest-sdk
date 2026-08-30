package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ItemAvailability {

    IN_STOCK("in stock"),
    
    OUT_OF_STOCK("out of stock"),
    
    PREORDER("preorder")

    private final String value

    ItemAvailability(String value) {
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
