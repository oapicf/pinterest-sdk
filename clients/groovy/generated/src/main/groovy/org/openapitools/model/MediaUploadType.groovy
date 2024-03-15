package org.openapitools.model;

import groovy.transform.Canonical

enum MediaUploadType {

    VIDEO("video")

    private final String value

    MediaUploadType(String value) {
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
