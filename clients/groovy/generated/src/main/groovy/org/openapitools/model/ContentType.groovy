package org.openapitools.model;

import groovy.transform.Canonical

enum ContentType {

    IMAGE_JPEG("image/jpeg"),
    
    IMAGE_PNG("image/png")

    private final String value

    ContentType(String value) {
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
