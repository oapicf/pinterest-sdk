package org.openapitools.model;

import groovy.transform.Canonical

enum AdgroupTrackingFeatureType {

    TRENDS("TRENDS"),
    
    CLONE_META("CLONE_META"),
    
    BULK_EDITOR("BULK_EDITOR"),
    
    AD_ROTATION("AD_ROTATION")

    private final String value

    AdgroupTrackingFeatureType(String value) {
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
