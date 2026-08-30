package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AppsflyerPlatform {

    ANDROID("android"),
    
    IOS("ios")

    private final String value

    AppsflyerPlatform(String value) {
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
