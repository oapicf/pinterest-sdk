package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MobileAppPlatform {

    IOS("IOS"),
    
    ANDROID("ANDROID")

    private final String value

    MobileAppPlatform(String value) {
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
