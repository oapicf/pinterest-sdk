package org.openapitools.model;

import groovy.transform.Canonical

enum ProductCategoryRegion {

    US("US"),
    
    GB_IE("GB+IE"),
    
    CA("CA")

    private final String value

    ProductCategoryRegion(String value) {
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
