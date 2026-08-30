package org.openapitools.model;

import groovy.transform.Canonical

enum AdPinPreviewCreativeType {

    SHOPPING("SHOPPING"),
    
    COLLECTION("COLLECTION"),
    
    MAX_VIDEO("MAX_VIDEO"),
    
    MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION"),
    
    MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION")

    private final String value

    AdPinPreviewCreativeType(String value) {
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
