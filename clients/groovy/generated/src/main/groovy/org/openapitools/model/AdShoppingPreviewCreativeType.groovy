package org.openapitools.model;

import groovy.transform.Canonical

enum AdShoppingPreviewCreativeType {

    SHOPPING("SHOPPING"),
    
    COLLECTION("COLLECTION"),
    
    CAROUSEL("CAROUSEL"),
    
    MAX_WIDTH_COLLECTION("MAX_WIDTH_COLLECTION")

    private final String value

    AdShoppingPreviewCreativeType(String value) {
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
